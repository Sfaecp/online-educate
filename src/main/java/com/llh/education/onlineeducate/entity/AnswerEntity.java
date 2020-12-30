/****************************************************
 * 系统名称： 债券多级托管系统
 * 工程名称: 在线考试
 * 公司名称: 深圳市赢时胜信息技术股份有限公司
 *
 * All rights Reserved, Designed By 赢时胜软件
 * @Copyright:2016-2020
 *
 ********************************************************/
package com.llh.education.onlineeducate.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 类描述：答题表 持久化对象
 * 类名称：AnswerEntity
 * 包路径：com.llh.education.onlineeducate.entity
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 15:49:30
 */
@ApiModel(value="t_llh_answer持久化对象", description="答题表")
@Data
@EqualsAndHashCode(callSuper = false)
public class AnswerEntity {

	private String id;
	@ApiModelProperty(value = "试题编号")
	private String qId;
	@ApiModelProperty(value = "学生编号")
	private String sId;
	@ApiModelProperty(value = "是否正确 c-正确 f-错误")
	private String flag;
	@ApiModelProperty(value = "阶段")
	private String term;
	@ApiModelProperty(value = "创建时间")
	private Date createTime;
}
