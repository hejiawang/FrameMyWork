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

public class JiFangGuanLiFrame extends JFrame {

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
					JiFangGuanLiFrame frame = new JiFangGuanLiFrame();
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
	public JiFangGuanLiFrame() {
		setTitle("大同大学校园一卡通系统——机房管理");
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
		
		JLabel label_2 = new JLabel("元");
		label_2.setFont(new Font("宋体", Font.PLAIN, 16));
		label_2.setBounds(247, 104, 45, 37);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("账号余额：");
		label_3.setFont(new Font("宋体", Font.PLAIN, 16));
		label_3.setBounds(10, 104, 93, 37);
		contentPane.add(label_3);
		
		JLabel label_7 = new JLabel("随机座位：");
		label_7.setFont(new Font("宋体", Font.PLAIN, 16));
		label_7.setBounds(305, 57, 93, 37);
		contentPane.add(label_7);
		
		JButton button_7 = new JButton("上    机");
		button_7.setBackground(Color.GREEN);
		button_7.setBounds(212, 196, 124, 36);
		contentPane.add(button_7);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(113, 113, 124, 21);
		contentPane.add(textField_5);
		
		JLabel label_8 = new JLabel("选择座位：");
		label_8.setFont(new Font("宋体", Font.PLAIN, 16));
		label_8.setBounds(302, 104, 93, 37);
		contentPane.add(label_8);
		
		JLabel label_5 = new JLabel("收费标准：");
		label_5.setFont(new Font("宋体", Font.PLAIN, 16));
		label_5.setBounds(305, 10, 93, 37);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("2  元/小时");
		label_6.setFont(new Font("宋体", Font.PLAIN, 16));
		label_6.setBounds(408, 10, 93, 37);
		contentPane.add(label_6);
		
		JLabel label_9 = new JLabel("一排3座");
		label_9.setFont(new Font("宋体", Font.PLAIN, 16));
		label_9.setBounds(408, 57, 93, 37);
		contentPane.add(label_9);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(405, 113, 124, 21);
		contentPane.add(comboBox);
	}
}
