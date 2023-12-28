package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemEvent;

public class FMmodifyview extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	public static int judge1 =0;
	public Object[][] Otable ;
	public Object[] Tableheader;
	public static Object[][] container_2 ;
	public int r,quantity;
	public int flag= -1;
	public static String id;
	public int []record;
	public int []record1;
	public static int n,k;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FMmodifyview frame = new FMmodifyview();
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
	public FMmodifyview() {
		int record[]=new int[100];
		int record2[]=new int[100];
		container_2=new Object[][] {
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
			{null, null, null, null, null, null},
		};
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("家庭成员信息");
		lblNewLabel.setFont(new Font("华文楷体", Font.BOLD, 42));
		
		JButton btnNewButton = new JButton("返回");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(judge1==0)
				{dispose();
				new Adminview().setVisible(true);}
				else
				{
					dispose();
					new Operatorview().setVisible(true);
					judge1=0;
				}
			}
			});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1 = new JLabel("请选择户主");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		JScrollPane scrollPane = new JScrollPane();
		String  combination[] =new String[100];
		combination[0]=null;
		for(int m=0;m<JDBC.list1_1.size();m++)
		{
			combination[m+1]=JDBC.list1_1.get(m);
		}
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.SELECTED == e.getStateChange()&&comboBox.getSelectedItem()!=null)
				{
					System.out.println(1);
					Otable=new Object[][] {
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
					};
					Tableheader=new Object[] {
							"\u5BB6\u5EAD\u6210\u5458\u59D3\u540D", "\u5BB6\u5EAD\u6210\u5458id", "\u5BB6\u5EAD\u6210\u5458\u6027\u522B", "\u5BB6\u5EAD\u6210\u5458\u5730\u5740", "\u5BB6\u5EAD\u6210\u5458\u7535\u8BDD", "\u5BB6\u5EAD\u6210\u5458\u5DE5\u4F5C\u5F52\u5C5E\u5730"
					};
					for(n=0;n<JDBC.list1_1.size();n++)
					{
						if(combination[n+1].equals((String) comboBox.getSelectedItem()))
						{
							id=JDBC.list2_1.get(n);
							quantity=Integer.parseInt(JDBC.list7_1.get(n));
							break;
						}
					}
					r=0;
					for(int n=0;n<JDBC.list1_2.size();n++)
					{
						if(id.equals(JDBC.list1_2.get(n)))
						{record[r]=n;
						r++;}
					}
					for(int i=0;i<r;i++)
					{
						Otable[i][0]=JDBC.list2_2.get(record[i]);
					}
					for(int i=0;i<quantity;i++)
					{
						Otable[i][1]=JDBC.list3_2.get(record[i]);
					}
					for(int i=0;i<quantity;i++)
					{
						Otable[i][2]=JDBC.list4_2.get(record[i]);
					}
					for(int i=0;i<quantity;i++)
					{
						Otable[i][3]=JDBC.list5_2.get(record[i]);
					}
					for(int i=0;i<quantity;i++)
					{
						Otable[i][4]=JDBC.list6_2.get(record[i]);
					}
					for(int i=0;i<quantity;i++)
					{
						Otable[i][5]=JDBC.list7_2.get(record[i]);
					}
					table = new JTable();
					DefaultTableModel defaultTableModel = new DefaultTableModel(Otable,Tableheader);
					table.setModel(defaultTableModel);
					scrollPane.setViewportView(table);
					table.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							 flag = table.getSelectedRow();
						}
					});
					
				}
			}
		});
	
		comboBox.setModel(new DefaultComboBoxModel(combination));
		
		JButton btnNewButton_1 = new JButton("增加家庭成员");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new addFMview().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		JButton btnNewButton_2 = new JButton("删除家庭成员");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag!=-1)
				{
						JDBC.list1_2.remove(record[flag]);
						JDBC.list2_2.remove(record[flag]);
						JDBC.list3_2.remove(record[flag]);
						JDBC.list4_2.remove(record[flag]);
						JDBC.list5_2.remove(record[flag]);
						JDBC.list6_2.remove(record[flag]);
						JDBC.list7_2.remove(record[flag]);
						int temp=Integer.parseInt(JDBC.list7_1.get(FMmodifyview.n));
						JDBC.list7_1.set(FMmodifyview.n,String.valueOf(temp-1));
						JOptionPane.showMessageDialog(null, "删除成功！");
						flag=-1;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "你尚未选中任何行！");
				}
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		JButton btnNewButton_2_1 = new JButton("修改家庭成员");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag!=-1)
				{
					JDBC.list2_2.set(record[flag],(String)table.getValueAt(flag, 0));
					JDBC.list3_2.set(record[flag],(String)table.getValueAt(flag, 1));
					JDBC.list4_2.set(record[flag],(String)table.getValueAt(flag, 2));
					JDBC.list5_2.set(record[flag],(String)table.getValueAt(flag, 3));
					JDBC.list6_2.set(record[flag],(String)table.getValueAt(flag, 4));
					JDBC.list7_2.set(record[flag],(String)table.getValueAt(flag, 5));
					JOptionPane.showMessageDialog(null, "修改完成！");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "你尚未选中任何行！");
				}
			}
			});
		btnNewButton_2_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("新建查询");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				k=0;
				for(int i=0;i<JDBC.list2_2.size();i++)
				{
					if(textField.getText().equals(JDBC.list2_2.get(i)))
					{
						record2[k]=i;
						k++;			
					}
				}
				if(k!=0)
				{
						for(int i=0;i<k;i++)
						{
							
						    	container_2[i][0]=JDBC.list2_2.get(record2[i]);
						    	container_2[i][1]=JDBC.list3_2.get(record2[i]);
						    	container_2[i][2]=JDBC.list4_2.get(record2[i]);
						    	container_2[i][3]=JDBC.list5_2.get(record2[i]);
						    	container_2[i][4]=JDBC.list6_2.get(record2[i]);
						    	container_2[i][5]=JDBC.list7_2.get(record2[i]);
						}
						new FMsearchview().setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "未查询到结果！");
				}
			}
		});
		btnNewButton_3.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(34)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
										.addGap(256)
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
									.addComponent(scrollPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 928, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
									.addGap(265)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(34)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		
		/*table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
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
				"\u5BB6\u5EAD\u6210\u5458\u59D3\u540D", "\u5BB6\u5EAD\u6210\u5458id", "\u5BB6\u5EAD\u6210\u5458\u6027\u522B", "\u5BB6\u5EAD\u6210\u5458\u5730\u5740", "\u5BB6\u5EAD\u6210\u5458\u7535\u8BDD", "\u5BB6\u5EAD\u6210\u5458\u5DE5\u4F5C\u5F52\u5C5E\u5730"
			}
		));
		scrollPane.setViewportView(table);*/

		contentPane.setLayout(gl_contentPane);
	}
}
