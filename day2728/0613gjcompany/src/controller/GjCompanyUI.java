package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.member.MemberLoginUI;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GjCompanyUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GjCompanyUI frame = new GjCompanyUI();
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
	public GjCompanyUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(10, 22, 439, 78);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gj公司管理系統");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel.setBounds(140, 20, 124, 34);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(10, 110, 439, 333);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("會員管理");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				MemberLoginUI ml=new MemberLoginUI();
				ml.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(108, 37, 214, 32);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("員工管理");
		btnNewButton_1.setBounds(108, 90, 214, 32);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("產品管理");
		btnNewButton_2.setBounds(108, 142, 214, 32);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("訂單管理");
		btnNewButton_3.setBounds(108, 193, 214, 32);
		panel_1.add(btnNewButton_3);
	}
}