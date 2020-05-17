package com.xupt.read.parseManger;

import com.xupt.read.pageCapture.CapturePage;
import com.xupt.read.util.Strings;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.ArrayList;
import java.util.List;


/**
 * @description：  解析书籍的数据
 */
public class PageParse {
    /**测试短评*/
    public static void main(String[] args) {
        String url = "https://book.douban.com/subject/1056295/";
        PageParse.getBookComments(CapturePage.getHtml(url), new BookInfo(),4);
    }


    public static void getBookAndAuthorInfo(String html, BookInfo bookInfo){
        if(html == null){
            return;
        }

        Document document = Jsoup.parse(html);
        Elements elements = document.getElementsByClass("intro");

        for(int i = elements.size()-1, j = 0; i >= 0 && j <= 1; i --, j ++ ){
            if(j == 0){
                bookInfo.setAuthorInfo(getAuthorInfo(elements.get(i)));
            }

            if(j == 1){
                bookInfo.setBookInfo(getAuthorInfo(elements.get(i)));
            }
        }
    }

    public static String getAuthorInfo(Element element){
        Elements elements = element.getElementsByTag("p");
        StringBuilder sb = new StringBuilder();
        for(Element ele : elements){
            sb.append("     ").append(ele.html()).append("\n");
        }
        return sb.toString();
    }

    public static void getBookImg(String html, BookInfo bookInfo){
        if(html == null){
            return;
        }

        Document document = Jsoup.parse(html);
        Elements elements = document.getElementsByClass("nbg");
        Element e = elements.first();
        String img = e.select("img").attr("src");
        bookInfo.setImgName(img.trim());
    }

    /**
     *
     * @param html
     * @param bookInfo   获取书籍的短评
     *                   只爬取了书籍短评的第一页数据，需要很多短评数据获取下一页接着爬取
     */
    public static void getBookComments(String html, BookInfo bookInfo){
        getBookComments(html, bookInfo, 1);
    }

    public static void getBookComments(String html, BookInfo bookInfo, int number){
        //comment-content
        Document document = Jsoup.parse(html);
        Elements elements = document.getElementsByClass("mod-hd");
        Element commentsUrl = elements.first();
        commentsUrl.select("a[href]");

        /**获取数据短评的链接*/
        String baseUrl = commentsUrl.select("a[href]").last().attr("href");
        String url = baseUrl;
        List<String> comments = new ArrayList<String>();
        for(int i = 0; i < number; i ++) {
            Document doc = Jsoup.parse(CapturePage.getHtml(url));
            Elements comment = doc.select("li[class=comment-item]");
            for (Element element : comment) {
                comments.add(element.select("span[class=short]").first().html().trim());
            }

            /**解析分页的短评*/
            Elements elements1 = doc.select("ul[class=comment-paginator]");
            Element element = elements1.select("li[class=p]").last();
            String href = element.getElementsByClass("page-btn").attr("href");
            if(Strings.isEmptyOrNull(href)){
                break;
            }

            url = baseUrl + href;
        }

        bookInfo.setBookComment(comments);
    }

    public static void getBookName(String html, BookInfo bookInfo){
        if(html == null){
            return;
        }
        Document document = Jsoup.parse(html);
        Elements elements = document.select("div[id=wrapper]");
        Element element = elements.first();
        Elements eles = element.select("span[property=v:itemreviewed]");
        Element e = eles.first();
        bookInfo.setBookName(e.html().trim());
    }

    /**
     *
     * @param html
     * @param bookInfo   获取出版社 作者 出版年
     */
    public static void getBookInfo(String html, BookInfo bookInfo){
        Document document = Jsoup.parse(html);
        Elements elements = document.select("div[id=wrapper]");
        Element element = elements.first();
        Elements elem = element.select("div[id=info]");
        Element e = elem.first();
        String info[] = e.html().split("<br>");
        for(String str : info){
            if(str.contains("作者")){
                Document doc = Jsoup.parse(str);
                Elements ele = doc.select("a");
                bookInfo.setAuthorName(ele.first().html().trim());
            }

            if(str.contains("出版社")){
                String publishName = str.split(">")[2].trim();
                bookInfo.setBookPublish(publishName);
            }

            if(str.contains("出版年")){
                String publishAge = str.split(">")[2].trim();
                bookInfo.setPublishYear(publishAge);
            }
        }
    }
}