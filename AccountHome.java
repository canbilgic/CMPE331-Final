//AccountHome.java is main page of project. which included profile, new reservation, cancel reservation and search bus.


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import java.awt.Label;
import java.awt.SystemColor;
import java.sql.Date;
import java.util.Calendar;
import java.awt.Font;
import java.awt.Canvas;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AccountHome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountHome frame = new AccountHome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame. It is include all label and layout. 
	 */
	public AccountHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		//Welcome label on mainpage
		Label label = new Label("Welcome! ");
		label.setFont(new Font("Dialog", Font.PLAIN, 16));
		label.setBackground(SystemColor.controlHighlight);
		label.setBounds(10, 10, 222, 22);
		contentPane.add(label);
		//Logout label on mainpage
		Label lbl_logout = new Label("Logout");
		lbl_logout.setFont(new Font("Dialog", Font.PLAIN, 12));
		lbl_logout.setBackground(SystemColor.controlHighlight);
		lbl_logout.setAlignment(Label.RIGHT);
		lbl_logout.setBounds(528, 10, 72, 22);
		contentPane.add(lbl_logout);
		
		Canvas header = new Canvas();
		header.setBackground(SystemColor.controlHighlight);
		header.setBounds(0, 0, 609, 45);
		contentPane.add(header);
		//My Profile label on mainpage
		Label lbl_profile = new Label("My Profile");
		lbl_profile.setFont(new Font("Dialog", Font.PLAIN, 13));
		lbl_profile.setBackground(SystemColor.scrollbar);
		lbl_profile.setBounds(10, 63, 130, 22);
		contentPane.add(lbl_profile);
		//New Reservation label on mainpage
		Label lbl_new_rsv = new Label("New Reservation");
		lbl_new_rsv.setFont(new Font("Dialog", Font.PLAIN, 13));
		lbl_new_rsv.setBackground(SystemColor.scrollbar);
		lbl_new_rsv.setBounds(10, 108, 130, 22);
		contentPane.add(lbl_new_rsv);
		//Cancel reservation label on mainpage
		Label lbl_cncnl_rsv = new Label("Cancel Reservation");
		lbl_cncnl_rsv.setFont(new Font("Dialog", Font.PLAIN, 13));
		lbl_cncnl_rsv.setBackground(SystemColor.scrollbar);
		lbl_cncnl_rsv.setBounds(10, 155, 130, 22);
		contentPane.add(lbl_cncnl_rsv);
		//Search Bus label on mainpage
		Label lbl_srch_bus = new Label("Search Bus");
		lbl_srch_bus.setFont(new Font("Dialog", Font.PLAIN, 13));
		lbl_srch_bus.setBackground(SystemColor.scrollbar);
		lbl_srch_bus.setBounds(10, 205, 130, 22);
		contentPane.add(lbl_srch_bus);
		
		Canvas side_menu = new Canvas();
		side_menu.setBackground(SystemColor.scrollbar);
		side_menu.setBounds(2, 44, 153, 341);
		contentPane.add(side_menu);
		
		JPanel my_profile = new JPanel();
		my_profile.setVisible(false);
		my_profile.setBounds(538, 27, 439, 321);
		contentPane.add(my_profile);
		my_profile.setLayout(null);
		//Welcome label on mainpage
		Label label_1 = new Label("My Profile");
		label_1.setVisible(false);
		label_1.setBounds(179, 0, 89, 24);
		label_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_1.setBackground(SystemColor.control);
		my_profile.add(label_1);
		
		Label label_2 = new Label("FirstName: Emre");
		label_2.setVisible(false);
		label_2.setAlignment(Label.CENTER);
		label_2.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_2.setBackground(SystemColor.menu);
		label_2.setBounds(138, 81, 158, 24);
		my_profile.add(label_2);
		
		Label label_3 = new Label("LastName: Sonmez");
		label_3.setVisible(false);
		label_3.setAlignment(Label.CENTER);
		label_3.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_3.setBackground(SystemColor.menu);
		label_3.setBounds(138, 111, 158, 24);
		my_profile.add(label_3);
		
		Label label_4 = new Label("Contact no: 123456789");
		label_4.setVisible(false);
		label_4.setAlignment(Label.CENTER);
		label_4.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_4.setBackground(SystemColor.menu);
		label_4.setBounds(138, 141, 158, 24);
		my_profile.add(label_4);
		
		Label label_5 = new Label("Email: graduate@gmail.com");
		label_5.setVisible(false);
		label_5.setAlignment(Label.CENTER);
		label_5.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_5.setBackground(SystemColor.menu);
		label_5.setBounds(131, 171, 178, 24);
		my_profile.add(label_5);
		
		Label label_6 = new Label("UserName: test");
		label_6.setVisible(false);
		label_6.setAlignment(Label.CENTER);
		label_6.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_6.setBackground(SystemColor.menu);
		label_6.setBounds(138, 51, 158, 24);
		my_profile.add(label_6);
		
		JPanel reservation = new JPanel();
		reservation.setBounds(161, 51, 439, 321);
		contentPane.add(reservation);
		reservation.setLayout(null);
		
		Label label_7 = new Label("Reserve your seat");
		label_7.setAlignment(Label.CENTER);
		label_7.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_7.setBackground(SystemColor.control);
		label_7.setBounds(144, 0, 166, 22);
		reservation.add(label_7);
		
		Label label_8 = new Label("Choose your seat:");
		label_8.setBounds(10, 49, 130, 22);
		reservation.add(label_8);
		label_8.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_8.setBackground(SystemColor.control);
		
		Label label_9 = new Label("Credit card Number:");
		label_9.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_9.setBackground(SystemColor.menu);
		label_9.setBounds(10, 87, 126, 22);
		reservation.add(label_9);
		
		textField = new JTextField();
		textField.setBounds(142, 87, 152, 22);
		reservation.add(textField);
		textField.setColumns(10);
		//Select Route label 
		Label label_10 = new Label("Select Route:");
		label_10.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_10.setBackground(SystemColor.menu);
		label_10.setBounds(10, 126, 126, 22);
		reservation.add(label_10);
		//Place label 
		Label label_11 = new Label("Place:");
		label_11.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_11.setBackground(SystemColor.menu);
		label_11.setBounds(10, 154, 42, 22);
		reservation.add(label_11);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A1", "A2", "A3", "A4", "A5", "A6", "B1", "B2", "B3", "B4", "B5", "B6"}));
		comboBox.setBounds(143, 48, 151, 22);
		reservation.add(comboBox);
		//Combobox for destinations. 
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Adalar", "Arnavutkoy", "Bahcelievler", "Bayrampasa", "Beykoz", "Eminonu", "Esenler", "Sariyer", "Tuzla", "Umraniye", "Uskudar", "Yalova", "Zeytinburnu"}));
		comboBox_1.setBounds(58, 154, 117, 22);
		reservation.add(comboBox_1);
		//Destination label
		Label label_12 = new Label("Destination:");
		label_12.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_12.setBackground(SystemColor.menu);
		label_12.setBounds(181, 154, 74, 22);
		reservation.add(label_12);
		//Combobox for destinations. 
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Adalar", "Arnavutkoy", "Bahcelievler", "Bayrampasa", "Beykoz", "Eminonu", "Esenler", "Sariyer", "Tuzla", "Umraniye", "Uskudar", "Yalova", "Zeytinburnu"}));
		comboBox_2.setBounds(257, 154, 117, 22);
		reservation.add(comboBox_2);
		
		Label label_13 = new Label("Select Day:");
		label_13.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_13.setBackground(SystemColor.menu);
		label_13.setBounds(10, 195, 74, 22);
		reservation.add(label_13);
		//ComboBox for days
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Monday", "Tuesday", "Wednessday", "Thursday", "Friday", "Saturday", "Sunday"}));
		comboBox_3.setBounds(90, 195, 97, 22);
		reservation.add(comboBox_3);
		
		Label label_14 = new Label("Select Date:");
		label_14.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_14.setBackground(SystemColor.menu);
		label_14.setBounds(198, 195, 74, 22);
		reservation.add(label_14);
		reservation.setVisible(false);
	}
}

	
