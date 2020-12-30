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

import com.llh.education.onlineeducate.entity.ChooseQuestionEntity;
import com.llh.education.onlineeducate.vo.req.CheckQuestionVO;
import com.llh.education.onlineeducate.vo.req.ChooseQuestionAddReqVO;
import com.llh.education.onlineeducate.vo.req.ChooseQuestionBaseReqVO;
import com.llh.education.onlineeducate.vo.req.ChooseQuestionQryReqVO;
import com.llh.education.onlineeducate.vo.req.ChooseQuestionUpdateReqVO;
import com.llh.education.onlineeducate.vo.rep.ChooseQuestionRepVO;

/**
 * 类描述：选择题试题表 接口服务
 * 类名称：IChooseQuestionService
 * 包路径：com.llh.education.onlineeducate.service
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 10:00:48
 */
public interface ChooseQuestionService {

    /**
     * 检验单个题目是否正确
     * @param questionVO
     * @return
     */
    boolean checkQuestion(CheckQuestionVO questionVO);

    /**
     * 查询单个题目内容
     * @param chooseQuestionQryReqVO
     * @return
     */
    ChooseQuestionBaseReqVO querySingleQuestion( ChooseQuestionQryReqVO chooseQuestionQryReqVO);

    /**
     * 查分页列表-选择题试题表
     * @param chooseQuestionQryReqVO
     * @return
     */
    PageInfo<ChooseQuestionRepVO> pageList(ChooseQuestionQryReqVO chooseQuestionQryReqVO);

    /**
     * 新增-选择题试题表
     * @param chooseQuestionAddReqVO
     */
    ChooseQuestionEntity save(ChooseQuestionAddReqVO chooseQuestionAddReqVO);

    /**
     * 修改-选择题试题表
     * @param chooseQuestionUpdateReqVO
     */
    ChooseQuestionEntity update(ChooseQuestionUpdateReqVO chooseQuestionUpdateReqVO);

    /**
     * 详情-选择题试题表
     * @param id 主键id
     * @return
     */
    ChooseQuestionRepVO getDetailById(Serializable id);

    /**
     * 选择题试题表-导出选中项（根据id集合）
     * @param ids id集合
     */
    void exportBySelected(List<Long> ids);

    /**
     * 选择题试题表-条件导出（按查询条件导出全部或当前页）
     * @param qryVO
     */
    void exportByCondition(ChooseQuestionQryReqVO qryVO);
}

