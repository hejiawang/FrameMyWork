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

public class XiTongGuanLiFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XiTongGuanLiFrame frame = new XiTongGuanLiFrame();
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
	public XiTongGuanLiFrame() {
		setTitle("大连银行客户关系管理系统——系统管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("系统管理") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("账号管理");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("密码管理");
						node_1.add(new DefaultMutableTreeNode(""));
					add(node_1);
				}
			}
		));
		tree.setBounds(0, 10, 167, 242);
		contentPane.add(tree);
		
		JButton btnNewButton = new JButton("添加账号");
		btnNewButton.setBounds(495, 14, 93, 23);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("账号名称：");
		label.setBounds(177, 11, 93, 28);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(253, 15, 129, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("查找账号");
		button.setBounds(392, 14, 93, 23);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("姓名");
		label_1.setBackground(Color.LIGHT_GRAY);
		label_1.setBounds(193, 63, 93, 28);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("账户类型");
		label_2.setBounds(289, 63, 93, 28);
		contentPane.add(label_2);
		
		JLabel lblAdmin = new JLabel("admin1");
		lblAdmin.setBounds(193, 101, 93, 28);
		contentPane.add(lblAdmin);
		
		JLabel label_3 = new JLabel("管理员");
		label_3.setBounds(289, 101, 93, 28);
		contentPane.add(label_3);
		
		JLabel lblCommon = new JLabel("common");
		lblCommon.setBounds(193, 133, 93, 28);
		contentPane.add(lblCommon);
		
		JLabel label_4 = new JLabel("普通用户");
		label_4.setBounds(289, 133, 93, 28);
		contentPane.add(label_4);
		
		JButton button_1 = new JButton("修改账号");
		button_1.setBounds(392, 104, 93, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("冻结账号");
		button_2.setBounds(495, 104, 93, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("删除账号");
		button_3.setBounds(599, 104, 93, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("修改账号");
		button_4.setBounds(392, 136, 93, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("冻结账号");
		button_5.setBounds(495, 136, 93, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("删除账号");
		button_6.setBounds(599, 136, 93, 23);
		contentPane.add(button_6);
	}
}
