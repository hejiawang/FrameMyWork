package com.wang.jida.xfaq;

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

public class XiaoFangDangAnFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XiaoFangDangAnFrame frame = new XiaoFangDangAnFrame();
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
	public XiaoFangDangAnFrame() {
		setTitle("社会单位消防安全管理系统——消防档案管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("档案管理") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("火灾隐患档案");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("消防检查档案");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("消防档案");
						node_1.add(new DefaultMutableTreeNode("消防许可审批"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("消防器材档案");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
				}
			}
		));
		tree.setBounds(0, 10, 167, 242);
		contentPane.add(tree);
		
		JButton button = new JButton("添加档案");
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		button.setBounds(177, 33, 93, 61);
		contentPane.add(button);
		
		JButton button_1 = new JButton("删除档案");
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBounds(298, 33, 93, 61);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("查看档案");
		button_2.setFont(new Font("宋体", Font.PLAIN, 14));
		button_2.setBounds(298, 166, 93, 61);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("修改档案");
		button_3.setFont(new Font("宋体", Font.PLAIN, 14));
		button_3.setBounds(177, 166, 93, 61);
		contentPane.add(button_3);
	}
}
