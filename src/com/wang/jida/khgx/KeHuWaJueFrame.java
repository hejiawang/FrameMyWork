package com.wang.jida.khgx;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class KeHuWaJueFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeHuWaJueFrame frame = new KeHuWaJueFrame();
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
	public KeHuWaJueFrame() {
		setTitle("大连银行客户关系管理系统——客户挖掘");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("客户特征挖掘");
		btnNewButton.setBounds(10, 32, 123, 38);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("重点客户挖掘");
		button.setBounds(174, 32, 123, 38);
		contentPane.add(button);
		
		JButton button_1 = new JButton("活跃客户挖掘");
		button_1.setBounds(10, 106, 123, 38);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("违约客户挖掘\r\n");
		button_2.setBounds(174, 106, 123, 38);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("大额变动客户挖掘");
		button_3.setBounds(62, 180, 162, 38);
		contentPane.add(button_3);
	}

}
