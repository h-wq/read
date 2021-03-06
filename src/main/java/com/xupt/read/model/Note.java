package com.xupt.read.model;

import java.io.Serializable;
import java.util.Date;

public class Note implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.user_id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.bookshelf_id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    private Integer bookshelfId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.note
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    private String note;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.create_at
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    private Date createAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table note
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.id
     *
     * @return the value of note.id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.id
     *
     * @param id the value for note.id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.user_id
     *
     * @return the value of note.user_id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.user_id
     *
     * @param userId the value for note.user_id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.bookshelf_id
     *
     * @return the value of note.bookshelf_id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public Integer getBookshelfId() {
        return bookshelfId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.bookshelf_id
     *
     * @param bookshelfId the value for note.bookshelf_id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public void setBookshelfId(Integer bookshelfId) {
        this.bookshelfId = bookshelfId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.note
     *
     * @return the value of note.note
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.note
     *
     * @param note the value for note.note
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.create_at
     *
     * @return the value of note.create_at
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.create_at
     *
     * @param createAt the value for note.create_at
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}