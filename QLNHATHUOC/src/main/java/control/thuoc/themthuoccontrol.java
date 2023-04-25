package control.thuoc;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import databese.db;
import form.thuoc.*;
public class themthuoccontrol {

	public static void back() {
		tabkhothuoc.tabbedPane.setSelectedIndex(0);
	}
	public static void clear() {
		
	}
	public static void newlist() {
		themthuocform.cbphanloai = new DefaultComboBoxModel(new String[] { "Tất cả" });
		ResultSet res = db.getquery("SELECT* FROM PHANLOAI");
		try {
			while (res.next()) {
				themthuocform.cbphanloai.addElement(res.getString(2).trim());
			}
			db.disconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		themthuocform.Phanloai.setModel(themthuocform.cbphanloai);

		themthuocform.cbdonvi = new DefaultComboBoxModel(new String[] { "Tất cả" });
		res = db.getquery("SELECT* FROM DONVITHUOC");
		try {
			while (res.next()) {
				themthuocform.cbdonvi.addElement(res.getString(2).trim());
			}
			db.disconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		themthuocform.Donvi.setModel(themthuocform.cbdonvi);
		themthuocform.cbhang = new DefaultComboBoxModel(new String[] { "Tất cả" });
		res = db.getquery("SELECT* FROM NHACUNGCAP");
		try {
			while (res.next()) {
				themthuocform.cbhang.addElement(res.getString(1).trim());
			}
			db.disconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		themthuocform.Hang.setModel(themthuocform.cbhang);
	}
}
