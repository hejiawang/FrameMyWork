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

public class JiTuanKeHuGuanLiFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JiTuanKeHuGuanLiFrame frame = new JiTuanKeHuGuanLiFrame();
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
	public JiTuanKeHuGuanLiFrame() {
		setTitle("大连银行客户关系管理系统——集团客户管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("集团客户管理") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("集团客户信息公示");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("集团客户信息维护");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("集团客户审批");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("集团客户信息查询");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
				}
			}
		));
		tree.setBounds(0, 10, 167, 357);
		contentPane.add(tree);
		
		JButton btnNewButton = new JButton("审批通过");
		btnNewButton.setBounds(177, 323, 93, 38);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("集团客户审批流程");
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(328, 10, 185, 38);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("集团名称：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 14));
		label_1.setBounds(177, 58, 81, 27);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("白石集团");
		label_2.setBounds(268, 64, 81, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("集团规模：");
		label_3.setFont(new Font("宋体", Font.PLAIN, 14));
		label_3.setBounds(177, 95, 81, 27);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("1800人");
		label_4.setBounds(268, 101, 81, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("集团资产：");
		label_5.setFont(new Font("宋体", Font.PLAIN, 14));
		label_5.setBounds(177, 135, 81, 27);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("320亿元人民币");
		label_6.setBounds(268, 139, 106, 15);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("集团法人：");
		label_7.setFont(new Font("宋体", Font.PLAIN, 14));
		label_7.setBounds(177, 176, 81, 27);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("白石");
		label_8.setBounds(268, 182, 81, 15);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("集团不良记录：");
		label_9.setFont(new Font("宋体", Font.PLAIN, 14));
		label_9.setBounds(177, 219, 119, 27);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("无");
		label_10.setBounds(291, 225, 58, 15);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("集团简介：");
		label_11.setFont(new Font("宋体", Font.PLAIN, 14));
		label_11.setBounds(384, 58, 81, 27);
		contentPane.add(label_11);
		
		JLabel lblNewLabel = new JLabel("白石集团成立于1990年1月1日，目前集团拥有优秀员工1800余人");
		lblNewLabel.setBounds(384, 101, 362, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("，每一位员工都是业内优秀人士。目前集团资产320亿元人民币，");
		lblNewLabel_1.setBounds(384, 139, 362, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_12 = new JLabel("集团致力于各行各业，在各行各业都有优秀的不菲的成绩，为世");
		label_12.setBounds(384, 182, 362, 15);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("界和平作出巨大贡献。");
		label_13.setBounds(384, 219, 362, 15);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("集团行业：");
		label_14.setFont(new Font("宋体", Font.PLAIN, 14));
		label_14.setBounds(177, 256, 81, 27);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("各行各业");
		label_15.setBounds(268, 262, 81, 15);
		contentPane.add(label_15);
		
		JButton button = new JButton("拒绝审批");
		button.setBounds(291, 323, 93, 38);
		contentPane.add(button);
		
		JButton button_1 = new JButton("下一条");
		button_1.setBounds(653, 329, 93, 27);
		contentPane.add(button_1);
	}
}
