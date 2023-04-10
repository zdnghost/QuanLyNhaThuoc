package model.thuoc;

import java.util.Date;

public class lothuoc {
	private String malothuoc;//mã lô thuốc
	private int slton;//số lượng tồn
	private int giaban;//giá bán
	private boolean con;//còn tồn tại không
	private Date ngayhethan ;//ngày hết hạn
	public String getMalothuoc() {
		return malothuoc;
	}
	public void setMalothuoc(String malothuoc) {
		this.malothuoc = malothuoc;
	}
	public int getSlton() {
		return slton;
	}
	public void setSlton(int slton) {
		this.slton = slton;
	}
	public int getGiaban() {
		return giaban;
	}
	public void setGiaban(int giaban) {
		this.giaban = giaban;
	}
	public boolean isCon() {
		return con;
	}
	public void setCon(boolean con) {
		this.con = con;
	}
	public Date getNgayhethan() {
		return ngayhethan;
	}
	public void setNgayhethan(Date ngayhethan) {
		this.ngayhethan = ngayhethan;
	}
	/**
	 * lothuoc()
	 * 
	 * @author luong gia tuan
	 */
	public lothuoc() {
		
		 
	}
	/**
	 * lothuoc(String malothuoc,int slton,int giaban,Date ngayhethan,boolean con)
	 *<p>khởi tạo class lothuoc</p>
	 *<p>String malothuoc : Mã lô thuốc</p>
	 *<p>int slton : Số lượng tồn</p>
	 *<p>int giaban : Giá bán</p>
	 *<p>boolean con : Còn tồn tại không</p>
	 *<p>Date ngayhethan : Ngày hết hạn</p>
	 * @author luong gia tuan
	 */
	public lothuoc(String malothuoc,int slton,int giaban,Date ngayhethan,boolean con) {
		 this.malothuoc=malothuoc;
		 this.slton=slton;
		 this.giaban=giaban;
		 this.ngayhethan=ngayhethan;
		 this.con=con;
	}

}
