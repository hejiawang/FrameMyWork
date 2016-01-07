package com.wang.jida.tycgssxt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

public class QiCaiFrame extends JFrame {

	private JPanel contentPane;
	private final JButton btnHello = new JButton("新增器材");
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QiCaiFrame frame = new QiCaiFrame();
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
	public QiCaiFrame() {
		setTitle("器材管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		btnHello.setBounds(12, 12, 93, 23);
		contentPane.add(btnHello);
		
		JButton button = new JButton("维修器材");
		button.setBounds(117, 12, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("器材报废");
		button_1.setBounds(222, 12, 93, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("器材借还");
		button_2.setBounds(327, 10, 93, 23);
		contentPane.add(button_2);
		
		table = new JTable();
		table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		table.setFont(new Font("宋体", Font.PLAIN, 12));
		table.setToolTipText("器材管理");
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u5668\u6750\u540D\u79F0", "\u5668\u6750\u72B6\u6001", "\u5668\u6750\u5F52\u5C5E", "\u5F15\u8FDB\u8BBE\u5907\u65F6\u95F4", "\u5668\u6750\u76EE\u524D\u6240\u5728", "\u5907\u6CE8"},
				{"\u7BEE\u7403_A1_1", "\u6B63\u5E38", "\u7BEE\u7403\u573AA1", "2000-01-01", "\u7BEE\u7403\u573AA1", null},
				{"\u7FBD\u6BDB\u7403\u62CD_\u5355_A", "\u6B63\u5E38", "\u7FBD\u6BDB\u7403\u5355\u4EBAA", "2002-09-01", "\u7FBD\u6BDB\u7403\u5355\u4EBAA", null},
				{"\u7BEE\u7403_A1_2", "\u7EF4\u4FEE", "\u7BEE\u7403\u573AA1", "2000-01-01", "\u7BEE\u7403\u573AB1", "\u5916\u501F"},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"\u5668\u6750\u540D\u79F0", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(87);
		table.getColumnModel().getColumn(1).setPreferredWidth(94);
		table.getColumnModel().getColumn(2).setPreferredWidth(99);
		table.getColumnModel().getColumn(3).setPreferredWidth(99);
		table.getColumnModel().getColumn(4).setPreferredWidth(94);
		table.setBounds(12, 69, 595, 144);
		contentPane.add(table);
	}
}
