package form.thuoc;

import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.SwingConstants;
import swing.panel.RoundPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.formdev.flatlaf.FlatLightLaf;

import swing.button.RoundButton;
import java.awt.event.ActionListener;
import java.util.prefs.BackingStoreException;
import java.awt.event.ActionEvent;
import control.thuoc.themthuoccontrol;
public class themthuocform extends JPanel {
	public JTextField masp;
	public JTextField tensp;
	public JTextField hamluong;
	public JTextField hoatchat;
	public static DefaultComboBoxModel cbphanloai;
	public static DefaultComboBoxModel cbdonvi;
	public static DefaultComboBoxModel cbhang;
	public static JComboBox Donvi;
	public static JComboBox Phanloai;
	public static JComboBox Hang ;
	public JTextField quydoi;

	/**
	 * Create the panel.
	 */
	public themthuocform() {
		FlatLightLaf.setup();
		setLayout(new BorderLayout(0, 0));
		setSize(1213,707);
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setBackground(SystemColor.activeCaption);
		JLabel lblNewLabel = new JLabel("Sản phẩm mới");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		RoundPanel roundPanel = new RoundPanel();
		roundPanel.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_1 = new JLabel("Mã sản phẩm");
		
		masp = new JTextField();
		masp.setColumns(10);
		
		tensp = new JTextField();
		tensp.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên sản phẩm");
		
		hamluong = new JTextField();
		hamluong.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("Hàm lượng");
		
		JLabel lblNewLabel_2 = new JLabel("Hãng sản xuất");
		
		Hang = new JComboBox();
		
		JLabel lblNewLabel_2_1 = new JLabel("Phân loại");
		
		Phanloai = new JComboBox();
		
		JLabel lblNewLabel_2_2 = new JLabel("Đơn vị");
		
		Donvi = new JComboBox();
		
		hoatchat = new JTextField();
		hoatchat.setColumns(10);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Hoạt chất");
		
		RoundButton rndbtnBack = new RoundButton();
		rndbtnBack.setFocusPainted(false);
		rndbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				themthuoccontrol.back();
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
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
							.addGap(17)
							.addComponent(roundPanel, GroupLayout.PREFERRED_SIZE, 537, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(rndbtnBack, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		
		RoundButton rndbtnThm = new RoundButton();
		rndbtnThm.setFocusPainted(false);
		rndbtnThm.setText("Thêm");
		rndbtnThm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		quydoi = new JTextField();
		quydoi.setColumns(10);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Quy đổi");
		
		JButton btnNewButton = new JButton("Thêm");
		
		JButton btnNewButton_1 = new JButton("Thêm");
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("(Nếu đây là đơn vị cơ bản hãy nhập số 1)");
		GroupLayout gl_roundPanel = new GroupLayout(roundPanel);
		gl_roundPanel.setHorizontalGroup(
			gl_roundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(60)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(masp, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
					.addGap(60))
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(60)
					.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(tensp, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
					.addGap(60))
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(60)
					.addComponent(lblNewLabel_1_2_1, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(hoatchat, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
					.addGap(60))
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(60)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
							.addGap(10))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(Hang, 0, 385, Short.MAX_VALUE)
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addGroup(gl_roundPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(Donvi, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Phanloai, Alignment.LEADING, 0, 283, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))))
					.addGap(60))
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(60)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(lblNewLabel_1_2, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(hamluong, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(lblNewLabel_1_2_2, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(quydoi, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1_2_2_1, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)))
					.addGap(60))
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(240)
					.addComponent(rndbtnThm, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(239, Short.MAX_VALUE))
		);
		gl_roundPanel.setVerticalGroup(
			gl_roundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(67)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(masp, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(tensp, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(Hang, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2_1, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
						.addComponent(Phanloai, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
					.addGap(11)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(Donvi, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(hoatchat, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(hamluong, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_2_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(quydoi, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_2_2_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rndbtnThm, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(98))
		);
		roundPanel.setLayout(gl_roundPanel);
		panel.setLayout(gl_panel);
		themthuoccontrol.newlist();
	}
}
