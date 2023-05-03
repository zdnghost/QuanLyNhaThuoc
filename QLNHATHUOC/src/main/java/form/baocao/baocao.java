package form.baocao;

import java.awt.BorderLayout;
import java.awt.SystemColor;

import javax.swing.JPanel;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import swing.panel.RoundPanel;

public class baocao extends JPanel {

	/**
	 * Create the panel.
	 */
	public baocao() {
		setLayout(new BorderLayout(0, 0));
		setSize(1213,707);
		FlatLightLaf.setup();
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		add(panel, BorderLayout.CENTER);
		
		RoundPanel roundPanel = new RoundPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(45)
					.addComponent(roundPanel, GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
					.addGap(46))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(roundPanel, GroupLayout.PREFERRED_SIZE, 562, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(134, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}
