// Search.Java is a search function to check on system. 

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Search extends JFrame {

	private JPanel search;
	private Label label12;
	private int cbName,cbDay;
	private String name,day;
	private static String TAG="Home";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search(TAG);
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
public Search(String TAG) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 355);
		search = new JPanel();
		search.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(search);
		search.setLayout(null);
		// some labels for search function, shown in Search Bus page. 
		Label label = new Label("Search for Bus");
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Dialog", Font.PLAIN, 16));
		label.setBackground(SystemColor.controlHighlight);
		label.setBounds(153, 0, 165, 22);
		search.add(label);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(SystemColor.controlHighlight);
		canvas.setBounds(0, 0, 469, 27);
		search.add(canvas);
		
		label12 = new Label("Search by Name:");
		label12.setFont(new Font("Dialog", Font.PLAIN, 13));
		label12.setBackground(SystemColor.scrollbar);
		label12.setBounds(10, 33, 115, 22);
		search.add(label12);
		//Bus numbers for search function
		JComboBox cb_name = new JComboBox();
		cb_name.setModel(new DefaultComboBoxModel(new String[] {"Bus1", "Bus2", "Bus3", "Bus4", "Bus5", "Bus6", "Bus7", "Bus8", "Bus9", "Bus10"}));
		cb_name.setBounds(10, 58, 103, 22);
		search.add(cb_name);
		
		Label label23 = new Label("Search by Day:");
		label23.setFont(new Font("Dialog", Font.PLAIN, 13));
		label23.setBackground(SystemColor.scrollbar);
		label23.setBounds(10, 102, 115, 22);
		search.add(label23);
		//Days combobox for search function
		JComboBox cb_day = new JComboBox();
		cb_day.setModel(new DefaultComboBoxModel(new String[] {"Monday", "Tuesday", "Wednessday", "Thursday", "Friday", "Saturday", "Sunday"}));
		cb_day.setBounds(10, 129, 102, 22);
		search.add(cb_day);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(SystemColor.scrollbar);
		canvas_1.setBounds(0, 27, 125, 290);
		search.add(canvas_1);
		
		Label lbl_bus_name = new Label("");
		lbl_bus_name.setAlignment(Label.RIGHT);
		lbl_bus_name.setFont(new Font("Dialog", Font.PLAIN, 13));
		lbl_bus_name.setBackground(SystemColor.scrollbar);
		lbl_bus_name.setBounds(194, 45, 130, 22);
		search.add(lbl_bus_name);
		
		Label label_1 = new Label("Name:");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_1.setBackground(SystemColor.scrollbar);
		label_1.setBounds(131, 45, 168, 22);
		search.add(label_1);
		
		Label lbl_bus_day = new Label("");
		lbl_bus_day.setFont(new Font("Dialog", Font.PLAIN, 13));
		lbl_bus_day.setBackground(SystemColor.scrollbar);
		lbl_bus_day.setAlignment(Label.RIGHT);
		lbl_bus_day.setBounds(194, 83, 130, 22);
		search.add(lbl_bus_day);
		
		Label label_2 = new Label("Day:");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_2.setBackground(SystemColor.scrollbar);
		label_2.setBounds(131, 83, 168, 22);
		search.add(label_2);
		
		JLabel lbl_img = new JLabel();					
			    
		JButton btn_clr = new JButton("Clear");
		btn_clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// when user click this button it will get clear all data
				lbl_bus_name.setText("");
				lbl_bus_day.setText("");
				ImageIcon imageIcon = new ImageIcon(new ImageIcon("").getImage().getScaledInstance(338, 165, Image.SCALE_DEFAULT));
				lbl_img.setBounds(131, 111, 338, 165);	
				lbl_img.setIcon(imageIcon);
				search.add(lbl_img);	
			}
		});
		btn_clr.setBounds(263, 278, 102, 28);
		search.add(btn_clr);
		
		JButton btn_srch = new JButton("Search");
		btn_srch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// when user click search button it willl get user select details and search for bus
				cbName = cb_name.getSelectedIndex();
				cbDay = cb_day.getSelectedIndex();
				Bus bus = new Bus();
				lbl_bus_name.setText(bus.getName(cbName));
				lbl_bus_day.setText(bus.getDay(cbDay));
				ImageIcon imageIcon = new ImageIcon(new ImageIcon("src/"+bus.getImg(cbName)).getImage().getScaledInstance(338, 165, Image.SCALE_DEFAULT));
				lbl_img.setBounds(131, 111, 338, 165);	
				lbl_img.setIcon(imageIcon);
				search.add(lbl_img);				
			}
		});
		btn_srch.setBounds(367, 278, 102, 28);
		search.add(btn_srch);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if search window is called from home window it will go to home window
				if(TAG.equals("Home")){
					Home fr1 = new Home();
					fr1.setVisible(true);
					dispose();
				}else if(TAG.equals("AccountHome")){
					//if search window is called from account home window it will go to account home window
					AccountHome fr1 = new AccountHome();
					fr1.setVisible(true);
					dispose();
				}
			}
		});
		btnBack.setBounds(159, 278, 102, 28);
		search.add(btnBack);
	}
}
