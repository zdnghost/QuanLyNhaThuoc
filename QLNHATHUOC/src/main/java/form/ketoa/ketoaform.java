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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;

public class ketoaform extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public ketoaform() {
		setLayout(new BorderLayout(0, 0));
		setSize(1213,707);
		
		JPanel roundPanel = new JPanel();
		add(roundPanel, BorderLayout.CENTER);
		
		RoundButton rndbtnNhp = new RoundButton();
		rndbtnNhp.setText("Nhập");
		
		RoundButton rndbtnBack = new RoundButton();
		rndbtnBack.setText("Back");
		
		RoundPanel roundPanel_1_1 = new RoundPanel();
		roundPanel_1_1.setLayout(null);
		roundPanel_1_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblThmThngTin = new JLabel("Thêm thuốc");
		lblThmThngTin.setHorizontalAlignment(SwingConstants.CENTER);
		lblThmThngTin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblThmThngTin.setBounds(79, 11, 229, 38);
		roundPanel_1_1.add(lblThmThngTin);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1.setBounds(35, 118, 91, 0);
		roundPanel_1_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mã thuốc");
		lblNewLabel_1_2.setBounds(35, 58, 91, 14);
		roundPanel_1_1.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(130, 55, 189, 20);
		roundPanel_1_1.add(textField);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Đơn vị");
		lblNewLabel_1_1_2.setBounds(35, 115, 91, 14);
		roundPanel_1_1.add(lblNewLabel_1_1_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(130, 173, 86, 20);
		roundPanel_1_1.add(spinner);
		
		JComboBox dv = new JComboBox();
		dv.setBounds(130, 111, 189, 22);
		roundPanel_1_1.add(dv);
		
		JLabel lblNewLabel_2 = new JLabel("Sl");
		lblNewLabel_2.setBounds(35, 176, 91, 14);
		roundPanel_1_1.add(lblNewLabel_2);
		
		RoundButton rndbtnThm = new RoundButton();
		rndbtnThm.setText("Thêm");
		rndbtnThm.setBounds(306, 235, 72, 29);
		roundPanel_1_1.add(rndbtnThm);
		
		RoundButton rndbtnXa = new RoundButton();
		rndbtnXa.setText("Xóa");
		rndbtnXa.setBounds(217, 235, 72, 29);
		roundPanel_1_1.add(rndbtnXa);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 83, 189, 20);
		roundPanel_1_1.add(textField_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Mã hãng thuốc");
		lblNewLabel_1_2_1.setBounds(35, 86, 91, 14);
		roundPanel_1_1.add(lblNewLabel_1_2_1);
		
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
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
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
							.addGap(818)
							.addComponent(lblNewLabel_1_2_1_2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rndbtnNhp, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(roundPanel_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(rndbtnBack, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
								.addComponent(roundPanel_1, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_roundPanel.setVerticalGroup(
			gl_roundPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 644, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_roundPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(rndbtnNhp, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
								.addGroup(gl_roundPanel.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNewLabel_1_2_1_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(rndbtnBack, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(roundPanel_1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(roundPanel_1_1, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Ghi chú");
		lblNewLabel_1_2_1_1.setBounds(35, 207, 91, 14);
		roundPanel_1_1.add(lblNewLabel_1_2_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(130, 204, 189, 20);
		roundPanel_1_1.add(textField_2);
		
		JComboBox dv_1 = new JComboBox();
		dv_1.setBounds(130, 140, 189, 22);
		roundPanel_1_1.add(dv_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Lô thuốc");
		lblNewLabel_1_1_2_1.setBounds(35, 144, 91, 14);
		roundPanel_1_1.add(lblNewLabel_1_1_2_1);
		roundPanel.setLayout(gl_roundPanel);
	}
}
