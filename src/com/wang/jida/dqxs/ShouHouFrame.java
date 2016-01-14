package com.wang.jida.dqxs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;

public class ShouHouFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShouHouFrame frame = new ShouHouFrame();
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
	public ShouHouFrame() {
		setTitle("电器销售管理系统——售后管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("售后服务：");
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		label.setBounds(10, 20, 90, 31);
		contentPane.add(label);
		
		JRadioButton radioButton = new JRadioButton("换货申请");
		radioButton.setBounds(90, 25, 84, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("退货申请");
		radioButton_1.setBounds(176, 25, 84, 23);
		contentPane.add(radioButton_1);
		
		JButton button = new JButton("提到换货流程");
		button.setBackground(Color.GREEN);
		button.setBounds(10, 61, 164, 23);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("换货申请清单：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 14));
		label_1.setBounds(10, 104, 164, 31);
		contentPane.add(label_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u6362\u8D27\u7F16\u53F7", "\u7535\u5668\u540D\u79F0", "\u7535\u5668\u7C7B\u578B", "\u7535\u5668\u4EF7\u683C", "\u8D2D\u4E70\u65F6\u95F4", "\u6362\u8D27\u7406\u7531", "\u5907\u6CE8"},
				{"0001", "\u5145\u7535\u5668", "\u5145\u7535\u5668", "90", "2016-01-01", "\u4E0D\u597D\u770B", null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 145, 544, 107);
		contentPane.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(564, 145, 17, 107);
		contentPane.add(scrollBar);
		
		JRadioButton radioButton_2 = new JRadioButton("售后维修");
		radioButton_2.setBounds(275, 25, 84, 23);
		contentPane.add(radioButton_2);
	}
}
