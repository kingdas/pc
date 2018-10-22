package dao;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DbUtils {
	static final String DRIVER;
	static final String URL;
	static final String USERNAME;
	static final String PASSWORD;

	static {
		Properties p = new Properties();
		try {
			p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		DRIVER = p.getProperty("driver");
		URL = p.getProperty("url");
		USERNAME = p.getProperty("username");
		PASSWORD = p.getProperty("password");
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("注册驱动失败");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			System.out.println("获取链接对象失败");
			e.printStackTrace();
		}
		return conn;
	}

	public static <t> List<t> executeR(String sql, Class<t> cls) {
		List<t> li = new ArrayList<>();
		Connection conn = null;
		Statement sta = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		String cname = null;
		Field f = null;
		Object o = null;
		try {
			conn = getConnection();
			sta = conn.createStatement();
			rs = sta.executeQuery(sql);
			rsmd = rs.getMetaData();
			while (rs.next()) {
				o = cls.newInstance();
				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					cname = rsmd.getColumnName(i);
					try {
						f = cls.getDeclaredField(cname);
						f.setAccessible(true);
						f.set(o, rs.getObject(cname));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				li.add((t) o);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			release(rs, sta, conn);
		}
		return li;
	}

	public static ResultSet executeR(String sql, Connection conn) {
		Statement sta = null;
		ResultSet rs = null;
		try {
			sta = conn.createStatement();
			rs = sta.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	public static int executeCUD(String sql) {
		int n = 0;
		Connection conn = getConnection();
		Statement sta = null;
		try {
			sta = conn.createStatement();
			n = sta.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			release(null, sta, conn);
		}
		return n;
	}

	public static void release(ResultSet rs, Statement sta, Connection conn) {
		try {
			if (!rs.isClosed() && rs != null) {
				rs.close();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		try {
			if (!sta.isClosed() && sta != null) {
				sta.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (!conn.isClosed() && conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
