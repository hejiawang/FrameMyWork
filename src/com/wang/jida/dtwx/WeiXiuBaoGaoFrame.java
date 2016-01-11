package com.wang.jida.dtwx;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class WeiXiuBaoGaoFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeiXiuBaoGaoFrame frame = new WeiXiuBaoGaoFrame();
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
	public WeiXiuBaoGaoFrame() {
		setTitle("维修报告");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("地铁设备维修报告");
		label.setFont(new Font("宋体", Font.PLAIN, 30));
		label.setBounds(81, 10, 284, 56);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("维修计划报表");
		btnNewButton.setBounds(36, 76, 121, 33);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("维修账务报表");
		button.setBounds(244, 76, 121, 33);
		contentPane.add(button);
		
		JButton button_1 = new JButton("维修设备报表");
		button_1.setBounds(36, 130, 121, 33);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("维修工单报表");
		button_2.setBounds(244, 135, 121, 33);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("设备性能报表");
		button_3.setBounds(36, 189, 121, 33);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("设备管理报表");
		button_4.setBounds(244, 194, 121, 33);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("预算报表");
		button_5.setBounds(36, 249, 121, 33);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("度量报表");
		button_6.setBounds(244, 254, 121, 33);
		contentPane.add(button_6);
	}
}
