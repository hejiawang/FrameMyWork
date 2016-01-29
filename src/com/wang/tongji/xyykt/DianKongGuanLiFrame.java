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

public class DianKongGuanLiFrame extends JFrame {

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
					DianKongGuanLiFrame frame = new DianKongGuanLiFrame();
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
	public DianKongGuanLiFrame() {
		setTitle("大同大学校园一卡通系统——教学管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setBounds(166, 65, 124, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("卡号：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(76, 56, 93, 37);
		contentPane.add(label_1);
		
		JLabel label = new JLabel("学生号：");
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		label.setBounds(76, 104, 93, 37);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(166, 113, 124, 21);
		contentPane.add(textField_1);
		
		JLabel label_3 = new JLabel("密码：");
		label_3.setFont(new Font("宋体", Font.PLAIN, 16));
		label_3.setBounds(76, 151, 93, 37);
		contentPane.add(label_3);
		
		JButton button_7 = new JButton("登    录");
		button_7.setBackground(Color.GREEN);
		button_7.setBounds(76, 233, 99, 36);
		contentPane.add(button_7);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(166, 160, 124, 21);
		contentPane.add(textField_5);
		
		JButton button = new JButton("密码重置");
		button.setBackground(Color.GREEN);
		button.setBounds(185, 233, 105, 36);
		contentPane.add(button);
	}
}
