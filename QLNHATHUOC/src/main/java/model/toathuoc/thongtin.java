package model.toathuoc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import databese.db;
import form.nhanvien.dsnhanvienform;
import model.user.duocsi;

public class thongtin {
	private String maphieu;
	private Date ngayke;
	private String sd;
	private duocsi ds;
	private ArrayList<chitiet> chitiet;
		public thongtin() {
			// TODO Auto-generated constructor stub
		}
		public void nhap() {
			String sql1 = "INSERT INTO TOATHUOC VALUES(?,?,?,?)";
			String sql2="INSERT INTO CHITIETTOA VAULES(?,?,?,?,?,?,?)";
			db.conect();
			if (db.con != null){
				try{
				db.con.setAutoCommit(false);
				PreparedStatement prest =db.con.prepareStatement(sql1);
				prest.setString(1, maphieu);
				prest.setDate(2, new java.sql.Date(ngayke.getTime()));
				prest.setString(3, ds.getMa());
				prest.setInt(4,0);
				prest.executeUpdate();
				for(chitiet a:chitiet)
				{
					prest.setString(1,maphieu);
					prest.setString(2,a.getMathuoc());
					prest.setString(3,a.getHangthuoc());
					prest.setInt(4,a.getIddonvi());
					prest.setInt(5, a.getSl());
					prest.setString(6,a.getGhichu());
					prest.setString(7,a.getMalothuoc());
					prest.executeUpdate();
				}
				db.con.commit();
				db.con.setAutoCommit(true);
				}
				catch(SQLException e){
					try {
					db.con.rollback();
					} catch (SQLException e1) {
					System.out.println(e1); }
					System.out.println(e); }
					}
		}
	
}
