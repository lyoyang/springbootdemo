package com.lyoyang.springbootmultipledatasourcetransaction.datasource;

import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@MapperScan(basePackages = "com.lyoyang.springbootmultipledatasourcetransaction.test1", sqlSessionTemplateRef = "test1SqlSessionTemplate")
public class DataSource1Config {

    /**
     * 配置test1数据库
     * @return
     */
    @Primary
    @Bean(name = "test1DataSource")
    public DataSource testDataSource(DBConfig1 dbConfig1) throws SQLException {


        MysqlXADataSource mysqlXaDataSource = new MysqlXADataSource();
        mysqlXaDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/test");
        mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
        mysqlXaDataSource.setPassword("root");
        mysqlXaDataSource.setUser("root");
        mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);

        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(mysqlXaDataSource);
        xaDataSource.setUniqueResourceName("test1DataSource");

        xaDataSource.setMinPoolSize(3);
        xaDataSource.setMaxPoolSize(25);
        xaDataSource.setMaxLifetime(20000);
        xaDataSource.setBorrowConnectionTimeout(30);
        xaDataSource.setLoginTimeout(30);
        xaDataSource.setMaintenanceInterval(60);
        xaDataSource.setMaxIdleTime(60);
        xaDataSource.setTestQuery("select 1");
        return xaDataSource;

//        MysqlXADataSource mysqlXADataSource = new MysqlXADataSource();
//        mysqlXADataSource.setURL(dbConfig1.getUrl());
//        mysqlXADataSource.setPinGlobalTxToPhysicalConnection(true);
//        mysqlXADataSource.setPassword(dbConfig1.getPassword());
//        mysqlXADataSource.setUser(dbConfig1.getUsername());
//        mysqlXADataSource.setPinGlobalTxToPhysicalConnection(true);
//
//        AtomikosDataSourceBean atomikosDataSourceBean = new AtomikosDataSourceBean();
//        atomikosDataSourceBean.setXaDataSource(mysqlXADataSource);
//        atomikosDataSourceBean.setUniqueResourceName("test1DataSource");
//        atomikosDataSourceBean.setMinPoolSize(dbConfig1.getMinPoolSize());
//        atomikosDataSourceBean.setMaxPoolSize(dbConfig1.getMaxPoolSize());
//        atomikosDataSourceBean.setMaxLifetime(dbConfig1.getMaxLifetime());
//        atomikosDataSourceBean.setBorrowConnectionTimeout(dbConfig1.getBorrowConnectionTimeout());
//        atomikosDataSourceBean.setLoginTimeout(dbConfig1.getLoginTimeout());
//        atomikosDataSourceBean.setMaintenanceInterval(dbConfig1.getMaintenanceInterval());
//        atomikosDataSourceBean.setMaxIdleTime(dbConfig1.getMaxIdleTime());
//        atomikosDataSourceBean.setTestQuery(dbConfig1.getTestQuery());
//        return atomikosDataSourceBean;
    }

    /**
     * test1 数据会话工厂
     * @param dataSource
     * @return
     * @throws Exception
     */
    @Bean(name = "test1SqlSessionFactory")
    @Primary
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("test1DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        //mybatis写配置文件
//		 bean.setMapperLocations(
//		 PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/test1/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }


    @Bean(name = "test1SqlSessionTemplate")
    @Primary
    public SqlSessionTemplate test1SqlSessionTemplate(@Qualifier("test1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
