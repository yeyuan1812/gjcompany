package Controller.Main.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.member.implMember;
import Model.member;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;

public class loginUI extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginUI frame = new loginUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		username = new JTextField();
		username.setBounds(185, 138, 96, 21);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("帳號");
		lblNewLabel.setBounds(129, 141, 46, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("密碼");
		lblNewLabel_1.setBounds(129, 177, 46, 15);
		contentPane.add(lblNewLabel_1);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(185, 169, 96, 21);
		contentPane.add(password);
		
		JButton login = new JButton("登入");
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.帳號密碼 getText()
				 * 2.queryUser(帳號,密碼):member
				 * 3.!=null--->loginSuccess
				 * 4.null-->loginError
				 */
				
				String Username=username.getText();
				String Password=password.getText();
				
				member m=new implMember().queryMember(Username,Password);
				if(m!=null)
				{
					loginSuccess l=new loginSuccess();
					l.show();
					dispose();
				}
				else
				{
					loginError l=new loginError();
					l.show();
					dispose();
					
					
				}
			
			
			}
		});
		login.setBounds(194, 225, 87, 23);
		contentPane.add(login);
	}
}
