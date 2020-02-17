package LoginForm_s;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/DesignPattern";
		String userName = "root";
		String passWord = "123";
		return DriverManager.getConnection(url, userName, passWord);
	}
}
