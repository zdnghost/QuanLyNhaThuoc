package swing.menu;

import javax.swing.JPanel;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.interpolation.PropertySetter;

import Main.test;
import swing.button.RoundButton;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.util.Set;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class menuslide extends JPanel {
	/**
	 * Create the panel.
	 */
	private boolean menuon=false;
	public JPanel menu = new JPanel();
	private RoundButton btnMenu = new RoundButton();
	private Animator a;
	private Animator b;
	RoundButton btnKho = new RoundButton();
	RoundButton btnThuoc = new RoundButton();
	RoundButton btnCungcap = new RoundButton();
	RoundButton btnKetoa = new RoundButton();
	public menuslide() {
		btnMenu.setAlignmentY(Component.TOP_ALIGNMENT);
		btnMenu.setIconTextGap(0);
		btnMenu.setSize(50, 50);
		setOpaque(false);
		menu.setBounds(0, 0, 305, 789);
		menu.setBackground(new Color(51, 255, 255));
		
		
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				slide();
			}
		});
		btnMenu.setIcon(getImage("/swing/menu/menu.png",50,50));
		setLayout(null);
		btnMenu.setLocation(255,0);
		add(btnMenu);
		add(menu);
		menu.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setBounds(0, 0, 255, 50);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		menu.add(lblNewLabel);
		

		btnKho.setBorderPainted(false);
		btnKho.setColor(new Color(0, 144, 219));
		btnKho.setBackground(new Color(0, 144, 219));
		btnKho.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnKho.setHorizontalAlignment(SwingConstants.LEFT);
		btnKho.setBorderColor(new Color(0, 144, 219));
		btnKho.setBounds(-15, 50, 320, 50);
		menu.add(btnKho);
		btnKho.setIcon(getImage("/swing/menu/warehouse.png",50,50));
		btnKho.setText("    Kho hàng");
		

		btnThuoc.setBorderPainted(false);
		btnThuoc.setColor(new Color(0, 144, 219));
		btnThuoc.setBackground(new Color(0, 144, 219));
		btnThuoc.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnThuoc.setHorizontalAlignment(SwingConstants.LEFT);
		btnThuoc.setBorderColor(new Color(0, 144, 219));
		btnThuoc.setBounds(-15, 100, 320, 50);
		menu.add(btnThuoc);
		btnThuoc.setIcon(getImage("/swing/menu/pill.png",50,50));
		btnThuoc.setText("    Danh mục thuốc");
		

		btnCungcap.setIcon(getImage("/swing/menu/organization.png",50,50));
		btnCungcap.setText("    Nhà cung cấp");
		btnCungcap.setHorizontalAlignment(SwingConstants.LEFT);
		btnCungcap.setBorderPainted(false);
		btnCungcap.setColor(new Color(0, 144, 219));
		btnCungcap.setBackground(new Color(0, 144, 219));
		btnCungcap.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnCungcap.setBorderColor(new Color(0, 144, 219));
		btnCungcap.setBounds(-15, 150, 320, 50);
		menu.add(btnCungcap);
		
		btnKetoa.setHorizontalAlignment(SwingConstants.LEFT);
		btnKetoa.setIcon(getImage("/swing/menu/article.png",50,50));
		btnKetoa.setText("    Kê toa");
		btnKetoa.setBorderPainted(false);
		btnKetoa.setColor(new Color(0, 144, 219));
		btnKetoa.setBackground(new Color(0, 144, 219));
		btnKetoa.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnKetoa.setBorderColor(new Color(0, 144, 219));
		btnKetoa.setBounds(-15, 200, 320, 50);
		menu.add(btnKetoa);
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				menu.setLocation(0,0);
				
				if(menuon) {
					menu.setSize(getWidth(),getHeight());
					btnMenu.setLocation(menu.getWidth()-btnMenu.getWidth(),0);

				}
				else {
					menu.setSize(btnMenu.getWidth(),getHeight());
					btnMenu.setLocation(0,0);
				}
			}
		});
	}
	public void slide() {
		if(a!=null&&a.isRunning()) {
			a.stop();
		}
		if(menuon)
		{
			//dong menu
		a=PropertySetter.createAnimator(200, menu,"size",menu.getSize(),new Dimension(btnMenu.getWidth(),getHeight()));
		b=PropertySetter.createAnimator(200,btnMenu ,"location",btnMenu.getLocation(),new Point(0,0));
		b.start();
		a.start();		
		menuon=false;
		}
		else
		{
			//mo menu
			a=PropertySetter.createAnimator(200, menu,"size",menu.getSize(),new Dimension(getWidth(),getHeight()));
			b=PropertySetter.createAnimator(200,btnMenu ,"location",btnMenu.getLocation(),new Point(getWidth()-btnMenu.getWidth(),0));
			b.start();
			a.start();
			menuon=true;
		}
	}
	public ImageIcon getImage(String source,int width,int height) {
		ImageIcon a=new ImageIcon(getClass().getResource(source));
		Image newicon;
		Image icon=a.getImage();
		icon=a.getImage();
		newicon=icon.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		a=new ImageIcon(newicon);
		return a;
	}
}
