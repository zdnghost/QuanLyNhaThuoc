package form.nhanvien;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;

import com.formdev.flatlaf.FlatLightLaf;

import control.nhanvien.themnhanviencontrol;
import control.thuoc.themthuoccontrol;
import swing.button.RoundButton;
import swing.panel.RoundPanel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;

public class themnhanvienform extends JPanel {
	private JTextField tensp;
	private JTextField hoatchat;
	public static DefaultComboBoxModel cbphanloai;
	public static DefaultComboBoxModel cbdonvi;
	public static DefaultComboBoxModel cbhang;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup chucvu = new ButtonGroup();
	private final ButtonGroup gioi = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public themnhanvienform() {
		FlatLightLaf.setup();
		setLayout(new BorderLayout(0, 0));
		setSize(1213,707);
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setBackground(SystemColor.activeCaption);
		JLabel lblNewLabel = new JLabel("Nhân viên mới");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		RoundPanel roundPanel = new RoundPanel();
		roundPanel.setRoundTopRight(30);
		roundPanel.setRoundTopLeft(30);
		roundPanel.setRoundBottomRight(30);
		roundPanel.setRoundBottomLeft(30);
		roundPanel.setBackground(Color.LIGHT_GRAY);
		
		tensp = new JTextField();
		tensp.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên nhân viên");
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		
		JLabel lblNewLabel_2_1 = new JLabel("Số điện thoại");
		
		JLabel lblNewLabel_2_2 = new JLabel("Ngày vào");
		
		hoatchat = new JTextField();
		hoatchat.setColumns(10);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Password");
		
		RoundButton rndbtnBack = new RoundButton();
		rndbtnBack.setFocusPainted(false);
		rndbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				themnhanviencontrol.back();
			}
		});
		rndbtnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rndbtnBack.setText("Back");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(rndbtnBack, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(314)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
					.addGap(424))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(274)
					.addComponent(roundPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(275))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(42)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(rndbtnBack, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(roundPanel, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(174, Short.MAX_VALUE))
		);
		
		RoundButton rndbtnThm = new RoundButton();
		rndbtnThm.setFocusPainted(false);
		rndbtnThm.setText("Thêm");
		rndbtnThm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Dược sĩ");
		chucvu.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		
		JRadioButton rdbtnKimKho = new JRadioButton("Kiểm kho");
		chucvu.add(rdbtnKimKho);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Chức vụ");
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Giới tính");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Nam");
		gioi.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setSelected(true);
		
		JRadioButton rdbtnKimKho_1 = new JRadioButton("Nữ");
		gioi.add(rdbtnKimKho_1);
		GroupLayout gl_roundPanel = new GroupLayout(roundPanel);
		gl_roundPanel.setHorizontalGroup(
			gl_roundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addGap(50)
							.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(tensp, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addGap(50)
							.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addGap(50)
							.addComponent(lblNewLabel_2_1, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addGap(50)
							.addComponent(lblNewLabel_2_2, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addGap(50)
							.addComponent(lblNewLabel_1_2_1, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(hoatchat, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addGap(50)
							.addComponent(lblNewLabel_1_2_1_1, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
							.addGap(18)
							.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnNewRadioButton, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
								.addComponent(rdbtnKimKho, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(78)
							.addComponent(lblNewLabel_1_2_1_1_1, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
							.addGap(18)
							.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnNewRadioButton_1, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
								.addComponent(rdbtnKimKho_1, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
							.addGap(62))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addGap(244)
							.addComponent(rndbtnThm, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
							.addGap(173)))
					.addGap(62))
		);
		gl_roundPanel.setVerticalGroup(
			gl_roundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(54)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(tensp, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(hoatchat, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addGap(12)
							.addComponent(lblNewLabel_1_2_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton)
							.addGap(3)
							.addComponent(rdbtnKimKho))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addGap(12)
							.addComponent(lblNewLabel_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton_1)
							.addGap(3)
							.addComponent(rdbtnKimKho_1)))
					.addGap(25)
					.addComponent(rndbtnThm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		roundPanel.setLayout(gl_roundPanel);
		panel.setLayout(gl_panel);
	}
}
