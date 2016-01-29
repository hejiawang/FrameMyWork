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

public class XiaoFeiGuanLiFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XiaoFeiGuanLiFrame frame = new XiaoFeiGuanLiFrame();
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
	public XiaoFeiGuanLiFrame() {
		setTitle("大同大学校园一卡通系统——消费管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton button = new JButton("餐厅消费");
		button.setBackground(Color.GREEN);
		button.setBounds(10, 10, 93, 36);
		contentPane.add(button);
		
		JButton button_1 = new JButton("机房消费");
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(113, 10, 93, 36);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("图书馆");
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(216, 10, 93, 36);
		contentPane.add(button_2);
		
		textField = new JTextField();
		textField.setBounds(113, 114, 196, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button_3 = new JButton("洗浴消费");
		button_3.setBackground(Color.GREEN);
		button_3.setBounds(10, 56, 93, 36);
		contentPane.add(button_3);
		
		JLabel label_1 = new JLabel("卡号：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(10, 105, 93, 37);
		contentPane.add(label_1);
		
		JButton button_4 = new JButton("超市消费");
		button_4.setBackground(Color.GREEN);
		button_4.setBounds(113, 56, 93, 36);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("影院消费");
		button_5.setBackground(Color.GREEN);
		button_5.setBounds(216, 56, 93, 36);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("缴纳学费");
		button_6.setBackground(Color.GREEN);
		button_6.setBounds(319, 10, 93, 36);
		contentPane.add(button_6);
		
		JLabel label = new JLabel("原始金额：");
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		label.setBounds(10, 152, 93, 37);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(113, 161, 196, 21);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("元");
		label_2.setFont(new Font("宋体", Font.PLAIN, 16));
		label_2.setBounds(341, 152, 45, 37);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("消费金额：");
		label_3.setFont(new Font("宋体", Font.PLAIN, 16));
		label_3.setBounds(10, 199, 93, 37);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(113, 208, 196, 21);
		contentPane.add(textField_2);
		
		JLabel label_4 = new JLabel("元");
		label_4.setFont(new Font("宋体", Font.PLAIN, 16));
		label_4.setBounds(341, 199, 45, 37);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("卡内余额：");
		label_5.setFont(new Font("宋体", Font.PLAIN, 16));
		label_5.setBounds(10, 246, 93, 37);
		contentPane.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(113, 255, 196, 21);
		contentPane.add(textField_3);
		
		JLabel label_6 = new JLabel("元");
		label_6.setFont(new Font("宋体", Font.PLAIN, 16));
		label_6.setBounds(341, 246, 45, 37);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("消费日期：");
		label_7.setFont(new Font("宋体", Font.PLAIN, 16));
		label_7.setBounds(10, 293, 93, 37);
		contentPane.add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(113, 302, 196, 21);
		contentPane.add(textField_4);
		
		JButton button_7 = new JButton("确认消费");
		button_7.setBackground(Color.GREEN);
		button_7.setBounds(113, 340, 93, 36);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("取    消");
		button_8.setBackground(Color.GREEN);
		button_8.setBounds(216, 340, 93, 36);
		contentPane.add(button_8);
	}
}
