package com.wang.jida.dqxs;

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

public class YuanGongFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YuanGongFrame frame = new YuanGongFrame();
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
	public YuanGongFrame() {
		setTitle("电器销售管理系统——员工管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton button = new JButton("添加员工");
		button.setBackground(Color.GREEN);
		button.setBounds(10, 10, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("删除员工");
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(113, 10, 93, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("修改员工");
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(216, 10, 93, 23);
		contentPane.add(button_2);
		
		JLabel label = new JLabel("请输入员工姓名：");
		label.setBounds(331, 14, 105, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(428, 11, 124, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button_3 = new JButton("查找员工");
		button_3.setBackground(Color.GREEN);
		button_3.setBounds(562, 10, 93, 23);
		contentPane.add(button_3);
		
		JLabel label_1 = new JLabel("员工信息表：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(10, 43, 196, 37);
		contentPane.add(label_1);
		
		JButton button_4 = new JButton("导出员工信息");
		button_4.setBackground(Color.GREEN);
		button_4.setBounds(665, 10, 119, 23);
		contentPane.add(button_4);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(767, 77, 17, 175);
		contentPane.add(scrollBar);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u5458\u5DE5\u7F16\u53F7", "\u59D3\u540D", "\u5E74\u9F84", "\u6027\u522B", "\u804C\u4F4D", "\u5DE5\u8D44", "\u8054\u7CFB\u7535\u8BDD", "\u4E1A\u7EE9", "\u5907\u6CE8"},
				{"10001", "\u5F20\u4E09", "23", "\u7537", "\u7ECF\u7406", "8000", "13333333333", "80970", null},
				{"10002", "\u8D75\u56DB", "24", "\u7537", "\u9500\u552E\u5458", "1000", "13444444444", "56734", null},
				{"10003", "\u738B\u4E94", "25", "\u5973", "\u79D8\u4E66", "1100", "15555555555", "45554", null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 77, 754, 175);
		contentPane.add(table);
	}
}
