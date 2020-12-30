
package com.llh.education.onlineeducate.vo.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 类描述：选择题试题表 响应对象
 * 类名称：ChooseQuestionRepVO
 * 包路径：com.llh.education.onlineeducate.vo.req
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 10:00:48
 */
@ApiModel(value="t_llh_choose_question查询条件对象", description="选择题试题表查询条件对象")
@Data
@EqualsAndHashCode(callSuper = false)
public class ChooseQuestionQryReqVO{

    @ApiModelProperty("主键")
    private String id;
    @ApiModelProperty("题目编号")
    private String code;
    @ApiModelProperty("题目内容")
    private String content;
    @ApiModelProperty("选项A")
    private String optionA;
        @ApiModelProperty("选项B")
    private String optionB;
        @ApiModelProperty("选项C")
    private String optionC;
        @ApiModelProperty("选项D")
    private String optionD;
        @ApiModelProperty("答案")
    private String result;
        @ApiModelProperty("答案解析")
    private String analysis;
        @ApiModelProperty("题目难度")
    private String difficulty;
        @ApiModelProperty("年级课程")
    private String gradeCourse;
        @ApiModelProperty("创建时间")
    private Date createTime;
        @ApiModelProperty("更新时间")
    private Date updateTime;
        @ApiModelProperty("创建人")
    private Integer createId;
    
}
