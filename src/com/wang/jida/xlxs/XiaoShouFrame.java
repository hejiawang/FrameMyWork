package com.wang.jida.xlxs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;

public class XiaoShouFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XiaoShouFrame frame = new XiaoShouFrame();
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
	public XiaoShouFrame() {
		setTitle("鞋类销售管理系统——销售管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton button = new JButton("销售分析");
		button.setBackground(Color.GREEN);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(383, 10, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("销售明细");
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(279, 10, 93, 23);
		contentPane.add(button_1);
		
		JButton btnNewButton = new JButton("销售统计");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(486, 10, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton button_2 = new JButton("添加销售记录");
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(10, 10, 122, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("导出销售记录");
		button_3.setBackground(Color.GREEN);
		button_3.setBounds(142, 10, 122, 23);
		contentPane.add(button_3);
		
		JLabel label = new JLabel("销售记录：");
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		label.setBounds(10, 55, 122, 29);
		contentPane.add(label);
		
		table = new JTable();
		table.setFont(new Font("宋体", Font.PLAIN, 14));
		table.setToolTipText("");
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"鞋子品牌", "鞋子类型", "鞋子型号", "鞋子进价", "鞋子售价", "鞋子利润"},
				{"耐克", "男N43", "43", "300", "500", "200"},
				{"耐克", "男N42", "42", "300", "500", "200"},
				{"李宁", "女L37", "37", "240", "400", "160"},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 94, 571, 158);
		contentPane.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(587, 94, 17, 158);
		contentPane.add(scrollBar);
	}
}
