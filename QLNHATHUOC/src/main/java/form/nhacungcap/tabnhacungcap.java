package form.nhacungcap;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class tabnhacungcap extends JPanel {
	public static JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	public dsnhacungcapform ds=new dsnhacungcapform();
	/**
	 * Create the panel.
	 */
	public tabnhacungcap() {
		setSize(1213,707);
		setLayout(null);
		tabbedPane.setBounds(0, -25, 1213,732);
		add(tabbedPane);
		tabbedPane.addTab(null, ds);
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				tabbedPane.setBounds(0,-25,getWidth(),tabbedPane.getHeight());
			}
		});
		
	}

}
