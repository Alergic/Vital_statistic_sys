package Views;

import java.awt.EventQueue;
import java.sql.*;
import java.util.*;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorLoginview extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public OperatorLoginview() {
		setTitle("农村人口统计系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel = new JLabel("操作员登录界面");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 353, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, -341, SpringLayout.EAST, contentPane);
		lblNewLabel.setFont(new Font("华文楷体", Font.BOLD, 40));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 309, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, -48, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 214, SpringLayout.NORTH, contentPane);
		lblNewLabel_1.setForeground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel_1.setFont(new Font("华文楷体", Font.PLAIN, 35));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 177, SpringLayout.NORTH, contentPane);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 25, SpringLayout.SOUTH, lblNewLabel_1);
		lblNewLabel_2.setFont(new Font("华文楷体", Font.PLAIN, 35));
		lblNewLabel_2.setForeground(UIManager.getColor("Button.darkShadow"));
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2, 268, SpringLayout.WEST, contentPane);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 409, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, -11, SpringLayout.WEST, textField);
		textField.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, -317, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, -280, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, -245, SpringLayout.EAST, contentPane);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_1, 29, SpringLayout.SOUTH, textField);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_1, -214, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 11, SpringLayout.EAST, lblNewLabel_2);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_1, -245, SpringLayout.EAST, contentPane);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		JButton btnNewButton = new JButton("登录");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 for(int i=0;i<JDBC.list1.size();i++)
				 {
				if(textField.getText().equals(JDBC.list1.get(i))&&textField_1.getText().equals(JDBC.list2.get(i))) 
				{
					dispose();
					JDBC.count=i;
					new Operatorview().setVisible(true);
					break;
				}
				if(i==JDBC.list1.size()-1)
				{
					JOptionPane.showMessageDialog(null, "你输入的id或密码错误请重新输入！");
					break;
				}
				 }
			}
		});
		btnNewButton.setFont(new Font("华文楷体", Font.PLAIN, 30));
		
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 64, SpringLayout.SOUTH, lblNewLabel_2);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 372, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -113, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -377, SpringLayout.EAST, contentPane);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("返回");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new StartView().setVisible(true);
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 24, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, -102, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 57, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, -22, SpringLayout.EAST, contentPane);
		btnNewButton_1.setFont(new Font("华文楷体", Font.PLAIN, 18));
		contentPane.add(btnNewButton_1);

	}

}
