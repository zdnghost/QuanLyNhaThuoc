package model.phieunhap;

import java.util.Date;

import model.thuoc.lothuoc;

public class chitiet {
	public chitiet(String mathuoc, String hangthuoc, int iddonvi, int sl, Date ngayhethan) {
		super();
		this.mathuoc = mathuoc;
		this.hangthuoc = hangthuoc;
		this.iddonvi = iddonvi;
		this.sl = sl;
		this.ngayhethan = ngayhethan;
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
	public int getIddonvi() {
		return iddonvi;
	}
	public void setIddonvi(int iddonvi) {
		this.iddonvi = iddonvi;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	private String mathuoc;
	private String hangthuoc;
	private int iddonvi;
	private int sl ;
	private Date ngayhethan;
	public Date getNgayhethan() {
		return ngayhethan;
	}
	public void setNgayhethan(Date ngayhethan) {
		this.ngayhethan = ngayhethan;
	}
	public chitiet() {
		// TODO Auto-generated constructor stub
	}

}
