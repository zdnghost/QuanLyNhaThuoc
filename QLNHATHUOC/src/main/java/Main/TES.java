package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import swing.textfield.text;
import swing.panel.RoundPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class TES extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			
					TES frame = new TES();
					frame.setVisible(true);
			
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TES() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 405);
		contentPane=new JPanel();

		setContentPane(contentPane);
		
		text text_ = new text();
		
		RoundPanel roundPanel = new RoundPanel();
		roundPanel.setRoundTopRight(50);
		roundPanel.setRoundTopLeft(50);
		roundPanel.setRoundBottomRight(50);
		roundPanel.setRoundBottomLeft(50);
		roundPanel.setBackground(new Color(51, 255, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(84)
					.addComponent(roundPanel, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
					.addGap(87))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addComponent(roundPanel, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
					.addGap(23))
		);
		GroupLayout gl_roundPanel = new GroupLayout(roundPanel);
		gl_roundPanel.setHorizontalGroup(
			gl_roundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(38)
					.addComponent(text_, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
					.addGap(48))
		);
		gl_roundPanel.setVerticalGroup(
			gl_roundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(119)
					.addComponent(text_, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(160, Short.MAX_VALUE))
		);
		roundPanel.setLayout(gl_roundPanel);
		contentPane.setLayout(gl_contentPane);
	}
}
