package com.wang.jida.dqxs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class KeHuFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeHuFrame frame = new KeHuFrame();
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
	public KeHuFrame() {
		setTitle("电器销售管理系统——客户管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("客户管理") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("普通客户");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("会员客户");
						node_1.add(new DefaultMutableTreeNode("白银会员"));
						node_1.add(new DefaultMutableTreeNode("黄金会员"));
						node_1.add(new DefaultMutableTreeNode("白金会员"));
						node_1.add(new DefaultMutableTreeNode("钻石会员"));
					add(node_1);
				}
			}
		));
		tree.setBounds(10, 10, 115, 375);
		contentPane.add(tree);
		
		JButton button = new JButton("通知电器优惠信息");
		button.setBackground(Color.GREEN);
		button.setBounds(547, 21, 150, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("添加会员");
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(135, 21, 93, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("删除会员");
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(238, 21, 93, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("修改会员");
		button_3.setBackground(Color.GREEN);
		button_3.setBounds(341, 21, 93, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("会员升级");
		button_4.setBackground(Color.GREEN);
		button_4.setBounds(444, 21, 93, 23);
		contentPane.add(button_4);
		
		JLabel label = new JLabel("请输入会员姓名：");
		label.setBounds(135, 68, 105, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(238, 65, 196, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button_5 = new JButton("查找会员");
		button_5.setBackground(Color.GREEN);
		button_5.setBounds(444, 64, 93, 23);
		contentPane.add(button_5);
		
		JLabel label_1 = new JLabel("本期会员优惠信息：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(135, 96, 299, 34);
		contentPane.add(label_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("优惠一：买一赠一\r\n优惠二：黄金会员，买一赠二\r\n优惠三：白金会员，买一赠三\r\n优惠四：钻石会员，买一赠四\r\n");
		textArea.setBounds(135, 130, 560, 85);
		contentPane.add(textArea);
		
		JLabel label_2 = new JLabel("白金会员信息：");
		label_2.setFont(new Font("宋体", Font.PLAIN, 16));
		label_2.setBounds(135, 225, 299, 34);
		contentPane.add(label_2);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(699, 130, 17, 85);
		contentPane.add(scrollBar);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u4F1A\u5458\u7F16\u53F7", "\u59D3\u540D", "\u5E74\u9F84", "\u6027\u522B", "\u8054\u7CFB\u7535\u8BDD", "\u4F1A\u5458\u79EF\u5206", "\u5907\u6CE8"},
				{"03001", "\u674E\u56FD\u7ACB", "45", "\u7537", "14555555555", "8967", null},
				{"03002", "\u5F20\u957F\u7AE0", "34", "\u5973", "13555555555", "4525", null},
				{"03003", "\u738B\u65FA\u65FA", "45", "\u7537", "13656565656", "346", null},
				{"03004", "\u90D1\u5DDE\u56FD", "25", "\u5973", "13456778907", "363223", null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(135, 269, 560, 116);
		contentPane.add(table);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(699, 270, 17, 115);
		contentPane.add(scrollBar_1);
		
		JButton button_6 = new JButton("会员积分兑换");
		button_6.setBackground(Color.GREEN);
		button_6.setBounds(547, 64, 150, 23);
		contentPane.add(button_6);
	}
}
