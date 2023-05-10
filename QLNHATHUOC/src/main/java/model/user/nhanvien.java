package model.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import databese.db;

public class nhanvien {
	private String ten;
	private int ma;
	private boolean phai;//true: nam, False: nu
	private String email;
	private String password;
	private Date ngayvao;
	private String maxacnhan;
	private boolean admin=false;
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public String getTen() {
		return ten;
	}
	public nhanvien(String ten, int ma, boolean phai, String email, String password, Date ngayvao, String maxacnhan) {
		super();
		this.ten = ten;
		this.ma = ma;
		this.phai = phai;
		this.email = email;
		this.password = password;
		this.ngayvao = ngayvao;
		this.maxacnhan = maxacnhan;
	}
	public nhanvien(String ten, int ma, boolean phai, String email, String password, Date ngayvao, String maxacnhan,
			boolean admin) {
		super();
		this.ten = ten;
		this.ma = ma;
		this.phai = phai;
		this.email = email;
		this.password = password;
		this.ngayvao = ngayvao;
		this.maxacnhan = maxacnhan;
		this.admin = admin;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public boolean isPhai() {
		return phai;
	}
	public void setPhai(boolean phai) {
		this.phai = phai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public Date getNgayvao() {
		return ngayvao;
	}
	public void setNgayvao(Date ngayvao) {
		this.ngayvao = ngayvao;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public nhanvien() {
		// TODO Auto-generated constructor stub
	}
	public boolean checklogin(){
		db.conect();
		ResultSet res = db.getquery("SELECT* FROM NHANVIEN");
		try {
			while (res.next()) {
				if(email==res.getString(5)&&password==res.getString(7)) {
					return true;
				}
			}
			db.disconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public void load(String email) {
		db.conect();
		ResultSet res = db.getquery("SELECT* FROM NHANVIEN left join ADMIN on ADMIN.MANV=NHANVIEN.MANV where EMAIL='"+email+"'");
		try {
			while (res.next()) {
				ma=res.getInt(1);
				ten=res.getString(2);
				phai=res.getBoolean(3);
				ngayvao=res.getDate(4);
				this.email=res.getString(5);
				maxacnhan=res.getString(6);
				password=res.getString(7);
				if(res.getInt(8)==res.getInt(1))
					admin=true;
				else 
					admin=false;
				}
				db.disconect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void load(int ma) {
			db.conect();
			ResultSet res = db.getquery("SELECT* FROM NHANVIEN left join ADMIN on ADMIN.MANV=NHANVIEN.MANV where NHANVIEN.MANV="+ma+"");
			try {
				while (res.next()) {
				this.ma=res.getInt(1);
				ten=res.getString(2);
				phai=res.getBoolean(3);
				ngayvao=res.getDate(4);
				email=res.getString(5);
				maxacnhan=res.getString(6);
				password=res.getString(7);
				if(res.getInt(8)==res.getInt(1))
					admin=true;
				else 
					admin=false;
			}
			db.disconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getMaxacnhan() {
		return maxacnhan;
	}
	public void setMaxacnhan(String maxacnhan) {
		this.maxacnhan = maxacnhan;
	}
	public void signin() {
	}
}
