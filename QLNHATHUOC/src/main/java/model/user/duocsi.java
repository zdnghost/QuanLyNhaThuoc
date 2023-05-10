package model.user;

import java.security.interfaces.RSAKey;
import java.sql.ResultSet;
import java.sql.SQLException;

import databese.db;

public class duocsi extends nhanvien{
	private String Mahieu;//mã bằng dược sĩ
	public duocsi() {
		// TODO Auto-generated constructor stub
	}
	public String getMahieu() {
		return Mahieu;
	}
	public void setMahieu(String mahieu) {
		Mahieu = mahieu;
	}
	@Override
	public void load(int ma) {
		super.load(ma);
		ResultSet res = db.getquery("SELECT* FROM DUOCSI where MANV='"+ma+"'");
		try {
			db.conect();
			res.next();
			Mahieu=res.getString(2);
			db.disconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
