
package com.llh.education.onlineeducate.mapper;

import java.util.List;

import com.llh.education.onlineeducate.entity.FillQuestionEntity;
import tk.mybatis.mapper.common.Mapper;

/**
 * 类描述：填空题试题表 数据层
 * 类名称：IFillQuestionMapper
 * 包路径：com.llh.education.onlineeducate.dao
 * 创建人：lbx
 * 邮箱：lbx@qq.com
 * 创建时间：2020-12-21 10:00:49
 */
//@Mapper
public interface FillQuestionMapper extends Mapper<FillQuestionEntity> {

    int insertBatch(List<FillQuestionEntity> list);
}
