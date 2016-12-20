//Creating Register class which included name, last name, email, username, password and Contact number frames.

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Canvas;
import java.awt.TextField;
import java.awt.ComponentOrientation;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField txt_fname;
	private JTextField txt_lname;
	private JTextField txt_email;
	private JTextField txt_usr;
	private JButton btn_rgstr;
	String lname,fname,email,phone,username,password;
	private JPasswordField txt_pass;
	private JTextField txt_cntct;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 496);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Top header label
		Label lbl_intro = new Label("Register yourself and join our system!!");
		lbl_intro.setFont(new Font("Dialog", Font.PLAIN, 14));
		lbl_intro.setBackground(SystemColor.controlHighlight);
		lbl_intro.setBounds(10, 10, 337, 22);
		contentPane.add(lbl_intro);
		
		Canvas header = new Canvas();
		header.setBackground(SystemColor.controlHighlight);
		header.setBounds(0, 0, 382, 43);
		contentPane.add(header);
		
		//First name textfield
		txt_fname = new JTextField();
		txt_fname.setText("Your First Name");
		txt_fname.setBounds(87, 88, 193, 29);
		contentPane.add(txt_fname);
		txt_fname.setColumns(10);
		
		//Last name textfield
		txt_lname = new JTextField();
		txt_lname.setText("Your Last Name");
		txt_lname.setColumns(10);
		txt_lname.setBounds(87, 140, 193, 29);
		contentPane.add(txt_lname);
		
		//Email textfield
		txt_email = new JTextField();
		txt_email.setText("Your Email Id");
		txt_email.setColumns(10);
		txt_email.setBounds(87, 189, 193, 29);
		contentPane.add(txt_email);
		
		//Username textfield
		txt_usr = new JTextField();
		txt_usr.setText("Your Username");
		txt_usr.setColumns(10);
		txt_usr.setBounds(87, 238, 193, 29);
		contentPane.add(txt_usr);
		
		//Register function
		btn_rgstr = new JButton("Register");
		btn_rgstr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fname = txt_fname.getText().toString();
				lname = txt_lname.getText().toString();				
				email = txt_email.getText().toString();
				phone = txt_cntct.getText().toString();
				username = txt_usr.getText().toString();
				password = txt_pass.getText().toString();
				// checking texts from form and if everything is okay, user registered successfully. 
				if(!fname.equals("")&&!lname.equals("")&&!email.equals("")&&!phone.equals("")&&!username.equals("")&&!password.equals("")){
					JOptionPane.showMessageDialog(null,"You are registered succesfully");
					AccountHome ac = new AccountHome();
					ac.setVisible(true);
					dispose();
				}else	
					// else function if user can't fill from correct. (Error message)
					JOptionPane.showMessageDialog(null,"please enter correct info");
			}
		});
		
		//Password textfield
		txt_pass = new JPasswordField();
		txt_pass.setText("Password");
		txt_pass.setEchoChar('*');
		txt_pass.setBounds(87, 288, 193, 29);
		contentPane.add(txt_pass);
		
		//Contact textfield
		txt_cntct = new JTextField();
		txt_cntct.setText("Contact no");
		txt_cntct.setColumns(10);
		txt_cntct.setBounds(87, 338, 193, 29);
		contentPane.add(txt_cntct);
		btn_rgstr.setBounds(191, 389, 89, 29);
		contentPane.add(btn_rgstr);
		
		Canvas rgstr_box = new Canvas();
		rgstr_box.setBackground(SystemColor.menu);
		rgstr_box.setBounds(46, 67, 268, 381);
		contentPane.add(rgstr_box);
	}
}
