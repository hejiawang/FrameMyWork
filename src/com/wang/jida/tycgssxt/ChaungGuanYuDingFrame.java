package com.wang.jida.tycgssxt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.JTree;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class ChaungGuanYuDingFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChaungGuanYuDingFrame frame = new ChaungGuanYuDingFrame();
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
	public ChaungGuanYuDingFrame() {
		setTitle("场馆预定管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("场馆列表") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("篮球场");
						node_1.add(new DefaultMutableTreeNode("篮球场A1"));
						node_1.add(new DefaultMutableTreeNode("篮球场A2"));
						node_1.add(new DefaultMutableTreeNode("篮球场B1"));
						node_1.add(new DefaultMutableTreeNode("篮球场B2"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("足球场");
						node_1.add(new DefaultMutableTreeNode("足球场A"));
						node_1.add(new DefaultMutableTreeNode("足球场B"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("羽毛球场");
						node_1.add(new DefaultMutableTreeNode("单人A"));
						node_1.add(new DefaultMutableTreeNode("单人B"));
						node_1.add(new DefaultMutableTreeNode("双人A"));
					add(node_1);
				}
			}
		));
		tree.setBounds(0, 0, 142, 312);
		contentPane.add(tree);
		
		JLabel lbla = new JLabel("篮球场A2  2016-01-01  日  使用情况如下：");
		lbla.setBounds(152, 10, 289, 15);
		contentPane.add(lbla);
		
		JLabel label = new JLabel("第一节");
		label.setFont(new Font("宋体", Font.PLAIN, 14));
		label.setBounds(252, 66, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("第二节");
		label_1.setFont(new Font("宋体", Font.PLAIN, 14));
		label_1.setBounds(355, 66, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("第三节");
		label_2.setFont(new Font("宋体", Font.PLAIN, 14));
		label_2.setBounds(457, 66, 54, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("第四节");
		label_3.setFont(new Font("宋体", Font.PLAIN, 14));
		label_3.setBounds(548, 66, 54, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("晚课");
		label_4.setFont(new Font("宋体", Font.PLAIN, 14));
		label_4.setBounds(656, 66, 54, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("上课");
		label_5.setBounds(252, 117, 54, 15);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("上课");
		label_6.setBounds(355, 117, 54, 15);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("上课");
		label_7.setBounds(457, 117, 54, 15);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("空闲");
		label_8.setBounds(548, 117, 54, 15);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("外租");
		label_9.setBounds(656, 117, 54, 15);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("时间：");
		label_10.setBounds(156, 66, 54, 15);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("使用情况：");
		label_11.setBounds(152, 117, 72, 15);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("预定情况：");
		label_12.setBounds(152, 167, 72, 15);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("不可预定");
		label_13.setBounds(252, 167, 54, 15);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("不可预定");
		label_14.setBounds(355, 167, 54, 15);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("不可预定");
		label_15.setBounds(457, 167, 54, 15);
		contentPane.add(label_15);
		
		JButton button = new JButton("预定");
		button.setBounds(524, 163, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("取消预定");
		button_1.setBounds(630, 163, 93, 23);
		contentPane.add(button_1);
		
		JLabel label_16 = new JLabel("日期查询：");
		label_16.setBounds(152, 227, 72, 15);
		contentPane.add(label_16);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2016-01-01"}));
		comboBox.setBounds(252, 224, 142, 21);
		contentPane.add(comboBox);
		
		JLabel label_17 = new JLabel("场馆查询：");
		label_17.setBounds(152, 283, 72, 15);
		contentPane.add(label_17);
		
		JButton button_2 = new JButton("查询");
		button_2.setBounds(551, 279, 66, 23);
		contentPane.add(button_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"篮球场"}));
		comboBox_1.setBounds(252, 280, 142, 21);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"篮球场A2"}));
		comboBox_2.setBounds(404, 281, 142, 21);
		contentPane.add(comboBox_2);
	}
}
