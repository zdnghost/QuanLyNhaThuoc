package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing.menu.menuslide;
import swing.textfield.TextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import swing.button.RoundButton;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class testmenu extends JFrame {
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
				try {
					testmenu frame = new testmenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public testmenu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 800);
		contentPane = new JPanel();
		menuslide aMenuslide=new menuslide();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		menuslide menuslide_ = new menuslide();
		menuslide_.setBounds(0, 0, 286, 761);
		menuslide_.menu.setBackground(new Color(0, 144, 219));
		menuslide_.menu.setLocation(0, 0);
		menuslide_.menu.setSize(0, 0);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 144, 219));
		panel.setBounds(0, 0, 1264, 52);
		contentPane.setLayout(null);
		contentPane.add(menuslide_);
		contentPane.add(panel);
		panel.setLayout(null);
		
		RoundButton rndbtnngXut = new RoundButton();
		rndbtnngXut.setBorderColor(new Color(255, 255, 255));
		rndbtnngXut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rndbtnngXut.setText("Đăng xuất");
		rndbtnngXut.setBounds(1137, 11, 117, 30);
		panel.add(rndbtnngXut);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(942, 0, 185, 52);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("User name:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Admin");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_1);
	}
}
