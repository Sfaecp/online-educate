package com.llh.education.onlineeducate.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.llh.education.onlineeducate.vo.req.CheckQuestionVO;
import com.llh.education.onlineeducate.vo.req.ChooseQuestionBaseReqVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.*;

import com.llh.education.onlineeducate.entity.ChooseQuestionEntity;
import com.llh.education.onlineeducate.mapper.ChooseQuestionMapper;
import com.llh.education.onlineeducate.service.ChooseQuestionService;
import com.llh.education.onlineeducate.vo.req.ChooseQuestionAddReqVO;
import com.llh.education.onlineeducate.vo.req.ChooseQuestionQryReqVO;
import com.llh.education.onlineeducate.vo.req.ChooseQuestionUpdateReqVO;
import com.llh.education.onlineeducate.vo.rep.ChooseQuestionRepVO;
import com.llh.education.onlineeducate.vo.rep.ChooseQuestionExcelRepVO;

/**
 * 类描述：选择题试题表 接口服务实现类
 * 类名称：IChooseQuestionServiceImpl
 * 包路径：com.llh.education.onlineeducate.service.impl
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 10:00:48
 */
@Slf4j
@Service("chooseQuestionService")
public class ChooseQuestionServiceImpl implements ChooseQuestionService {

    @Autowired
    private ChooseQuestionMapper chooseQuestionMapper;

    @Override
    public boolean checkQuestion(CheckQuestionVO questionVO) {
        ChooseQuestionEntity chooseReq = new ChooseQuestionEntity();
        chooseReq.setCode(questionVO.getItemCode());
        chooseReq.setId(questionVO.getItemId());
        ChooseQuestionEntity answer = chooseQuestionMapper.selectOne(chooseReq);
        return answer != null && answer.getResult().equals(questionVO.getResult());
    }

    @Override
    public ChooseQuestionBaseReqVO querySingleQuestion(ChooseQuestionQryReqVO chooseQuestionQryReqVO) {
        ChooseQuestionEntity chooseReq = new ChooseQuestionEntity();
       chooseReq.setId(chooseQuestionQryReqVO.getId());
        chooseReq.setCode(chooseQuestionQryReqVO.getCode());
        chooseReq.setGradeCourse(chooseQuestionQryReqVO.getGradeCourse());
        ChooseQuestionEntity cq = chooseQuestionMapper.querySingleQuestion(chooseReq);
        ChooseQuestionBaseReqVO result = new ChooseQuestionBaseReqVO();
        BeanUtil.copyProperties(cq, result);
        return result;
    }

    /**
     * 分页列表查询-选择题试题表
     * @param chooseQuestionQryReqVO
     * @return
     */
    @Override
    public PageInfo<ChooseQuestionRepVO> pageList(ChooseQuestionQryReqVO chooseQuestionQryReqVO) {
        //PageHelper.startPage(chooseQuestionQryReqVO.getReqPageNum(), chooseQuestionQryReqVO.getReqPageSize());

        PageInfo<ChooseQuestionEntity> pageInfo = new PageInfo<>(null);
        return null;
    }

    /**
     * 新增-选择题试题表
     * @param chooseQuestionAddReqVO
     */
    @Override
    public ChooseQuestionEntity save(ChooseQuestionAddReqVO chooseQuestionAddReqVO){
        ChooseQuestionEntity chooseQuestion = new ChooseQuestionEntity();
        BeanUtil.copyProperties(chooseQuestionAddReqVO, chooseQuestion);
        return null;
    }

    /**
     * 修改-选择题试题表
     * @param chooseQuestionUpdateReqVO
     */
    @Override
    public ChooseQuestionEntity update(ChooseQuestionUpdateReqVO chooseQuestionUpdateReqVO){

        return null;
    }

    /**
     * 详情-选择题试题表
     * @param id 主键id
     */
    public ChooseQuestionRepVO getDetailById(Serializable id) {


        return null;
    }

    /**
     * 选择题试题表-导出选中项（根据id集合）
     * @param ids id集合
     */
    @Override
    public void exportBySelected(List<Long> ids) {

    }

    /**
     * 选择题试题表-条件导出（按查询条件导出全部或当前页）
     * @param qryVO
     */
    @Override
    public void exportByCondition(ChooseQuestionQryReqVO qryVO) {
//        if (qryVO.getReqPageNum()!=null && qryVO.getReqPageSize()!=null){
//        PageHelper.startPage(qryVO.getReqPageNum(), qryVO.getReqPageSize());
//        }
//        List<ChooseQuestionEntity> list = super.bmtpListByQryReqVO(qryVO);
        this.exportDataToExcel(null);
    }

    /**
     * 导出数据到excel文档
     * @param list
     */
    private void exportDataToExcel(List<ChooseQuestionEntity> list) {

    }
}
