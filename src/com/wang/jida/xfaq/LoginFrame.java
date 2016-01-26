package com.wang.jida.xfaq;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

public class LoginFrame extends JFrame {

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
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setTitle("社会单位消防安全管理系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("用户名：");
		label.setBounds(50, 50, 54, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(114, 47, 180, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("密  码：");
		label_1.setBounds(50, 107, 54, 15);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(114, 104, 180, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("登   录");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(50, 190, 96, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("找回密码");
		button_1.setBounds(198, 190, 96, 23);
		contentPane.add(button_1);
		
		JRadioButton radioButton = new JRadioButton("消防人员登录");
		radioButton.setBounds(50, 143, 121, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("管理人员登录");
		radioButton_1.setBounds(173, 143, 121, 23);
		contentPane.add(radioButton_1);
	}
}
