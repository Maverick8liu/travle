package com.hg.hgc.web.dao;

import com.hg.hgc.core.generic.GenericDao;
import com.hg.hgc.web.model.GuideService;
import com.hg.hgc.web.model.GuideServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuideServiceMapper extends GenericDao<GuideService, Integer>{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_service
     *
     * @mbg.generated Sun Jul 02 22:48:21 CST 2017
     */
    long countByExample(GuideServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_service
     *
     * @mbg.generated Sun Jul 02 22:48:21 CST 2017
     */
    int deleteByExample(GuideServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_service
     *
     * @mbg.generated Sun Jul 02 22:48:21 CST 2017
     */
    int deleteByPrimaryKey(Integer guideservice);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_service
     *
     * @mbg.generated Sun Jul 02 22:48:21 CST 2017
     */
    int insert(GuideService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_service
     *
     * @mbg.generated Sun Jul 02 22:48:21 CST 2017
     */
    int insertSelective(GuideService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_service
     *
     * @mbg.generated Sun Jul 02 22:48:21 CST 2017
     */
    List<GuideService> selectByExampleWithBLOBs(GuideServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_service
     *
     * @mbg.generated Sun Jul 02 22:48:21 CST 2017
     */
    List<GuideService> selectByExample(GuideServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_service
     *
     * @mbg.generated Sun Jul 02 22:48:21 CST 2017
     */
    GuideService selectByPrimaryKey(Integer guideservice);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_service
     *
     * @mbg.generated Sun Jul 02 22:48:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") GuideService record, @Param("example") GuideServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_service
     *
     * @mbg.generated Sun Jul 02 22:48:21 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") GuideService record, @Param("example") GuideServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_service
     *
     * @mbg.generated Sun Jul 02 22:48:21 CST 2017
     */
    int updateByExample(@Param("record") GuideService record, @Param("example") GuideServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_service
     *
     * @mbg.generated Sun Jul 02 22:48:21 CST 2017
     */
    int updateByPrimaryKeySelective(GuideService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_service
     *
     * @mbg.generated Sun Jul 02 22:48:21 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(GuideService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_service
     *
     * @mbg.generated Sun Jul 02 22:48:21 CST 2017
     */
    int updateByPrimaryKey(GuideService record);
}