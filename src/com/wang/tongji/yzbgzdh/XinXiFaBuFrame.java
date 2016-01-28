package com.wang.tongji.yzbgzdh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class XinXiFaBuFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XinXiFaBuFrame frame = new XinXiFaBuFrame();
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
	public XinXiFaBuFrame() {
		setTitle("沈阳邮政办公自动化系统——信息发布平台");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("公告牌");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel.setBounds(169, 10, 97, 35);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("1、关于沈阳邮政办公自动化系统使用的公告");
		label.setFont(new Font("宋体", Font.PLAIN, 14));
		label.setBounds(10, 70, 285, 25);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("2016-01-01");
		label_1.setBounds(305, 75, 71, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("2、关于提高沈阳邮政系统办公效率的公告");
		label_2.setFont(new Font("宋体", Font.PLAIN, 14));
		label_2.setBounds(10, 105, 285, 25);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("2016-01-01");
		label_3.setBounds(305, 110, 71, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("3、关于沈阳邮政系统新年任务的公告");
		label_4.setFont(new Font("宋体", Font.PLAIN, 14));
		label_4.setBounds(10, 140, 285, 25);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("2016-01-01");
		label_5.setBounds(305, 145, 71, 15);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("【点击查看】");
		label_6.setBounds(385, 75, 81, 15);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("【点击查看】");
		label_7.setBounds(386, 110, 81, 15);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("【点击查看】");
		label_8.setBounds(385, 145, 81, 15);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("第1页/共1页");
		label_9.setBounds(10, 237, 71, 15);
		contentPane.add(label_9);
		
		JButton button = new JButton("下一页");
		button.setBounds(231, 233, 81, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("上一页");
		button_1.setBounds(140, 233, 81, 23);
		contentPane.add(button_1);
		
		textField = new JTextField();
		textField.setBounds(322, 234, 57, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button_2 = new JButton("跳转");
		button_2.setBounds(385, 233, 72, 23);
		contentPane.add(button_2);
	}
}
