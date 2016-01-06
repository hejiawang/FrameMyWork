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
		setBounds(100, 100, 450, 300);
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
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\u5668\u6750\u540D\u79F0", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(22, 95, 405, 165);
		contentPane.add(table);
	}
}
