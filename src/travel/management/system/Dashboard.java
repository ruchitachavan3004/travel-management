package travel.management.system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


class Dashboard extends JFrame implements ActionListener  {
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
	private static String username;
	public Dashboard(String username){
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		getContentPane().setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(0,0,1950,65);
		p1.setBackground(new Color(0,0,102));
		getContentPane().add(p1);
		this.username = username;
	        setForeground(Color.CYAN);
	        getContentPane().setLayout(null); 

		
		
		JLabel l3 = new JLabel("Dashboard");
		l3.setFont(new Font("Tahoma",Font.BOLD,30));
		l3.setForeground(Color.white);
		l3.setBounds(80,10,300,40);
		p1.add(l3);
		
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(0,65,300,1000);
		p2.setBackground(new Color(0,0,102));
		getContentPane().add(p2);
		
		JButton b1 = new JButton("Add Personal Details");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new AddCustomer(username).setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setVisible(false);
			}
		});
		b1.setFont(new Font("Tahoma",Font.PLAIN,20));
		b1.setBackground(new Color(0,0,102));
		b1.setForeground(Color.white);
		b1.setBounds(0,0,300,50);
		b1.setMargin(new Insets(0,0,0,60));
		p2.add(b1);
		
		JButton b2 = new JButton("Update Personal Details");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new UpdateCustomer(username).setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		b2.setFont(new Font("Tahoma",Font.PLAIN,20));
		b2.setBackground(new Color(0,0,102));
		b2.setForeground(Color.white);
		b2.setBounds(0,50,300,50);
		b2.setMargin(new Insets(0,0,0,30));
		p2.add(b2);
		
			
		JButton b5 = new JButton("Check Package");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CheckPackage().setVisible(true);
//				setVisible(false);
			}
		});
		b5.setFont(new Font("Tahoma",Font.PLAIN,20));
		b5.setBackground(new Color(0,0,102));
		b5.setForeground(Color.white);
		b5.setBounds(0,100,300,50);
		b5.setMargin(new Insets(0,0,0,120));
		p2.add(b5);
		
		JButton b6 = new JButton("Book Package");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BookPackage(username).setVisible(true);
//				setVisible(false);
			}
		});
		b6.setFont(new Font("Tahoma",Font.PLAIN,20));
		b6.setBackground(new Color(0,0,102));
		b6.setForeground(Color.white);
		b6.setBounds(0,150,300,50);
		b6.setMargin(new Insets(0,0,0,120));
		p2.add(b6);
		
		JButton b7 = new JButton("View Package");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ViewPackage(username).setVisible(true);
//				setVisible(false);
			}
		});
		b7.setFont(new Font("Tahoma",Font.PLAIN,20));
		b7.setBackground(new Color(0,0,102));
		b7.setForeground(Color.white);
		b7.setBounds(0,200,300,50);
		b7.setMargin(new Insets(0,0,0,120));
		p2.add(b7);
		
		JButton b8 = new JButton("View Hotels");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CheckHotels().setVisible(true);
//				setVisible(false);
			}
		});
		b8.setFont(new Font("Tahoma",Font.PLAIN,20));
		b8.setBackground(new Color(0,0,102));
		b8.setForeground(Color.white);
		b8.setBounds(0,250,300,50);
		b8.setMargin(new Insets(0,0,0,125));
		p2.add(b8);
		
		JButton b9 = new JButton("Book Hotel");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BookHotel(username).setVisible(true);
				setVisible(false);
			}
		});
		b9.setFont(new Font("Tahoma",Font.PLAIN,20));
		b9.setBackground(new Color(0,0,102));
		b9.setForeground(Color.white);
		b9.setBounds(0,300,300,50);
		b9.setMargin(new Insets(0,0,0,135));
		p2.add(b9);
		
		JButton b10 = new JButton("View Booked Hotel");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ViewBookedHotel(username).setVisible(true);
				setVisible(false);
			}
		});
		b10.setFont(new Font("Tahoma",Font.PLAIN,20));
		b10.setBackground(new Color(0,0,102));
		b10.setForeground(Color.white);
		b10.setBounds(0,350,300,50);
		b10.setMargin(new Insets(0,0,0,70));
		p2.add(b10);
		
		JButton b11 = new JButton("Destinations");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Destination().setVisible(true);
//				setVisible(false);
			}
		});
		b11.setFont(new Font("Tahoma",Font.PLAIN,20));
		b11.setBackground(new Color(0,0,102));
		b11.setForeground(Color.white);
		b11.setBounds(0,400,300,50);
		b11.setMargin(new Insets(0,0,0,130));
		p2.add(b11);
		
		JButton b12 = new JButton("Payment");
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Payment().setVisible(true);
				setVisible(false);
			}
		});
		b12.setFont(new Font("Tahoma",Font.PLAIN,20));
		b12.setBackground(new Color(0,0,102));
		b12.setForeground(Color.white);
		b12.setBounds(0,450,300,50);
		b12.setMargin(new Insets(0,0,0,155));
		p2.add(b12);
		

		JButton b14 = new JButton("About");
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new About().setVisible(true);
				setVisible(false);
			}
		});
		b14.setFont(new Font("Tahoma",Font.PLAIN,20));
		b14.setBackground(new Color(0,0,102));
		b14.setForeground(Color.white);
		b14.setBounds(0,500,300,50);
		b14.setMargin(new Insets(0,0,0,170));
		p2.add(b14);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1950, 1000); 
        getContentPane().add(l1);
        
        JLabel l4 = new JLabel("Travel and Tourism Management System");
        l4.setBounds(400,100,1000,70);
        l4.setForeground(Color.white);
        l4.setFont(new Font("Tahoma",Font.PLAIN,55));
        l1.add(l4);        
	}
	
	
	public static void main(String[] args) {
		try {
			new Dashboard(username).setVisible(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}