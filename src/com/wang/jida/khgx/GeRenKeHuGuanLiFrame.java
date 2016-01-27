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

public class GeRenKeHuGuanLiFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeRenKeHuGuanLiFrame frame = new GeRenKeHuGuanLiFrame();
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
	public GeRenKeHuGuanLiFrame() {
		setTitle("大连银行客户关系管理系统——个人客户管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("个人客户管理") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("客户额度明细管理");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("客户财务明细管理");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("客户基本信息管理");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("客户创利信息管理");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("客户风险信息管理");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
				}
			}
		));
		tree.setBounds(0, 10, 167, 357);
		contentPane.add(tree);
		
		JButton btnNewButton = new JButton("添加");
		btnNewButton.setBounds(233, 329, 93, 38);
		contentPane.add(btnNewButton);
		
		JLabel label_1 = new JLabel("姓名：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 14));
		label_1.setBounds(177, 58, 57, 27);
		contentPane.add(label_1);
		
		JButton button = new JButton("重置");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(394, 329, 93, 38);
		contentPane.add(button);
		
		JLabel label = new JLabel("添加个人客户");
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(361, 10, 167, 44);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("性别：");
		label_2.setFont(new Font("宋体", Font.PLAIN, 14));
		label_2.setBounds(177, 95, 57, 27);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("年龄：");
		label_3.setFont(new Font("宋体", Font.PLAIN, 14));
		label_3.setBounds(177, 132, 57, 27);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("电话：");
		label_4.setFont(new Font("宋体", Font.PLAIN, 14));
		label_4.setBounds(177, 169, 57, 27);
		contentPane.add(label_4);
		
		textField = new JTextField();
		textField.setBounds(231, 61, 112, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox checkBox = new JCheckBox("男");
		checkBox.setSelected(true);
		checkBox.setBounds(231, 99, 49, 23);
		contentPane.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("女");
		checkBox_1.setBounds(291, 99, 49, 23);
		contentPane.add(checkBox_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(30), null, null, new Integer(1)));
		spinner.setBounds(231, 135, 112, 22);
		contentPane.add(spinner);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(231, 172, 112, 21);
		contentPane.add(textField_1);
		
		JLabel label_5 = new JLabel("客户等级：");
		label_5.setFont(new Font("宋体", Font.PLAIN, 14));
		label_5.setBounds(404, 58, 83, 27);
		contentPane.add(label_5);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Integer(3), null, null, new Integer(1)));
		spinner_1.setBounds(497, 61, 112, 22);
		contentPane.add(spinner_1);
		
		JLabel label_6 = new JLabel("不良记录：");
		label_6.setFont(new Font("宋体", Font.PLAIN, 14));
		label_6.setBounds(404, 101, 83, 27);
		contentPane.add(label_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(496, 114, 234, 83);
		contentPane.add(textArea);
		
		JLabel label_7 = new JLabel("备注：");
		label_7.setFont(new Font("宋体", Font.PLAIN, 14));
		label_7.setBounds(177, 214, 57, 27);
		contentPane.add(label_7);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(231, 216, 499, 83);
		contentPane.add(textArea_1);
	}
}
