package form.nhaphang;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import swing.panel.RoundPanel;
import java.awt.GridLayout;
import swing.button.RoundButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DebugGraphics;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.formdev.flatlaf.FlatLightLaf;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class dsnhaphanhform extends JPanel {
	private JTextField maphieu;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public dsnhaphanhform() {
		setLayout(new BorderLayout(0, 0));
		setSize(1213,707);
		FlatLightLaf.setup();
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		add(panel, BorderLayout.CENTER);
		
		RoundPanel btnpanel = new RoundPanel();
		btnpanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		RoundButton rndbtnThm = new RoundButton();
		rndbtnThm.setText("Thêm");
		rndbtnThm.setFocusPainted(false);
		btnpanel.add(rndbtnThm);
		
		RoundPanel roundPanel_1 = new RoundPanel();
		roundPanel_1.setLayout(new BorderLayout(0, 0));
		
		RoundPanel roundPanel = new RoundPanel();
		roundPanel.setRoundTopRight(20);
		roundPanel.setRoundTopLeft(20);
		roundPanel.setRoundBottomRight(20);
		roundPanel.setRoundBottomLeft(20);
		
		JLabel lblNewLabel = new JLabel("Mã phiếu");
		lblNewLabel.setBounds(10, 27, 64, 23);
		
		maphieu = new JTextField();
		maphieu.setBounds(84, 28, 159, 22);
		maphieu.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		maphieu.setColumns(10);
		
		JLabel lblHng = new JLabel("Nhà cung cấp");
		lblHng.setBounds(257, 27, 88, 23);
		
		JComboBox Hang = new JComboBox();
		Hang.setBounds(349, 27, 136, 22);
		
		RoundButton rndbtnLmMi = new RoundButton();
		rndbtnLmMi.setBounds(771, 43, 106, 23);
		rndbtnLmMi.setText("Làm mới");
		
		RoundButton rndbtnLmMi_1 = new RoundButton();
		rndbtnLmMi_1.setBounds(771, 11, 106, 23);
		rndbtnLmMi_1.setText("Tìm kiếm");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(157)
					.addComponent(roundPanel, GroupLayout.PREFERRED_SIZE, 899, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(157, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnpanel, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(20)
							.addComponent(roundPanel_1, GroupLayout.DEFAULT_SIZE, 1173, Short.MAX_VALUE)))
					.addGap(20))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(roundPanel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(roundPanel_1, GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnpanel, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(24))
		);
		
		JScrollPane scrollPane = new JScrollPane();
		roundPanel_1.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		roundPanel.setLayout(null);
		roundPanel.add(lblNewLabel);
		roundPanel.add(maphieu);
		roundPanel.add(lblHng);
		roundPanel.add(Hang);
		roundPanel.add(rndbtnLmMi);
		roundPanel.add(rndbtnLmMi_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd/M/yyyy");
		dateChooser.setBounds(579, 27, 182, 20);
		roundPanel.add(dateChooser);
		
		JLabel lblNewLabel_1 = new JLabel("Ngày nhập");
		lblNewLabel_1.setBounds(510, 31, 59, 14);
		roundPanel.add(lblNewLabel_1);
		panel.setLayout(gl_panel);

	}
}
