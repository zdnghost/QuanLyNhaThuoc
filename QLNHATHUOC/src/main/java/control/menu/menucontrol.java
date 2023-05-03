package control.menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

import org.jdesktop.animation.timing.interpolation.PropertySetter;

import form.main.testmenu;
import form.menu.*;
public class menucontrol {
	public static void Kho() {
		menuslide.btnThuoc.setColor(new Color(255, 255, 255,90));
		menuslide.btnNhaphang.setColor(new Color(0, 144, 219));
		menuslide.btnKetoa.setColor(new Color(0, 144, 219));
		menuslide.btnCungcap.setColor(new Color(0, 144, 219));
		menuslide.btnHome.setColor(new Color(0, 144, 219));
		menuslide.btnUser.setColor(new Color(0, 144, 219));
		//
		menuslide.btnThuoc.setColorOver(new Color(255, 255, 255,90));
		menuslide.btnNhaphang.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnKetoa.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnCungcap.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnHome.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnUser.setColorOver(new Color(255, 255, 255,30));
		testmenu.tabbedPane.setSelectedIndex(1);
	}
	public static void Nhacungcap() {
		menuslide.btnCungcap.setColor(new Color(255, 255, 255,90));
		menuslide.btnThuoc.setColor(new Color(0, 144, 219));
		menuslide.btnKetoa.setColor(new Color(0, 144, 219));
		menuslide.btnNhaphang.setColor(new Color(0, 144, 219));
		menuslide.btnHome.setColor(new Color(0, 144, 219));
		menuslide.btnUser.setColor(new Color(0, 144, 219));
		//
		menuslide.btnCungcap.setColorOver(new Color(255, 255, 255,90));
		menuslide.btnThuoc.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnKetoa.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnNhaphang.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnHome.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnUser.setColorOver(new Color(255, 255, 255,30));
		testmenu.tabbedPane.setSelectedIndex(3);
	}
	public static void Toa() {
		menuslide.btnKetoa.setColor(new Color(255, 255, 255,90));
		menuslide.btnThuoc.setColor(new Color(0, 144, 219));
		menuslide.btnNhaphang.setColor(new Color(0, 144, 219));
		menuslide.btnCungcap.setColor(new Color(0, 144, 219));
		menuslide.btnHome.setColor(new Color(0, 144, 219));
		menuslide.btnUser.setColor(new Color(0, 144, 219));
		//
		menuslide.btnKetoa.setColorOver(new Color(255, 255, 255,90));
		menuslide.btnThuoc.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnNhaphang.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnCungcap.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnHome.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnUser.setColorOver(new Color(255, 255, 255,30));
		testmenu.tabbedPane.setSelectedIndex(4);
	}
	public static void Nhap() {
		menuslide.btnNhaphang.setColor(new Color(255, 255, 255,90));
		menuslide.btnThuoc.setColor(new Color(0, 144, 219));
		menuslide.btnKetoa.setColor(new Color(0, 144, 219));
		menuslide.btnCungcap.setColor(new Color(0, 144, 219));
		menuslide.btnHome.setColor(new Color(0, 144, 219));
		menuslide.btnUser.setColor(new Color(0, 144, 219));
		//
		menuslide.btnNhaphang.setColorOver(new Color(255, 255, 255,90));
		menuslide.btnThuoc.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnKetoa.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnCungcap.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnHome.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnUser.setColorOver(new Color(255, 255, 255,30));
		testmenu.tabbedPane.setSelectedIndex(2);
	}
	public static void Home() {
		menuslide.btnHome.setColor(new Color(255, 255, 255,90));
		menuslide.btnThuoc.setColor(new Color(0, 144, 219));
		menuslide.btnKetoa.setColor(new Color(0, 144, 219));
		menuslide.btnCungcap.setColor(new Color(0, 144, 219));
		menuslide.btnNhaphang.setColor(new Color(0, 144, 219));
		menuslide.btnUser.setColor(new Color(0, 144, 219));
		//
		menuslide.btnHome.setColorOver(new Color(255, 255, 255,90));
		menuslide.btnThuoc.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnKetoa.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnCungcap.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnNhaphang.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnUser.setColorOver(new Color(255, 255, 255,30));
		testmenu.tabbedPane.setSelectedIndex(0);
	}
	public static void User() {
		menuslide.btnUser.setColor(new Color(255, 255, 255,90));
		menuslide.btnThuoc.setColor(new Color(0, 144, 219));
		menuslide.btnKetoa.setColor(new Color(0, 144, 219));
		menuslide.btnCungcap.setColor(new Color(0, 144, 219));
		menuslide.btnHome.setColor(new Color(0, 144, 219));
		menuslide.btnNhaphang.setColor(new Color(0, 144, 219));
		//
		menuslide.btnUser.setColorOver(new Color(255, 255, 255,90));
		menuslide.btnThuoc.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnKetoa.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnCungcap.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnHome.setColorOver(new Color(255, 255, 255,30));
		menuslide.btnNhaphang.setColorOver(new Color(255, 255, 255,30));
		testmenu.tabbedPane.setSelectedIndex(5);
	}
}
