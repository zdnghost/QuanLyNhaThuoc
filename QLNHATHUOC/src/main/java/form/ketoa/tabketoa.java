package form.ketoa;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class tabketoa extends JPanel {
	public static JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	public static dstoaform dstoa=new dstoaform();
	/**
	 * Create the panel.
	 */
	public tabketoa() {
		setSize(1213,707);
		setLayout(null);
		tabbedPane.setBounds(0, -25, 1213,732);
		add(tabbedPane);
		tabbedPane.addTab(null, dstoa);
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
			
				tabbedPane.setBounds(0,-25,getWidth(),getHeight()+25);
			}
		});
	}
}
