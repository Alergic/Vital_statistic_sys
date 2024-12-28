package Views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class addHview extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static JTextField textField;
	public static JTextField textField_1;
	public static JTextField textField_2;
	public static JTextField textField_3;
	public static JTextField textField_4;
	public static JTextField textField_5;
	public static JTextField textField_6;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			addHview dialog = new addHview();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public addHview() {
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblNewLabel = new JLabel("新建户主");
		lblNewLabel.setFont(new Font("华文楷体", Font.BOLD, 42));
		JLabel lblNewLabel_1 = new JLabel("户主id");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		JLabel lblNewLabel_2 = new JLabel("户主姓名");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 15));

		JLabel lblNewLabel_2_1 = new JLabel("户主贫困等级");
		lblNewLabel_2_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));


		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"男", "女"}));
		JLabel lblNewLabel_3 = new JLabel("户主性别");
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.PLAIN, 15));

		JLabel lblNewLabel_4 = new JLabel("户主电话");
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		JLabel lblNewLabel_2_1_1 = new JLabel("户主住址");
		lblNewLabel_2_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		JLabel lblNewLabel_2_1_1_1 = new JLabel("户主家庭成员数量");
		lblNewLabel_2_1_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("户主住宅面积");
		lblNewLabel_5.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);


		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(269)
					.addComponent(lblNewLabel)
					.addContainerGap(342, Short.MAX_VALUE))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_4)
										.addComponent(lblNewLabel_1)
										.addComponent(lblNewLabel_2_1))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(64)
							.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(231, Short.MAX_VALUE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
									.addGap(34)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)))
							.addGap(148))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap(27, Short.MAX_VALUE)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addGap(51)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_2)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
									.addGap(83))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addGap(87)))
							.addGap(53))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(207)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_2_1)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(47)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5))
							.addGap(48)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(68, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnNewButton = new JButton("取消");
				btnNewButton.setFont(new Font("宋体", Font.PLAIN, 15));
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				{
					JButton btnNewButton_1 = new JButton("确定");
					btnNewButton_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JDBC.list1_1.add(textField.getText());
							JDBC.list2_1.add(textField_1.getText());
							JDBC.list8_1.add(textField_2.getText());
							JDBC.list3_1.add((String) comboBox.getSelectedItem());
							JDBC.list4_1.add(textField_6.getText());
							JDBC.list5_1.add(textField_4.getText());
							JDBC.list6_1.add(textField_3.getText());
							JDBC.list7_1.add(textField_5.getText());
							JDBC.dbinsertPerson(2);
							dispose();
						}
					});
					btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 15));
					buttonPane.add(btnNewButton_1);
				}
				buttonPane.add(btnNewButton);
			}
		}
	}
}
