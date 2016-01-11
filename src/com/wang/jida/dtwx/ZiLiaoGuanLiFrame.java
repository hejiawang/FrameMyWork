package com.wang.jida.dtwx;

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

public class ZiLiaoGuanLiFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZiLiaoGuanLiFrame frame = new ZiLiaoGuanLiFrame();
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
	public ZiLiaoGuanLiFrame() {
		setTitle("资料管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("资料管理") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("管理记录");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("图纸资料");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("技术资料");
						node_1.add(new DefaultMutableTreeNode("螺丝的技术"));
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
				}
			}
		));
		tree.setBounds(0, 10, 167, 242);
		contentPane.add(tree);
		
		JButton button = new JButton("添加\r\n资料");
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		button.setBounds(177, 33, 93, 61);
		contentPane.add(button);
		
		JButton button_1 = new JButton("删除资料");
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBounds(298, 33, 93, 61);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("查看资料");
		button_2.setFont(new Font("宋体", Font.PLAIN, 14));
		button_2.setBounds(298, 166, 93, 61);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("修改资料");
		button_3.setFont(new Font("宋体", Font.PLAIN, 14));
		button_3.setBounds(177, 166, 93, 61);
		contentPane.add(button_3);
	}
}
