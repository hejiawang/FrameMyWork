package com.wang.tongji.yzbgzdh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class RiChangBanGongFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RiChangBanGongFrame frame = new RiChangBanGongFrame();
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
	public RiChangBanGongFrame() {
		setTitle("沈阳邮政办公自动化系统——日常办公平台");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("日常办公平台") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("办公小助手");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("日程安排");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("会议管理");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("工作提醒");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("工作日志");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
				}
			}
		));
		tree.setBounds(0, 10, 167, 357);
		contentPane.add(tree);
		
		JLabel label = new JLabel("办公助手");
		label.setFont(new Font("宋体", Font.PLAIN, 26));
		label.setBounds(261, 10, 185, 38);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("当前时间：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(189, 81, 112, 38);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("2016年1月1日  8：59：59");
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(324, 84, 240, 32);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("待办事宜：");
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(189, 129, 112, 38);
		contentPane.add(label_3);
		
		JLabel lblZhangsan = new JLabel("（2）项");
		lblZhangsan.setFont(new Font("宋体", Font.PLAIN, 18));
		lblZhangsan.setBounds(324, 132, 122, 32);
		contentPane.add(lblZhangsan);
		
		JLabel label_5 = new JLabel("公文查收：");
		label_5.setFont(new Font("宋体", Font.PLAIN, 18));
		label_5.setBounds(189, 177, 112, 38);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("（0）件");
		label_6.setFont(new Font("宋体", Font.PLAIN, 18));
		label_6.setBounds(324, 180, 106, 32);
		contentPane.add(label_6);
		
		JLabel label_4 = new JLabel("邮件查收：");
		label_4.setFont(new Font("宋体", Font.PLAIN, 18));
		label_4.setBounds(189, 227, 112, 38);
		contentPane.add(label_4);
		
		JLabel label_7 = new JLabel("（7）封");
		label_7.setFont(new Font("宋体", Font.PLAIN, 18));
		label_7.setBounds(324, 233, 106, 32);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("工作提醒：");
		label_8.setFont(new Font("宋体", Font.PLAIN, 18));
		label_8.setBounds(189, 285, 112, 38);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("您将在5分钟后，参加会议");
		label_9.setFont(new Font("宋体", Font.PLAIN, 18));
		label_9.setBounds(324, 291, 230, 32);
		contentPane.add(label_9);
	}
}
