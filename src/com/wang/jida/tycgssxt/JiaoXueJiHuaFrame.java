package com.wang.jida.tycgssxt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class JiaoXueJiHuaFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JiaoXueJiHuaFrame frame = new JiaoXueJiHuaFrame();
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
	public JiaoXueJiHuaFrame() {
		setTitle("教学计划场地安排管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1009, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton button = new JButton("昨天");
		button.setBounds(10, 10, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("明天");
		button_1.setBounds(131, 10, 93, 23);
		contentPane.add(button_1);
		
		JLabel label = new JLabel("选择日期：");
		label.setBounds(250, 14, 72, 15);
		contentPane.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2016-01-01"}));
		comboBox.setBounds(322, 11, 102, 21);
		contentPane.add(comboBox);
		
		JLabel label_1 = new JLabel("2016-01-01教学计划场地安排：");
		label_1.setBounds(10, 45, 184, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("第一节");
		label_2.setBounds(10, 142, 54, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("第二节");
		label_3.setBounds(10, 186, 54, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("第三节");
		label_4.setBounds(10, 229, 54, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("第四节");
		label_5.setBounds(10, 279, 54, 15);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("晚课");
		label_6.setBounds(10, 328, 54, 15);
		contentPane.add(label_6);
		
		JLabel lbla = new JLabel("篮球场A1");
		lbla.setBounds(91, 90, 54, 15);
		contentPane.add(lbla);
		
		JLabel lbla_1 = new JLabel("篮球场A2");
		lbla_1.setBounds(220, 90, 54, 15);
		contentPane.add(lbla_1);
		
		JLabel label_9 = new JLabel("羽毛球单人Ａ");
		label_9.setBounds(322, 90, 84, 15);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("羽毛球双人Ａ");
		label_10.setBounds(451, 90, 93, 15);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("足球场Ａ");
		label_11.setBounds(593, 90, 54, 15);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("足球场Ｂ");
		label_12.setBounds(714, 90, 54, 15);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("台球场Ａ");
		label_13.setBounds(833, 90, 54, 15);
		contentPane.add(label_13);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"外租"}));
		comboBox_2.setBounds(67, 139, 115, 21);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"上课"}));
		comboBox_1.setBounds(192, 139, 115, 21);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"外租"}));
		comboBox_3.setBounds(315, 139, 115, 21);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"上课"}));
		comboBox_4.setBounds(440, 139, 115, 21);
		contentPane.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"上课"}));
		comboBox_5.setBounds(565, 139, 115, 21);
		contentPane.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"空闲"}));
		comboBox_6.setBounds(690, 139, 115, 21);
		contentPane.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"上课"}));
		comboBox_7.setBounds(815, 139, 115, 21);
		contentPane.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"外租"}));
		comboBox_8.setBounds(67, 183, 115, 21);
		contentPane.add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"外租"}));
		comboBox_9.setBounds(67, 226, 115, 21);
		contentPane.add(comboBox_9);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"空闲"}));
		comboBox_10.setBounds(67, 276, 115, 21);
		contentPane.add(comboBox_10);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"空闲"}));
		comboBox_11.setBounds(67, 325, 115, 21);
		contentPane.add(comboBox_11);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"上课"}));
		comboBox_12.setBounds(192, 183, 115, 21);
		contentPane.add(comboBox_12);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"上课"}));
		comboBox_13.setBounds(192, 226, 115, 21);
		contentPane.add(comboBox_13);
		
		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"空闲"}));
		comboBox_14.setBounds(192, 276, 115, 21);
		contentPane.add(comboBox_14);
		
		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"外租"}));
		comboBox_15.setBounds(192, 325, 115, 21);
		contentPane.add(comboBox_15);
		
		JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"外租"}));
		comboBox_16.setBounds(315, 183, 115, 21);
		contentPane.add(comboBox_16);
		
		JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"上课"}));
		comboBox_17.setBounds(315, 226, 115, 21);
		contentPane.add(comboBox_17);
		
		JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setModel(new DefaultComboBoxModel(new String[] {"上课"}));
		comboBox_18.setBounds(315, 276, 115, 21);
		contentPane.add(comboBox_18);
		
		JComboBox comboBox_19 = new JComboBox();
		comboBox_19.setModel(new DefaultComboBoxModel(new String[] {"空闲"}));
		comboBox_19.setBounds(315, 325, 115, 21);
		contentPane.add(comboBox_19);
		
		JComboBox comboBox_20 = new JComboBox();
		comboBox_20.setModel(new DefaultComboBoxModel(new String[] {"外租"}));
		comboBox_20.setBounds(440, 183, 115, 21);
		contentPane.add(comboBox_20);
		
		JComboBox comboBox_21 = new JComboBox();
		comboBox_21.setModel(new DefaultComboBoxModel(new String[] {"外租"}));
		comboBox_21.setBounds(440, 226, 115, 21);
		contentPane.add(comboBox_21);
		
		JComboBox comboBox_22 = new JComboBox();
		comboBox_22.setModel(new DefaultComboBoxModel(new String[] {"外租"}));
		comboBox_22.setBounds(440, 276, 115, 21);
		contentPane.add(comboBox_22);
		
		JComboBox comboBox_23 = new JComboBox();
		comboBox_23.setModel(new DefaultComboBoxModel(new String[] {"空闲"}));
		comboBox_23.setBounds(440, 325, 115, 21);
		contentPane.add(comboBox_23);
		
		JComboBox comboBox_24 = new JComboBox();
		comboBox_24.setModel(new DefaultComboBoxModel(new String[] {"上课"}));
		comboBox_24.setBounds(565, 183, 115, 21);
		contentPane.add(comboBox_24);
		
		JComboBox comboBox_25 = new JComboBox();
		comboBox_25.setModel(new DefaultComboBoxModel(new String[] {"空闲"}));
		comboBox_25.setBounds(565, 226, 115, 21);
		contentPane.add(comboBox_25);
		
		JComboBox comboBox_26 = new JComboBox();
		comboBox_26.setModel(new DefaultComboBoxModel(new String[] {"外租"}));
		comboBox_26.setBounds(565, 276, 115, 21);
		contentPane.add(comboBox_26);
		
		JComboBox comboBox_27 = new JComboBox();
		comboBox_27.setModel(new DefaultComboBoxModel(new String[] {"外租"}));
		comboBox_27.setBounds(565, 325, 115, 21);
		contentPane.add(comboBox_27);
		
		JComboBox comboBox_28 = new JComboBox();
		comboBox_28.setModel(new DefaultComboBoxModel(new String[] {"空闲"}));
		comboBox_28.setBounds(690, 183, 115, 21);
		contentPane.add(comboBox_28);
		
		JComboBox comboBox_29 = new JComboBox();
		comboBox_29.setModel(new DefaultComboBoxModel(new String[] {"空闲"}));
		comboBox_29.setBounds(690, 226, 115, 21);
		contentPane.add(comboBox_29);
		
		JComboBox comboBox_30 = new JComboBox();
		comboBox_30.setModel(new DefaultComboBoxModel(new String[] {"空闲"}));
		comboBox_30.setBounds(690, 276, 115, 21);
		contentPane.add(comboBox_30);
		
		JComboBox comboBox_31 = new JComboBox();
		comboBox_31.setModel(new DefaultComboBoxModel(new String[] {"空闲"}));
		comboBox_31.setBounds(690, 325, 115, 21);
		contentPane.add(comboBox_31);
		
		JComboBox comboBox_32 = new JComboBox();
		comboBox_32.setModel(new DefaultComboBoxModel(new String[] {"上课"}));
		comboBox_32.setBounds(815, 183, 115, 21);
		contentPane.add(comboBox_32);
		
		JComboBox comboBox_33 = new JComboBox();
		comboBox_33.setModel(new DefaultComboBoxModel(new String[] {"空闲"}));
		comboBox_33.setBounds(815, 226, 115, 21);
		contentPane.add(comboBox_33);
		
		JComboBox comboBox_34 = new JComboBox();
		comboBox_34.setModel(new DefaultComboBoxModel(new String[] {"空闲"}));
		comboBox_34.setBounds(815, 276, 115, 21);
		contentPane.add(comboBox_34);
		
		JComboBox comboBox_35 = new JComboBox();
		comboBox_35.setModel(new DefaultComboBoxModel(new String[] {"外租"}));
		comboBox_35.setBounds(815, 325, 115, 21);
		contentPane.add(comboBox_35);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		scrollBar.setBounds(63, 360, 867, 17);
		contentPane.add(scrollBar);
	}
}
