package org.nh.common.config.datasource.suffix;

import org.nh.common.config.datasource.DataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @program: DataSourceConfigSuffix.java
 * @description: 数据源注入前置类, 暂时没用
 * @author: yindanqing
 * @create: 2020/7/21 17:14
 */
public class DataSourceConfigPrefix implements Condition {

    @Autowired
    private DataSourceConfig dataSourceConfig;

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return false;
    }
}
