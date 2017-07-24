package com.hg.hgc.web.dao;

import com.hg.hgc.core.feature.orm.mybatis.Page;
import com.hg.hgc.core.generic.GenericDao;
import com.hg.hgc.web.model.Menu;
import com.hg.hgc.web.model.MenuExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 功能菜单模块数据处理层
 * @author liuguoyu
 *
 * @since 2016年4月26日下午3:41:56
 */
public interface MenuMapper extends GenericDao<Menu, Integer>{
    int countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer menuid);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer menuid);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
    /**
     * 分页条件查询
     * 
     * @param page
     * @param example
     * @return
     */
    List<Menu> selectByExampleAndPage(Page<Menu> page, MenuExample example);
}