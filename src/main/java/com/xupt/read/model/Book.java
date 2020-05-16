package com.xupt.read.model;

import java.io.Serializable;

public class Book implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.id
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.name
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.author
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private String author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.synopsis
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private String synopsis;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.score
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private Integer score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.link
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private String link;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.type_id
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private Integer typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.picture
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private String picture;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.popularity
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private Integer popularity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.is_newest
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private Boolean isNewest;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.is_end
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private Boolean isEnd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table book
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.id
     *
     * @return the value of book.id
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.id
     *
     * @param id the value for book.id
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.name
     *
     * @return the value of book.name
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.name
     *
     * @param name the value for book.name
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.author
     *
     * @return the value of book.author
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.author
     *
     * @param author the value for book.author
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.synopsis
     *
     * @return the value of book.synopsis
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.synopsis
     *
     * @param synopsis the value for book.synopsis
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis == null ? null : synopsis.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.score
     *
     * @return the value of book.score
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.score
     *
     * @param score the value for book.score
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.link
     *
     * @return the value of book.link
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public String getLink() {
        return link;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.link
     *
     * @param link the value for book.link
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.type_id
     *
     * @return the value of book.type_id
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.type_id
     *
     * @param typeId the value for book.type_id
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.picture
     *
     * @return the value of book.picture
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public String getPicture() {
        return picture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.picture
     *
     * @param picture the value for book.picture
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.popularity
     *
     * @return the value of book.popularity
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public Integer getPopularity() {
        return popularity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.popularity
     *
     * @param popularity the value for book.popularity
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.is_newest
     *
     * @return the value of book.is_newest
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public Boolean getIsNewest() {
        return isNewest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.is_newest
     *
     * @param isNewest the value for book.is_newest
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public void setIsNewest(Boolean isNewest) {
        this.isNewest = isNewest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.is_end
     *
     * @return the value of book.is_end
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public Boolean getIsEnd() {
        return isEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.is_end
     *
     * @param isEnd the value for book.is_end
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public void setIsEnd(Boolean isEnd) {
        this.isEnd = isEnd;
    }
}