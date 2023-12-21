package Views;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

public class Operatorview extends JFrame {

	private JPanel contentPane;
	public Operatorview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel = new JLabel("操作员模块");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 50, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 381, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, -400, SpringLayout.EAST, contentPane);
		lblNewLabel.setFont(new Font("华文楷体", Font.BOLD, 40));
		contentPane.add(lblNewLabel);
		
		System.out.println(JDBC.count);
		JLabel lblNewLabel_1 = new JLabel("Welcome! "+JDBC.list3.get(JDBC.count));
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, -207, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, -15, SpringLayout.EAST, contentPane);
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 20));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 37, SpringLayout.NORTH, contentPane);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("户主信息");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 238, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, 217, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -202, SpringLayout.SOUTH, contentPane);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hmodifyview.judge=1;
				dispose();
				new Hmodifyview().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("家庭成员信息");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FMmodifyview.judge1=1;
				dispose();
				new FMmodifyview().setVisible(true);
			}
		});
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, -279, SpringLayout.WEST, btnNewButton_2);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_2, -237, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_2, 238, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_2, -202, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_2, -373, SpringLayout.EAST, contentPane);
		btnNewButton_2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("退出登录");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new StartView().setVisible(true);
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_3, -129, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_3, 423, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_3, -70, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_3, 559, SpringLayout.WEST, contentPane);
		btnNewButton_3.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		contentPane.add(btnNewButton_3);
	}

}
