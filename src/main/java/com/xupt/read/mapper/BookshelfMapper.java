package com.xupt.read.mapper;

import com.xupt.read.model.Bookshelf;
import com.xupt.read.model.BookshelfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookshelfMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelves
     *
     * @mbg.generated Sat Nov 12 16:21:53 CST 2022
     */
    long countByExample(BookshelfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelves
     *
     * @mbg.generated Sat Nov 12 16:21:53 CST 2022
     */
    int deleteByExample(BookshelfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelves
     *
     * @mbg.generated Sat Nov 12 16:21:53 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelves
     *
     * @mbg.generated Sat Nov 12 16:21:53 CST 2022
     */
    int insert(Bookshelf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelves
     *
     * @mbg.generated Sat Nov 12 16:21:53 CST 2022
     */
    int insertSelective(Bookshelf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelves
     *
     * @mbg.generated Sat Nov 12 16:21:53 CST 2022
     */
    List<Bookshelf> selectByExample(BookshelfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelves
     *
     * @mbg.generated Sat Nov 12 16:21:53 CST 2022
     */
    Bookshelf selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelves
     *
     * @mbg.generated Sat Nov 12 16:21:53 CST 2022
     */
    int updateByExampleSelective(@Param("record") Bookshelf record, @Param("example") BookshelfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelves
     *
     * @mbg.generated Sat Nov 12 16:21:53 CST 2022
     */
    int updateByExample(@Param("record") Bookshelf record, @Param("example") BookshelfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelves
     *
     * @mbg.generated Sat Nov 12 16:21:53 CST 2022
     */
    int updateByPrimaryKeySelective(Bookshelf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelves
     *
     * @mbg.generated Sat Nov 12 16:21:53 CST 2022
     */
    int updateByPrimaryKey(Bookshelf record);
}