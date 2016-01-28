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

public class TongXunPingTaiFrame extends JFrame {

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
					TongXunPingTaiFrame frame = new TongXunPingTaiFrame();
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
	public TongXunPingTaiFrame() {
		setTitle("沈阳邮政办公自动化系统——通讯平台");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("通讯平台") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("通讯联系");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("电子邮件");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("网上论坛");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
				}
			}
		));
		tree.setBounds(0, 10, 167, 357);
		contentPane.add(tree);
		
		JButton btnNewButton = new JButton("发送");
		btnNewButton.setBounds(263, 329, 93, 38);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("发送电子邮件");
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(328, 10, 185, 38);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("收件人：");
		label_1.setFont(new Font("宋体", Font.PLAIN, 14));
		label_1.setBounds(177, 58, 81, 27);
		contentPane.add(label_1);
		
		JLabel label_3 = new JLabel("抄送人：");
		label_3.setFont(new Font("宋体", Font.PLAIN, 14));
		label_3.setBounds(177, 95, 81, 27);
		contentPane.add(label_3);
		
		JLabel label_5 = new JLabel("邮件内容：");
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
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(263, 98, 177, 21);
		contentPane.add(textField_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(263, 137, 483, 162);
		contentPane.add(textArea);
	}
}
