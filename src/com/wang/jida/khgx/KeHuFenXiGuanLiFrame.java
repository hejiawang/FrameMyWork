package com.wang.jida.khgx;

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
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.ImageIcon;

public class KeHuFenXiGuanLiFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeHuFenXiGuanLiFrame frame = new KeHuFenXiGuanLiFrame();
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
	public KeHuFenXiGuanLiFrame() {
		setTitle("大连银行客户关系管理系统——客户分析管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1114, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("客户分析管理") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("客户行为分析");
						node_1.add(new DefaultMutableTreeNode("客户满意调查分析"));
						node_1.add(new DefaultMutableTreeNode("客户忠诚度分析"));
						node_1.add(new DefaultMutableTreeNode("客户账龄分析"));
						node_1.add(new DefaultMutableTreeNode("客户获利分析"));
						node_1.add(new DefaultMutableTreeNode("客户流失分析"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("客户贡献度分析");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
				}
			}
		));
		tree.setBounds(0, 10, 167, 357);
		contentPane.add(tree);
		
		JLabel lblNewLabel = new JLabel("集团客户与个人客户贡献度分析比较");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel.setBounds(268, 10, 347, 41);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon(KeHuFenXiGuanLiFrame.class.getResource("/com/wang/jida/khgx/分析.jpg")));
		label.setBounds(177, 57, 923, 310);
		contentPane.add(label);
	}
}
