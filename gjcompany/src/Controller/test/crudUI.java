package Controller.test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.porder.*;
import Model.porder;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JScrollBar;

public class crudUI extends JFrame {

	private JPanel contentPane;
	private JTextField udesk;
	private JTextField ua;
	private JTextField ub;
	private JTextField uc;
	private JTextField id;
	private JTextField desk;
	private JTextField A;
	private JTextField B;
	private JTextField C;
	private JTextField did;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crudUI frame = new crudUI();
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
	public crudUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 139, 139));
		panel.setBounds(202, 20, 437, 235);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton selectAll = new JButton("查詢");
		selectAll.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		
		selectAll.setBounds(10, 100, 72, 23);
		panel.add(selectAll);
		
		JButton update = new JButton("修改");
		update.setBounds(146, 194, 87, 23);
		panel.add(update);
		
		JButton delete = new JButton("刪除");
		delete.setBounds(331, 194, 87, 23);
		panel.add(delete);
		
		JLabel lblNewLabel_4 = new JLabel("桌號");
		lblNewLabel_4.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel_4.setBounds(99, 35, 35, 52);
		panel.add(lblNewLabel_4);
		
		udesk = new JTextField();
		udesk.setColumns(10);
		udesk.setBounds(137, 54, 96, 21);
		panel.add(udesk);
		
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblA.setBounds(119, 77, 15, 33);
		panel.add(lblA);
		
		ua = new JTextField();
		ua.setColumns(10);
		ua.setBounds(137, 86, 96, 21);
		panel.add(ua);
		
		JLabel lblB = new JLabel("B");
		lblB.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblB.setBounds(119, 108, 15, 33);
		panel.add(lblB);
		
		ub = new JTextField();
		ub.setColumns(10);
		ub.setBounds(137, 117, 96, 21);
		panel.add(ub);
		
		JLabel lblC = new JLabel("C");
		lblC.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblC.setBounds(119, 151, 15, 33);
		panel.add(lblC);
		
		uc = new JTextField();
		uc.setColumns(10);
		uc.setBounds(137, 160, 96, 21);
		panel.add(uc);
		
		JLabel lblNewLabel_4_1 = new JLabel("Id");
		lblNewLabel_4_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(144, 0, 26, 52);
		panel.add(lblNewLabel_4_1);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(164, 19, 57, 21);
		panel.add(id);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Id");
		lblNewLabel_4_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel_4_1_1.setBounds(331, 142, 20, 33);
		panel.add(lblNewLabel_4_1_1);
		
		did = new JTextField();
		did.setColumns(10);
		did.setBounds(350, 151, 57, 21);
		panel.add(did);
		
		JTextArea showAll = new JTextArea();
		showAll.setBackground(new Color(192, 192, 192));
		showAll.setBounds(202, 279, 437, 179);
		contentPane.add(showAll);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(85, 107, 47));
		panel_1.setLayout(null);
		panel_1.setBounds(10, 20, 172, 344);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("點餐系統");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel.setBounds(63, 0, 65, 52);
		panel_1.add(lblNewLabel);
		
		JLabel lblA_1 = new JLabel("A");
		lblA_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblA_1.setBounds(34, 93, 19, 52);
		panel_1.add(lblA_1);
		
		JLabel lblB_1 = new JLabel("B");
		lblB_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblB_1.setBounds(34, 140, 22, 52);
		panel_1.add(lblB_1);
		
		JLabel lblC_1 = new JLabel("C");
		lblC_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblC_1.setBounds(31, 202, 22, 52);
		panel_1.add(lblC_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("桌號");
		lblNewLabel_4_2.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel_4_2.setBounds(18, 43, 35, 52);
		panel_1.add(lblNewLabel_4_2);
		
		desk = new JTextField();
		desk.setColumns(10);
		desk.setBounds(55, 62, 96, 21);
		panel_1.add(desk);
		
		A = new JTextField();
		A.setColumns(10);
		A.setBounds(55, 108, 96, 21);
		panel_1.add(A);
		
		B = new JTextField();
		B.setColumns(10);
		B.setBounds(55, 159, 96, 21);
		panel_1.add(B);
		
		C = new JTextField();
		C.setColumns(10);
		C.setBounds(55, 221, 96, 21);
		panel_1.add(C);
		
		JButton add = new JButton("新增");
		
		add.setBounds(41, 279, 87, 23);
		panel_1.add(add);
		
		
		//新增
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.擷取UI-->getText
				 * 2.ABC-->轉型-->int
				 * 3.new porder
				 * 4.add(p)
				 */
				String DESK=desk.getText();
				int a=Integer.parseInt(A.getText());
				int b=Integer.parseInt(B.getText());
				int c=Integer.parseInt(C.getText());
				porder p=new porder(DESK,a,b,c);
				new implPorder().add(p);
			}
		});
		
		
		//查詢
		selectAll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.List<porder> l-->selectAll()
				 *  方法1.String-->for-each-->顯示
				 *  方法2.List--->轉陣列--->toArray-->顯示 , 統計分析
				 */
				
				/*List<porder> l=new implPorder().selectAll();        //方法1
				String show="";
				
				for(porder p:l)
				{
					show=show+"id:"+p.getId()+"\t桌號:"+p.getDesk()+
							"\tA:"+p.getA()+
							"\tB:"+p.getB()+
							"\tC:"+p.getC()+"\n";
				}
				
				showAll.setText(show);*/
				
				List<porder> l=new implPorder().selectAll();          //方法2
				/*Object[] o=l.toArray();
				System.out.println(((porder)o[0]).getA());*/
				
				porder[] p=l.toArray(new porder[l.size()]);//porder[] p=new porder[3];
				
				//System.out.println(p[0].getId()+"\t"+p[0].getDesk());
				
				String show="";
				int sum=0;
				for(porder P:p)
				{
					show=show+"id:"+P.getId()+"\t桌號:"+P.getDesk()+
							"\tA:"+P.getA()+
							"\tB:"+P.getB()+
							"\tC:"+P.getC()+"\n";
					
					
				}
				
				for(int i=0;i<p.length;i++)
				{
					sum=sum+p[i].getA();
				}
				
				showAll.setText(show+"\n總共="+sum);
			
			}
		});
		
		
		
		//修改
		update.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.擷取->所有getText
				 * 2.ua,ub,uc,id-->string -->int
				 * 3.selectId-->id
				 * 4.porder-->set修改
				 * 5.update
				 * 
				 */
				
				String Desk=udesk.getText();
				int A=Integer.parseInt(ua.getText());
				int B=Integer.parseInt(ub.getText());
				int C=Integer.parseInt(uc.getText());
				int ID=Integer.parseInt(id.getText());
				
				porder p=new implPorder().selectId(ID);
				p.setDesk(Desk);
				p.setA(A);
				p.setB(B);
				p.setC(C);
				
				new implPorder().update(p);
				
			}
		});
		
		
		//刪除
		delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.擷取-->id-->轉型int
				 * 2.delete
				 * 
				 */
				int ID=Integer.parseInt(did.getText());
				new implPorder().delete(ID);
				
			}
		});
		
	}
}
