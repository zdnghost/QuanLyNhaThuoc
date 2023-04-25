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
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class addphieuform extends JPanel {
	private JTextField maphieu;
	private JTextField nhacungcap;
	private JTextField mathuoc;
	private JTable table;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public addphieuform() {
		setLayout(new BorderLayout(0, 0));
		setSize(1213,707);
		RoundPanel roundPanel = new RoundPanel();
		add(roundPanel, BorderLayout.CENTER);
		
		RoundButton rndbtnBack = new RoundButton();
		rndbtnBack.setText("Back");
		
		RoundPanel roundPanel_1 = new RoundPanel();
		roundPanel_1.setBackground(Color.LIGHT_GRAY);
		
		RoundPanel roundPanel_1_1 = new RoundPanel();
		roundPanel_1_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Đơn vị");
		lblNewLabel_1_1_2.setBounds(35, 115, 91, 14);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1.setBounds(35, 118, 91, 0);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mã thuốc");
		lblNewLabel_1_2.setBounds(35, 58, 91, 14);
		
		mathuoc = new JTextField();
		mathuoc.setBounds(130, 55, 189, 20);
		mathuoc.setColumns(10);
		
		JLabel lblThmThngTin = new JLabel("Thêm thông tin phiếu");
		lblThmThngTin.setBounds(60, 11, 229, 38);
		lblThmThngTin.setHorizontalAlignment(SwingConstants.CENTER);
		lblThmThngTin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JComboBox dv = new JComboBox();
		dv.setBounds(130, 111, 189, 22);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(130, 145, 86, 20);
		spinner.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		
		JScrollPane scrollPane = new JScrollPane();
		
		RoundButton rndbtnNhp = new RoundButton();
		rndbtnNhp.setText("Nhập");
		GroupLayout gl_roundPanel = new GroupLayout(roundPanel);
		gl_roundPanel.setHorizontalGroup(
			gl_roundPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(rndbtnNhp, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
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
							.addComponent(rndbtnNhp, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(rndbtnBack, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(roundPanel_1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(roundPanel_1_1, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		roundPanel_1_1.setLayout(null);
		roundPanel_1_1.add(lblThmThngTin);
		roundPanel_1_1.add(lblNewLabel_1_1_1_1);
		roundPanel_1_1.add(lblNewLabel_1_2);
		roundPanel_1_1.add(mathuoc);
		roundPanel_1_1.add(lblNewLabel_1_1_2);
		roundPanel_1_1.add(spinner);
		roundPanel_1_1.add(dv);
		
		JLabel lblNewLabel_2 = new JLabel("Sl");
		lblNewLabel_2.setBounds(35, 148, 91, 14);
		roundPanel_1_1.add(lblNewLabel_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd/MM/yyyy\r\n");
		dateChooser.setBounds(130, 176, 189, 20);
		roundPanel_1_1.add(dateChooser);
		
		JLabel lblNewLabel_3 = new JLabel("Ngày hết hạn");
		lblNewLabel_3.setBounds(35, 178, 91, 14);
		roundPanel_1_1.add(lblNewLabel_3);
		
		RoundButton rndbtnThm = new RoundButton();
		rndbtnThm.setText("Thêm");
		rndbtnThm.setBounds(306, 207, 72, 29);
		roundPanel_1_1.add(rndbtnThm);
		
		RoundButton rndbtnXa = new RoundButton();
		rndbtnXa.setText("Xóa");
		rndbtnXa.setBounds(217, 207, 72, 29);
		roundPanel_1_1.add(rndbtnXa);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(130, 83, 189, 20);
		roundPanel_1_1.add(textField);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Mã hãng thuốc");
		lblNewLabel_1_2_1.setBounds(35, 86, 91, 14);
		roundPanel_1_1.add(lblNewLabel_1_2_1);
		
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
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
					.addGap(60))
				.addGroup(gl_roundPanel_1.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_roundPanel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_roundPanel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addGap(193))
						.addGroup(gl_roundPanel_1.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_roundPanel_1.createSequentialGroup()
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
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
					.addContainerGap(97, Short.MAX_VALUE))
		);
		roundPanel_1.setLayout(gl_roundPanel_1);
		roundPanel.setLayout(gl_roundPanel);

	}
}
