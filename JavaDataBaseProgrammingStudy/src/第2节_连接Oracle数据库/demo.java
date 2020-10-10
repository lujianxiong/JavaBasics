package 第2节_连接Oracle数据库;
//范例：实现具体的数据库连接操作

import java.sql.Connection;
import java.sql.DriverManager;

public class demo {
    private static final String DATABASE_DRIVER = "oracle.jdbc.driver.OracleDriver";   //数据库的驱动程序
    private static final String DATABASE_URL = "jdbc:oracle:thin:@localhost:1521:daxiong";   //daxiong数据库连接地址  （主机名称：localhost）
    private static final String DATABASE_USER = "scott";  //daxiong数据库的用户名
    private static final String DATABASE_PASSWORD = "tiger";  //daxiong数据库的密码

    public static void main(String[] args) throws Exception{
        Connection conn = null;    //每一个Connection的接口对象描述的就是一个用户的连接
        Class.forName(DATABASE_DRIVER);    //向容器之中加载数据库驱动程序
        conn = DriverManager.getConnection(DATABASE_URL,DATABASE_USER,DATABASE_PASSWORD);
        System.out.println(conn);
        conn.close();  //数据库的连接资源有限，一定要关闭

    }
}
