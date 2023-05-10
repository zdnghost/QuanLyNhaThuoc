package model.toathuoc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import databese.db;
import form.nhanvien.dsnhanvienform;
import model.toathuoc.*;
import model.user.duocsi;

public class thongtintoa {
	private String maphieu;
	private Date ngayke;
	private duocsi ds;
	private int tong;
	public String getMaphieu() {
		return maphieu;
	}
	public void setMaphieu(String maphieu) {
		this.maphieu = maphieu;
	}
	public duocsi getDs() {
		return ds;
	}
	public void setDs(duocsi ds) {
		this.ds = ds;
	}
	public ArrayList<chitiet> getChitiet() {
		return chitiet;
	}
	public void setChitiet(ArrayList<chitiet> chitiet) {
		this.chitiet = chitiet;
	}
	public Date getNgayke() {
		return ngayke;
	}
	public void setNgayke(Date ngayke) {
		this.ngayke = ngayke;
	}
	public int getTong() {
		return tong;
	}
	public void setTong(int tong) {
		this.tong = tong;
	}
	private ArrayList<chitiet> chitiet;
		public thongtintoa() {
			// TODO Auto-generated constructor stub
		}
		public void nhap() {
			String sql1 = "INSERT INTO TOATHUOC VALUES(?,?,?,?)";
			String sql2="INSERT INTO CHITIETTOA VAULES(?,?,?,?,?,?,?)";
			db.conect();
			if (db.con != null&&chitiet.size()>0){
				try{
				db.con.setAutoCommit(false);
				PreparedStatement prest =db.con.prepareStatement(sql1);
				prest.setString(1, maphieu);
				prest.setDate(2, new java.sql.Date(ngayke.getTime()));
				prest.setInt(3, ds.getMa());
				prest.setInt(4,0);
				prest.executeUpdate();
				prest =db.con.prepareStatement(sql2);
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
		public void load(String ma) {
			chitiet=new ArrayList<chitiet>();
			String sql1 = "select * from TOATHUOC";
			String sql2="select * from dbo.fn_getChitietToa('"+ma+"')";
			db.conect();
			if (db.con != null){
				try {
					ResultSet res = db.getquery(sql1);
					while (res.next()) {
						maphieu=res.getString(1);
						ngayke=res.getDate(2);
						ds=new duocsi();
						ds.load(res.getInt(3));
						tong=res.getInt(4);
					}
					res = db.getquery(sql2);
					while (res.next()) {
						chitiet.add(new chitiet(res.getString(2),res.getString(3),res.getInt(4),res.getInt(5),res.getString(6),res.getString(7)));
					}
					db.disconect();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.print(e);
				}
					}
				
			}
}
