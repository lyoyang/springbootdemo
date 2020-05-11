package com.lyoyang.springbootmultipledatasourcetransaction.datasource;


import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@MapperScan(basePackages = "com.lyoyang.springbootmultipledatasourcetransaction.test2", sqlSessionTemplateRef = "test2SqlSessionTemplate")
public class DataSource2Config {

    /**
     * 配置test2数据库s
     * @return
     */
    @Bean(name = "test2DataSource")
    public DataSource testDataSource(DBConfig2 dbConfig2) throws SQLException {
        MysqlXADataSource mysqlXaDataSource = new MysqlXADataSource();
        mysqlXaDataSource.setUrl(dbConfig2.getUrl());
        mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
        mysqlXaDataSource.setPassword(dbConfig2.getPassword());
        mysqlXaDataSource.setUser(dbConfig2.getUsername());
        mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(mysqlXaDataSource);
        xaDataSource.setUniqueResourceName("test2DataSource");

        xaDataSource.setMinPoolSize(dbConfig2.getMinPoolSize());
        xaDataSource.setMaxPoolSize(dbConfig2.getMaxPoolSize());
        xaDataSource.setMaxLifetime(dbConfig2.getMaxLifetime());
        xaDataSource.setBorrowConnectionTimeout(dbConfig2.getBorrowConnectionTimeout());
        xaDataSource.setLoginTimeout(dbConfig2.getLoginTimeout());
        xaDataSource.setMaintenanceInterval(dbConfig2.getMaintenanceInterval());
        xaDataSource.setMaxIdleTime(dbConfig2.getMaxIdleTime());
        xaDataSource.setTestQuery(dbConfig2.getTestQuery());
        return xaDataSource;



//        MysqlXADataSource mysqlXADataSource = new MysqlXADataSource();
//        mysqlXADataSource.setURL(dbConfig2.getUrl());
//        mysqlXADataSource.setPinGlobalTxToPhysicalConnection(true);
//        mysqlXADataSource.setPassword(dbConfig2.getPassword());
//        mysqlXADataSource.setUser(dbConfig2.getUsername());
//        mysqlXADataSource.setPinGlobalTxToPhysicalConnection(true);
//        AtomikosDataSourceBean atomikosDataSourceBean = new AtomikosDataSourceBean();
//        atomikosDataSourceBean.setXaDataSource(mysqlXADataSource);
//        atomikosDataSourceBean.setUniqueResourceName("test2DataSource");
//        atomikosDataSourceBean.setMinPoolSize(dbConfig2.getMinPoolSize());
//        atomikosDataSourceBean.setMaxPoolSize(dbConfig2.getMaxPoolSize());
//        atomikosDataSourceBean.setMaxLifetime(dbConfig2.getMaxLifetime());
//        atomikosDataSourceBean.setBorrowConnectionTimeout(dbConfig2.getBorrowConnectionTimeout());
//        atomikosDataSourceBean.setLoginTimeout(dbConfig2.getLoginTimeout());
//        atomikosDataSourceBean.setMaintenanceInterval(dbConfig2.getMaintenanceInterval());
//        atomikosDataSourceBean.setMaxIdleTime(dbConfig2.getMaxIdleTime());
//        atomikosDataSourceBean.setTestQuery(dbConfig2.getTestQuery());
//        return atomikosDataSourceBean;
    }

    /**
     * test2 数据会话工厂
     * @param dataSource
     * @return
     * @throws Exception
     */
    @Bean(name = "test2SqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("test2DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        //mybatis写配置文件
//		 bean.setMapperLocations(
//		 PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/test2/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }


    @Bean(name = "test2SqlSessionTemplate")
    public SqlSessionTemplate test2SqlSessionTemplate(@Qualifier("test2SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
