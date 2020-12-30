package com.llh.education.onlineeducate.controller;

import com.llh.education.onlineeducate.common.ComResponse;
import com.llh.education.onlineeducate.constant.QuestionConstant;
import com.llh.education.onlineeducate.service.AnswerService;
import com.llh.education.onlineeducate.service.ChooseQuestionService;
import com.llh.education.onlineeducate.service.FillQuestionService;
import com.llh.education.onlineeducate.vo.req.CheckQuestionVO;
import com.llh.education.onlineeducate.vo.req.PracticeReqVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question")
@Slf4j
public class QuestionController {

    @Autowired
    private AnswerService answerService;

    /**
     * 提交单个试题
     * @param checkQuestionVO
     * @return
     */
    @PostMapping(value = "/checkResult", produces =  "application/json")
    public ComResponse<Boolean> checkResult(@RequestBody CheckQuestionVO checkQuestionVO) {

        return ComResponse.handleSuccess(answerService.answerQuestion(checkQuestionVO));
    }

    public ComResponse<List<String>> getPracticeList(@RequestBody PracticeReqVO reqVO) {

        return null;
    }
}
