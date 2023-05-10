package control.thuoc;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import databese.db;
import form.main.testmenu;
import form.thuoc.*;
import model.nhacungcap.nhacungcap;
import model.thuoc.id;
public class themthuoccontrol {

	public static void back() {
		tabkhothuoc.tabbedPane.setSelectedIndex(0);
	}
	public static void clear() {
		
	}
	public static void newlist() {
		themthuocform.cbphanloai = new DefaultComboBoxModel();
		testmenu.listpl.load();
		testmenu.listdv.load();
		testmenu.listcc.load();
		
		for(id a:testmenu.listpl.list)
		{
			themthuocform.cbphanloai.addElement(a.getTen());}
		themthuocform.Phanloai.setModel(themthuocform.cbphanloai);

		themthuocform.cbdonvi = new DefaultComboBoxModel();
		for(id a:testmenu.listdv.list)
		{			themthuocform.cbdonvi.addElement(a.getTen());
			}
		themthuocform.Donvi.setModel(themthuocform.cbdonvi);
		
		themthuocform.cbhang = new DefaultComboBoxModel();
		for(nhacungcap a:testmenu.listcc.list)
		{
			themthuocform.cbhang.addElement(a.getMa());
		}
		themthuocform.Hang.setModel(themthuocform.cbhang);
	}
}
