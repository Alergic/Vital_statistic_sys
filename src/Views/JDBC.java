package Views;
import java.sql.*;
import java.util.*;

public class JDBC {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/vital_statisticsdb";
    static final String USER = "root";
    static final String PASS = "xll051647"; 
    public static String Aid;
	public static String Apassword;
	public static int count;
	public static List<String> list1=new ArrayList<String>();
	public static List<String> list2=new ArrayList<String>();
	public static List<String> list3=new ArrayList<String>();
	public static List<String> list4=new ArrayList<String>();
	public static List<String> list5=new ArrayList<String>();
	public static List<String> list6=new ArrayList<String>();
	public static List<String> list7=new ArrayList<String>();
	public static List<String> list1_1=new ArrayList<String>();
	public static List<String> list2_1=new ArrayList<String>();
	public static List<String> list3_1=new ArrayList<String>();
	public static List<String> list4_1=new ArrayList<String>();
	public static List<String> list5_1=new ArrayList<String>();
	public static List<String> list6_1=new ArrayList<String>();
	public static List<String> list7_1=new ArrayList<String>();
	public static List<String> list8_1=new ArrayList<String>();
	public static List<String> list1_2=new ArrayList<String>();
	public static List<String> list2_2=new ArrayList<String>();
	public static List<String> list3_2=new ArrayList<String>();
	public static List<String> list4_2=new ArrayList<String>();
	public static List<String> list5_2=new ArrayList<String>();
	public static List<String> list6_2=new ArrayList<String>();
	public static List<String> list7_2=new ArrayList<String>();
	
    public JDBC() {
    	try {
        	Connection conn = null;
        	Statement stmt = null;
        	Statement stmt1 = null;
        	Statement stmt2 = null;
        	Statement stmt3 = null;
            // 注册 JDBC 驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
        
            // 打开链接
            System.out.println("连接数据库...");
           
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("数据库连接成功！");
            // 执行查询
            //System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            stmt1=conn.createStatement();
            stmt2=conn.createStatement();
            stmt3=conn.createStatement();
            String sql,sql1,sql2,sql3;
            sql = "SELECT * FROM admin";
            sql1="SELECT * FROM operator";
            sql2="SELECT * FROM householder";
            sql3="SELECT * FROM familymember";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet rs1 = stmt1.executeQuery(sql1);
            ResultSet rs2 = stmt2.executeQuery(sql2);
            ResultSet rs3 = stmt3.executeQuery(sql3);
            list1.clear();list2.clear();list3.clear();list4.clear();list5.clear();list6.clear();list7.clear();
            list1_1.clear();list2_1.clear();list3_1.clear();list4_1.clear();list5_1.clear();list6_1.clear();list7_1.clear();list8_1.clear();
            list1_2.clear();list2_2.clear();list3_2.clear();list4_2.clear();list5_2.clear();list6_2.clear();list7_2.clear();
            while(rs.next())
            {	Aid=rs.getString("Aid");
            	Apassword=rs.getString("Apassword");
            }
            while(rs1.next())
            {
            list1.add(rs1.getString("Oid"));
        	list2.add(rs1.getString("Opassword"));     	
        	list3.add(rs1.getString("name"));
        	list4.add(rs1.getString("sex"));
        	list5.add(rs1.getString("address"));
        	list6.add(rs1.getString("Pnumber"));
        	list7.add(rs1.getString("Wplace"));
            }
            while(rs2.next())
            {
            list1_1.add(rs2.getString("Hname"));
        	list2_1.add(rs2.getString("Hid"));     	
        	list3_1.add(rs2.getString("Hsex"));
        	list4_1.add(rs2.getString("Haddress"));
        	list5_1.add(rs2.getString("Harea"));
        	list6_1.add(rs2.getString("HPnumber"));
        	list7_1.add(rs2.getString("HFquantity"));
        	list8_1.add(rs2.getString("HPlevel"));
            }
            while(rs3.next())
            {
            list1_2.add(rs3.getString("Hid"));
        	list2_2.add(rs3.getString("FMname"));     	
        	list3_2.add(rs3.getString("FMid"));
        	list4_2.add(rs3.getString("FMsex"));
        	list5_2.add(rs3.getString("FMaddress"));
        	list6_2.add(rs3.getString("FMPnumber"));
        	list7_2.add(rs3.getString("FMWplace"));
            }
    	}catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
            System.out.println("处理 JDBC 错误");        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }
    }
    public static void dbinsertPerson(int n){
    	Connection conn1 = null;
    	PreparedStatement stmt4 = null;
		PreparedStatement stmt5 = null;
		try {
			System.out.println(1);
			Class.forName("com.mysql.cj.jdbc.Driver");
		    conn1 = DriverManager.getConnection(DB_URL,USER,PASS);

			if(n == 1){
				String sql = "insert into operator(Oid, Opassword, name, sex, address, Pnumber, Wplace)value(?,?,?,?,?,?,?)";
				stmt4=(PreparedStatement)conn1.prepareStatement(sql);
				stmt4.setString(1,addOview.textField.getText());
				stmt4.setString(2,addOview.textField_1.getText());
				stmt4.setString(3,addOview.textField_2.getText());
				stmt4.setString(4,list4.get(list4.size()-1));
				stmt4.setString(5,addOview.textField_4.getText());
				stmt4.setString(6,addOview.textField_3.getText());
				stmt4.setString(7,addOview.textField_5.getText());
				stmt4.executeUpdate();
				System.out.println("操作员数据插入成功");
			}else if(n == 2){
				String sql = "insert into householder(Hname, Hid , HPlevel, Hsex, Haddress, Harea, HPnumber, HFquantity)value(?,?,?,?,?,?,?,?)";
				stmt4=(PreparedStatement)conn1.prepareStatement(sql);
				stmt4.setString(1,addHview.textField.getText());
				stmt4.setString(2,addHview.textField_1.getText());
				stmt4.setString(3,addHview.textField_2.getText());
				stmt4.setString(4,list3_1.get(list3_1.size()-1));
				stmt4.setString(5,addHview.textField_6.getText());
				stmt4.setString(6,addHview.textField_4.getText());
				stmt4.setString(7,addHview.textField_3.getText());
				stmt4.setString(8,addHview.textField_5.getText());
				stmt4.executeUpdate();
				System.out.println("户主数据插入成功");
			}else if(n == 3){
				String sql = "insert into familymember(FMid, FMname, FMsex, FMPnumber, FMaddress, FMWplace, Hid)value(?,?,?,?,?,?,?)";
				String sql2 = "insert into householder(HFquantity)value(?)";
				stmt4=(PreparedStatement)conn1.prepareStatement(sql);
				stmt4.setString(1, addFMview.textField.getText());
				stmt4.setString(2, addFMview.textField_2.getText());
				stmt4.setString(3, list4_2.get(list4_2.size()-1));
				stmt4.setString(4, addFMview.textField_3.getText());
				stmt4.setString(5, addFMview.textField_4.getText());
				stmt4.setString(6, addFMview.textField_5.getText());
				stmt4.setString(7, FMmodifyview.id);
				stmt5=(PreparedStatement)conn1.prepareStatement(sql2);
				int temp=Integer.parseInt(JDBC.list7_1.get(0));
				stmt5.setString(1, String.valueOf(temp + 1));
				stmt4.executeUpdate();
				stmt5.executeUpdate();
				System.out.println("家庭成员数据插入成功");
			}

		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e){
        	// 处理 Class.forName 错误
        	e.printStackTrace();
    	}
	}

}
