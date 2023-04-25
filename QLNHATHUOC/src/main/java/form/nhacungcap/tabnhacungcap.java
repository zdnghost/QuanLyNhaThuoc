package form.nhacungcap;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class tabnhacungcap extends JPanel {
	public static JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	static nhacungcapform all=new nhacungcapform();
	/**
	 * Create the panel.
	 */
	public tabnhacungcap() {
		setSize(1213,707);
		setLayout(null);
		tabbedPane.setBounds(0, -25, 1213,732);
		add(tabbedPane);
		tabbedPane.addTab("", all);
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				tabbedPane.setBounds(0,-25,getWidth(),getHeight()+25);
			}
		});
	}

}
