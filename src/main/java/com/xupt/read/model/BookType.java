package com.xupt.read.model;

import java.io.Serializable;

public class BookType implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_type.id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_type.name
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table book_type
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_type.id
     *
     * @return the value of book_type.id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_type.id
     *
     * @param id the value for book_type.id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_type.name
     *
     * @return the value of book_type.name
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_type.name
     *
     * @param name the value for book_type.name
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}