
package com.llh.education.onlineeducate.mapper;

import java.util.List;

import com.llh.education.onlineeducate.entity.ChooseQuestionEntity;
import tk.mybatis.mapper.common.Mapper;

/**
 * 类描述：选择题试题表 数据层
 * 类名称：IChooseQuestionMapper
 * 包路径：com.llh.education.onlineeducate.dao
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 10:00:48
 */

public interface ChooseQuestionMapper extends Mapper<ChooseQuestionEntity> {

    int insertBatch(List<ChooseQuestionEntity> list);

    ChooseQuestionEntity querySingleQuestion(ChooseQuestionEntity params);
}
