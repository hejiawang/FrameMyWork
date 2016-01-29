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

public class TuShuGuanLiFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TuShuGuanLiFrame frame = new TuShuGuanLiFrame();
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
	public TuShuGuanLiFrame() {
		setTitle("大同大学校园一卡通系统——图书管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setBounds(113, 66, 124, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("卡号：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(10, 57, 93, 37);
		contentPane.add(label_1);
		
		JLabel label = new JLabel("学生号：");
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		label.setBounds(10, 104, 93, 37);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(113, 161, 124, 21);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("元");
		label_2.setFont(new Font("宋体", Font.PLAIN, 16));
		label_2.setBounds(247, 152, 45, 37);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("账号余额：");
		label_3.setFont(new Font("宋体", Font.PLAIN, 16));
		label_3.setBounds(10, 152, 93, 37);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(113, 208, 124, 21);
		contentPane.add(textField_2);
		
		JLabel label_4 = new JLabel("元");
		label_4.setFont(new Font("宋体", Font.PLAIN, 16));
		label_4.setBounds(247, 199, 45, 37);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("借阅者信息");
		label_5.setFont(new Font("宋体", Font.PLAIN, 16));
		label_5.setBounds(10, 10, 93, 37);
		contentPane.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(113, 255, 124, 21);
		contentPane.add(textField_3);
		
		JLabel label_7 = new JLabel("应收罚款：");
		label_7.setFont(new Font("宋体", Font.PLAIN, 16));
		label_7.setBounds(10, 199, 93, 37);
		contentPane.add(label_7);
		
		JButton button_7 = new JButton("续借");
		button_7.setBackground(Color.GREEN);
		button_7.setBounds(113, 303, 93, 36);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("借阅");
		button_8.setBackground(Color.GREEN);
		button_8.setBounds(442, 303, 93, 36);
		contentPane.add(button_8);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(113, 113, 124, 21);
		contentPane.add(textField_5);
		
		JLabel label_8 = new JLabel("以借图书：");
		label_8.setFont(new Font("宋体", Font.PLAIN, 16));
		label_8.setBounds(10, 239, 93, 37);
		contentPane.add(label_8);
		
		JLabel label_6 = new JLabel("图书信息");
		label_6.setFont(new Font("宋体", Font.PLAIN, 16));
		label_6.setBounds(339, 10, 93, 37);
		contentPane.add(label_6);
		
		JLabel label_9 = new JLabel("图书编号：");
		label_9.setFont(new Font("宋体", Font.PLAIN, 16));
		label_9.setBounds(339, 57, 93, 37);
		contentPane.add(label_9);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(442, 66, 124, 21);
		contentPane.add(textField_4);
		
		JLabel label_10 = new JLabel("图书名：");
		label_10.setFont(new Font("宋体", Font.PLAIN, 16));
		label_10.setBounds(339, 104, 93, 37);
		contentPane.add(label_10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(442, 113, 124, 21);
		contentPane.add(textField_6);
		
		JLabel label_11 = new JLabel("借阅权限：");
		label_11.setFont(new Font("宋体", Font.PLAIN, 16));
		label_11.setBounds(339, 145, 93, 37);
		contentPane.add(label_11);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(442, 161, 124, 21);
		contentPane.add(comboBox);
		
		JLabel label_12 = new JLabel("借阅日期：");
		label_12.setFont(new Font("宋体", Font.PLAIN, 16));
		label_12.setBounds(339, 192, 93, 37);
		contentPane.add(label_12);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(442, 199, 124, 21);
		contentPane.add(textField_7);
		
		JLabel label_13 = new JLabel("应还日期：");
		label_13.setFont(new Font("宋体", Font.PLAIN, 16));
		label_13.setBounds(339, 239, 93, 37);
		contentPane.add(label_13);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(442, 248, 124, 21);
		contentPane.add(textField_8);
	}
}
