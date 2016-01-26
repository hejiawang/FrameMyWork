package com.wang.jida.xfaq;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class XiaoFangQiCaiFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XiaoFangQiCaiFrame frame = new XiaoFangQiCaiFrame();
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
	public XiaoFangQiCaiFrame() {
		setTitle("社会单位消防安全系统——消防器材管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton button = new JButton("添加器材");
		button.setBackground(Color.GREEN);
		button.setBounds(10, 10, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("修改器材");
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(120, 10, 93, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("删除器材");
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(231, 10, 93, 23);
		contentPane.add(button_2);
		
		JLabel label = new JLabel("器材查询");
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(10, 55, 93, 35);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("器材类型：");
		label_1.setBounds(10, 113, 93, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("器材名称：");
		label_2.setBounds(10, 159, 93, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("器材归属地：");
		label_3.setBounds(10, 207, 93, 15);
		contentPane.add(label_3);
		
		txta = new JTextField();
		txta.setText("灭火器A");
		txta.setColumns(10);
		txta.setBounds(120, 156, 204, 21);
		contentPane.add(txta);
		
		JButton button_3 = new JButton("管理器材类型");
		button_3.setBackground(Color.GREEN);
		button_3.setBounds(346, 10, 119, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("管理器材归属地");
		button_4.setBackground(Color.GREEN);
		button_4.setBounds(486, 10, 136, 23);
		contentPane.add(button_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"移动灭火器"}));
		comboBox.setBounds(120, 110, 204, 21);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"仓库"}));
		comboBox_1.setBounds(120, 204, 204, 21);
		contentPane.add(comboBox_1);
		
		JButton button_5 = new JButton("查询");
		button_5.setBackground(Color.GREEN);
		button_5.setBounds(120, 247, 93, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("重置");
		button_6.setBackground(Color.GREEN);
		button_6.setBounds(231, 247, 93, 23);
		contentPane.add(button_6);
	}
}
