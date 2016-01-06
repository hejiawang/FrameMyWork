package com.wang.jida.tycgssxt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;

public class ChangGaunFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangGaunFrame frame = new ChangGaunFrame();
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
	public ChangGaunFrame() {
		setTitle("场馆管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("场馆管理") {
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
		tree.setBounds(0, 0, 142, 344);
		contentPane.add(tree);
		
		JButton button = new JButton("增加场馆");
		button.setBounds(154, 10, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("删除场馆");
		button_1.setBounds(268, 10, 93, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("修改场馆信息");
		button_2.setBounds(378, 10, 112, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("申请保养场馆");
		button_3.setBounds(505, 10, 112, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("增加场地");
		button_4.setBounds(154, 59, 93, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("删除场地");
		button_5.setBounds(268, 59, 93, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("修改场地信息");
		button_6.setBounds(378, 59, 112, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("申请保养场地");
		button_7.setBounds(505, 59, 112, 23);
		contentPane.add(button_7);
		
		JLabel lblA = new JLabel("篮球场馆  篮球场地 A2  基本信息：");
		lblA.setBounds(152, 114, 209, 15);
		contentPane.add(lblA);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		textArea.setText("该篮球场地始建于2000年7月7日。\r\n本校教师观察到我校学生多善于篮\r\n球运动，并多次在全国大学生篮球\r\n比赛中获奖，鉴于这种情况，校方\r\n决定继续支持学生们的篮球运动，\r\n建立这个篮球场地，鼓励学生\r\n");
		textArea.setBounds(154, 139, 249, 205);
		contentPane.add(textArea);
		
		JLabel label = new JLabel("场地状态：");
		label.setBounds(413, 146, 77, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setText("正在上课");
		textField.setBounds(505, 143, 66, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("使用器材：");
		label_1.setBounds(413, 192, 77, 15);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setText("篮球");
		textField_1.setBounds(505, 189, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("1");
		textField_2.setBounds(505, 220, 66, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_2 = new JLabel("个");
		label_2.setBounds(573, 223, 54, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("使用安排：");
		label_3.setBounds(413, 263, 77, 15);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setText("今日：13：00—15：00");
		textField_3.setBounds(505, 260, 137, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setText("明日：外租");
		textField_4.setBounds(505, 291, 137, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
