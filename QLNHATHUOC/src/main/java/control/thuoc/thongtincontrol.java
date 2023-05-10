package control.thuoc;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import form.main.testmenu;
import form.thuoc.tabkhothuoc;
import form.thuoc.thongtinform;
import model.thuoc.id;
import model.thuoc.lothuoc;
import model.thuoc.thuoc;

public class thongtincontrol {
	public static void back() {
		tabkhothuoc.tabbedPane.setSelectedIndex(0);
	}
	public static void getthongtin(String ma,String hang,String donvi) {
		thuoc temp = null;
		for(thuoc a:testmenu.kho.listthuoc)
		{
			if(a.getMathuoc()==ma&&a.getHangthuoc()==hang&&a.getDonvi().getTen()==donvi) {
				temp=a;
				break;
			}
		}
		thongtinform.ma.setText(temp.getMathuoc());
		thongtinform.ten.setText(temp.getTenthuoc());
		thongtinform.hang.setText(temp.getHangthuoc());
		thongtinform.dv.setText(temp.getDonvi().getTen());
		thongtinform.hl.setText(temp.getHamluong());
		thongtinform.hc.setText(temp.getHoatchat());
		thongtinform.qd.setText(temp.getQuydoi()+"");
		DefaultTableModel model =new DefaultTableModel(new Object[][] {},
				new String[] { "Mã lô thuốc", "Sl","Ngay hết hạn"}) {
			boolean[] columnEditables = new boolean[] { false, false, false};

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
		for(lothuoc a:temp.getLohang())
		{
			model.addRow(new Object[] {a.getMalothuoc(),a.getSl(),a.getHansudung()});
		}
		thongtinform.table.setModel(model);
		
		
		DefaultComboBoxModel modelcb=new DefaultComboBoxModel();
		for(id a:testmenu.listpl.list)
		{
			modelcb.addElement(a.getTen());
		}
		thongtinform.Phanloai.setModel(modelcb);
		thongtinform.Phanloai.setSelectedItem(temp.getPhanloai().getTen());
	}
}
