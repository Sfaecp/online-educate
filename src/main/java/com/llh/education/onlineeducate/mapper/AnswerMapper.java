
package com.llh.education.onlineeducate.mapper;

import java.util.List;

import com.llh.education.onlineeducate.entity.AnswerEntity;
import tk.mybatis.mapper.common.Mapper;

/**
 * 类描述：答题表 数据层
 * 类名称：IAnswerMapper
 * 包路径：com.llh.education.onlineeducate.dao
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 15:49:30
 */

public interface AnswerMapper extends Mapper<AnswerEntity> {

    int insertBatch(List<AnswerEntity> list);
}
