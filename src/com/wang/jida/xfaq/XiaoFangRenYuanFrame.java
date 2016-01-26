package com.wang.jida.xfaq;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class XiaoFangRenYuanFrame extends JFrame {

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
					XiaoFangRenYuanFrame frame = new XiaoFangRenYuanFrame();
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
	public XiaoFangRenYuanFrame() {
		setTitle("社会单位消防安全管理系统——消防人员管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton button = new JButton("添加人员");
		button.setBackground(Color.GREEN);
		button.setBounds(10, 10, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("删除人员");
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(113, 10, 93, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("修改人员");
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(216, 10, 93, 23);
		contentPane.add(button_2);
		
		JLabel label = new JLabel("请输入人员姓名：");
		label.setBounds(10, 51, 105, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(113, 48, 196, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button_3 = new JButton("查找人员");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBackground(Color.GREEN);
		button_3.setBounds(324, 47, 119, 23);
		contentPane.add(button_3);
		
		JLabel label_1 = new JLabel("消防人员信息表：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(10, 76, 196, 37);
		contentPane.add(label_1);
		
		JButton button_4 = new JButton("组织消防培训");
		button_4.setBackground(Color.GREEN);
		button_4.setBounds(453, 10, 119, 23);
		contentPane.add(button_4);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(767, 123, 17, 129);
		contentPane.add(scrollBar);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u4EBA\u5458\u7F16\u53F7", "\u59D3\u540D", "\u5E74\u9F84", "\u6027\u522B", "\u6D88\u9632\u804C\u4F4D", "\u57F9\u8BAD\u6B21\u6570", "\u8054\u7CFB\u7535\u8BDD", "\u5907\u6CE8"},
				{"10001", "\u5F20\u4E09", "23", "\u7537", "\u961F\u957F", "7", "13333333333", ""},
				{"10002", "\u8D75\u56DB", "24", "\u7537", "\u961F\u5458", "3", "13444444444", ""},
				{"10003", "\u738B\u4E94", "25", "\u5973", "\u961F\u5458", "5", "15555555555", ""},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 123, 754, 129);
		contentPane.add(table);
		
		JButton button_5 = new JButton("导出人员信息");
		button_5.setBackground(Color.GREEN);
		button_5.setBounds(324, 10, 119, 23);
		contentPane.add(button_5);
	}
}
