package com.wang.jida.dtwx;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;

public class WeiXiuQiCaiFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeiXiuQiCaiFrame frame = new WeiXiuQiCaiFrame();
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
	public WeiXiuQiCaiFrame() {
		setTitle("维修器材管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton button = new JButton("添加器材");
		button.setBounds(10, 20, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("器材报废");
		button_1.setBounds(131, 20, 93, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("器材租用");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(250, 20, 93, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("器材出库");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(10, 74, 93, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("器材如库");
		button_4.setBounds(131, 74, 93, 23);
		contentPane.add(button_4);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u5668\u6750\u540D\u79F0", "\u5668\u6750\u6570\u91CF", "\u5668\u6750\u72B6\u6001", "\u5668\u6750\u63CF\u8FF0"},
				{"\u87BA\u4E1D", "89", "\u53EF\u7528", "\u87BA\u4E1D"},
				{"\u5C16\u5634\u94B3\u5B50", "4", "\u6B63\u5728\u4F7F\u7528", null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 169, 414, 80);
		contentPane.add(table);
		
		JLabel label = new JLabel("器材列表：");
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		label.setBounds(10, 107, 214, 41);
		contentPane.add(label);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(433, 169, 17, 80);
		contentPane.add(scrollBar);
	}
}
