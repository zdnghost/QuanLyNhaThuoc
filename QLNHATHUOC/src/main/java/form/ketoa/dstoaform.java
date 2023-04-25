package form.ketoa;

import javax.swing.JPanel;
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
import javax.swing.SwingConstants;

public class dstoaform extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public dstoaform() {
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
		
		JLabel lblNewLabel = new JLabel("Mã toa");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField = new JTextField();
		textField.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		textField.setColumns(10);
		
		JLabel lblHng = new JLabel("Người kê");
		lblHng.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JComboBox Hang = new JComboBox();
		
		RoundButton rndbtnLmMi = new RoundButton();
		rndbtnLmMi.setText("Làm mới");
		
		RoundButton rndbtnLmMi_1 = new RoundButton();
		rndbtnLmMi_1.setText("Tìm kiếm");
		
		JLabel lblNewLabel_1 = new JLabel("Ngày kê");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd/MM/yyyy");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(186)
					.addComponent(roundPanel, GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
					.addGap(187))
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnpanel, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(20)
							.addComponent(roundPanel_1, GroupLayout.DEFAULT_SIZE, 1173, Short.MAX_VALUE)))
					.addGap(20))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(16)
					.addComponent(roundPanel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
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
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
					.addGap(14)
					.addComponent(lblHng, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
					.addGap(8)
					.addComponent(Hang, 0, 137, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
					.addGap(4)
					.addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
					.addGap(46)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(rndbtnLmMi_1, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(rndbtnLmMi, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
					.addGap(23))
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
					.addComponent(lblHng, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(27)
					.addComponent(Hang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel_1))
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(28)
					.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(11)
					.addComponent(rndbtnLmMi_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(rndbtnLmMi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		roundPanel.setLayout(gl_roundPanel);
		panel.setLayout(gl_panel);

	}
}
