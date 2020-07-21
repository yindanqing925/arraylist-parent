package org.nh.common.config.datasource;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.nh.common.config.datasource.common.DataSourceUtil;
import org.nh.common.config.datasource.extend.DataSourceProperties;
import org.nh.common.config.datasource.resolve.PropertiesResolve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 考虑的哟数据源的支持
 * @program: DataSourceConfig.java
 * @description: 集成数据源, 目前只支持但数据源
 * @author: yindanqing
 * @create: 2020/7/21 14:15
 */
@Configuration
@EnableTransactionManagement
public class DataSourceConfig {

    @Value("${application.sign}")
    private String applicationSign;

    @Autowired
    private Environment environment;

    // 唯一标识
    //这里暂时没有想好怎么处理比较完美
    //String DATASOURCE =APPLICATION_SIGN +  "DataSource";
    //String TRANSACTION_MANAGER = APPLICATION_SIGN + "TransactionManager";
    //String SQL_SESSION_FACTORY = APPLICATION_SIGN + "SqlSessionFactory";
    String PACKAGE = "org.nh.cloud." + applicationSign + ".microservice.**.dao";
    String MAPPER_LOCATION = "classpath:org/nh/cloud/"+ applicationSign +"/microservice/**/*.xml";

    @Bean
    public DataSource dataSource() throws SQLException {
        DataSourceProperties dataSourceProperties = PropertiesResolve.getPropertiesByEnvironment(environment, applicationSign);
        return DataSourceUtil.getInstance().getDataSource(dataSourceProperties);
    }

    @Bean
    public PlatformTransactionManager transactionManager() throws Exception {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));
        sessionFactory.setTypeAliasesPackage(PACKAGE);
        return sessionFactory.getObject();
    }

    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        //servletRegistrationBean.addInitParameter("allow","127.0.0.1");  //设置ip白名单
        //servletRegistrationBean.addInitParameter("deny","192.168.0.19");//设置ip黑名单，优先级高于白名单
        //设置控制台管理用户
        servletRegistrationBean.addInitParameter("loginUsername","admin");
        servletRegistrationBean.addInitParameter("loginPassword","123456");
        //是否可以重置数据
        servletRegistrationBean.addInitParameter("resetEnable","false");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean statFilter(){
        //创建过滤器
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        //设置过滤器过滤路径
        filterRegistrationBean.addUrlPatterns("/*");
        //忽略过滤的形式
        filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }


}
