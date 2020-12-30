package com.llh.education.onlineeducate.vo.req;

import com.llh.education.onlineeducate.common.BaseQryReqVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 类描述：填空题试题表 响应对象
 * 类名称：FillQuestionRepVO
 * 包路径：com.llh.education.onlineeducate.vo.req
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 10:00:49
 */
@ApiModel(value="t_llh_fill_question查询条件对象", description="填空题试题表查询条件对象")
@Data
@EqualsAndHashCode(callSuper = false)
public class FillQuestionQryReqVO extends BaseQryReqVO {


        @ApiModelProperty("主键")
    private String id;
        @ApiModelProperty("题目编号")
    private String code;
        @ApiModelProperty("题目内容")
    private String content;
        @ApiModelProperty("答案")
    private String result;
        @ApiModelProperty("题目解析")
    private String analysis;
        @ApiModelProperty("年级课程")
    private String gradeCourse;
        @ApiModelProperty("考题难度")
    private String difficulty;
        @ApiModelProperty("创建时间")
    private Date createTime;
        @ApiModelProperty("变更时间")
    private Date updateTime;
        @ApiModelProperty("创建人")
    private String createId;
    
}
