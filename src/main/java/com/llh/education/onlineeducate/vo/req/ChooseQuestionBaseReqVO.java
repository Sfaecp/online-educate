package com.llh.education.onlineeducate.vo.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 类描述：选择题试题表 响应对象
 * 类名称：ChooseQuestionRepVO
 * 包路径：com.llh.education.onlineeducate.vo.req
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 10:00:48
 */
@ApiModel(value = "t_llh_choose_question基础请求对象", description = "选择题试题表基础请求对象")
@Data
@EqualsAndHashCode(callSuper = false)
public class ChooseQuestionBaseReqVO {

    private String id;
    @ApiModelProperty(value = "题目编号,required = true") private String code;
    @ApiModelProperty(value = "题目内容,required = true") private String content;
    @ApiModelProperty(value = "选项A,required = true") private String optionA;
    @ApiModelProperty(value = "选项B,required = true") private String optionB;
    @ApiModelProperty(value = "选项C,required = true") private String optionC;
    @ApiModelProperty(value = "选项D,required = true") private String optionD;
    @ApiModelProperty(value = "答案,required = true") private String result;
    @ApiModelProperty(value = "答案解析,required = true") private String analysis;
    @ApiModelProperty(value = "题目难度,required = true") private String difficulty;
    @ApiModelProperty(value = "年级课程,required = true") private String gradeCourse;
    @ApiModelProperty(value = "创建人,required = true") private Integer createId;

}
