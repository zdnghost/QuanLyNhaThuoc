package form.thuoc;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import swing.panel.RoundPanel;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DebugGraphics;
import javax.swing.JComboBox;
import swing.button.RoundButton;
import java.awt.SystemColor;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class tabkhothuoc extends JPanel {
	public static JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	static khothuocform kho=new khothuocform();
	static themthuocform them=new themthuocform();
	static thongtinform info=new thongtinform();
	/**
	 * Create the panel.
	 */
	public tabkhothuoc() {
		setSize(1213,707);
		setLayout(null);
		tabbedPane.setBounds(0, -35, 1213,742);
		add(tabbedPane);
		tabbedPane.addTab("", kho);
		tabbedPane.addTab("", them);
		tabbedPane.addTab("", info);
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				tabbedPane.setBounds(0,-35,getWidth(),tabbedPane.getHeight());
			}
		});
	}
}
