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

public class DoctorFrame extends JFrame implements ActionListener{
	JLabel label;
	JButton addButton;
	JButton updateButton;
	public DoctorFrame() {
		label = new JLabel("Please select one of the following options");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(48, 196, 22));
		label.setFont(new Font("MV Boli", Font.BOLD, 19));
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		addButton = new JButton("Add");
		ImageIcon icon2 = new ImageIcon("addi.png");
		Image image2 = icon2.getImage();
		Image newimg2 = image2.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH);
		icon2 = new ImageIcon(newimg2);
		addButton.setIcon(icon2);
		addButton.setIconTextGap(20);
		updateButton = new JButton("Update/Delete");
		ImageIcon icon3 = new ImageIcon("edit.png");
		Image image3 = icon3.getImage();
		Image newimg3 = image3.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH);
		icon3 = new ImageIcon(newimg3);
		updateButton.setIcon(icon3);
		addButton.setBounds(100,70,240,120);
		updateButton.setBounds(100,260,240,120);
		// Styling the buttons
		Font buttonFont = new Font("MV Boli", Font.BOLD, 16);
		Color buttonColor = new Color(48, 196, 22);
		Color buttonHoverColor = new Color(7, 242, 11);
		Color buttonBorderColor = new Color(186, 219, 20);
		int buttonBorderThickness = 2;
		addButton.setFont(buttonFont);
		addButton.setForeground(Color.WHITE);
		addButton.setBackground(buttonColor);
		addButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor, buttonBorderThickness));
		addButton.setFocusPainted(false);
		addButton.addActionListener(this);
		addButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        addButton.setBackground(buttonHoverColor);
		        addButton.setForeground(Color.black);
		        addButton.setBorder(BorderFactory.createLineBorder(buttonHoverColor, buttonBorderThickness));
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        addButton.setBackground(buttonColor);
		        addButton.setForeground(Color.WHITE);
		        addButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor, buttonBorderThickness));
		    }
		});

		updateButton.setFont(buttonFont);
		updateButton.setForeground(Color.WHITE);
		updateButton.setBackground(buttonColor);
		updateButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor, buttonBorderThickness));
		updateButton.setFocusPainted(false);
		updateButton.addActionListener(this);
		updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        updateButton.setBackground(buttonHoverColor);
		        updateButton.setForeground(Color.black);
		        updateButton.setBorder(BorderFactory.createLineBorder(buttonHoverColor, buttonBorderThickness));
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        updateButton.setBackground(buttonColor);
		        updateButton.setForeground(Color.WHITE);
		        updateButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor, buttonBorderThickness));
		    }
		});

		
		ImageIcon icon = new ImageIcon("greenC-PhotoRoom.png-PhotoRoom.png");
		this.setIconImage(icon.getImage()); 
		this.setTitle("Doctor Department");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setResizable(false); 
		this.setSize(450,450); // eza badde just to resize depending on the components of the frame I just do : frame.pack();
		this.setLocationRelativeTo(null); // Center the JFrame on the screen
		label.add(addButton);
		label.add(updateButton);
		this.add(label);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addButton) {
			new addDFrame();
			dispose();
		}else if (e.getSource() == updateButton) {
			new updateDFrame();
			dispose();
		}
		
	}
}