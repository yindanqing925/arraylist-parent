package org.nh.common.config.datasource.resolve;

import org.nh.common.config.datasource.extend.DataSourceProperties;
import org.springframework.core.env.Environment;

/**
 * @program: PropertiesResolve.java
 * @description:
 * @author: yindanqing
 * @create: 2020/7/21 14:15
 */
public class PropertiesResolve {

    private static final String URL = ".datasource.url";
    private static final String DRIVER = ".datasource.driver";
    private static final String USERNAME = ".datasource.username";
    private static final String PASSWORD = ".datasource.password";
    // 初始化大小，最小，最大
    private static final String INIT_SIZE = ".datasource.initSize";
    private static final String MIN_IDLE = ".datasource.minIdle";
    private static final String MAX_ACTIVE = ".datasource.maxActive";
    // 配置获取连接等待超时的时间
    private static final String MAX_WAIT = ".datasource.maxWait";
    // 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
    private static final String TIME_BETWEEN_EVICTION_RUNS_MILLIS = ".datasource.timeBetweenEvictionRunsMillis";
    // 配置一个连接在池中最小生存的时间，单位是毫秒
    private static final String MIN_EVICTABLE_IDLE_TIME_MILLIS = ".datasource.minEvictableIdleTimeMillis";
    // 校验SQL，Oracle配置 private static  String .datasource.validationQuery=SELECT 1 FROM DUAL，如果不配validationQuery项，则下面三项配置无用
    private static final String VALIDATION_QUERY = ".datasource.validationQuery";
    private static final String TEST_WHILE_IDLE = ".datasource.testWhileIdle";
    private static final String TEST_ON_BORROW = ".datasource.testOnBorrow";
    private static final String TEST_ON_RETURN = ".datasource.testOnReturn";
    // 打开PSCache，并且指定每个连接上PSCache的大小
    private static final String POOL_PREPARED_STATEMENTS = ".datasource.poolPreparedStatements";
    private static final String MAX_POOL_PREPARED_STATEMENT_PER_CONNECTION_SIZE = ".datasource.maxPoolPreparedStatementPerConnectionSize";
    // 配置监控统计拦截的filters，去掉后监控界面sql无法统计，'wall'用于防火墙
    private static final String FILTERS = ".datasource.filters";
    // 通过connectProperties属性来打开mergeSql功能；慢SQL记录
    private static final String CONNECTION_PROPERTIES = ".datasource.connectionProperties";
    // 合并多个DruidDataSource的监控数据
    private static final String USE_GLOBAL_DATA_SOURCE_STAT = ".datasource.useGlobalDataSourceStat";

    private static final String COMMON = "common";

    /**
     * @param environment
     * @param sign
     * @return
     */
    public static DataSourceProperties getPropertiesByEnvironment(Environment environment, String sign) {
        DataSourceProperties dataSourceProperties = new DataSourceProperties();
        dataSourceProperties.setUrl(getPorperty(environment, sign, URL));
        dataSourceProperties.setDriver(getPorperty(environment, sign, DRIVER));
        dataSourceProperties.setUsername(getPorperty(environment, sign, USERNAME));
        dataSourceProperties.setPassword(getPorperty(environment, sign, PASSWORD));
        String initSize = getPorperty(environment, sign, INIT_SIZE);
        dataSourceProperties.setInitSize(Integer.parseInt(initSize));
        String minIdle = getPorperty(environment, sign, MIN_IDLE);
        dataSourceProperties.setMinIdle(Integer.parseInt(minIdle));
        String maxActive = getPorperty(environment, sign, MAX_ACTIVE);
        dataSourceProperties.setMaxActive(Integer.parseInt(maxActive));
        String maxWait = getPorperty(environment, sign, MAX_WAIT);
        dataSourceProperties.setMaxWait(Long.parseLong(maxWait));
        String timeBetweenEvictionRunsMillis = getPorperty(environment, sign, TIME_BETWEEN_EVICTION_RUNS_MILLIS);
        dataSourceProperties.setTimeBetweenEvictionRunsMillis(Long.parseLong(timeBetweenEvictionRunsMillis));
        dataSourceProperties.setValidationQuery(getPorperty(environment, sign, VALIDATION_QUERY));
        String testWhileIdle = getPorperty(environment, sign, TEST_WHILE_IDLE);
        dataSourceProperties.setTestWhileIdle(Boolean.getBoolean(testWhileIdle));
        String testOnBorrow = getPorperty(environment, sign, TEST_ON_BORROW);
        dataSourceProperties.setTestOnBorrow(Boolean.getBoolean(testOnBorrow));
        String testOnReturn = getPorperty(environment, sign, TEST_ON_RETURN);
        dataSourceProperties.setTestOnReturn(Boolean.getBoolean(testOnReturn));
        String poolPreparedStatements = getPorperty(environment, sign, POOL_PREPARED_STATEMENTS);
        dataSourceProperties.setPoolPreparedStatements(Boolean.getBoolean(poolPreparedStatements));
        String maxPoolPreparedStatementPerConnectionSize = getPorperty(environment, sign, MAX_POOL_PREPARED_STATEMENT_PER_CONNECTION_SIZE);
        dataSourceProperties.setMaxPoolPreparedStatementPerConnectionSize(Integer.parseInt(maxPoolPreparedStatementPerConnectionSize));
        dataSourceProperties.setFilters(getPorperty(environment, sign, FILTERS));
        return dataSourceProperties;
    }

    private static String getPorperty(Environment environment, String prefix, String suffix){
        String property = environment.getProperty(prefix + suffix);
        if(property == null || property.trim().length() == 0){
            return environment.getProperty(COMMON + suffix);
        }
        return property;
    }

}
