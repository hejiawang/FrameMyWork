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
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;

public class GongWenLiuZhuanFrame extends JFrame {

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
					GongWenLiuZhuanFrame frame = new GongWenLiuZhuanFrame();
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
	public GongWenLiuZhuanFrame() {
		setTitle("沈阳邮政办公自动化系统——公文流转平台");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("公文流转平台") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("发文管理");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("收文管理");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("公文查询");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
				}
			}
		));
		tree.setBounds(0, 10, 167, 357);
		contentPane.add(tree);
		
		JButton btnNewButton = new JButton("发布");
		btnNewButton.setBounds(263, 329, 93, 38);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("公文发布");
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(328, 10, 185, 38);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("公文标题：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 14));
		label_1.setBounds(177, 58, 81, 27);
		contentPane.add(label_1);
		
		JLabel label_3 = new JLabel("公文等级：");
		label_3.setFont(new Font("宋体", Font.PLAIN, 14));
		label_3.setBounds(177, 95, 81, 27);
		contentPane.add(label_3);
		
		JLabel label_5 = new JLabel("公文内容：");
		label_5.setFont(new Font("宋体", Font.PLAIN, 14));
		label_5.setBounds(177, 135, 81, 27);
		contentPane.add(label_5);
		
		JButton button = new JButton("重置");
		button.setBounds(463, 329, 93, 38);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(263, 61, 177, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(263, 137, 483, 162);
		contentPane.add(textArea);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(263, 98, 177, 22);
		contentPane.add(spinner);
		
		JButton button_1 = new JButton("保存草稿");
		button_1.setBounds(653, 329, 93, 38);
		contentPane.add(button_1);
		
		JLabel label_2 = new JLabel("提醒谁看：");
		label_2.setFont(new Font("宋体", Font.PLAIN, 14));
		label_2.setBounds(457, 58, 81, 27);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(548, 61, 198, 21);
		contentPane.add(textField_1);
		
		JLabel label_4 = new JLabel("导入公文：");
		label_4.setFont(new Font("宋体", Font.PLAIN, 14));
		label_4.setBounds(457, 95, 81, 27);
		contentPane.add(label_4);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("选择文件");
		tglbtnNewToggleButton.setBounds(548, 97, 198, 23);
		contentPane.add(tglbtnNewToggleButton);
	}
}
