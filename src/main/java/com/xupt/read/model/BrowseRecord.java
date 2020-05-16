package com.xupt.read.model;

import java.io.Serializable;
import java.util.Date;

public class BrowseRecord implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column browse_record.id
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column browse_record.user_id
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column browse_record.book_id
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private Integer bookId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column browse_record.created_at
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private Date createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table browse_record
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column browse_record.id
     *
     * @return the value of browse_record.id
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column browse_record.id
     *
     * @param id the value for browse_record.id
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column browse_record.user_id
     *
     * @return the value of browse_record.user_id
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column browse_record.user_id
     *
     * @param userId the value for browse_record.user_id
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column browse_record.book_id
     *
     * @return the value of browse_record.book_id
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column browse_record.book_id
     *
     * @param bookId the value for browse_record.book_id
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column browse_record.created_at
     *
     * @return the value of browse_record.created_at
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column browse_record.created_at
     *
     * @param createdAt the value for browse_record.created_at
     *
     * @mbg.generated Sat May 16 13:48:58 CST 2020
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}