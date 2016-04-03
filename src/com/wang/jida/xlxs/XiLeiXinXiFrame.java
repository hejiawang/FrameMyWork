package com.wang.jida.xlxs;

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

public class XiLeiXinXiFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XiLeiXinXiFrame frame = new XiLeiXinXiFrame();
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
	public XiLeiXinXiFrame() {
		setTitle("鞋类详细信息管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("鞋子分类信息") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("旅游鞋");
						node_1.add(new DefaultMutableTreeNode("男"));
						node_1.add(new DefaultMutableTreeNode("女"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("高跟鞋");
						node_1.add(new DefaultMutableTreeNode("3cm"));
						node_1.add(new DefaultMutableTreeNode("5cm"));
						node_1.add(new DefaultMutableTreeNode("7cm"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("品牌鞋");
						node_1.add(new DefaultMutableTreeNode("耐克"));
						node_1.add(new DefaultMutableTreeNode("爱蒂达斯"));
						node_1.add(new DefaultMutableTreeNode("李宁"));
					add(node_1);
				}
			}
		));
		tree.setBounds(0, 10, 167, 242);
		contentPane.add(tree);
		
		JButton button = new JButton("添加鞋子种类");
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		button.setBounds(177, 33, 118, 61);
		contentPane.add(button);
		
		JButton button_1 = new JButton("查看详细信息");
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBounds(345, 33, 131, 61);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("修改种类信息");
		button_2.setFont(new Font("宋体", Font.PLAIN, 14));
		button_2.setBounds(356, 166, 120, 61);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("删除种类信息");
		button_3.setFont(new Font("宋体", Font.PLAIN, 14));
		button_3.setBounds(177, 166, 118, 61);
		contentPane.add(button_3);
	}
}
