package com.llh.education.onlineeducate.vo.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 类描述：填空题试题表 响应对象
 * 类名称：FillQuestionRepVO
 * 包路径：com.llh.education.onlineeducate.vo.req
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 10:00:49
 */
@ApiModel(value = "t_llh_fill_question基础请求对象", description = "填空题试题表基础请求对象")
@Data
@EqualsAndHashCode(callSuper = false)
public class FillQuestionBaseReqVO {

    private String id;
    @ApiModelProperty(value = "题目编号,required = true") private String code;
    @ApiModelProperty(value = "题目内容,required = true") private String content;
    @ApiModelProperty(value = "答案,required = true") private String result;
    @ApiModelProperty(value = "题目解析,required = true") private String analysis;
    @ApiModelProperty(value = "年级课程,required = true") private String gradeCourse;
    @ApiModelProperty(value = "考题难度,required = true") private String difficulty;

    @ApiModelProperty(value = "创建人,required = true") private Integer createId;

}
