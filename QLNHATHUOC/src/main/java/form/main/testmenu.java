 package form.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatLightLaf;

import form.baocao.baocao;
import form.ketoa.tabketoa;
import form.nhacungcap.tabnhacungcap;
import form.nhanvien.tabnhanvien;
import form.nhaphang.tabnhaphang;
import form.thuoc.tabkhothuoc;
import form.menu.menuslide;
import java.awt.Color;
import swing.button.RoundButton;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
public class testmenu extends JFrame {
	 private JPanel contentPane= new JPanel();
	 private menuslide menuslide = new menuslide(this);
	 private JPanel panel = new JPanel();
	 public static JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.RIGHT);
	 
	 public tabnhacungcap nhacungcap=new tabnhacungcap();
	 public tabnhaphang nhaphang= new tabnhaphang();
	 public tabketoa ketoa= new tabketoa();  
	 public tabnhanvien nhanvien= new tabnhanvien();
	 public tabkhothuoc thuoc= new tabkhothuoc();
	 public baocao home=new baocao();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
			EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testmenu frame = new testmenu();
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
	public testmenu() {
		
		FlatLightLaf.setup();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 800);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("Quản lý nhà thuốc");
		menuslide.setBounds(0, 0, 286, 761);
		menuslide.menu.setBackground(new Color(0, 144, 219));
		menuslide.menu.setLocation(25, 0);
		menuslide.menu.setSize(0, 0);
		setResizable(false);
		panel.setBackground(new Color(0, 144, 219));
		panel.setBounds(0, 0, 1264, 50);
		contentPane.setLayout(null);
		contentPane.add(menuslide);
		contentPane.add(panel);
		panel.setLayout(null);
		RoundButton rndbtnngXut = new RoundButton();
		rndbtnngXut.setBorderColor(new Color(255, 255, 255));
		rndbtnngXut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rndbtnngXut.setText("Đăng xuất");
		rndbtnngXut.setBounds(1137, 11, 117, 30);
		panel.add(rndbtnngXut);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(942, 0, 185, 52);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblUserInformation = new JLabel("User name:");
		lblUserInformation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUserInformation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblUserInformation);		
		JLabel lblUser = new JLabel("Admin");
		lblUser.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblUser);
		
		tabbedPane.setBorder(null);
		tabbedPane.setRequestFocusEnabled(false);
		tabbedPane.setBounds(50, 50, 1239, 711);
		contentPane.add(tabbedPane);
		tabbedPane.addTab("",home);
		tabbedPane.addTab("",thuoc);
		tabbedPane.addTab("",nhaphang);
		tabbedPane.addTab("",nhacungcap);
		tabbedPane.addTab("",ketoa);
		tabbedPane.addTab("",nhanvien);
	}
	
}
