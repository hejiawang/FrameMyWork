package com.wang.jida.xlxs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.Font;

public class HuiYuanFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HuiYuanFrame frame = new HuiYuanFrame();
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
	public HuiYuanFrame() {
		setTitle("鞋类销售管理系统——会员管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 777, 236);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "\u4F1A\u5458\u59D3\u540D", "\u6CE8\u518C\u65F6\u95F4", "\u5F53\u524D\u72B6\u6001", "\u8D26\u6237\u4F59\u989D", "\u4F1A\u5458\u7B49\u7EA7", "\u8054\u7CFB\u65B9\u5F0F", "\u5907\u6CE8"},
				{"1", "\u5F20\u4E09", "2016-01-01", "\u6B63\u5728\u6D88\u8D39", "199.00", "1", "13333333333", null},
				{"2", "\u674E\u56DB", "2016-01-01", "\u6302\u5931", "444.00", "1", "17777777777", "\u8BE5\u4F1A\u5458\u4F1A\u5458\u5361\u4E22\u5931\uFF0C\u8FD8\u672A\u8865\u529E"},
				{"3", "\u738B\u4E94", "2016-01-01", "\u6B63\u5E38", "0.00", "3", "", ""},
				{"4", "\u5C0F\u516D", "2016-01-01", "\u6B63\u5E38", "6.00", "2", "44444444444", null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(7).setPreferredWidth(230);
		table.setBounds(8, 118, 714, 80);
		contentPane.add(table);
		
		JButton button = new JButton("添加会员");
		button.setBounds(10, 10, 106, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("修改会员");
		button_1.setBounds(126, 10, 105, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("删除会员");
		button_2.setBounds(241, 10, 93, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("查找会员");
		button_3.setBounds(359, 60, 93, 23);
		contentPane.add(button_3);
		
		JLabel label = new JLabel("会员查找（请输入会员姓名）：");
		label.setBounds(10, 64, 209, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(206, 61, 141, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("会员信息列表：");
		label_1.setBounds(20, 91, 157, 15);
		contentPane.add(label_1);
		
		JButton button_5 = new JButton("会员卡充值");
		button_5.setBounds(462, 10, 106, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("会员卡挂失");
		button_6.setBounds(577, 10, 106, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("会员信息");
		button_7.setBounds(357, 10, 93, 23);
		contentPane.add(button_7);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(732, 110, 17, 80);
		contentPane.add(scrollBar);
	}
}
