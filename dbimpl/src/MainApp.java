import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.DBConnection;
import dao.DeptDao;
import model.Dept;

public class MainApp {
	
	public static void 추가(int id) {
		String sql="INSERT INTO test1(id) VALUES (?)";
		Connection conn=DBConnection.getInstance();
		//인터페이스가 적용되어 있는 버퍼
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			int result=pstmt.executeUpdate(); // 변경된 row count를 리턴, - 값은 오류시에만 리턴
			System.out.println("result : "+result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void 삭제(int id) {
		String sql="DELETE FROM test1 WHERE id=?";
		Connection conn=DBConnection.getInstance();
		//인터페이스가 적용되어 있는 버퍼
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			int result=pstmt.executeUpdate(); // 변경된 row count를 리턴, - 값은 오류시에만 리턴
			System.out.println("result : "+result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void 변경(int id,int id2) {
		String sql="UPDATE test1 SET id=? WHERE id=?";
		Connection conn=DBConnection.getInstance();
		//인터페이스가 적용되어 있는 버퍼
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setInt(2, id2);
			int result=pstmt.executeUpdate(); // 변경된 row count를 리턴, - 값은 오류시에만 리턴
			System.out.println("result : "+result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Dept 찾기(int deptno) {
		String sql="SELECT deptno, dname, loc FROM dept WHERE deptno=?";
		Connection conn=DBConnection.getInstance();
		//인터페이스가 적용되어 있는 버퍼
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				
				Dept dept=Dept.builder()
						.deptno(rs.getInt("deptno"))
						.dname(rs.getString("dname"))
						.loc(rs.getString("loc"))
						.build();
				System.out.println(dept);
				return dept;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static ArrayList<Object> 전체찾기() {
		String sql="SELECT deptno, dname, loc FROM dept";
		Connection conn=DBConnection.getInstance();
		ArrayList<Object> list=new ArrayList<>();

		
		//인터페이스가 적용되어 있는 버퍼
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				Dept dept=Dept.builder()
						.deptno(rs.getInt("deptno"))
						.dname(rs.getString("dname"))
						.loc(rs.getString("loc"))
						.build();
				list.add(dept.getDeptno());
				list.add(dept.getDname());
				list.add(dept.getLoc());		
			}
			//System.out.println(list);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static ArrayList<Dept> 전체찾기2() {
		String sql="SELECT deptno, dname, loc FROM dept";
		Connection conn=DBConnection.getInstance();
		ArrayList<Dept> list=new ArrayList<>();

		
		//인터페이스가 적용되어 있는 버퍼
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				Dept dept=Dept.builder()
						.deptno(rs.getInt("deptno"))
						.dname(rs.getString("dname"))
						.loc(rs.getString("loc"))
						.build();
				list.add(dept);	
			}
			//System.out.println(list);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		//추가(9);
		//삭제(1);
		//변경(8,1);
		//Dept dept=찾기(10);
		//System.out.println(dept);
		//==================================
		//전체찾기();
		//ArrayList<Object> list=전체찾기();
		//System.out.println(list);
		//==================================
		//전체찾기2();
		ArrayList<Dept> list=전체찾기2();
		System.out.println(list);
		//Dept dept=DeptDao.찾기(1);
	}
}
