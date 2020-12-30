package com.llh.education.onlineeducate.vo.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("提交试题答案")
public class CheckQuestionVO {

    @ApiModelProperty("题目类型，选择题，填空题")
    private String type;

    @ApiModelProperty("提交的答案")
    private String result;

    @ApiModelProperty("题目id")
    private String itemId;

    @ApiModelProperty("题目编号")
    private String itemCode;

    @ApiModelProperty("答题人id")
    private String sId;

    @ApiModelProperty("阶段")
    private String term;
}
