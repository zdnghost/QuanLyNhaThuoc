package form.ketoa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import swing.button.RoundButton;
import swing.panel.RoundPanel;
import javax.swing.JTable;

public class thongtintoaform extends JPanel {
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public thongtintoaform() {
		setLayout(new BorderLayout(0, 0));
		setSize(1213,729);
		
		JPanel roundPanel = new JPanel();
		add(roundPanel, BorderLayout.CENTER);
		
		RoundButton rndbtnBack = new RoundButton();
		rndbtnBack.setText("Back");
		
		RoundPanel roundPanel_1 = new RoundPanel();
		roundPanel_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel = new JLabel("Thông tin toa thuốc");
		lblNewLabel.setBounds(121, 11, 703, 38);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setBounds(881, 110, 91, 0);
		
		JLabel lblNewLabel_1 = new JLabel("Mã toa");
		lblNewLabel_1.setBounds(35, 58, 44, 14);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(89, 55, 245, 20);
		textField_3.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Tổng tiền");
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		GroupLayout gl_roundPanel = new GroupLayout(roundPanel);
		gl_roundPanel.setHorizontalGroup(
			gl_roundPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1165, Short.MAX_VALUE)
						.addGroup(gl_roundPanel.createSequentialGroup()
							.addComponent(lblNewLabel_1_2_1_2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)))
					.addGap(24))
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(133)
					.addComponent(roundPanel_1, GroupLayout.PREFERRED_SIZE, 946, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(134, Short.MAX_VALUE))
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(rndbtnBack, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1087, Short.MAX_VALUE))
		);
		gl_roundPanel.setVerticalGroup(
			gl_roundPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_roundPanel.createSequentialGroup()
					.addGap(22)
					.addComponent(rndbtnBack, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(roundPanel_1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 494, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_roundPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_2_1_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(27))
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		roundPanel_1.setLayout(null);
		roundPanel_1.add(lblNewLabel);
		roundPanel_1.add(lblNewLabel_1_1_1);
		roundPanel_1.add(lblNewLabel_1);
		roundPanel_1.add(textField_3);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(635, 52, 189, 20);
		roundPanel_1.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Người kê");
		lblNewLabel_1_1.setBounds(581, 55, 44, 14);
		roundPanel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Ngày kê");
		lblNewLabel_1_1_2.setBounds(35, 85, 44, 14);
		roundPanel_1.add(lblNewLabel_1_1_2);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(89, 82, 245, 20);
		roundPanel_1.add(textField_1);
		roundPanel.setLayout(gl_roundPanel);
	}
}

