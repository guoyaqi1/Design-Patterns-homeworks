package LoginForm;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginForm {

	private JFrame frame;
	
	
	public LoginForm() {
		initialize();
	}
	
	private JTextField tfUserName;
	private JPasswordField pwdField;
	private JLabel labelUserName;
	private JLabel labelPassword;
	private JButton btnLogin;
	private JButton btnClose;
	private JLabel labelLoginInfo;

	public void display() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void validate() {
		String userName = tfUserName.getText();
		String userPassword = new String(pwdField.getPassword());
		boolean isSuccess = findUser(userName, userPassword);
		if(isSuccess) {
			JOptionPane.showMessageDialog(frame, "��¼�ɹ�");
		}else {
			JOptionPane.showMessageDialog(frame, "��¼ʧ��");
		}
	}
	
	public Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/DesignPattern";
		String userName = "root";
		String passWord = "123";
		return DriverManager.getConnection(url, userName, passWord);
	}
	
	public boolean findUser(String userName,String userPassword){
		// 用户名 root 密码 123456
		String sql = "select * from login where userName = ? and userPassword = ?";
		
		try {
			Connection con = getConnection();
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

	private void initialize() {
		frame = new JFrame("LoginForm");
		frame.setResizable(false);
		frame.setFont(new Font("MS UI Gothic", Font.PLAIN, 12));
		frame.setBounds(100, 100, 350, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		labelUserName = new JLabel("用户名");
		labelUserName.setBounds(64, 46, 60, 18);
		frame.getContentPane().add(labelUserName);
		
		labelPassword = new JLabel("密码");
		labelPassword.setBounds(74, 82, 72, 21);
		frame.getContentPane().add(labelPassword);
		
		tfUserName = new JTextField();
		tfUserName.setBounds(122, 43, 130, 24);
		frame.getContentPane().add(tfUserName);
		tfUserName.setColumns(10);
		
		btnLogin = new JButton("登录");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validate();
			}
		});
		btnLogin.setBounds(76, 142, 78, 27);
		frame.getContentPane().add(btnLogin);
		
		btnClose = new JButton("退出");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnClose.setBounds(166, 142, 78, 27);
		frame.getContentPane().add(btnClose);
		
		pwdField = new JPasswordField();
		pwdField.setBounds(122, 77, 129, 24);
		frame.getContentPane().add(pwdField);
		
		labelLoginInfo = new JLabel("");
		labelLoginInfo.setForeground(Color.RED);
		labelLoginInfo.setBounds(122, 116, 72, 18);
		frame.getContentPane().add(labelLoginInfo);
		
	}
	public static void main(String[] args) {
		LoginForm lf = new LoginForm();
		lf.display();
	}
}
