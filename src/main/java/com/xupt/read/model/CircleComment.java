package com.xupt.read.model;

import java.io.Serializable;

public class CircleComment implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column circle_comment.id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column circle_comment.circle_id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    private Integer circleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column circle_comment.user_id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column circle_comment.comment
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    private Integer comment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table circle_comment
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column circle_comment.id
     *
     * @return the value of circle_comment.id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column circle_comment.id
     *
     * @param id the value for circle_comment.id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column circle_comment.circle_id
     *
     * @return the value of circle_comment.circle_id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public Integer getCircleId() {
        return circleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column circle_comment.circle_id
     *
     * @param circleId the value for circle_comment.circle_id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public void setCircleId(Integer circleId) {
        this.circleId = circleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column circle_comment.user_id
     *
     * @return the value of circle_comment.user_id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column circle_comment.user_id
     *
     * @param userId the value for circle_comment.user_id
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column circle_comment.comment
     *
     * @return the value of circle_comment.comment
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public Integer getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column circle_comment.comment
     *
     * @param comment the value for circle_comment.comment
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    public void setComment(Integer comment) {
        this.comment = comment;
    }
}