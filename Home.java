// Home.java is include our homepage, register, login and search functions. 


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Canvas;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image img = Toolkit.getDefaultToolkit().createImage("img1.jpg");
		//Register Label
		Label lbl_rgstr = new Label("Register");
		lbl_rgstr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//when user click on register button this will open regiter window
				Register fr1 = new Register();
				fr1.setVisible(true);
				dispose();
			}
		});
		lbl_rgstr.setAlignment(Label.CENTER);
		lbl_rgstr.setBounds(169, 93, 225, 32);
		contentPane.add(lbl_rgstr);
		//Login Label
		Label lbl_login = new Label("Login");
		lbl_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//when user click on login button this will open login window
				Login fr2 = new Login();
				fr2.setVisible(true);
				dispose();
			}
		});
		lbl_login.setAlignment(Label.CENTER);
		lbl_login.setBounds(169, 166, 225, 32);
		contentPane.add(lbl_login);
		//This is our search Label
		Label lbl_srch = new Label("Search");
		lbl_srch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//when user click on search button this will open search window
				Search fr3 = new Search("Home");
				fr3.setVisible(true);
				dispose();
			}
		});
		lbl_srch.setAlignment(Label.CENTER);
		lbl_srch.setBounds(169, 240, 225, 32);
		contentPane.add(lbl_srch);
		
		Canvas login_box = new Canvas();
		login_box.setForeground(Color.BLUE);
		login_box.setBackground(SystemColor.controlHighlight);
		login_box.setBounds(123, 56, 312, 253);
		contentPane.add(login_box);
	}

}
