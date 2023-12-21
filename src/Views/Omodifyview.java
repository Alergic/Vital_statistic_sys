package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Omodifyview extends JFrame {

	private JPanel contentPane;
	public int i,r;
	public Object[][] Otable ;
	public Object[] Tableheader;
	public static Object[][] container ;
	private JTable table;
	private JTextField textField;
	public int flag= -1;
	public static int j=0;
	public int []record;
	public Omodifyview() {
		int record[]=new int[100];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		container= new Object[][]{
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null}};
		JScrollPane scrollPane = new JScrollPane();
		Otable= new Object[][]{
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null}};
		Tableheader=new Object[]{
				"\u64CD\u4F5C\u5458id", "\u64CD\u4F5C\u5458\u5BC6\u7801", "\u64CD\u4F5C\u5458\u59D3\u540D", "\u64CD\u4F5C\u5458\u6027\u522B", "\u64CD\u4F5C\u5458\u4F4F\u5740", "\u64CD\u4F5C\u5458\u7535\u8BDD\u53F7\u7801","\u64CD\u4F5C\u5458\u5DE5\u4F5C\u5C5E\u5730"};
		i=JDBC.list1.size();
		r=0;
	    for(r=0;r<i;r++)
	    {
	    	Otable[r][0]=JDBC.list1.get(r);
	    }
	    for(r=0;r<i;r++)
	    {
	    	Otable[r][1]=JDBC.list2.get(r);
	    }
	    for(r=0;r<i;r++)
	    {
	    	Otable[r][2]=JDBC.list3.get(r);
	    }
	    for(r=0;r<i;r++)
	    {
	    	Otable[r][3]=JDBC.list4.get(r);
	    }
	    for(r=0;r<i;r++)
	    {
	    	Otable[r][4]=JDBC.list5.get(r);
	    }
	    for(r=0;r<i;r++)
	    {
	    	Otable[r][5]=JDBC.list6.get(r);
	    }
	    for(r=0;r<i;r++)
	    {
	    	Otable[r][6]=JDBC.list7.get(r);
	    }
		table = new JTable();
		DefaultTableModel defaultTableModel = new DefaultTableModel(Otable,Tableheader);
		table.setModel(defaultTableModel);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 flag = table.getSelectedRow();
				 System.out.println(flag);
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("操作员信息");
		lblNewLabel.setFont(new Font("华文楷体", Font.BOLD, 42));
		
		JButton btnNewButton = new JButton("返回");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Adminview().setVisible(true);}	
		});
		
		JButton btnNewButton_1 = new JButton("增加操作员");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new addOview().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		JButton btnNewButton_2 = new JButton("删除操作员");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag!=-1)
				{	
						JDBC.list1.remove(flag);
						JDBC.list2.remove(flag);
						JDBC.list3.remove(flag);
						JDBC.list4.remove(flag);
						JDBC.list5.remove(flag);
						JDBC.list6.remove(flag);
						JDBC.list7.remove(flag);
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
		
		JButton btnNewButton_3 = new JButton("修改操作员");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(Otable[0][0]);
				if (flag!=-1)
				{
					JDBC.list1.set(flag,(String)table.getValueAt(flag, 0));
					JDBC.list2.set(flag,(String)table.getValueAt(flag, 1));
					JDBC.list3.set(flag,(String)table.getValueAt(flag, 2));
					JDBC.list4.set(flag,(String)table.getValueAt(flag, 3));
					JDBC.list5.set(flag,(String)table.getValueAt(flag, 4));
					JDBC.list6.set(flag,(String)table.getValueAt(flag, 5));
					JDBC.list7.set(flag,(String)table.getValueAt(flag, 6));
					JOptionPane.showMessageDialog(null, "修改完成！");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "你尚未选中任何行！");
				}
			}
		});
		btnNewButton_3.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("新建查询");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<JDBC.list3.size();i++)
				{
					if(textField.getText().equals(JDBC.list3.get(i)))
					{
						record[j]=i;
						j++;			
					}
				}
				if(j!=0)
				{
						for(int i=0;i<j;i++)
						{
							
						    	container[i][0]=JDBC.list1.get(record[i]);
						    	container[i][1]=JDBC.list2.get(record[i]);
						    	container[i][2]=JDBC.list3.get(record[i]);
						    	container[i][3]=JDBC.list4.get(record[i]);
						    	container[i][4]=JDBC.list5.get(record[i]);
						    	container[i][5]=JDBC.list6.get(record[i]);
						    	container[i][6]=JDBC.list7.get(record[i]);
						}
						new Osearchview().setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "未查询到结果！");
				}
			}
		});
		btnNewButton_4.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		JButton btnNewButton_5 = new JButton("刷新表格数据");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Omodifyview().setVisible(true);
			}
		});
		btnNewButton_5.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(640)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
							.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(37)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(576, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addComponent(btnNewButton_5)
					.addPreferredGap(ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
					.addGap(281)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addGap(35))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))))
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		
	
		contentPane.setLayout(gl_contentPane);
	}
}
