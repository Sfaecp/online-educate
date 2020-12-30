
package com.llh.education.onlineeducate.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.llh.education.onlineeducate.service.FillQuestionService;

import com.llh.education.onlineeducate.vo.req.CheckQuestionVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.*;


import com.llh.education.onlineeducate.entity.FillQuestionEntity;
import com.llh.education.onlineeducate.mapper.FillQuestionMapper;
import com.llh.education.onlineeducate.vo.req.FillQuestionAddReqVO;
import com.llh.education.onlineeducate.vo.req.FillQuestionQryReqVO;
import com.llh.education.onlineeducate.vo.req.FillQuestionUpdateReqVO;
import com.llh.education.onlineeducate.vo.rep.FillQuestionRepVO;


/**
 * 类描述：填空题试题表 接口服务实现类
 * 类名称：IFillQuestionServiceImpl
 * 包路径：com.llh.education.onlineeducate.service.impl
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 10:00:49
 */
@Slf4j
@Service("fillQuestionService")
public class FillQuestionServiceImpl  implements FillQuestionService {

    @Autowired
    private FillQuestionMapper fillQuestionMapper;

    @Override
    public boolean checkQuestion(CheckQuestionVO questionVO) {
        return false;
    }

    /**
     * 分页列表查询-填空题试题表
     * @param fillQuestionQryReqVO
     * @return
     */
    @Override
    public PageInfo<FillQuestionRepVO> pageList(FillQuestionQryReqVO fillQuestionQryReqVO) {
//        PageHelper.startPage(fillQuestionQryReqVO.getReqPageNum(), fillQuestionQryReqVO.getReqPageSize());
//        List<FillQuestionEntity> list = super.bmtpListByQryReqVO(fillQuestionQryReqVO);
//        PageInfo<FillQuestionEntity> pageInfo = new PageInfo<>(list);
        return null;
    }

    /**
     * 新增-填空题试题表
     * @param fillQuestionAddReqVO
     */
    @Override
    public FillQuestionEntity save(FillQuestionAddReqVO fillQuestionAddReqVO){
        FillQuestionEntity fillQuestion = new FillQuestionEntity();
        BeanUtil.copyProperties(fillQuestionAddReqVO, fillQuestion);
        return null;
    }

    /**
     * 修改-填空题试题表
     * @param fillQuestionUpdateReqVO
     */
    @Override
    public FillQuestionEntity update(FillQuestionUpdateReqVO fillQuestionUpdateReqVO){

        return null;
    }

    /**
     * 详情-填空题试题表
     * @param id 主键id
     */
    @Override
    public FillQuestionRepVO getDetailById(Serializable id) {

        return null;
    }

    /**
     * 填空题试题表-导出选中项（根据id集合）
     * @param ids id集合
     */
    @Override
    public void exportBySelected(List<Long> ids) {

    }

    /**
     * 填空题试题表-条件导出（按查询条件导出全部或当前页）
     * @param qryVO
     */
    @Override
    public void exportByCondition(FillQuestionQryReqVO qryVO) {

    }

    /**
     * 导出数据到excel文档
     * @param list
     */
    private void exportDataToExcel(List<FillQuestionEntity> list) {

    }
}
