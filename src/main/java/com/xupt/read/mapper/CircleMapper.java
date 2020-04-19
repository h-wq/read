package com.xupt.read.mapper;

import com.xupt.read.model.Circle;
import com.xupt.read.model.CircleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CircleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    long countByExample(CircleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    int deleteByExample(CircleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    int insert(Circle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    int insertSelective(Circle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    List<Circle> selectByExample(CircleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    Circle selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") Circle record, @Param("example") CircleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    int updateByExample(@Param("record") Circle record, @Param("example") CircleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    int updateByPrimaryKeySelective(Circle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table circle
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    int updateByPrimaryKey(Circle record);
}