package com.wang.tongji.xykxs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FengXianFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FengXianFrame frame = new FengXianFrame();
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
	public FengXianFrame() {
		setTitle("交通银行上海分行信用卡销售管理系统——风险管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton button = new JButton("风险信息维护");
		button.setBounds(51, 21, 115, 36);
		contentPane.add(button);
		
		JButton button_1 = new JButton("风险件登记");
		button_1.setBounds(270, 21, 115, 36);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("风险件分配");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(51, 88, 115, 36);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("风险件调查");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(270, 88, 115, 36);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("风险件监控");
		button_4.setBounds(51, 156, 115, 36);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("风险件奖惩");
		button_5.setBounds(270, 156, 115, 36);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("风险统计");
		button_6.setBounds(51, 216, 115, 36);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("风险预警");
		button_7.setBounds(270, 216, 115, 36);
		contentPane.add(button_7);
	}
}
