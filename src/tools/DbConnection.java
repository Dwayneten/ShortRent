package tools;

import java.sql.*;
//����mysql���ݿ�����
public class DbConnection {
	//������ز���
	final static String driverName="com.mysql.jdbc.Driver";
	final static String url="jdbc:mysql://localhost:3306/shortrent";
	static String username= "root";
	static String password="root";
	
	//��ȡ���ݿ����ӣ���Ҫ�����쳣
	public static Connection getConnection(){
		Connection conn=null;
		try {
			Class.forName(driverName);
			conn=DriverManager.getConnection(url, username, password);
			return conn;
		} catch (Exception e) {
			System.out.println("�޷��������ݿ⣬�����쳣");
			e.printStackTrace();
			return conn;
		}
	}
	
	//��main��������
	public static void main(String[] args) {
		Connection conn = DbConnection.getConnection();
		if (conn!=null) {
			System.out.println("���ݿ����ӳɹ���");
		}else {
			System.out.println("���ݿ�����ʧ��!");
		}
	}
}
