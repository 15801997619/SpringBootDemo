package com.springbootdemo.springbootdemo.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
public class DruidDBConfig {
	@Value("${spring.datasource.url}")
    private String dbUrl;
 
    @Value("${spring.datasource.username}")
    private String username;
 
    @Value("${spring.datasource.password}")
    private String password;
 
    @Value("${spring.datasource.driverClassName}")
    private String driverClassName;
 
    @Value("${spring.datasource.initialSize}")
    private int initialSize;
 
    @Value("${spring.datasource.minIdle}")
    private int minIdle;
 
    @Value("${spring.datasource.maxActive}")
    private int maxActive;
 
    @Value("${spring.datasource.maxWait}")
    private int maxWait;
 
    @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;
 
    @Value("${spring.datasource.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;
 
    @Value("${spring.datasource.validationQuery}")
    private String validationQuery;
 
    @Value("${spring.datasource.testWhileIdle}")
    private boolean testWhileIdle;
 
    @Value("${spring.datasource.testOnBorrow}")
    private boolean testOnBorrow;
 
    @Value("${spring.datasource.testOnReturn}")
    private boolean testOnReturn;
 
    @Value("${spring.datasource.poolPreparedStatements}")
    private boolean poolPreparedStatements;
 
    @Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;
 
    @Value("${spring.datasource.filters}")
    private String filters;
 
    @Value("{spring.datasource.connectionProperties}")
    private String connectionProperties;
 
    @Bean     //声明其为Bean实例
    @Primary  //在同样的DataSource中，首先使用被标注的DataSource
    public DataSource dataSource() {
        DruidDataSource datasource = new DruidDataSource();
 
        datasource.setUrl(this.dbUrl);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverClassName);
 
        //configuration
        datasource.setInitialSize(initialSize);
        datasource.setMinIdle(minIdle);
        datasource.setMaxActive(maxActive);
        datasource.setMaxWait(maxWait);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        datasource.setValidationQuery(validationQuery);
        datasource.setTestWhileIdle(testWhileIdle);
        datasource.setTestOnBorrow(testOnBorrow);
        datasource.setTestOnReturn(testOnReturn);
        datasource.setPoolPreparedStatements(poolPreparedStatements);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        try {
            datasource.setFilters(filters);
        } catch (SQLException e) {
            System.err.print("druid configuration initialization filter :"+e.getErrorCode());
        }
        datasource.setConnectionProperties(connectionProperties);
 
        return datasource;
        
    }
    @Bean
    public ServletRegistrationBean statViewServle(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        // IP白名单
        servletRegistrationBean.addInitParameter("allow","127.0.0.1");
        //控制台管理用户
        servletRegistrationBean.addInitParameter("loginUsername","jieyi");
        servletRegistrationBean.addInitParameter("loginPassword","111111");
        //是否能够重置数据
        servletRegistrationBean.addInitParameter("resetEnable","false");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean statFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        //添加过滤规则
        filterRegistrationBean.addUrlPatterns("/*");
        //忽略过滤的格式
        filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
