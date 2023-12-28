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

public class addFMview extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static JTextField textField;
	public static JTextField textField_2;
	public static JTextField textField_3;
	public static JTextField textField_4;
	public static JTextField textField_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			addFMview dialog = new addFMview();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public addFMview() {
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblNewLabel = new JLabel("新建家庭成员");
		lblNewLabel.setFont(new Font("华文楷体", Font.BOLD, 42));
		textField = new JTextField();
		textField.setColumns(10);
		JLabel lblNewLabel_2 = new JLabel("家庭成员id");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		JLabel lblNewLabel_2_1 = new JLabel("家庭成员姓名");
		lblNewLabel_2_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"男", "女"}));
		JLabel lblNewLabel_3 = new JLabel("家庭成员性别");
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		JLabel lblNewLabel_4 = new JLabel("家庭成员电话");
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		JLabel lblNewLabel_2_1_1 = new JLabel("家庭成员住址");
		lblNewLabel_2_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		JLabel lblNewLabel_2_1_1_1 = new JLabel("家庭成员工作属地");
		lblNewLabel_2_1_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(80)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_2_1_1_1)
								.addComponent(lblNewLabel_2)
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblNewLabel_2_1_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel_2_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 516, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 516, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_4, Alignment.TRAILING))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(246)
							.addComponent(lblNewLabel)))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(25)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(120)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addGap(26)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addGap(54)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(95, Short.MAX_VALUE))
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
							JDBC.list3_2.add(textField.getText());
							JDBC.list2_2.add(textField_2.getText());
							JDBC.list4_2.add((String) comboBox.getSelectedItem());
							JDBC.list6_2.add(textField_3.getText());
							JDBC.list5_2.add(textField_4.getText());
							JDBC.list7_2.add(textField_5.getText());
							JDBC.list1_2.add(FMmodifyview.id);
							int temp=Integer.parseInt(JDBC.list7_1.get(FMmodifyview.n));
							JDBC.list7_1.set(FMmodifyview.n,String.valueOf(temp+1));
							JDBC.dbinsertPerson(3);
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
