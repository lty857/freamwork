package com.lty.freamwork.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class CreateSqlSession {
    static private SqlSessionFactory sqlSessionFactory;

    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        if(sqlSessionFactory == null){
            InputStream inputStream ;
            inputStream = Resources.getResourceAsStream("configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
        return sqlSessionFactory;
    }
    public static SqlSession OpenSession(SqlSessionFactory sqlSessionFactory){
        return sqlSessionFactory.openSession();
    }

}
