package com.wang.tongji.yzbgzdh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

public class ZhiShiGuanLiFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZhiShiGuanLiFrame frame = new ZhiShiGuanLiFrame();
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
	public ZhiShiGuanLiFrame() {
		setTitle("沈阳邮政办公自动化系统——知识管理平台");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("图书期刊");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton.setBounds(156, 43, 125, 58);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("文档资料");
		button.setFont(new Font("宋体", Font.PLAIN, 18));
		button.setBounds(56, 164, 125, 58);
		contentPane.add(button);
		
		JButton button_1 = new JButton("规章制度");
		button_1.setFont(new Font("宋体", Font.PLAIN, 18));
		button_1.setBounds(245, 164, 125, 58);
		contentPane.add(button_1);
	}

}
