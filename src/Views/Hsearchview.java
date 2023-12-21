package Views;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Hsearchview extends JFrame {

	private JPanel contentPane;
	public Object[][] Otable_1 ;
	public Object[] Tableheader_1;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hsearchview frame = new Hsearchview();
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
	public Hsearchview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		JLabel lblNewLabel = new JLabel("查询对象信息");
		lblNewLabel.setFont(new Font("华文楷体", Font.BOLD, 42));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton = new JButton("关闭此窗口");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(354)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(29))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(37)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(24)
							.addComponent(btnNewButton)))
					.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE))
		);
		
		Otable_1= new Object[][]{
			{null, null, null, null, null, null, null,null},
			{null, null, null, null, null, null, null,null},
			{null, null, null, null, null, null, null,null},
			{null, null, null, null, null, null, null,null},
			{null, null, null, null, null, null, null,null},
			{null, null, null, null, null, null, null,null},
			{null, null, null, null, null, null, null,null},
			{null, null, null, null, null, null, null,null},
			{null, null, null, null, null, null, null,null},
			{null, null, null, null, null, null, null,null},
			{null, null, null, null, null, null, null,null},
			{null, null, null, null, null, null, null,null},
			{null, null, null, null, null, null, null,null},
			{null, null, null, null, null, null, null,null},
			{null, null, null, null, null, null, null,null},
			{null, null, null, null, null, null, null,null}};
		Tableheader_1=new Object[]{
				"\u6237\u4E3B\u59D3\u540D", "\u6237\u4E3Bid", "\u6237\u4e3b\u6027\u522b", "\u6237\u4E3B\u5730\u5740", "\u6237\u4E3B\u4F4F\u5B85\u9762\u79EF", "\u6237\u4E3B\u7535\u8BDD", "\u6237\u4E3B\u5BB6\u5EAD\u6210\u5458\u6570\u91CF", "\u6237\u4E3B\u5DE5\u4F5C\u5F52\u5C5E\u5730"
			};
		table_1 = new JTable();
		DefaultTableModel defaultTableModel = new DefaultTableModel(Otable_1,Tableheader_1);
		table_1.setModel(defaultTableModel);
		//Otable_1=Omodifyview.container;
		
		for(int i=0;i<=Hmodifyview.j;i++) {
			for(int k=0;k<8;k++) {
				Otable_1[i][k]=Hmodifyview.container_1[i][k];
			}
			}
		Hmodifyview.j=0;
		table_1 = new JTable(Otable_1,Tableheader_1);
		scrollPane.setViewportView(table_1);
		contentPane.setLayout(gl_contentPane);
	}
}
