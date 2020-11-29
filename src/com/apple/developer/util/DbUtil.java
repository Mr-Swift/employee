package com.apple.developer.util;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.activation.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class DbUtil {
    private static ThreadLocal<Connection> threadLocal=new ThreadLocal<>();

    public static DataSource dataSource=null;

    public static Properties properties = new Properties();

    static{
        try {
            properties.load(DbUtil.class.getClassLoader().getResourceAsStream("db.properties"));
            dataSource = (DataSource) BasicDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
