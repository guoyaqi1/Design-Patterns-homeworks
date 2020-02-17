package LoginForm_s;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
	private DBUtil dbUtil =new DBUtil();
	
	public boolean findUser(String userName,String userPassword){
		// 用户名 root 密码 123456
		String sql = "select * from login where userName = ? and userPassword = ?";
		
		try {
			Connection con = dbUtil.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, userName);
			pst.setString(2, userPassword);
			ResultSet rs = pst.executeQuery();
			return rs.next()?true:false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	
	}

}
