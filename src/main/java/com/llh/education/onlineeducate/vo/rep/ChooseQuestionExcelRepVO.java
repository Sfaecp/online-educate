/****************************************************
 * 系统名称： 债券多级托管系统
 * 工程名称: 在线试题
 * 公司名称: 深圳市赢时胜信息技术股份有限公司
 *
 * All rights Reserved, Designed By 赢时胜软件
 * @Copyright:2016-2020
 *
 ********************************************************/
package com.llh.education.onlineeducate.vo.rep;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.win.bmtp.common.util.vo.rep.BaseExcelRepVO;

import java.math.BigDecimal;

/**
 * 类描述：选择题试题表 响应对象
 * 类名称：ChooseQuestionRepVO
 * 包路径：com.llh.education.onlineeducate.vo.rep
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 10:00:48
 */
@ApiModel(value="t_llh_choose_question导出对象", description="选择题试题表导出对象")
@Data
@EqualsAndHashCode(callSuper = false)
public class ChooseQuestionExcelRepVO extends BaseExcelRepVO {

	private static final long serialVersionUID = 1L;

									@ApiModelProperty(value = "题目编号")
			@ExcelProperty("题目编号")
			private String code;
								@ApiModelProperty(value = "题目内容")
			@ExcelProperty("题目内容")
			private String content;
								@ApiModelProperty(value = "选项A")
			@ExcelProperty("选项A")
			private String optionA;
								@ApiModelProperty(value = "选项B")
			@ExcelProperty("选项B")
			private String optionB;
								@ApiModelProperty(value = "选项C")
			@ExcelProperty("选项C")
			private String optionC;
								@ApiModelProperty(value = "选项D")
			@ExcelProperty("选项D")
			private String optionD;
								@ApiModelProperty(value = "答案")
			@ExcelProperty("答案")
			private String result;
								@ApiModelProperty(value = "答案解析")
			@ExcelProperty("答案解析")
			private String analysis;
								@ApiModelProperty(value = "题目难度")
			@ExcelProperty("题目难度")
			private String difficulty;
								@ApiModelProperty(value = "年级课程")
			@ExcelProperty("年级课程")
			private String gradeCourse;
														@ApiModelProperty(value = "创建人")
			@ExcelProperty("创建人")
			private Integer createId;
			
}