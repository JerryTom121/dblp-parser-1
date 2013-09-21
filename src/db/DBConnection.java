package db;

import java.sql.*;


public class DBConnection {
	
	private static String dbUrl = "jdbc:mysql://127.0.0.1:3306/dblp_inproc?useUnicode=true&characterEncoding=utf-8";
	private static String user = "root";
	private static String password = "123456";

  
	public static Connection getConn()
	{
		//����MySQL���ݿ���������
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			//���һ�����ݿ�����
			Connection conn = DriverManager.getConnection(dbUrl,user,password);
			
			return conn;
		} catch (Exception e) {
			System.out.println("Error while opening a conneciton to database server: " + e.getMessage());
		}
		
		return null;
	
	}

	public Connection getConnNew()
	throws SQLException ,ClassNotFoundException{
		//����MySQL���ݿ���������
		Class.forName("org.gjt.mm.mysql.Driver");
		
		Connection conn = DriverManager.getConnection(dbUrl,user,password);
		return conn;
	}
}
