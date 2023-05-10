package model.thuoc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import databese.db;

public class thuoc  {
	private String mathuoc;//Mã thuoc
	private String hangthuoc;//hãng thuốc
	private String tenthuoc;//Tên thuốc
	private String hoatchat;//hoạt chất
	private String hamluong;//hàm lượng
	private id phanloai;
	private id donvi;
	private ArrayList<lothuoc> lohang;//lô hàng
	private int quydoi;
	public thuoc() {
		
		// TODO Auto-generated constructor stub
	}
	public thuoc(String mathuoc, String hangthuoc, String tenthuoc, String hoatchat, String hamluong, id phanloai,
			id donvi, ArrayList<lothuoc> lohang,int quydoi) {
		super();
		this.mathuoc = mathuoc;
		this.hangthuoc = hangthuoc;
		this.tenthuoc = tenthuoc;
		this.hoatchat = hoatchat;
		this.hamluong = hamluong;
		this.phanloai = phanloai;
		this.donvi = donvi;
		this.lohang = lohang;
		this.quydoi=quydoi;
	}
	public int getQuydoi() {
		return quydoi;
	}
	public void setQuydoi(int quydoi) {
		this.quydoi = quydoi;
	}
	public id getPhanloai() {
		return phanloai;
	}
	public void setPhanloai(id phanloai) {
		this.phanloai = phanloai;
	}
	public id getDonvi() {
		return donvi;
	}
	public void setDonvi(id donvi) {
		this.donvi = donvi;
	}
	public String getMathuoc() {
		return mathuoc;
	}
	public void setMathuoc(String mathuoc) {
		this.mathuoc = mathuoc;
	}
	public String getHangthuoc() {
		return hangthuoc;
	}
	public void setHangthuoc(String hangthuoc) {
		this.hangthuoc = hangthuoc;
	}
	public String getTenthuoc() {
		return tenthuoc;
	}
	public void setTenthuoc(String tenthuoc) {
		this.tenthuoc = tenthuoc;
	}
	public String getHoatchat() {
		return hoatchat;
	}
	public void setHoatchat(String hoatchat) {
		this.hoatchat = hoatchat;
	}
	public String getHamluong() {
		return hamluong;
	}
	public void setHamluong(String hamluong) {
		this.hamluong = hamluong;
	}
	public ArrayList<lothuoc> getLohang() {
		return lohang;
	}
	public void setLohang(ArrayList<lothuoc> lohang) {
		this.lohang = lohang;
	}
	public void updatett(String ten,int pl,String hc,String hl) {
		
		
		
		String sql="update THUOC set TENTHUOC=? ,IDPHANLOAI=?,HOATCHAT=? ,HAMLUONG=? where MATHUOC=? and HANGTHUOC=?";
		try {
			db.conect();
			PreparedStatement pres=db.con.prepareStatement(sql);
			
			pres.setString(1,ten);
			pres.setInt(2,pl);
			pres.setString(3,hc);
			pres.setString(4,hl);
			pres.setString(5,mathuoc); 
			pres.setString(6,hangthuoc);
			pres.execute();
			db.disconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void updateqd(int qd) {
		String sql="update THUOC set QUYDOI=? where MATHUOC=? and HANGTHUOC=? and IDDONVI=?";
		try {
			db.conect();
			PreparedStatement pres=db.con.prepareStatement(sql);
			pres.setInt(1,qd);
			pres.setString(2,mathuoc); 
			pres.setString(3,hangthuoc);
			pres.setInt(4,donvi.getId());
			pres.execute();
			db.disconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
		kho a =new kho();
		System.out.print(a.listthuoc.get(0).getQuydoi());
	}
}
