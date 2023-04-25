package model.thuoc;

import java.util.ArrayList;

public class thuoc  {
	private String mathuoc;//Mã thuoc
	private String hangthuoc;//hãng thuốc
	private String tenthuoc;//Tên thuốc
	private String hoatchat;//hoạt chất
	private String hamluong;//hàm lượng
	private ArrayList<lothuoc> lohang;//lô hàng
	private int sl;
	public thuoc(String mathuoc, String hangthuoc, String tenthuoc, String hoatchat, String hamluong,
			ArrayList<lothuoc> lohang, int sl) {
		super();
		this.mathuoc = mathuoc;
		this.hangthuoc = hangthuoc;
		this.tenthuoc = tenthuoc;
		this.hoatchat = hoatchat;
		this.hamluong = hamluong;
		this.lohang = lohang;
		this.sl = sl;
	}
	/**
	 *<p>String mathuoc : Mã thuoc
	<p>String hangthuoc : hãng thuốc
	<p>String tenthuoc : Tên thuốc
	<p>String hoatchat : hoạt chất
	<p>String hamluong : hàm lượng
	<p>ArrayList	&ltlothuoc&gt lohang : lô hàng
	<p>String donvi : đơn vị tính
	<p>String dongdoi : quy định đóng gói
	 * 
	 */
	public thuoc() {
		
		// TODO Auto-generated constructor stub
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
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	
	
}
