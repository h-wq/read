package com.xupt.read.mapper;

import com.xupt.read.model.Evaluate;
import com.xupt.read.model.EvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluate
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    long countByExample(EvaluateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluate
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    int deleteByExample(EvaluateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluate
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluate
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    int insert(Evaluate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluate
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    int insertSelective(Evaluate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluate
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    List<Evaluate> selectByExample(EvaluateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluate
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    Evaluate selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluate
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluate
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    int updateByExample(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluate
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    int updateByPrimaryKeySelective(Evaluate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluate
     *
     * @mbg.generated Sun Apr 19 16:12:11 CST 2020
     */
    int updateByPrimaryKey(Evaluate record);
}