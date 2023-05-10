package form.login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import swing.button.RoundButton;
import swing.panel.RoundPanel;
import swing.textfield.PasswordField;
import swing.textfield.TextField;

public class fogot extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fogot frame = new fogot();
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
	public fogot() {
		setTitle("Fogot");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 412);
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
		roundPanel.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel = new JLabel("Quên mật khẩu");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 43));
		
		TextField textField = new TextField();
		textField.setLabelText("Email");
		textField.setOpaque(false);
		
		RoundButton rndbtnLogin = new RoundButton();
		rndbtnLogin.setForeground(new Color(255, 255, 255));
		rndbtnLogin.setRadius(10);
		rndbtnLogin.setColorOver(new Color(0, 51, 255));
		rndbtnLogin.setColorClick(new Color(51, 153, 255));
		rndbtnLogin.setBorderColor(new Color(255, 255, 255));
		rndbtnLogin.setColor(new Color(0, 153, 255));
		rndbtnLogin.setBackground(new Color(0, 153, 255));
		rndbtnLogin.setText("Gửi");
		
		RoundButton rndbtnQunMtKhu = new RoundButton();
		rndbtnQunMtKhu.setForeground(new Color(255, 255, 255));
		rndbtnQunMtKhu.setRadius(10);
		rndbtnQunMtKhu.setColorOver(new Color(0, 51, 255));
		rndbtnQunMtKhu.setColorClick(new Color(51, 153, 255));
		rndbtnQunMtKhu.setBorderColor(new Color(255, 255, 255));
		rndbtnQunMtKhu.setColor(new Color(0, 153, 255));
		rndbtnQunMtKhu.setBackground(new Color(0, 153, 255));
		rndbtnQunMtKhu.setText("Đăng nhập");
		
		TextField textField_1 = new TextField();
		textField_1.setOpaque(false);
		textField_1.setLabelText("Mã xác nhận");
		
		RoundButton rndbtnQunMtKhu_1 = new RoundButton();
		rndbtnQunMtKhu_1.setForeground(new Color(255, 255, 255));
		rndbtnQunMtKhu_1.setRadius(10);
		rndbtnQunMtKhu_1.setColorOver(new Color(0, 51, 255));
		rndbtnQunMtKhu_1.setColorClick(new Color(51, 153, 255));
		rndbtnQunMtKhu_1.setBorderColor(new Color(255, 255, 255));
		rndbtnQunMtKhu_1.setColor(new Color(0, 153, 255));
		rndbtnQunMtKhu_1.setBackground(new Color(0, 153, 255));
		rndbtnQunMtKhu_1.setText("Xác nhận");
		GroupLayout gl_roundPanel = new GroupLayout(roundPanel);
		gl_roundPanel.setHorizontalGroup(
			gl_roundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(rndbtnLogin, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(47)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
					.addGap(48))
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(94)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(rndbtnQunMtKhu_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(rndbtnQunMtKhu, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(95, Short.MAX_VALUE))
		);
		gl_roundPanel.setVerticalGroup(
			gl_roundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(rndbtnLogin, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(rndbtnQunMtKhu_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(rndbtnQunMtKhu, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		roundPanel.setLayout(gl_roundPanel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addComponent(roundPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(16)
					.addComponent(roundPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(6))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
