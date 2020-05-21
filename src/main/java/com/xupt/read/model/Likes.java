package com.xupt.read.model;

import java.io.Serializable;
import java.util.Date;

public class Likes implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column likes.id
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column likes.circle_id
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    private Integer circleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column likes.user_id
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column likes.is_delete
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    private Boolean isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column likes.created_at
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column likes.updated_at
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    private Date updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table likes
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column likes.id
     *
     * @return the value of likes.id
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column likes.id
     *
     * @param id the value for likes.id
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column likes.circle_id
     *
     * @return the value of likes.circle_id
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    public Integer getCircleId() {
        return circleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column likes.circle_id
     *
     * @param circleId the value for likes.circle_id
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    public void setCircleId(Integer circleId) {
        this.circleId = circleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column likes.user_id
     *
     * @return the value of likes.user_id
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column likes.user_id
     *
     * @param userId the value for likes.user_id
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column likes.is_delete
     *
     * @return the value of likes.is_delete
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column likes.is_delete
     *
     * @param isDelete the value for likes.is_delete
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column likes.created_at
     *
     * @return the value of likes.created_at
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column likes.created_at
     *
     * @param createdAt the value for likes.created_at
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column likes.updated_at
     *
     * @return the value of likes.updated_at
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column likes.updated_at
     *
     * @param updatedAt the value for likes.updated_at
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}