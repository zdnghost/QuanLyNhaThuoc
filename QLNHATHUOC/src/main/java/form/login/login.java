package form.login;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import swing.panel.RoundPanel;
import swing.textfield.PasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import swing.textfield.TextField;
import java.awt.SystemColor;
import swing.button.RoundButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FlatLightLaf.setup();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 412);
		contentPane = new JPanel();
		setResizable(false);
		
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		RoundPanel roundPanel = new RoundPanel();
		roundPanel.setRoundTopRight(50);
		roundPanel.setRoundTopLeft(50);
		roundPanel.setRoundBottomLeft(50);
		roundPanel.setRoundBottomRight(50);
		roundPanel.setBackground(Color.WHITE);
		
		PasswordField passwordField = new PasswordField();
		passwordField.setLabelText("Password");
		
		passwordField.setShowAndHide(true);
		
		JLabel lblNewLabel = new JLabel("Đăng nhập");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setForeground(Color.BLACK);
		passwordField.setBackground(new Color(0, 0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 43));
		
		TextField textField = new TextField();
		textField.setLabelText("User");
		textField.setOpaque(false);
		
		RoundButton rndbtnLogin = new RoundButton();
		rndbtnLogin.setColorOver(new Color(51, 51, 255));
		rndbtnLogin.setColorClick(new Color(51, 153, 255));
		rndbtnLogin.setColor(new Color(0, 153, 255));
		rndbtnLogin.setForeground(new Color(255, 255, 255));
		rndbtnLogin.setRadius(10);
		rndbtnLogin.setBorderColor(SystemColor.activeCaption);
		rndbtnLogin.setBackground(new Color(0, 153, 255));
		rndbtnLogin.setText("Đăng nhập");
		
		RoundButton rndbtnQunMtKhu = new RoundButton();
		rndbtnQunMtKhu.setFont(new Font("Tahoma", Font.BOLD, 11));
		rndbtnQunMtKhu.setColorOver(new Color(255, 255, 255));
		rndbtnQunMtKhu.setColorClick(new Color(255, 255, 255));
		rndbtnQunMtKhu.setHorizontalAlignment(SwingConstants.LEFT);
		rndbtnQunMtKhu.setVerticalAlignment(SwingConstants.TOP);
		rndbtnQunMtKhu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rndbtnQunMtKhu.setForeground(new Color(0, 51, 255));
		rndbtnQunMtKhu.setRadius(10);
		rndbtnQunMtKhu.setBorderColor(new Color(255, 255, 255));
		rndbtnQunMtKhu.setBackground(new Color(255, 255, 255));
		rndbtnQunMtKhu.setText("Quên mật khẩu ?");
		GroupLayout gl_roundPanel = new GroupLayout(roundPanel);
		gl_roundPanel.setHorizontalGroup(
			gl_roundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_roundPanel.createSequentialGroup()
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(rndbtnQunMtKhu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_roundPanel.createSequentialGroup()
								.addGap(80)
								.addComponent(rndbtnLogin, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
								.addGap(63))
							.addGroup(gl_roundPanel.createSequentialGroup()
								.addGap(16)
								.addGroup(gl_roundPanel.createParallelGroup(Alignment.TRAILING)
									.addComponent(passwordField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
									.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)))
							.addGroup(gl_roundPanel.createSequentialGroup()
								.addGap(46)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
								.addGap(29))))
					.addGap(16))
		);
		gl_roundPanel.setVerticalGroup(
			gl_roundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rndbtnQunMtKhu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(rndbtnLogin, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		roundPanel.setLayout(gl_roundPanel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(roundPanel, GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(roundPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
