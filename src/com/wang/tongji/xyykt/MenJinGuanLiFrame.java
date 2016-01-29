package com.wang.tongji.xyykt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class MenJinGuanLiFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenJinGuanLiFrame frame = new MenJinGuanLiFrame();
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
	public MenJinGuanLiFrame() {
		setTitle("大同大学校园一卡通系统——门禁管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setBounds(113, 19, 124, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("卡号：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(10, 10, 93, 37);
		contentPane.add(label_1);
		
		JLabel label = new JLabel("学生号：");
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		label.setBounds(10, 57, 93, 37);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(113, 66, 124, 21);
		contentPane.add(textField_1);
		
		JLabel label_3 = new JLabel("刷卡时间：");
		label_3.setFont(new Font("宋体", Font.PLAIN, 16));
		label_3.setBounds(10, 104, 93, 37);
		contentPane.add(label_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(113, 113, 124, 21);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MenJinGuanLiFrame.class.getResource("/com/wang/tongji/xyykt/moren.jpg")));
		lblNewLabel.setBounds(321, 11, 192, 217);
		contentPane.add(lblNewLabel);
		
		JLabel label_4 = new JLabel("信息正确，请进入");
		label_4.setFont(new Font("宋体", Font.PLAIN, 24));
		label_4.setBounds(10, 174, 227, 54);
		contentPane.add(label_4);
	}
}
