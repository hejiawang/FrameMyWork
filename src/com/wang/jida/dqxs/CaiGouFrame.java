package com.wang.jida.dqxs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class CaiGouFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CaiGouFrame frame = new CaiGouFrame();
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
	public CaiGouFrame() {
		setTitle("电器销售管理系统——采购管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton button = new JButton("采购申请");
		button.setFont(new Font("宋体", Font.PLAIN, 16));
		button.setBackground(Color.GREEN);
		button.setBounds(23, 50, 139, 64);
		contentPane.add(button);
		
		JButton button_1 = new JButton("采购分析");
		button_1.setFont(new Font("宋体", Font.PLAIN, 16));
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(285, 50, 139, 64);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("查看采购清单");
		button_2.setFont(new Font("宋体", Font.PLAIN, 16));
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(147, 172, 139, 64);
		contentPane.add(button_2);
	}
}
