package com.wang.jida.dqxs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class KuCunFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KuCunFrame frame = new KuCunFrame();
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
	public KuCunFrame() {
		setTitle("电器销售管理系统——库存管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 406, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton button = new JButton("入库管理");
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		button.setBackground(Color.GREEN);
		button.setBounds(53, 50, 93, 60);
		contentPane.add(button);
		
		JButton button_1 = new JButton("出库管理");
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(224, 50, 93, 60);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("统计分析");
		button_2.setFont(new Font("宋体", Font.PLAIN, 14));
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(53, 157, 93, 60);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("库存容量");
		button_3.setFont(new Font("宋体", Font.PLAIN, 14));
		button_3.setBackground(Color.GREEN);
		button_3.setBounds(224, 157, 93, 60);
		contentPane.add(button_3);
	}

}
