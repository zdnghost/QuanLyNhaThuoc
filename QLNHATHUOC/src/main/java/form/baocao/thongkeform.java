package form.baocao;

import java.awt.BorderLayout;
import java.awt.SystemColor;

import javax.swing.JPanel;

import com.formdev.flatlaf.FlatLightLaf;

import control.baocaocontrol;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import swing.panel.RoundPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class thongkeform extends JPanel {
	public static JLabel lbltoa = new JLabel("");
	public static JLabel lblphieunhap = new JLabel("");
	public static JLabel lblhetsudung = new JLabel("");
	public static JLabel lblkk = new JLabel("");
	public static JLabel lblncc = new JLabel("");
	public static JLabel lblds = new JLabel("");
	public static JLabel lbltongtoa = new JLabel("");
	public static JLabel lbltongphieu = new JLabel("");
	/**
	 * Create the panel.
	 */
	public thongkeform() {
		setLayout(new BorderLayout(0, 0));
		setSize(1213,707);
		FlatLightLaf.setup();
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		add(panel, BorderLayout.CENTER);
		
		RoundPanel roundPanel = new RoundPanel();
		roundPanel.setRoundTopRight(30);
		roundPanel.setRoundTopLeft(30);
		roundPanel.setRoundBottomRight(30);
		roundPanel.setRoundBottomLeft(30);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(26)
					.addComponent(roundPanel, GroupLayout.DEFAULT_SIZE, 1157, Short.MAX_VALUE)
					.addGap(30))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(36)
					.addComponent(roundPanel, GroupLayout.PREFERRED_SIZE, 634, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		lbltoa.setBounds(30, 44, 341, 183);
		

		lbltoa.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbltoa.setBorder(new TitledBorder(null, "Số toa thuốc bán ra của tháng này", TitledBorder.LEADING, TitledBorder.TOP,new Font("Tahoma", Font.PLAIN, 14), null));
		lbltoa.setHorizontalAlignment(SwingConstants.CENTER);
		lblphieunhap.setBounds(408, 44, 341, 183);
		
		
		lblphieunhap.setHorizontalAlignment(SwingConstants.CENTER);
		lblphieunhap.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblphieunhap.setBorder(new TitledBorder(null, "Số đơn hàng nhập vào của tháng này", TitledBorder.LEADING, TitledBorder.TOP,new Font("Tahoma", Font.PLAIN, 14), null));
		lblhetsudung.setBounds(786, 44, 341, 183);
		
		
		lblhetsudung.setHorizontalAlignment(SwingConstants.CENTER);
		lblhetsudung.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblhetsudung.setBorder(new TitledBorder(null, "Số lô thuốc hết hạn sử dụng", TitledBorder.LEADING, TitledBorder.TOP,new Font("Tahoma", Font.PLAIN, 14), null));
		lblkk.setBounds(30, 422, 341, 183);
		
		
		lblkk.setHorizontalAlignment(SwingConstants.CENTER);
		lblkk.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblkk.setBorder(new TitledBorder(null, "Nhân viên kiểm kho ", TitledBorder.LEADING, TitledBorder.TOP,new Font("Tahoma", Font.PLAIN, 14), null));
		lblncc.setBounds(408, 422, 341, 183);
		
		
		lblncc.setHorizontalAlignment(SwingConstants.CENTER);
		lblncc.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblncc.setBorder(new TitledBorder(null, "Nhà cung cấp", TitledBorder.LEADING, TitledBorder.TOP,new Font("Tahoma", Font.PLAIN, 14), null));
		lblds.setBounds(786, 422, 341, 183);
		
		
		lblds.setHorizontalAlignment(SwingConstants.CENTER);
		lblds.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblds.setBorder(new TitledBorder(null, "Dược sĩ", TitledBorder.LEADING, TitledBorder.TOP,new Font("Tahoma", Font.PLAIN, 14), null));
		lbltongtoa.setBounds(30, 238, 513, 183);
		
		
		lbltongtoa.setHorizontalAlignment(SwingConstants.CENTER);
		lbltongtoa.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbltongtoa.setBorder(new TitledBorder(null, "Tổng số tiền bán được của tháng này", TitledBorder.LEADING, TitledBorder.TOP,new Font("Tahoma", Font.PLAIN, 14), null));
		lbltongphieu.setBounds(614, 238, 513, 183);
		
		
		lbltongphieu.setHorizontalAlignment(SwingConstants.CENTER);
		lbltongphieu.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbltongphieu.setBorder(new TitledBorder(null, "Tổng số tiền chi ra để nhập hàng của tháng này", TitledBorder.LEADING, TitledBorder.TOP,new Font("Tahoma", Font.PLAIN, 14), null));
		roundPanel.setLayout(null);
		roundPanel.add(lblkk);
		roundPanel.add(lbltongtoa);
		roundPanel.add(lbltoa);
		roundPanel.add(lblphieunhap);
		roundPanel.add(lblhetsudung);
		roundPanel.add(lblncc);
		roundPanel.add(lbltongphieu);
		roundPanel.add(lblds);
		panel.setLayout(gl_panel);
		baocaocontrol.baocao();
	}
}
