package com.llh.education.onlineeducate.service.impl;

import com.llh.education.onlineeducate.constant.QuestionConstant;
import com.llh.education.onlineeducate.entity.AnswerEntity;
import com.llh.education.onlineeducate.mapper.AnswerMapper;
import com.llh.education.onlineeducate.service.AnswerService;
import com.llh.education.onlineeducate.service.ChooseQuestionService;
import com.llh.education.onlineeducate.service.FillQuestionService;
import com.llh.education.onlineeducate.util.DistributeKeyUtil;
import com.llh.education.onlineeducate.vo.req.CheckQuestionVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Slf4j
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private ChooseQuestionService chooseQuestionService;

    @Autowired
    private FillQuestionService fillQuestionService;

    @Autowired
    private AnswerMapper answerMapper;

    @Override
    @Transactional
    public boolean answerQuestion(CheckQuestionVO checkQuestionVO) {
        boolean flag = false;
        if (QuestionConstant.CHOOSE.equals(checkQuestionVO.getType())) {
            flag = chooseQuestionService.checkQuestion(checkQuestionVO);
        } else if(QuestionConstant.FILL.equals(checkQuestionVO.getType())) {
            flag = fillQuestionService.checkQuestion(checkQuestionVO);
        } else {
            log.error("题目类型错误，不存在此题目类型：{}", checkQuestionVO.getType());
        }

        AnswerEntity answer = new AnswerEntity();
        answer.setId(DistributeKeyUtil.generateId());
        answer.setFlag(flag ? QuestionConstant.CORRECT : QuestionConstant.FAIL);
        answer.setQId(checkQuestionVO.getItemId());
        answer.setSId(checkQuestionVO.getSId());
        answer.setTerm(checkQuestionVO.getTerm());
        answer.setCreateTime(new Date());
        answerMapper.insertSelective(answer);
        return flag;
    }
}
