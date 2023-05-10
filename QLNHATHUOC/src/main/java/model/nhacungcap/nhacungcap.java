package model.nhacungcap;

import java.rmi.server.LoaderHandler;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import databese.db;

public class nhacungcap {
	private String ma;
	private String ten;
	private String dc;
	private String sdt;
	private String madoanhnghiep;
	private String email;
	public nhacungcap(String ma, String ten, String dc, String sdt, String madoanhnghiep, String email) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.dc = dc;
		this.sdt = sdt;
		this.madoanhnghiep = madoanhnghiep;
		this.email = email;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDc() {
		return dc;
	}
	public void setDc(String dc) {
		this.dc = dc;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getMadoanhnghiep() {
		return madoanhnghiep;
	}
	public void setMadoanhnghiep(String madoanhnghiep) {
		this.madoanhnghiep = madoanhnghiep;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public nhacungcap() {
		// TODO Auto-generated constructor stub
	}
	public void load(String ma) {
		try {
			db.conect();
			ResultSet res=db.getquery("select * from NHACUNGCAP where MACTY='"+ma+"'");
			while (res.next()) {
				this.ma=res.getString(1);
				ten=res.getString(2);
				dc=res.getString(3);
				sdt=res.getString(4);
				madoanhnghiep=res.getString(5);
				email=res.getString(6);
			}
			db.disconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
