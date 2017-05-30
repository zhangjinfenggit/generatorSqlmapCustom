package com.yhksxt.admin.mapper;

import com.yhksxt.admin.model.Title;
import com.yhksxt.admin.model.TitleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TitleMapper {
    int countByExample(TitleExample example);

    int deleteByExample(TitleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Title record);

    int insertSelective(Title record);

    List<Title> selectByExample(TitleExample example);

    Title selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Title record, @Param("example") TitleExample example);

    int updateByExample(@Param("record") Title record, @Param("example") TitleExample example);

    int updateByPrimaryKeySelective(Title record);

    int updateByPrimaryKey(Title record);
}