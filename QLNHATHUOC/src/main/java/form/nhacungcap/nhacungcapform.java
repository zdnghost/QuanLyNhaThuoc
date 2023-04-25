package form.nhacungcap;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import com.formdev.flatlaf.FlatLightLaf;
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

public class nhacungcapform extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public nhacungcapform() {
		FlatLightLaf.setup();
		setSize(1213,707);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		add(panel, BorderLayout.SOUTH);
		
		RoundPanel btnpanel = new RoundPanel();
		btnpanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		RoundButton rndbtnThm = new RoundButton();
		rndbtnThm.setText("Thêm");
		rndbtnThm.setFocusPainted(false);
		btnpanel.add(rndbtnThm);
		
		RoundButton rndbtnXut = new RoundButton();
		rndbtnXut.setText("Xuất file danh sách");
		rndbtnXut.setFocusPainted(false);
		btnpanel.add(rndbtnXut);
		
		RoundPanel roundPanel_1 = new RoundPanel();
		roundPanel_1.setLayout(new BorderLayout(0, 0));
		
		RoundPanel roundPanel = new RoundPanel();
		roundPanel.setRoundTopRight(20);
		roundPanel.setRoundTopLeft(20);
		roundPanel.setRoundBottomRight(20);
		roundPanel.setRoundBottomLeft(20);
		
		JLabel lblNewLabel = new JLabel("Mã công ty");
		
		JLabel lblTnThuc = new JLabel("Tên công ty");
		
		textField = new JTextField();
		textField.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		RoundButton rndbtnLmMi = new RoundButton();
		rndbtnLmMi.setText("Làm mới");
		
		RoundButton rndbtnLmMi_1 = new RoundButton();
		rndbtnLmMi_1.setText("Tìm kiếm");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(roundPanel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGap(895)
							.addComponent(btnpanel, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)))
					.addGap(20))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(254)
					.addComponent(roundPanel, GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
					.addGap(255))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(roundPanel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(roundPanel_1, GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
					.addGap(11)
					.addComponent(btnpanel, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(24))
		);
		GroupLayout gl_roundPanel = new GroupLayout(roundPanel);
		gl_roundPanel.setHorizontalGroup(
			gl_roundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
					.addGap(50)
					.addComponent(lblTnThuc, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
					.addGap(4)
					.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
					.addGap(38)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(rndbtnLmMi_1, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
						.addComponent(rndbtnLmMi, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
					.addGap(14))
		);
		gl_roundPanel.setVerticalGroup(
			gl_roundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(26)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(27)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(26)
					.addComponent(lblTnThuc, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(27)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(13)
					.addComponent(rndbtnLmMi_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(rndbtnLmMi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		roundPanel.setLayout(gl_roundPanel);
		panel.setLayout(gl_panel);
	}

}
