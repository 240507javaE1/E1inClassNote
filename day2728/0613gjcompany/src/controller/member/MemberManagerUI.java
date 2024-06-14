package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Member;
import service.impl.MemberServiceImpl;
import util.cal;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class MemberManagerUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField uid;
	private JTextField uname;
	private JTextField uaddress;
	private JTextField did;
	
	private static MemberServiceImpl msi=new MemberServiceImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberManagerUI frame = new MemberManagerUI();
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
	public MemberManagerUI() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(10, 25, 393, 54);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("會員管理");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 15));
		lblNewLabel.setBounds(155, 10, 79, 34);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(10, 89, 393, 302);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 54, 362, 130);
		panel_1.add(scrollPane);
		
		JTextArea show = new JTextArea();
		scrollPane.setViewportView(show);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 14));
		lblNewLabel_1.setBounds(105, 207, 22, 19);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("名");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(172, 209, 22, 19);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("地址");
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(250, 207, 41, 19);
		panel_1.add(lblNewLabel_1_2);
		
		uid = new JTextField();
		uid.setBounds(128, 206, 32, 21);
		panel_1.add(uid);
		uid.setColumns(10);
		
		uname = new JTextField();
		uname.setColumns(10);
		uname.setBounds(191, 206, 49, 21);
		panel_1.add(uname);
		
		uaddress = new JTextField();
		uaddress.setColumns(10);
		uaddress.setBounds(282, 206, 78, 21);
		panel_1.add(uaddress);
		
		
		
		JLabel lblNewLabel_1_3 = new JLabel("ID");
		lblNewLabel_1_3.setFont(new Font("新細明體", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(105, 247, 22, 19);
		panel_1.add(lblNewLabel_1_3);
		
		did = new JTextField();
		did.setColumns(10);
		did.setBounds(128, 244, 32, 21);
		panel_1.add(did);
		
		/*查詢*/

		JButton btnNewButton = new JButton("查詢");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				List<Member> l=msi.queryAll();
				String showAll="";
				for(Member m:l)
				{
					showAll=showAll+m.getId()+
							"\t"+m.getMemberno()+
							"\t"+m.getMembername()+
							"\t"+m.getUsername()+
							"\t"+m.getPassword()+
							"\t"+m.getAddress()+"\n";
				}
				
				show.setText(
						"id\t會員編號\t姓名\t帳號\t密碼\t地址\n"
						+ "=========================================================\n"
						+showAll);
			}
		});
		btnNewButton.setBounds(10, 21, 85, 23);
		panel_1.add(btnNewButton);
		
		/*修改*/
		JButton btnNewButton_1 = new JButton("修改");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int ID=Integer.parseInt(uid.getText());
				String name=uname.getText();
				String address=uaddress.getText();
				
				msi.updateMember(ID, name, address);
				
				uid.setText("");
				uname.setText("");
				uaddress.setText("");
				
			}
		});
		btnNewButton_1.setBounds(10, 205, 85, 23);
		panel_1.add(btnNewButton_1);
		
		/*刪除*/
		JButton btnNewButton_2 = new JButton("刪除");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int iD=Integer.parseInt(did.getText());
				msi.deleteId(iD);
				did.setText("");
				
			}
		});
		btnNewButton_2.setBounds(10, 243, 85, 23);
		panel_1.add(btnNewButton_2);
		
		
		
		
		
		
		
		JLabel M1 = new JLabel("");
		M1.setFont(new Font("新細明體", Font.BOLD, 14));
		M1.setBounds(105, 21, 135, 19);
		panel_1.add(M1);
		
		Member m1=(Member)cal.readFile("member.txt");
		M1.setText(m1.getMembername()+" 歡迎");
	}
}