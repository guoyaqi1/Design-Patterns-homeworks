package LoginForm_s;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm_s {
	
	private UserDao userDao = new UserDao();
	private JFrame frame;
	
	
	public LoginForm_s() {
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
		boolean isSuccess = userDao.findUser(userName, userPassword);
		if(isSuccess) {
			JOptionPane.showMessageDialog(frame, "登录成功");
		}else {
			JOptionPane.showMessageDialog(frame, "登录失败");
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
}
