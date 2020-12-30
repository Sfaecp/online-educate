/****************************************************
 * 系统名称： 债券多级托管系统
 * 工程名称: 在线试题
 * 公司名称: 深圳市赢时胜信息技术股份有限公司
 *
 * All rights Reserved, Designed By 赢时胜软件
 * @Copyright:2016-2020
 *
 ********************************************************/
package com.llh.education.onlineeducate.service;

import java.util.List;
import java.io.Serializable;
import com.github.pagehelper.PageInfo;

import com.llh.education.onlineeducate.entity.FillQuestionEntity;
import com.llh.education.onlineeducate.vo.req.CheckQuestionVO;
import com.llh.education.onlineeducate.vo.req.FillQuestionAddReqVO;
import com.llh.education.onlineeducate.vo.req.FillQuestionQryReqVO;
import com.llh.education.onlineeducate.vo.req.FillQuestionUpdateReqVO;
import com.llh.education.onlineeducate.vo.rep.FillQuestionRepVO;

/**
 * 类描述：填空题试题表 接口服务
 * 类名称：IFillQuestionService
 * 包路径：com.llh.education.onlineeducate.service
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 10:00:49
 */
public interface FillQuestionService  {

    /**
     * 检验单个题目是否正确
     * @param questionVO
     * @return
     */
    boolean checkQuestion(CheckQuestionVO questionVO);

    /**
     * 查分页列表-填空题试题表
     * @param fillQuestionQryReqVO
     * @return
     */
    PageInfo<FillQuestionRepVO> pageList(FillQuestionQryReqVO fillQuestionQryReqVO);

    /**
     * 新增-填空题试题表
     * @param fillQuestionAddReqVO
     */
    FillQuestionEntity save(FillQuestionAddReqVO fillQuestionAddReqVO);

    /**
     * 修改-填空题试题表
     * @param fillQuestionUpdateReqVO
     */
    FillQuestionEntity update(FillQuestionUpdateReqVO fillQuestionUpdateReqVO);

    /**
     * 详情-填空题试题表
     * @param id 主键id
     * @return
     */
    FillQuestionRepVO getDetailById(Serializable id);

    /**
     * 填空题试题表-导出选中项（根据id集合）
     * @param ids id集合
     */
    void exportBySelected(List<Long> ids);

    /**
     * 填空题试题表-条件导出（按查询条件导出全部或当前页）
     * @param qryVO
     */
    void exportByCondition(FillQuestionQryReqVO qryVO);
}

