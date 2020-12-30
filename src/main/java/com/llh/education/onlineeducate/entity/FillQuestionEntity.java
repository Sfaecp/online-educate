
package com.llh.education.onlineeducate.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 类描述：填空题试题表 持久化对象
 * 类名称：FillQuestionEntity
 * 包路径：com.llh.education.onlineeducate.entity
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 10:00:49
 */
@ApiModel(value="t_llh_fill_question持久化对象", description="填空题试题表")
@Data
@EqualsAndHashCode(callSuper = false)
public class FillQuestionEntity {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "题目编号")
	private String code;
	@ApiModelProperty(value = "题目内容")
	private String content;
	@ApiModelProperty(value = "答案")
	private String result;
	@ApiModelProperty(value = "题目解析")
	private String analysis;
	@ApiModelProperty(value = "年级课程")
	private String gradeCourse;
	@ApiModelProperty(value = "考题难度")
	private String difficulty;
	@ApiModelProperty(value = "创建人")
	private Integer createId;
	
}
