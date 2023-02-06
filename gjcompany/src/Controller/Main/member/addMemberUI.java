package Controller.Main.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.member.implMember;
import Model.member;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class addMemberUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField name;
	private JTextField username;
	private JTextField password;
	private JTextField address;
	private JTextField mobile;
	private JTextField phone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addMemberUI frame = new addMemberUI();
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
	public addMemberUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(279, 10, 1, 1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(222, 184, 135));
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("name");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel.setBounds(21, 56, 51, 33);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("帳號");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblNewLabel_1.setBounds(21, 99, 51, 33);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("密碼");
		lblNewLabel_1_1.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(21, 142, 51, 33);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("地址");
		lblNewLabel_1_1_1.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(21, 192, 51, 33);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("行動");
		lblNewLabel_1_1_1_1.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(21, 237, 51, 33);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("電話");
		lblNewLabel_1_1_1_1_1.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1.setBounds(21, 286, 51, 33);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(82, 56, 96, 31);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(82, 99, 96, 30);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(82, 142, 96, 30);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(82, 192, 163, 30);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(82, 237, 96, 33);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(82, 289, 96, 33);
		panel_1.add(textField_5);
		
		JLabel lblNewLabel_3_1 = new JLabel("新增會員資料");
		lblNewLabel_3_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_3_1.setBounds(71, 10, 118, 33);
		panel_1.add(lblNewLabel_3_1);
		
		JButton add = new JButton("新增");
		add.setFont(new Font("新細明體", Font.BOLD, 16));
		add.setBounds(71, 341, 87, 33);
		panel_1.add(add);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(222, 184, 135));
		panel_1_1.setBounds(160, 0, 255, 399);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("name");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel_2.setBounds(21, 56, 51, 33);
		panel_1_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("帳號");
		lblNewLabel_1_2.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(21, 99, 51, 33);
		panel_1_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("密碼");
		lblNewLabel_1_1_2.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblNewLabel_1_1_2.setBounds(21, 142, 51, 33);
		panel_1_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("地址");
		lblNewLabel_1_1_1_2.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblNewLabel_1_1_1_2.setBounds(21, 192, 51, 33);
		panel_1_1.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("行動");
		lblNewLabel_1_1_1_1_2.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_2.setBounds(21, 237, 51, 33);
		panel_1_1.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("電話");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1_1.setBounds(21, 286, 51, 33);
		panel_1_1.add(lblNewLabel_1_1_1_1_1_1);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(82, 56, 96, 31);
		panel_1_1.add(name);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(82, 99, 96, 30);
		panel_1_1.add(username);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(82, 142, 96, 30);
		panel_1_1.add(password);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(82, 192, 163, 30);
		panel_1_1.add(address);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(82, 237, 96, 33);
		panel_1_1.add(mobile);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(82, 289, 96, 33);
		panel_1_1.add(phone);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("新增會員資料");
		lblNewLabel_3_1_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_3_1_1.setBounds(71, 10, 118, 33);
		panel_1_1.add(lblNewLabel_3_1_1);
		
		JButton add2 = new JButton("新增");
		add2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.username-->getText
				 * 2.帳號判斷-->queryusername():boolean
				 * 3.true-->重複-->addError
				 * 4.false-->接收所有資料-->new member-->add()-->addSuccess
				 */
				String Username=username.getText();
				if(new implMember().queryUser(Username))
				{
					addError error=new addError();
					error.show();
					dispose();
				}
				else
				{
					String Name=name.getText();
					String Password=password.getText();
					String Address=address.getText();
					String Mobile=mobile.getText();
					String Phone=phone.getText();
					
					member m=new member(Name,Username,Password,Address,Mobile,Phone);
					
					new implMember().add(m);
					
					addSuccess success=new addSuccess();
					success.show();
					dispose();
				}
				
				
			}
		});
		add2.setFont(new Font("新細明體", Font.BOLD, 16));
		add2.setBounds(71, 341, 87, 33);
		panel_1_1.add(add2);
	}

}
