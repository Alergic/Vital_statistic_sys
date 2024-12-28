package Views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class StartView extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartView frame = new StartView();
					//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					frame.setVisible(true);
					Music music =new Music("src/星光倾诉.wav");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StartView() {
		JDBC JDBC=new JDBC();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("农村人口统计系统");
		setBounds(100, 100, 1024, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JButton btnNewButton = new JButton("以管理员登录");
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 363, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -395, SpringLayout.EAST, getContentPane());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AdminLoginview().setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("以操作员登录");
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -64, SpringLayout.NORTH, btnNewButton_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -157, SpringLayout.SOUTH, contentPane);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new OperatorLoginview().setVisible(true);
			}
		});
		btnNewButton_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 291, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 363, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, -395, SpringLayout.EAST, getContentPane());
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("农村人口统计系统");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 64, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 50, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 312, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 112, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -327, SpringLayout.EAST, contentPane);
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 42));
		getContentPane().add(lblNewLabel);
	}

}
