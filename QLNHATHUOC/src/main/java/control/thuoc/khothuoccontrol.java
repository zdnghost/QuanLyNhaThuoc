package control.thuoc;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import databese.db;
import form.thuoc.*;

public class khothuoccontrol {

	public static void newtable() {

		khothuocform.table.getTableHeader().setReorderingAllowed(false);
		khothuocform.model = new DefaultTableModel(new Object[][] {},
				new String[] { "Mã thuốc", "Tên thuốc", "Hãng", "Đóng gói", "Đơn vị", "Hoạt chất", "Hàm lượng" }) {
			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
		ResultSet res = db.getquery("SELECT* FROM dbo.fn_getDATADANHMUCTHUOC()");
		try {
			while (res.next()) {
				khothuocform.model.addRow(new Object[] { res.getString(1).trim(), res.getString(2).trim(),
						res.getString(3).trim(), res.getString(4).trim(), res.getString(5).trim(),
						res.getString(6).trim(), res.getString(7).trim() });
			}
			db.disconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		khothuocform.table.setModel(khothuocform.model);
		khothuocform.table.getColumnModel().getColumn(0).setResizable(false);
		khothuocform.table.getColumnModel().getColumn(1).setResizable(false);
		khothuocform.table.getColumnModel().getColumn(2).setResizable(false);
		khothuocform.table.getColumnModel().getColumn(3).setResizable(false);
		khothuocform.table.getColumnModel().getColumn(4).setResizable(false);
		khothuocform.table.getColumnModel().getColumn(5).setResizable(false);
		khothuocform.table.getColumnModel().getColumn(6).setResizable(false);
	}

	public static void newlist() {
		khothuocform.cbphanloai = new DefaultComboBoxModel(new String[] { "Tất cả" });
		ResultSet res = db.getquery("SELECT* FROM PHANLOAI");
		try {
			while (res.next()) {
				khothuocform.cbphanloai.addElement(res.getString(2).trim());
			}
			db.disconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		khothuocform.Phanloai.setModel(khothuocform.cbphanloai);

		khothuocform.cbdonvi = new DefaultComboBoxModel(new String[] { "Tất cả" });
		res = db.getquery("SELECT* FROM DONVITHUOC");
		try {
			while (res.next()) {
				khothuocform.cbdonvi.addElement(res.getString(2).trim());
			}
			db.disconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		khothuocform.Donvi.setModel(khothuocform.cbdonvi);
		khothuocform.cbhang = new DefaultComboBoxModel(new String[] { "Tất cả" });
		res = db.getquery("SELECT* FROM NHACUNGCAP");
		try {
			while (res.next()) {
				khothuocform.cbhang.addElement(res.getString(1).trim());
			}
			db.disconect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		khothuocform.Hang.setModel(khothuocform.cbhang);

	}
	
	public static void info() {
		tabkhothuoc.tabbedPane.setSelectedIndex(2);;
	}
	public static void addpanel() {
		tabkhothuoc.tabbedPane.setSelectedIndex(1);
	}
	public static void export() {
		try {
			String path=null;
			JFileChooser chooser = new JFileChooser();
			chooser.setDialogTitle("Save");
			chooser.setApproveButtonText("Save");
			int returnVal = chooser.showOpenDialog(null); // parent là đối tượng JFrame hoặc JDialog cha của bảng chọn file			
			if (returnVal == JFileChooser.APPROVE_OPTION) {
			    File selectedFile = chooser.getSelectedFile();
			    path=selectedFile.getPath();
			    System.out.print(path+".xlsx");
			    // làm gì đó với tệp đã chọn
			    boolean success =false;
		        if (success) {
		            System.out.println("Tao tep thanh cong: " + selectedFile.getAbsolutePath());
		        } else {
		            System.out.println("khong the tao tep");
		            if(JOptionPane.showConfirmDialog(null, "ban chac chua?", "thong bao", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
					{
					}
		        }
			}
			else {
				return;
			}
			
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"khong the luu file");
        }
	}
	public static void sort() {
		
	}
}
