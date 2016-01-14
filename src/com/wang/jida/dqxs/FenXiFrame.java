package com.wang.jida.dqxs;

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

public class FenXiFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenXiFrame frame = new FenXiFrame();
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
	public FenXiFrame() {
		setTitle("电器销售管理系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 916, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(FenXiFrame.class.getResource("/com/wang/jida/dqxs/分析.jpg")));
		lblNewLabel.setBounds(10, 60, 880, 310);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("销售金额");
		label.setFont(new Font("宋体", Font.PLAIN, 12));
		label.setBounds(10, 47, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("日期");
		label_1.setFont(new Font("宋体", Font.PLAIN, 12));
		label_1.setBounds(836, 363, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("销售金额统计分析");
		label_2.setFont(new Font("宋体", Font.PLAIN, 16));
		label_2.setBounds(333, 10, 194, 40);
		contentPane.add(label_2);
	}
}
