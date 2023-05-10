package form.nhaphang;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import swing.panel.RoundPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import swing.button.RoundButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;

import control.nhaphang.nhaphangcontrol;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addphieuform extends JPanel {
	private JTextField maphieu;
	private JTextField nhacungcap;
	private JTextField mathuoc;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public addphieuform() {
		setLayout(new BorderLayout(0, 0));
		setSize(1213,707);
		RoundPanel roundPanel = new RoundPanel();
		add(roundPanel, BorderLayout.CENTER);
		
		RoundButton rndbtnBack = new RoundButton();
		rndbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nhaphangcontrol.back();
			}
		});
		rndbtnBack.setText("Back");
		
		RoundPanel roundPanel_1 = new RoundPanel();
		roundPanel_1.setBackground(Color.LIGHT_GRAY);
		
		RoundPanel roundPanel_1_1 = new RoundPanel();
		roundPanel_1_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Đơn vị");
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("");
		
		JLabel lblNewLabel_1_2 = new JLabel("Mã thuốc");
		
		mathuoc = new JTextField();
		mathuoc.setColumns(10);
		
		JLabel lblThmThngTin = new JLabel("Thêm thông tin phiếu");
		lblThmThngTin.setHorizontalAlignment(SwingConstants.CENTER);
		lblThmThngTin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JComboBox dv = new JComboBox();
		dv.setModel(new DefaultComboBoxModel(new String[] {"VIEN"}));
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		
		JScrollPane scrollPane = new JScrollPane();
		
		RoundButton rndbtnNhp = new RoundButton();
		rndbtnNhp.setText("Nhập");
		
		textField_2 = new JTextField();
		textField_2.setText("150000");
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Tổng tiền ");
		GroupLayout gl_roundPanel = new GroupLayout(roundPanel);
		gl_roundPanel.setHorizontalGroup(
			gl_roundPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(lblNewLabel_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rndbtnNhp, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(roundPanel_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(rndbtnBack, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
								.addComponent(roundPanel_1, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_roundPanel.setVerticalGroup(
			gl_roundPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 644, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_1_2_1_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_roundPanel.createParallelGroup(Alignment.BASELINE)
									.addComponent(rndbtnNhp, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(rndbtnBack, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(roundPanel_1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(roundPanel_1_1, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"PA001", "GSK", "VIEN", "100", "2024-12-03", "1500"},
			},
			new String[] {
				"M\u00E3 thu\u1ED1c", "M\u00E3 h\u00E3ng", "\u0110\u01A1n v\u1ECB", "S\u1ED1 l\u01B0\u1EE3ng", "Ng\u00E0y h\u1EBFt h\u1EA1n", "\u0110\u01A1n gi\u00E1"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_2 = new JLabel("Sl");
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd/MM/yyyy\r\n");
		
		JLabel lblNewLabel_3 = new JLabel("Ngày hết hạn");
		
		RoundButton rndbtnThm = new RoundButton();
		rndbtnThm.setText("Thêm");
		
		RoundButton rndbtnXa = new RoundButton();
		rndbtnXa.setText("Xóa");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Mã hãng thuốc");
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Đơn giá");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout gl_roundPanel_1_1 = new GroupLayout(roundPanel_1_1);
		gl_roundPanel_1_1.setHorizontalGroup(
			gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel_1_1.createSequentialGroup()
					.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(35)
							.addComponent(lblNewLabel_1_2, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
							.addGap(4)
							.addComponent(mathuoc, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
							.addGap(59))
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(35)
							.addComponent(lblNewLabel_1_2_1, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
							.addGap(4)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
							.addGap(59))
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(35)
							.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1_2, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
							.addGap(4)
							.addComponent(dv, 0, 189, Short.MAX_VALUE)
							.addGap(59))
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(35)
							.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
							.addGap(4)
							.addComponent(spinner, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
							.addGap(162))
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(35)
							.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
							.addGap(4)
							.addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
							.addGap(59))
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(35)
							.addComponent(lblNewLabel_1_2_1_1, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
							.addGap(4)
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
							.addGap(59))
						.addGroup(Alignment.TRAILING, gl_roundPanel_1_1.createSequentialGroup()
							.addGap(217)
							.addComponent(rndbtnXa, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(17)
							.addComponent(rndbtnThm, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(80)
							.addComponent(lblThmThngTin, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
							.addGap(69)))
					.addGap(10))
		);
		gl_roundPanel_1_1.setVerticalGroup(
			gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel_1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblThmThngTin, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_1_2))
						.addComponent(mathuoc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_1_2_1))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_roundPanel_1_1.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNewLabel_1_1_1_1))
								.addComponent(lblNewLabel_1_1_2)))
						.addComponent(dv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_2))
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_3))
						.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_1_2_1_1))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
						.addComponent(rndbtnXa, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(rndbtnThm, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
		);
		roundPanel_1_1.setLayout(gl_roundPanel_1_1);
		
		JLabel lblNewLabel = new JLabel("Thông tin phiếu");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		maphieu = new JTextField();
		maphieu.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Mã phiếu");
		
		JLabel lblNewLabel_1_1 = new JLabel("Mã nhà cung cấp");
		
		nhacungcap = new JTextField();
		nhacungcap.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		GroupLayout gl_roundPanel_1 = new GroupLayout(roundPanel_1);
		gl_roundPanel_1.setHorizontalGroup(
			gl_roundPanel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel_1.createSequentialGroup()
					.addGap(60)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
					.addGap(60))
				.addGroup(gl_roundPanel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_roundPanel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_roundPanel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addGap(193))
						.addGroup(gl_roundPanel_1.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_roundPanel_1.createSequentialGroup()
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(nhacungcap, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_roundPanel_1.createSequentialGroup()
								.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(maphieu, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)))))
		);
		gl_roundPanel_1.setVerticalGroup(
			gl_roundPanel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_roundPanel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(maphieu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_roundPanel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(nhacungcap, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_roundPanel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_1_1)))
					.addGap(9)
					.addComponent(lblNewLabel_1_1_1)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		roundPanel_1.setLayout(gl_roundPanel_1);
		roundPanel.setLayout(gl_roundPanel);

	}
}
