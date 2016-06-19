package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	final static String driverName="com.mysql.jdbc.Driver";
	final static String url="jdbc:mysql://localhost:3306/mysql";
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
	
	// �ر����ݿ�
	public static void closeConnection(Connection conn){
		try{
			if((conn!=null) && (!conn.isClosed())){
				conn.close();
				conn = null;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	//��main��������
	public static void main(String[] args) {
		Connection conn = DBUtil.getConnection();
		if (conn!=null) {
			System.out.println("���ݿ����ӳɹ���");
		}else {
			System.out.println("���ݿ�����ʧ��!");
		}
	}
}
