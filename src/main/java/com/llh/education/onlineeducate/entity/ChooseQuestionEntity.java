
package com.llh.education.onlineeducate.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 类描述：选择题试题表 持久化对象
 * 类名称：ChooseQuestionEntity
 * 包路径：com.llh.education.onlineeducate.entity
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 10:00:48
 */
@ApiModel(value="t_llh_choose_question持久化对象", description="选择题试题表")
@Data
@EqualsAndHashCode(callSuper = false)
public class ChooseQuestionEntity {

	private String id;

	@ApiModelProperty(value = "题目编号")
	private String code;
			@ApiModelProperty(value = "题目内容")
	private String content;
			@ApiModelProperty(value = "选项A")
	private String optionA;
			@ApiModelProperty(value = "选项B")
	private String optionB;
			@ApiModelProperty(value = "选项C")
	private String optionC;
			@ApiModelProperty(value = "选项D")
	private String optionD;
			@ApiModelProperty(value = "答案")
	private String result;
			@ApiModelProperty(value = "答案解析")
	private String analysis;
			@ApiModelProperty(value = "题目难度")
	private String difficulty;
			@ApiModelProperty(value = "年级课程")
	private String gradeCourse;
					@ApiModelProperty(value = "创建人")
	private Integer createId;
	
}
