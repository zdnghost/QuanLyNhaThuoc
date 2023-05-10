package control.nhanvien;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

import databese.db;
import form.nhanvien.tabnhanvien;
import form.nhaphang.dsnhaphangform;
import form.nhaphang.tabnhaphang;

public class themnhanviencontrol {

	public static void back() {
		tabnhanvien.tabbedPane.setSelectedIndex(0);
	}
}
