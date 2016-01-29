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

public class ShuiKongGuanLiFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_5;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShuiKongGuanLiFrame frame = new ShuiKongGuanLiFrame();
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
	public ShuiKongGuanLiFrame() {
		setTitle("大同大学校园一卡通系统——水控管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 360);
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
		
		JLabel label_7 = new JLabel("本月共计：");
		label_7.setFont(new Font("宋体", Font.PLAIN, 16));
		label_7.setBounds(305, 57, 124, 37);
		contentPane.add(label_7);
		
		JButton button_7 = new JButton("开始接水");
		button_7.setBackground(Color.GREEN);
		button_7.setBounds(113, 271, 124, 36);
		contentPane.add(button_7);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(113, 113, 124, 21);
		contentPane.add(textField_5);
		
		JLabel label_5 = new JLabel("本次接水：");
		label_5.setFont(new Font("宋体", Font.PLAIN, 16));
		label_5.setBounds(305, 10, 93, 37);
		contentPane.add(label_5);
		
		JLabel lblL = new JLabel("2.3   L");
		lblL.setFont(new Font("宋体", Font.PLAIN, 16));
		lblL.setBounds(436, 10, 93, 37);
		contentPane.add(lblL);
		
		JLabel lblL_1 = new JLabel("100   L");
		lblL_1.setFont(new Font("宋体", Font.PLAIN, 16));
		lblL_1.setBounds(436, 57, 93, 37);
		contentPane.add(lblL_1);
		
		JLabel label_10 = new JLabel("本次消费：");
		label_10.setFont(new Font("宋体", Font.PLAIN, 16));
		label_10.setBounds(10, 163, 93, 37);
		contentPane.add(label_10);
		
		JLabel label_12 = new JLabel("卡内余额：");
		label_12.setFont(new Font("宋体", Font.PLAIN, 16));
		label_12.setBounds(10, 210, 93, 37);
		contentPane.add(label_12);
		
		JButton button = new JButton("停止接水");
		button.setBackground(Color.GREEN);
		button.setBounds(274, 271, 124, 36);
		contentPane.add(button);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(113, 172, 124, 21);
		contentPane.add(textField_2);
		
		JLabel label_11 = new JLabel("元");
		label_11.setFont(new Font("宋体", Font.PLAIN, 16));
		label_11.setBounds(247, 163, 45, 37);
		contentPane.add(label_11);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(113, 219, 124, 21);
		contentPane.add(textField_3);
		
		JLabel label_13 = new JLabel("元");
		label_13.setFont(new Font("宋体", Font.PLAIN, 16));
		label_13.setBounds(247, 210, 45, 37);
		contentPane.add(label_13);
	}
}
