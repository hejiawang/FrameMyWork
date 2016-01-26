package com.wang.jida.xfaq;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class XiaoFangYuJingFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XiaoFangYuJingFrame frame = new XiaoFangYuJingFrame();
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
	public XiaoFangYuJingFrame() {
		setTitle("社会单位消防安全管理系统——消防预警");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton button = new JButton("消防预案制定");
		button.setBackground(Color.GREEN);
		button.setBounds(10, 10, 123, 34);
		contentPane.add(button);
		
		JButton button_1 = new JButton("消防预案审批");
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(166, 10, 123, 34);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("消防预案删除");
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(10, 67, 123, 34);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("消防预案更新");
		button_3.setBackground(Color.GREEN);
		button_3.setBounds(166, 67, 123, 34);
		contentPane.add(button_3);
		
		JLabel label = new JLabel("消防预案查询：");
		label.setFont(new Font("宋体", Font.PLAIN, 14));
		label.setBounds(10, 127, 123, 34);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(110, 167, 171, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button_4 = new JButton("消防预案查询");
		button_4.setBackground(Color.GREEN);
		button_4.setBounds(10, 256, 123, 34);
		contentPane.add(button_4);
		
		JLabel label_1 = new JLabel("预案标题：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 14));
		label_1.setBounds(10, 160, 123, 34);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("预案日期：");
		label_2.setFont(new Font("宋体", Font.PLAIN, 14));
		label_2.setBounds(10, 204, 123, 34);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 211, 171, 27);
		contentPane.add(textField_1);
		
		JButton button_5 = new JButton("重置");
		button_5.setBackground(Color.GREEN);
		button_5.setBounds(158, 256, 123, 34);
		contentPane.add(button_5);
	}
}
