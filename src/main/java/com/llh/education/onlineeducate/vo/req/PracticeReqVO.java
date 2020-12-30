package com.llh.education.onlineeducate.vo.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("试题范围")
public class PracticeReqVO {

    @ApiModelProperty("学生id")
    private String sid;

    private String grade;

    private String course;

    private String start;

    private String end;
}
