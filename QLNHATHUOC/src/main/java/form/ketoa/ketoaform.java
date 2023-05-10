package form.ketoa;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import swing.panel.RoundPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import swing.button.RoundButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import control.ketoa.ketoacontrol;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ketoaform extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ketoaform() {
		setLayout(new BorderLayout(0, 0));
		setSize(1213,707);
		
		JPanel roundPanel = new JPanel();
		add(roundPanel, BorderLayout.CENTER);
		
		RoundButton rndbtnNhp = new RoundButton();
		rndbtnNhp.setText("Thanh toán");
		
		RoundButton rndbtnBack = new RoundButton();
		rndbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ketoacontrol.back();
			}
		});
		rndbtnBack.setText("Back");
		
		RoundPanel roundPanel_1_1 = new RoundPanel();
		roundPanel_1_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblThmThngTin = new JLabel("Thêm thuốc");
		lblThmThngTin.setHorizontalAlignment(SwingConstants.CENTER);
		lblThmThngTin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("");
		
		JLabel lblNewLabel_1_2 = new JLabel("Mã thuốc");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Đơn vị");
		
		JSpinner spinner = new JSpinner();
		
		JComboBox dv = new JComboBox();
		dv.setModel(new DefaultComboBoxModel(new String[] {"VIEN"}));
		
		JLabel lblNewLabel_2 = new JLabel("Sl");
		
		RoundButton rndbtnThm = new RoundButton();
		rndbtnThm.setText("Thêm");
		
		RoundButton rndbtnXa = new RoundButton();
		rndbtnXa.setText("Xóa");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Mã hãng thuốc");
		
		RoundPanel roundPanel_1 = new RoundPanel();
		roundPanel_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel = new JLabel("Thông tin toa");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		
		JLabel lblNewLabel_1 = new JLabel("Mã toa");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GroupLayout gl_roundPanel_1 = new GroupLayout(roundPanel_1);
		gl_roundPanel_1.setHorizontalGroup(
			gl_roundPanel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel_1.createSequentialGroup()
					.addGap(60)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
					.addGap(60))
				.addGroup(gl_roundPanel_1.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_roundPanel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_roundPanel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addGap(193))
						.addGroup(gl_roundPanel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
							.addGap(86))))
		);
		gl_roundPanel_1.setVerticalGroup(
			gl_roundPanel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_roundPanel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addComponent(lblNewLabel_1_1_1)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		roundPanel_1.setLayout(gl_roundPanel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Tổng tiền");
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		GroupLayout gl_roundPanel = new GroupLayout(roundPanel);
		gl_roundPanel.setHorizontalGroup(
			gl_roundPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(roundPanel_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(rndbtnBack, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
								.addComponent(roundPanel_1, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(lblNewLabel_1_2_1_2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rndbtnNhp, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_roundPanel.setVerticalGroup(
			gl_roundPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 625, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(rndbtnBack, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(roundPanel_1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(roundPanel_1_1, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)))
					.addGap(19)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_roundPanel.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1_2_1_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addComponent(rndbtnNhp, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 thu\u1ED1c", "H\u00E3ng", "\u0110\u01A1n v\u1ECB", "L\u00F4 thu\u1ED1c", "S\u1ED1 l\u01B0\u1EE3ng", "Ghi ch\u00FA"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Ghi chú");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JComboBox dv_1 = new JComboBox();
		dv_1.setModel(new DefaultComboBoxModel(new String[] {"P0001"}));
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Lô thuốc");
		GroupLayout gl_roundPanel_1_1 = new GroupLayout(roundPanel_1_1);
		gl_roundPanel_1_1.setHorizontalGroup(
			gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel_1_1.createSequentialGroup()
					.addGap(79)
					.addComponent(lblThmThngTin, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
					.addGap(80))
				.addGroup(gl_roundPanel_1_1.createSequentialGroup()
					.addGap(35)
					.addComponent(lblNewLabel_1_2, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
					.addGap(4)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
					.addGap(69))
				.addGroup(gl_roundPanel_1_1.createSequentialGroup()
					.addGap(35)
					.addComponent(lblNewLabel_1_2_1, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
					.addGap(4)
					.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
					.addGap(69))
				.addGroup(gl_roundPanel_1_1.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_1_2, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addComponent(dv, 0, 189, Short.MAX_VALUE)
					.addGap(69))
				.addGroup(gl_roundPanel_1_1.createSequentialGroup()
					.addGap(35)
					.addComponent(lblNewLabel_1_1_2_1, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
					.addGap(4)
					.addComponent(dv_1, 0, 189, Short.MAX_VALUE)
					.addGap(69))
				.addGroup(gl_roundPanel_1_1.createSequentialGroup()
					.addGap(35)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
					.addGap(4)
					.addComponent(spinner, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
					.addGap(172))
				.addGroup(gl_roundPanel_1_1.createSequentialGroup()
					.addGap(35)
					.addComponent(lblNewLabel_1_2_1_1, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
					.addGap(4)
					.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
					.addGap(69))
				.addGroup(gl_roundPanel_1_1.createSequentialGroup()
					.addGap(217)
					.addComponent(rndbtnXa, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addComponent(rndbtnThm, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
		);
		gl_roundPanel_1_1.setVerticalGroup(
			gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel_1_1.createSequentialGroup()
					.addGap(11)
					.addComponent(lblThmThngTin, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_1_2))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_1_2_1))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_1_2)
								.addGroup(gl_roundPanel_1_1.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNewLabel_1_1_1_1))))
						.addComponent(dv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(4)
							.addComponent(lblNewLabel_1_1_2_1))
						.addComponent(dv_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_2))
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel_1_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_1_2_1_1))
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_roundPanel_1_1.createParallelGroup(Alignment.LEADING)
						.addComponent(rndbtnXa, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(rndbtnThm, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
		);
		roundPanel_1_1.setLayout(gl_roundPanel_1_1);
		roundPanel.setLayout(gl_roundPanel);
	}
}
