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

public class XieTongGongZuoFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XieTongGongZuoFrame frame = new XieTongGongZuoFrame();
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
	public XieTongGongZuoFrame() {
		setTitle("沈阳邮政办公自动化系统——协同工作平台");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("协同工作平台") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("待办事宜");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("工作安排");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("事务审批");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("签到管理");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("工作动态");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
				}
			}
		));
		tree.setBounds(0, 10, 167, 357);
		contentPane.add(tree);
		
		JButton btnNewButton = new JButton("确认签到");
		btnNewButton.setBounds(455, 101, 93, 38);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("签到管理");
		label.setFont(new Font("宋体", Font.PLAIN, 26));
		label.setBounds(261, 10, 185, 38);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("员工姓名：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(189, 96, 112, 38);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("张三");
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(324, 102, 81, 32);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("员工账号：");
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(189, 160, 112, 38);
		contentPane.add(label_3);
		
		JLabel lblZhangsan = new JLabel("ZhangSan");
		lblZhangsan.setFont(new Font("宋体", Font.PLAIN, 18));
		lblZhangsan.setBounds(324, 166, 122, 32);
		contentPane.add(lblZhangsan);
		
		JLabel label_5 = new JLabel("当前时间：");
		label_5.setFont(new Font("宋体", Font.PLAIN, 18));
		label_5.setBounds(189, 232, 112, 38);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("8：28");
		label_6.setFont(new Font("宋体", Font.PLAIN, 18));
		label_6.setBounds(324, 238, 106, 32);
		contentPane.add(label_6);
		
		JButton button = new JButton("迟到说明");
		button.setBounds(455, 162, 93, 38);
		contentPane.add(button);
		
		JButton button_1 = new JButton("请假申请");
		button_1.setBounds(455, 232, 93, 38);
		contentPane.add(button_1);
	}
}
