package com.wang.jida.xlxs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class GuangGaoFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuangGaoFrame frame = new GuangGaoFrame();
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
	public GuangGaoFrame() {
		setTitle("鞋类销售管理系统——广告信息管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GuangGaoFrame.class.getResource("/com/wang/jida/xlxs/xiezi.png")));
		lblNewLabel.setBounds(12, 12, 265, 212);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("品牌：  耐克");
		label.setFont(new Font("Dialog", Font.BOLD, 16));
		label.setBounds(289, 22, 144, 17);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("价格：  400");
		label_1.setFont(new Font("Dialog", Font.BOLD, 16));
		label_1.setBounds(289, 52, 144, 17);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("促销活动：  店庆10周年，全部商品88折！！！");
		label_2.setFont(new Font("Dialog", Font.BOLD, 16));
		label_2.setBounds(289, 81, 444, 17);
		contentPane.add(label_2);
	}
}
