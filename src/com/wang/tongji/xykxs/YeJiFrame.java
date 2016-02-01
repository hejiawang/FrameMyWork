package com.wang.tongji.xykxs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.JScrollBar;

public class YeJiFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YeJiFrame frame = new YeJiFrame();
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
	public YeJiFrame() {
		setTitle("交通银行上海分行信用卡销售管理系统——业绩管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("业绩管理") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("团队绩效");
						node_1.add(new DefaultMutableTreeNode("月度"));
						node_1.add(new DefaultMutableTreeNode("季度"));
						node_1.add(new DefaultMutableTreeNode("半年度"));
						node_1.add(new DefaultMutableTreeNode("年度"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("个人绩效");
						node_1.add(new DefaultMutableTreeNode("月度"));
						node_1.add(new DefaultMutableTreeNode("季度"));
						node_1.add(new DefaultMutableTreeNode("半年度"));
						node_1.add(new DefaultMutableTreeNode("年度"));
					add(node_1);
				}
			}
		));
		tree.setBounds(0, 10, 167, 234);
		contentPane.add(tree);
		
		JLabel label = new JLabel("员工业绩明细表");
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(177, 43, 158, 33);
		contentPane.add(label);
		
		JButton button = new JButton("业绩分析");
		button.setBackground(Color.GREEN);
		button.setBounds(177, 10, 149, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("导出业绩明细表");
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(349, 10, 148, 23);
		contentPane.add(button_1);
		
		table = new JTable();
		table.setFont(new Font("宋体", Font.PLAIN, 14));
		table.setToolTipText("");
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u9500\u552E\u4EBA\u5458", "\u666E\u901A\u5361\u9500\u552E\u6570\u91CF", "\u91D1\u5361\u9500\u552E\u6570\u91CF", "\u94BB\u77F3\u5361\u9500\u552E\u6570\u91CF", "\u4E1A\u7EE9", "\u5907\u6CE8"},
				{"\u5F20\u4E09", "12", "2", "0", "600", ""},
				{"\u674E\u56DB", "0", "7", "1", "700", ""},
				{"\u738B\u4E94", "14", "0", "1", "800", ""},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(97);
		table.getColumnModel().getColumn(2).setPreferredWidth(89);
		table.getColumnModel().getColumn(3).setPreferredWidth(96);
		table.setBounds(177, 86, 571, 158);
		contentPane.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(746, 86, 17, 158);
		contentPane.add(scrollBar);
	}
}
