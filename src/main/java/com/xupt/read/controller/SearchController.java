package com.xupt.read.controller;

import com.xupt.read.common.result.JsonResult;
import com.xupt.read.common.result.PageResult;
import com.xupt.read.pageCapture.CapturePage;
import com.xupt.read.parseManger.BookInfo;
import com.xupt.read.service.SearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 搜索相关接口
 */
@RestController
@RequestMapping(value = "/search")
@Slf4j
public class SearchController {

    @Autowired
    private SearchService searchService;

    private ExecutorService executorService = Executors.newFixedThreadPool(4);

    private ExecutorCompletionService<BookInfo> completionService = new ExecutorCompletionService<>(executorService);

    /**
     * 根据书名或者作者名搜索图书
     */
    @RequestMapping(value = "getBooks",method = RequestMethod.GET)
    public JsonResult getBooks(@RequestParam(name = "name") String name) {
        PageResult<BookInfo> pageResult = new PageResult<>();
        try {
            String url = "https://www.douban.com/search?cat=1001&q=" + URLEncoder.encode(name, "utf-8");
            /**获取页面*/
            String html = CapturePage.getHtml(url);

            /**根据按book name搜索获取的html解析书籍url和picture*/
            List<String> urls = searchService.parseUrlBookName(html);

            urls.forEach(bookUrl -> completionService.submit(() -> searchService.getBookInfo(bookUrl)));
            List<BookInfo> bookInfos = new ArrayList<>(urls.size());
            for (int i = 0; i < urls.size(); i++) {
                try{
                    BookInfo bookInfo = completionService.take().get();

                    BookInfo book = new BookInfo();
                    book.setBookName(bookInfo.getBookName());
                    book.setImgPath(bookInfo.getImgPath());
                    book.setScore(bookInfo.getScore());
                    book.setPopularity(bookInfo.getPopularity());
                    book.setAuthorName(bookInfo.getAuthorName());
                    book.setBookPublish(bookInfo.getBookPublish());
                    book.setPublishYear(bookInfo.getPublishYear());
                    bookInfos.add(book);
                } catch (Exception e) {
                    log.error("getBookInfo error is ", e);
                }
            }
            pageResult.setItems(bookInfos);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return JsonResult.success(pageResult);
    }

    /**
     * 获取图书信息
     */
    @RequestMapping(value = "getBookInfo",method = RequestMethod.GET)
    public JsonResult getBookInfo(@RequestParam(name = "bookUrl") String bookUrl) {
        BookInfo bookInfo = searchService.getBookInfo(bookUrl);
        return JsonResult.success(bookInfo);
    }

}
