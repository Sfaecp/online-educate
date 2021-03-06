/****************************************************
 * 系统名称： 债券多级托管系统
 * 工程名称: 在线试题
 * 公司名称: 深圳市赢时胜信息技术股份有限公司
 *
 * All rights Reserved, Designed By 赢时胜软件
 * @Copyright:2016-2020
 *
 ********************************************************/
package com.llh.education.onlineeducate.controller;

import com.github.pagehelper.PageInfo;
import com.llh.education.onlineeducate.common.ComResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import java.util.List;


import com.llh.education.onlineeducate.entity.FillQuestionEntity;

import com.llh.education.onlineeducate.vo.req.FillQuestionAddReqVO;
import com.llh.education.onlineeducate.vo.req.FillQuestionQryReqVO;
import com.llh.education.onlineeducate.vo.req.FillQuestionUpdateReqVO;
import com.llh.education.onlineeducate.vo.rep.FillQuestionRepVO;


/**
 * 类描述：填空题试题表 控制器
 * 类名称：FillQuestionController
 * 包路径：com.llh.education.onlineeducate.controller
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 10:00:49
 */
@Api(tags="填空题试题表")
@Slf4j
@Controller
@RequestMapping("education/fillquestion")
public class FillQuestionController {

    @ApiOperation(value="填空题试题表-分页列表查询", notes="填空题试题表-分页列表查询")
    @PostMapping(value = "/pageList")
    @ResponseBody
    public ComResponse<PageInfo<FillQuestionRepVO>> queryPageList(@RequestBody FillQuestionQryReqVO fillQuestionQryReqVO) {

        return ComResponse.handleSuccess(null);
    }

    @ApiOperation(value = "填空题试题表-新增", notes = "单条新增-填空题试题表")
    @PostMapping(value = "/add")
    @ResponseBody
    public ComResponse<String> add(@RequestBody FillQuestionAddReqVO fillQuestionAddReqVO) {
       
        return ComResponse.handleSuccess("新增成功！");
    }

    @ApiOperation(value = "填空题试题表-修改", notes = "单条修改保存填空题试题表")
    @PutMapping(value = "/update")
    @ResponseBody
    public ComResponse<String> update(@RequestBody FillQuestionUpdateReqVO fillQuestionUpdateReqVO) {

        return ComResponse.handleSuccess("修改成功!");
    }

    @ApiOperation(value="填空题试题表-详情", notes="通过id查详情-填空题试题表")
    @GetMapping(value = "/detail/{id}")
    @ResponseBody
    public ComResponse<FillQuestionRepVO> detailById(@PathVariable Long id) {
        return ComResponse.handleSuccess(null);
    }

    @ApiOperation(value = "填空题试题表-删除", notes = "根据id单条逻辑删除-填空题试题表")
    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public ComResponse<String> delete(@PathVariable Long id){

        return ComResponse.handleSuccess("删除成功");
    }

    @ApiOperation(value = "填空题试题表-批量删除", notes = "根据id集合批量逻辑删除-填空题试题表")
    @DeleteMapping("/deleteBatch")
    @ResponseBody
    public ComResponse<String> deleteBatch(@RequestBody List<String> ids){

        return ComResponse.handleSuccess("批量删除成功");
    }

    @ApiOperation(value = "填空题试题表-导出选中项", notes = "填空题试题表-导出选中项")
    @PostMapping(value = "/export/selected")
    public ComResponse<String> exportSelected(@RequestBody List<Long> ids) {

        return ComResponse.handleSuccess("导出成功");
    }

    @ApiOperation(value = "填空题试题表-按条件导出", notes = "填空题试题表-按条件导出")
    @PostMapping(value = "/export/condition")
    public ComResponse<String> exportCondition(@RequestBody FillQuestionQryReqVO qryVO) {

        return ComResponse.handleSuccess("导出成功");
    }

}
