package com.llh.education.onlineeducate.util;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

/**
 * 分布式唯一Id生成
 */
public final class DistributeKeyUtil {

    public static String generateId() {
        Long id = null;

        //参数1为终端ID
        //参数2为数据中心ID
        Snowflake snowflake = IdUtil.getSnowflake(1, 1);
        id = snowflake.nextId();
        return String.valueOf(id);
    }
}
