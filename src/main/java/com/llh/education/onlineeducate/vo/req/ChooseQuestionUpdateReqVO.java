/****************************************************
 * 系统名称： 债券多级托管系统
 * 工程名称: 在线试题
 * 公司名称: 深圳市赢时胜信息技术股份有限公司
 *
 * All rights Reserved, Designed By 赢时胜软件
 * @Copyright:2016-2020
 *
 ********************************************************/
package com.llh.education.onlineeducate.vo.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 类描述：选择题试题表 响应对象
 * 类名称：ChooseQuestionRepVO
 * 包路径：com.llh.education.onlineeducate.vo.req
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 10:00:48
 */
@ApiModel(value="t_llh_choose_question更新对象", description="选择题试题表更新对象")
@Data
@EqualsAndHashCode(callSuper = false)
public class ChooseQuestionUpdateReqVO extends ChooseQuestionBaseReqVO{

    @ApiModelProperty(value = "主键id",required = true)
    private String id;
}
