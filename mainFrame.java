package Hospital;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class mainFrame extends JFrame implements ActionListener{
	JLabel label;
	JButton Pbutton;
	JButton Dbutton;
	public mainFrame() {
		label = new JLabel();
		Border border = BorderFactory.createLineBorder(Color.red,2);
		label.setText("Welcome to HABH Hopsital");
		ImageIcon icon2 = new ImageIcon("hospital.png");
		Image image2 = icon2.getImage();
		Image newimg2 = image2.getScaledInstance(70, 70,  java.awt.Image.SCALE_SMOOTH);
		icon2 = new ImageIcon(newimg2);
		label.setIcon(icon2);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(255,0,0));
		label.setFont(new Font("MV Boli", Font.BOLD, 16));
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		Pbutton = new JButton("Patient Department");
		Dbutton = new JButton("Doctor Department");
		// Patient JButton Style
		ImageIcon icon = new ImageIcon("patient-PhotoRoom.png-PhotoRoom.png");
		Image image = icon.getImage();
		Image newimg = image.getScaledInstance(70, 70,  java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimg);
		Pbutton.setIcon(icon);
		Pbutton.setBounds(100,90,255,90);
		Pbutton.setForeground(Color.red);
		Pbutton.setBackground(Color.white);
		Pbutton.setFont(new Font("MV Boli", Font.BOLD, 17));
		Pbutton.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		Pbutton.setFocusPainted(false);
		Pbutton.setFocusable(false);
		Pbutton.addActionListener(this);
		Color buttonHoverColor = Color.red;
		Pbutton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        Pbutton.setBackground(buttonHoverColor);
		        Pbutton.setForeground(Color.white);
		        Pbutton.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        Pbutton.setBackground(Color.white);
		        Pbutton.setForeground(Color.red);
		        Pbutton.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		    }
		});
		// Doctor JButton Style
		ImageIcon icon1 = new ImageIcon("doctor-PhotoRoom.png-PhotoRoom.png");
		Image image1 = icon1.getImage();
		Image newimg1 = image1.getScaledInstance(70, 70,  java.awt.Image.SCALE_SMOOTH);
		icon1 = new ImageIcon(newimg1); 
		Dbutton.setIcon(icon1);
		Dbutton.setBounds(100,230,255,90);
		Dbutton.setForeground(Color.red);
		Dbutton.setBackground(Color.white);
		Dbutton.setFont(new Font("MV Boli", Font.BOLD, 17));
		Dbutton.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		Dbutton.setFocusPainted(false);
		Dbutton.setFocusable(false);
		Dbutton.addActionListener(this);
		Dbutton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        Dbutton.setBackground(new Color(48, 196, 22));
		        Dbutton.setForeground(Color.white);
		        Dbutton.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        Dbutton.setBackground(Color.white);
		        Dbutton.setForeground(Color.red);
		        Dbutton.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		    }
		});
		
		this.setTitle("Hospital Management System");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setResizable(false); 
		this.setSize(450,450); // eza badde just to resize depending on the components of the frame I just do : frame.pack();
		this.setLocationRelativeTo(null); // Center the JFrame on the screen
		ImageIcon image3 = new ImageIcon("hfc.png"); 
		this.setIconImage(image3.getImage()); 
		this.getContentPane().setBackground(new Color(255, 255, 255));
		label.add(Dbutton);
		label.add(Pbutton);
		this.add(label);
		this.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Pbutton) {
			new PatientFrame();
			dispose();
		} else if (e.getSource() == Dbutton) {
			new DoctorFrame();
			dispose();
		}
		
	}

}
