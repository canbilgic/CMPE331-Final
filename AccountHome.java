//AccountHome.java is main page of project. which included profile, new reservation, cancel reservation and search bus.
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import java.awt.Label;
import java.awt.List;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Canvas;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;

public class AccountHome extends JFrame {

	private JPanel contentPane;
	private JTextField txt_cardno;
	private JTextField txt_date;
	JPanel cncl_rsrv = new JPanel();
	String[] aa = {"You have no reservation"};
	JList<String> list;
	DefaultListModel<String> listModel = new DefaultListModel<>();
	int i=0,populatelist=0;
	ArrayList<String> seat_no = new ArrayList<String>();	
	ArrayList<String> place = new ArrayList<String>();	
	ArrayList<String> destination = new ArrayList<String>();	
	ArrayList<String> day = new ArrayList<String>();	
	ArrayList<String> date = new ArrayList<String>();
	ArrayList<String> card_no= new ArrayList<String>();
	ArrayList<Integer> rsrv_no= new ArrayList<Integer>();
	
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
		//logout label on mainpage
		Label lbl_logout = new Label("Logout");
		lbl_logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//if user click logout label user will go to home window and logged out
				Home fr1 = new Home();
				fr1.setVisible(true);
				dispose();
			}
		});
		lbl_logout.setFont(new Font("Dialog", Font.PLAIN, 12));
		lbl_logout.setBackground(SystemColor.controlHighlight);
		lbl_logout.setAlignment(Label.RIGHT);
		lbl_logout.setBounds(528, 10, 72, 22);
		contentPane.add(lbl_logout);
		
		Canvas header = new Canvas();
		header.setBackground(SystemColor.controlHighlight);
		header.setBounds(0, 0, 609, 45);
		contentPane.add(header);		
		
		JPanel reservation = new JPanel();
		reservation.setVisible(false);
		
		JPanel my_profile = new JPanel();
		my_profile.setBounds(161, 51, 439, 321);
		contentPane.add(my_profile);
		my_profile.setLayout(null);
		
		//My profile label on mainpage
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
		reservation.setBounds(161, 51, 439, 321);
		contentPane.add(reservation);
		reservation.setLayout(null);
		
		Label label_7 = new Label("Reserve your seat");
		label_7.setVisible(false);
		label_7.setAlignment(Label.CENTER);
		label_7.setFont(new Font("Dialog", Font.PLAIN, 16));
		label_7.setBackground(SystemColor.control);
		label_7.setBounds(144, 0, 166, 22);
		reservation.add(label_7);
		
		Label label_8 = new Label("Choose your seat:");
		label_8.setVisible(false);
		label_8.setBounds(10, 57, 130, 22);		
		label_8.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_8.setBackground(SystemColor.control);
		reservation.add(label_8);
		
		//Combobox for destinations.
		JComboBox cb_seat = new JComboBox();
		cb_seat.setVisible(false);
		cb_seat.setModel(new DefaultComboBoxModel(new String[] {"A1", "A2", "A3", "A4", "A5", "A6", "B1", "B2", "B3", "B4", "B5", "B6"}));
		cb_seat.setBounds(143, 56, 151, 22);
		reservation.add(cb_seat);
		
		Label label_9 = new Label("Credit card Number:");
		label_9.setVisible(false);
		label_9.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_9.setBackground(SystemColor.menu);
		label_9.setBounds(10, 95, 126, 22);
		reservation.add(label_9);
		
		txt_cardno = new JTextField();
		txt_cardno.setVisible(false);
		txt_cardno.setBounds(142, 95, 152, 22);
		reservation.add(txt_cardno);
		txt_cardno.setColumns(10);
		
		Label label_10 = new Label("Select Route:");
		label_10.setVisible(false);
		label_10.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_10.setBackground(SystemColor.menu);
		label_10.setBounds(10, 170, 126, 22);
		reservation.add(label_10);
		
		Label label_11 = new Label("Place:");
		label_11.setVisible(false);
		label_11.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_11.setBackground(SystemColor.menu);
		label_11.setBounds(10, 198, 42, 22);
		reservation.add(label_11);
		
		JComboBox cb_src = new JComboBox();
		cb_src.setVisible(false);
		cb_src.setModel(new DefaultComboBoxModel(new String[] {"Adalar", "Arnavutk\u00F6y", "Bah\u00E7elievler", "Bayrampa\u015Fa", "Beykoz", "Emin\u00F6n\u00FC", "Esenler", "Sar\u0131yer", "Tuzla", "\u00DCmraniye", "\u00DCsk\u00FCdar", "Yalova", "Zeytinburnu"}));
		cb_src.setBounds(75, 198, 117, 22);
		reservation.add(cb_src);
		//Destination label.
		Label label_12 = new Label("Destination:");
		label_12.setVisible(false);
		label_12.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_12.setBackground(SystemColor.menu);
		label_12.setBounds(198, 198, 74, 22);
		reservation.add(label_12);
		
		JComboBox cb_dstnt = new JComboBox();
		cb_dstnt.setVisible(false);
		cb_dstnt.setModel(new DefaultComboBoxModel(new String[] {"Adalar", "Arnavutk\u00F6y", "Bah\u00E7elievler", "Bayrampa\u015Fa", "Beykoz", "Emin\u00F6n\u00FC", "Esenler", "Sar\u0131yer", "Tuzla", "\u00DCmraniye", "\u00DCsk\u00FCdar", "Yalova", "Zeytinburnu"}));
		cb_dstnt.setBounds(278, 198, 117, 22);
		reservation.add(cb_dstnt);
		
		Label label_13 = new Label("Select Day:");
		label_13.setVisible(false);
		label_13.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_13.setBackground(SystemColor.menu);
		label_13.setBounds(10, 136, 74, 22);
		reservation.add(label_13);
		
		//Combobox for destinations.
		JComboBox cb_day = new JComboBox();
		cb_day.setVisible(false);
		cb_day.setModel(new DefaultComboBoxModel(new String[] {"Monday", "Tuesday", "Wednessday", "Thursday", "Friday", "Saturday", "Sunday"}));
		cb_day.setBounds(90, 136, 102, 22);
		reservation.add(cb_day);
		
		Label label_14 = new Label("Select Date:");
		label_14.setVisible(false);
		label_14.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_14.setBackground(SystemColor.menu);
		label_14.setBounds(198, 136, 74, 22);
		reservation.add(label_14);		
		
		txt_date = new JTextField();
		txt_date.setVisible(false);
		txt_date.setColumns(10);
		txt_date.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				final JFrame f = new JFrame();
				txt_date.setText(new DatePicker(f).setPickedDate());
			}
		});
		txt_date.setColumns(10);
		txt_date.setBounds(278, 136, 117, 22);
		reservation.add(txt_date);	
		
		JButton btn_cnfrm = new JButton("Confirm");
		btn_cnfrm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				//add new reservation
				if(!txt_cardno.getText().equals("")&&!txt_date.getText().equals("")){
					rsrv_no.add(i+1);				
					card_no.add(txt_cardno.getText().toString());				
					date.add(txt_date.getText().toString());	
					listModel.addElement(txt_date.getText());
					if(listModel.getSize()>0)
						list = new JList<>(listModel);
					day.add(cb_day.getSelectedItem().toString());
					destination.add(cb_dstnt.getSelectedItem().toString());
					place.add(cb_src.getSelectedItem().toString());
					seat_no.add(cb_seat.getSelectedItem().toString());				
					i++;
					populatelist=1;
					JOptionPane.showMessageDialog(null,"Your reservation is done succesfully!!");
				}else
					JOptionPane.showMessageDialog(null,"Please fill complete details!!");
			}
		});
		btn_cnfrm.setVisible(false);
		btn_cnfrm.setBounds(327, 253, 102, 28);
		reservation.add(btn_cnfrm);
		
		JButton btn_clr = new JButton("Clear");
		btn_clr.setVisible(false);
		btn_clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				txt_cardno.setText("");
				txt_date.setText("");
			}
		});
		btn_clr.setBounds(215, 253, 102, 28);
		reservation.add(btn_clr);		
		
		cncl_rsrv.setVisible(false);
		cncl_rsrv.setBounds(161, 51, 439, 321);
		contentPane.add(cncl_rsrv);	
		cncl_rsrv.setLayout(null);
		
		JButton btn_cancel = new JButton("Cancel Reservation");
		btn_cancel.setVisible(false);
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {					
				int index = list.getSelectedIndex();
				listModel.remove(index);
        	    int size = listModel.getSize();
        	    if (size == 0) { //Nobody's left, disable btn_cancle
        	    	btn_cancel.setEnabled(false);
        	    } else { //Select an index.
        	        if (index == listModel.getSize()) {
        	            //removed item in last position
        	            index--;
        	        }
        	        list.setSelectedIndex(index);
        	        list.ensureIndexIsVisible(index);   
        	    }        	       	
			}
		});
		btn_cancel.setBounds(293, 287, 136, 23);
		cncl_rsrv.add(btn_cancel);	
		
		Label lbl_cncnl_rsv = new Label("Cancel Reservation");		
		lbl_cncnl_rsv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {	
				//if user click on cancel reservation label it will open cancel reservation panel
				if(listModel.getSize()==0){
					if(populatelist!=0){
						cncl_rsrv.setVisible(false);
						list.setVisible(false);
						btn_cancel.setVisible(false);
					}
				}				
				else if(listModel.getSize()>0){
					list.setVisible(true);					
					btn_cancel.setVisible(true);
					list = new JList<>(listModel);					
					list.setFont(new Font("Calibri", Font.PLAIN, 24));
					list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					JScrollPane scrollPane = new JScrollPane(list);
					scrollPane.setBounds(10, 5, 419, 218);
					cncl_rsrv.add(scrollPane);
				}				
				my_profile.setVisible(false);
				label_1.setVisible(false);
				label_2.setVisible(false);
				label_3.setVisible(false);
				label_4.setVisible(false);
				label_5.setVisible(false);
				label_6.setVisible(false);
				reservation.setVisible(false);
				label_7.setVisible(false);
				label_8.setVisible(false);
				label_9.setVisible(false);
				label_10.setVisible(false);
				label_11.setVisible(false);
				label_12.setVisible(false);
				label_13.setVisible(false);
				label_14.setVisible(false);
				cb_seat.setVisible(false);
				txt_cardno.setVisible(false);
				cb_src.setVisible(false);
				cb_dstnt.setVisible(false);
				cb_day.setVisible(false);
				txt_date.setVisible(false);
				btn_cnfrm.setVisible(false);
				btn_clr.setVisible(false);
				cncl_rsrv.setVisible(true);		
			}
		});
		lbl_cncnl_rsv.setFont(new Font("Dialog", Font.PLAIN, 13));
		lbl_cncnl_rsv.setBackground(SystemColor.scrollbar);
		lbl_cncnl_rsv.setBounds(10, 155, 130, 22);
		contentPane.add(lbl_cncnl_rsv);					
		
		Label lbl_profile = new Label("My Profile");
		lbl_profile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//if user click on cancel my profile label it will open cancel my profile panel
				my_profile.setVisible(true);
				label_1.setVisible(true);
				label_2.setVisible(true);
				label_3.setVisible(true);
				label_4.setVisible(true);
				label_5.setVisible(true);
				label_6.setVisible(true);
				reservation.setVisible(false);
				label_7.setVisible(false);
				label_8.setVisible(false);
				label_9.setVisible(false);
				label_10.setVisible(false);
				label_11.setVisible(false);
				label_12.setVisible(false);
				label_13.setVisible(false);
				label_14.setVisible(false);
				cb_seat.setVisible(false);
				txt_cardno.setVisible(false);
				cb_src.setVisible(false);
				cb_dstnt.setVisible(false);
				cb_day.setVisible(false);
				txt_date.setVisible(false);
				btn_cnfrm.setVisible(false);
				btn_clr.setVisible(false);					
				if(populatelist!=0){
					cncl_rsrv.setVisible(false);
					list.setVisible(false);
					btn_cancel.setVisible(false);
				}				
			}
		});
		lbl_profile.setFont(new Font("Dialog", Font.PLAIN, 13));
		lbl_profile.setBackground(SystemColor.scrollbar);
		lbl_profile.setBounds(10, 63, 130, 22);
		contentPane.add(lbl_profile);
		
		Label lbl_new_rsv = new Label("New Reservation");
		lbl_new_rsv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//if user click on new reservation label it will open new reservation panel
				my_profile.setVisible(false);
				label_1.setVisible(false);
				label_2.setVisible(false);
				label_3.setVisible(false);
				label_4.setVisible(false);
				label_5.setVisible(false);
				label_6.setVisible(false);
				reservation.setVisible(true);
				label_7.setVisible(true);
				label_8.setVisible(true);
				label_9.setVisible(true);
				label_10.setVisible(true);
				label_11.setVisible(true);
				label_12.setVisible(true);
				label_13.setVisible(true);
				label_14.setVisible(true);
				cb_seat.setVisible(true);
				txt_cardno.setVisible(true);
				cb_src.setVisible(true);
				cb_dstnt.setVisible(true);
				cb_day.setVisible(true);
				txt_date.setVisible(true);
				btn_cnfrm.setVisible(true);
				btn_clr.setVisible(true);
				if(populatelist!=0){
					cncl_rsrv.setVisible(false);
					list.setVisible(false);
					btn_cancel.setVisible(false);
				}
			}
		});
		lbl_new_rsv.setFont(new Font("Dialog", Font.PLAIN, 13));
		lbl_new_rsv.setBackground(SystemColor.scrollbar);
		lbl_new_rsv.setBounds(10, 108, 130, 22);
		contentPane.add(lbl_new_rsv);
		
		Label lbl_srch_bus = new Label("Search Bus");
		lbl_srch_bus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//if user click on search bus label it will open search window
				Search fr1 = new Search("AccountHome");
				fr1.setVisible(true);
				dispose();
			}
		});
		lbl_srch_bus.setFont(new Font("Dialog", Font.PLAIN, 13));
		lbl_srch_bus.setBackground(SystemColor.scrollbar);
		lbl_srch_bus.setBounds(10, 205, 130, 22);
		contentPane.add(lbl_srch_bus);
		
		Canvas side_menu = new Canvas();
		side_menu.setBackground(SystemColor.scrollbar);
		side_menu.setBounds(2, 44, 153, 341);
		contentPane.add(side_menu);
	} 
}
