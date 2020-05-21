package com.xupt.read.mapper;

import com.xupt.read.model.Likes;
import com.xupt.read.model.LikesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LikesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likes
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    long countByExample(LikesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likes
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    int deleteByExample(LikesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likes
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likes
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    int insert(Likes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likes
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    int insertSelective(Likes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likes
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    List<Likes> selectByExample(LikesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likes
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    Likes selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likes
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    int updateByExampleSelective(@Param("record") Likes record, @Param("example") LikesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likes
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    int updateByExample(@Param("record") Likes record, @Param("example") LikesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likes
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    int updateByPrimaryKeySelective(Likes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table likes
     *
     * @mbg.generated Thu May 21 22:47:45 CST 2020
     */
    int updateByPrimaryKey(Likes record);
}