package Food_search;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;

public class Food_DAO {
	
	private final static String URL = "jdbc:mysql://127.0.0.1:3306/?user=root";
	private final static String ID = "root";
	private final static String PASS = "wlals8899!*";
	
	private static Food_DAO _dao;
	
	private Food_DAO() {
		
	}
	
	static {
		_dao = new Food_DAO();
	}
	public static Food_DAO getDAO(){
		return _dao;
	}
	
	public int insertINFO(Food_DTO storemanage) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		PreparedStatement pstmt1=null;
		int rows=0;
		try {
			con = DriverManager.getConnection(URL, ID, PASS);
			
			String sql1="insert into STORE values(?,?,?,?,?, null)";
			String sql2="insert into MENU values(?, ?, ?)";
			pstmt=con.prepareStatement(sql1);
			pstmt.setString(1, storemanage.getSID());
			pstmt.setString(2, storemanage.getNAME());
			pstmt.setString(3, storemanage.getADDRESS());
			pstmt.setString(4, storemanage.getDISTANCE());
			pstmt.setString(5, storemanage.getNUMBER());
			rows=pstmt.executeUpdate();
			
			pstmt1=con.prepareStatement(sql2);
			pstmt1.setString(1, storemanage.getSID());
			pstmt1.setString(6, storemanage.getMAIN());
			pstmt1.setInt(7, storemanage.getPRICE());
			
			rows=pstmt1.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (pstmt1 != null)
					pstmt1.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} return rows;
	}	
	
	public int inserPOINT(Food_DTO storemanage) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		PreparedStatement pstmt1=null;
		int rows=0;
		try {
			con = DriverManager.getConnection(URL, ID, PASS);
			
			String sql1="select avg(POINTS) from PREFERENCE group by S_ID";
			String sql2="insert into MENU values(?, ?, ?)";
			pstmt=con.prepareStatement(sql1);
			pstmt.setString(1, storemanage.getSID());
			pstmt.setString(2, storemanage.getNAME());
			pstmt.setString(3, storemanage.getADDRESS());
			pstmt.setString(4, storemanage.getDISTANCE());
			pstmt.setString(5, storemanage.getNUMBER());
			rows=pstmt.executeUpdate();
			
			pstmt1=con.prepareStatement(sql2);
			pstmt1.setString(1, storemanage.getSID());
			pstmt1.setString(6, storemanage.getMAIN());
			pstmt1.setInt(7, storemanage.getPRICE());
			
			rows=pstmt1.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (pstmt1 != null)
					pstmt1.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} return rows;
	}
	
	public int updateINFO(Food_DTO storemanage) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		PreparedStatement pstmt1=null;
		
		int rows=0;
		try {
			con = DriverManager.getConnection(URL, ID, PASS);
			
			String sql1="update STORE set S_ID=?,NAME=?,ADDRESS=?,DISTANCE=?,NUMBER=?";
			String sql2="update MENU set S_ID=?,MAIN=?,PRICE=?";
			pstmt=con.prepareStatement(sql1);
			pstmt.setString(1, storemanage.getSID());
			pstmt.setString(2, storemanage.getNAME());
			pstmt.setString(3, storemanage.getADDRESS());
			pstmt.setString(4, storemanage.getDISTANCE());
			pstmt.setString(5, storemanage.getNUMBER());
			rows=pstmt.executeUpdate();
			
			pstmt1=con.prepareStatement(sql2);
			pstmt1.setString(1, storemanage.getSID());
			pstmt1.setString(6, storemanage.getMAIN());
			pstmt1.setInt(7, storemanage.getPRICE());
			
			rows=pstmt1.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (pstmt1 != null)
					pstmt1.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} return rows;
	}
	
	public int deleteINFO(String SID) throws SQLException{
		Connection con=null;
		PreparedStatement pstmt=null;
		PreparedStatement pstmt1=null;
		int rows=0;
		
		try {
			con = DriverManager.getConnection(URL, ID, PASS);
			
			String sql1="delete from STORE where S_ID=?";
			String sql2="delete from MENU where S_ID=?";
			
			pstmt=con.prepareStatement(sql1);
			pstmt.setString(1, SID); 
			rows=pstmt.executeUpdate();
		
			pstmt1=con.prepareStatement(sql2);
			pstmt1.setString(1, SID);
			rows=pstmt1.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (pstmt1 != null)
					pstmt1.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		return rows;
	}
	
public List<Food_DTO> selectNamesearch(String name) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Food_DTO> storeList=new ArrayList<Food_DTO>();
		try {
			con = DriverManager.getConnection(URL, ID, PASS);
			
			String sql="select * from STORE JOIN MENU where name=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name); //
			
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				Food_DTO Nsearch = new Food_DTO();
				Nsearch.setNAME(rs.getString("name"));
				Nsearch.setADDRESS(rs.getString("address"));
				Nsearch.setDISTANCE(rs.getString("distance"));
				Nsearch.setNUMBER(rs.getString("number"));
				Nsearch.setMAIN(rs.getString("main"));
				Nsearch.setPRICE(rs.getInt("price"));
				Nsearch.setSUM(rs.getDouble("sum"));
				storeList.add(Nsearch);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		} 
		return storeList;
	}
	
	public List<Food_DTO> selectDistancesearchList(String distance) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Food_DTO> storeList=new ArrayList<Food_DTO>();
		try {
			con = DriverManager.getConnection(URL, ID, PASS);
			
			String sql="select * from LunchManage where distance=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, distance); //
			
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				Food_DTO Msearch = new Food_DTO();
				Msearch.setNAME(rs.getString("name"));
				Msearch.setADDRESS(rs.getString("address"));
				Msearch.setDISTANCE(rs.getString("distance"));
				Msearch.setNUMBER(rs.getString("number"));
				Msearch.setMAIN(rs.getString("main"));
				Msearch.setPRICE(rs.getInt("price"));
				Msearch.setSUM(rs.getDouble("sum"));
				storeList.add(Msearch);
			}
		} catch (Exception e) {
			System.out.println("[에러] =selectDistanceLunchManageList() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		} 
		return storeList;
	}
	
	public List<Food_DTO> selectAllStoreList() {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Food_DTO> storeList=new ArrayList<Food_DTO>();
		try {
			con = DriverManager.getConnection(URL, ID, PASS);
			
			String sql="select * from STORE JOIN MENU order by name";
			pstmt=con.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				Food_DTO Msearch = new Food_DTO();
				Msearch.setNAME(rs.getString("name"));
				Msearch.setADDRESS(rs.getString("address"));
				Msearch.setDISTANCE(rs.getString("distance"));
				Msearch.setNUMBER(rs.getString("number"));
				Msearch.setMAIN(rs.getString("main"));
				Msearch.setPRICE(rs.getInt("price"));
				Msearch.setSUM(rs.getDouble("sum"));
				storeList.add(Msearch);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		return storeList; 
	}
}
