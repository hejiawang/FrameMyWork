package com.wang.jida.dtwx;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

public class YunFangXingWeiXiuFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YunFangXingWeiXiuFrame frame = new YunFangXingWeiXiuFrame();
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
	public YunFangXingWeiXiuFrame() {
		setTitle("维护管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton button = new JButton("添加维护计划");
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		button.setBounds(138, 37, 119, 59);
		contentPane.add(button);
		
		JButton button_1 = new JButton("启动紧急维护");
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBounds(246, 140, 119, 59);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("维护设备申请");
		button_2.setFont(new Font("宋体", Font.PLAIN, 14));
		button_2.setBounds(47, 140, 119, 59);
		contentPane.add(button_2);
	}

}
