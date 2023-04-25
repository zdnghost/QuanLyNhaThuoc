package model.phieunhap;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import databese.db;
import model.user.nhanvien;

public class thongtin {
	String maphieu;
	Date ngaynhap;
	String tennhacungcap;
	nhanvien phutrach;
	ArrayList<chitiet> chitiet;
	public thongtin() {
		// TODO Auto-generated constructor stub
	}
	public thongtin(String maphieu,Date ngaynhap,String tennhacungcap,nhanvien phutrach,ArrayList<chitiet> chitiet) {
		
	}
	public thongtin(String maphieu,Date ngaynhap,String tennhacungcap,nhanvien phutrach) {
		
	}
	
	public String getMaphieu() {
		return maphieu;
	}
	public void setMaphieu(String maphieu) {
		this.maphieu = maphieu;
	}
	public Date getNgaynhap() {
		return ngaynhap;
	}
	public void setNgaynhap(Date ngaynhap) {
		this.ngaynhap = ngaynhap;
	}
	public String getTennhacungcap() {
		return tennhacungcap;
	}
	public void setTennhacungcap(String tennhacungcap) {
		this.tennhacungcap = tennhacungcap;
	}
	public nhanvien getPhutrach() {
		return phutrach;
	}
	public void setPhutrach(nhanvien phutrach) {
		this.phutrach = phutrach;
	}
	public ArrayList<chitiet> getChitiet() {
		return chitiet;
	}
	public void setChitiet(ArrayList<chitiet> chitiet) {
		this.chitiet = chitiet;
	}
	public void nhap() {
		String sql1 = "INSERT INTO PHIEUNHAPKHO VALUES(?,?,?,?)";
		String sql2="INSERT INTO CHITIETPHIEU VAULES(?,?,?,?,?,?)";
		db.conect();
		if (db.con != null){
			try{
			db.con.setAutoCommit(false);
			PreparedStatement prest =db.con.prepareStatement(sql1);
			prest.setString(1, maphieu);
			prest.setDate(2, new java.sql.Date(ngaynhap.getTime()));
			prest.setString(3, tennhacungcap);
			prest.setString(4,phutrach.getMa());
			prest.executeUpdate();
			for(chitiet a:chitiet)
			{
				prest.setString(1,maphieu);
				prest.setString(2,a.getMathuoc());
				prest.setString(3,a.getHangthuoc());
				prest.setInt(4,a.getIddonvi());
				prest.setInt(5, a.getSl());
				prest.setDate(6,new java.sql.Date(a.getNgayhethan().getTime()));
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
