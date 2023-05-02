package Hospital;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class addPFrame extends JFrame implements ActionListener{
	JTextField firstNameField;
	JTextField lastNameField;
	JTextField phoneField;
	JTextField dobField;
	JTextField ssnField;
	JTextField addressField;
	JComboBox<String> genderComboBox;
	JButton submit;
	JButton clear;
	//int counter = 0;
	public addPFrame() {
		// Creating JLabels
		JLabel ssnLabel = new JLabel(" SSN:");
		JLabel genderLabel = new JLabel(" Gender:");
		JLabel firstNameLabel = new JLabel(" First Name:");
		JLabel lastNameLabel = new JLabel(" Last Name:");
		JLabel phoneLabel = new JLabel(" Phone Number:");
		JLabel dobLabel = new JLabel(" Date of Birth (YYYY-MM-dd):");
		JLabel addressLabel = new JLabel(" Address:");
		
		genderLabel.setForeground(new Color(39, 43, 48));
		genderLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		firstNameLabel.setForeground(new Color(39, 43, 48));
		firstNameLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		lastNameLabel.setForeground(new Color(39, 43, 48));
		lastNameLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		phoneLabel.setForeground(new Color(39, 43, 48));
		phoneLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		dobLabel.setForeground(new Color(39, 43, 48));
		dobLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		ssnLabel.setForeground(new Color(39, 43, 48));
		ssnLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		addressLabel.setForeground(new Color(39, 43, 48));
		addressLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		// Creating JTextFields
		firstNameField = new JTextField(20);
		lastNameField = new JTextField(20);
		phoneField = new JTextField(20);
		dobField = new JTextField(20);
		ssnField = new JTextField(20);
		addressField = new JTextField(20);
		firstNameField.setText("Ibrahim"); // Set initial text
		firstNameField.setForeground(Color.LIGHT_GRAY); // Set text color to light gray
		firstNameField.setCaretColor(Color.LIGHT_GRAY);
		firstNameField.setPreferredSize(new Dimension(150,35));
		firstNameField.setFont(new Font("MV Boli",Font.BOLD,25));
		firstNameField.addFocusListener(new FocusListener() {
	    @Override
	    public void focusGained(FocusEvent e) {
	            firstNameField.setText("");
	            firstNameField.setForeground(Color.BLACK); // Change text color when focus is gained
	        
	    }
	    @Override
	    public void focusLost(FocusEvent e) {
	        if (firstNameField.getText().isEmpty()) {
	            firstNameField.setText("Ibrahim");
	            firstNameField.setForeground(Color.LIGHT_GRAY); // Change text color when focus is lost
	        }
	    }

	    });
		lastNameField.setText("Bitar"); // Set initial text
		lastNameField.setForeground(Color.LIGHT_GRAY); // Set text color to light gray
		lastNameField.setCaretColor(Color.LIGHT_GRAY);
		lastNameField.setPreferredSize(new Dimension(150,35));
		lastNameField.setFont(new Font("MV Boli",Font.BOLD,25));
		lastNameField.addFocusListener(new FocusListener() {
	    @Override
	    public void focusGained(FocusEvent e) {
	            lastNameField.setText("");
	            lastNameField.setForeground(Color.BLACK); // Change text color when focus is gained
	        
	    }
	    @Override
	    public void focusLost(FocusEvent e) {
	        if (lastNameField.getText().isEmpty()) {
	            lastNameField.setText("Bitar");
	            lastNameField.setForeground(Color.LIGHT_GRAY); // Change text color when focus is lost
	        }
	    }

	    });
		phoneField.setText("03 390 391"); // Set initial text
		phoneField.setForeground(Color.LIGHT_GRAY); // Set text color to light gray
		phoneField.setCaretColor(Color.LIGHT_GRAY);
		phoneField.setPreferredSize(new Dimension(150,35));
		phoneField.setFont(new Font("MV Boli",Font.BOLD,25));
		phoneField.addFocusListener(new FocusListener() {
	    @Override
	    public void focusGained(FocusEvent e) {
	            phoneField.setText("");
	            phoneField.setForeground(Color.BLACK); // Change text color when focus is gained
	        
	    }
	    @Override
	    public void focusLost(FocusEvent e) {
	        if (phoneField.getText().isEmpty()) {
	            phoneField.setText("03 390 391");
	            phoneField.setForeground(Color.LIGHT_GRAY); // Change text color when focus is lost
	        }
	    }

	    });
		dobField.setText("1993-02-01"); // Set initial text
		dobField.setForeground(Color.LIGHT_GRAY); // Set text color to light gray
		dobField.setCaretColor(Color.LIGHT_GRAY);
		dobField.setPreferredSize(new Dimension(150,35));
		dobField.setFont(new Font("MV Boli",Font.BOLD,25));
		dobField.addFocusListener(new FocusListener() {
	    @Override
	    public void focusGained(FocusEvent e) {
	            dobField.setText("");
	            dobField.setForeground(Color.BLACK); // Change text color when focus is gained
	        
	    }
	    @Override
	    public void focusLost(FocusEvent e) {
	        if (dobField.getText().isEmpty()) {
	            dobField.setText("1993-02-01");
	            dobField.setForeground(Color.LIGHT_GRAY); // Change text color when focus is lost
	        }
	    }

	    });
		ssnField.setText("433 434 435"); // Set initial text
		ssnField.setForeground(Color.LIGHT_GRAY); // Set text color to light gray
		ssnField.setCaretColor(Color.LIGHT_GRAY);
		ssnField.setPreferredSize(new Dimension(150,35));
		ssnField.setFont(new Font("MV Boli",Font.BOLD,25));
		ssnField.addFocusListener(new FocusListener() {
	    @Override
	    public void focusGained(FocusEvent e) {
	            ssnField.setText("");
	            ssnField.setForeground(Color.BLACK); // Change text color when focus is gained
	        
	    }
	    @Override
	    public void focusLost(FocusEvent e) {
	        if (ssnField.getText().isEmpty()) {
	            ssnField.setText("433 434 435");
	            ssnField.setForeground(Color.LIGHT_GRAY); // Change text color when focus is lost
	        }
	    }

	    });
		addressField.setText("Beirut"); // Set initial text
		addressField.setForeground(Color.LIGHT_GRAY); // Set text color to light gray
		addressField.setCaretColor(Color.LIGHT_GRAY);
		addressField.setPreferredSize(new Dimension(150,35));
		addressField.setFont(new Font("MV Boli",Font.BOLD,25));
		addressField.addFocusListener(new FocusListener() {
	    @Override
	    public void focusGained(FocusEvent e) {
	            addressField.setText("");
	            addressField.setForeground(Color.BLACK); // Change text color when focus is gained
	        
	    }
	    @Override
	    public void focusLost(FocusEvent e) {
	        if (addressField.getText().isEmpty()) {
	            addressField.setText("Beirut");
	            addressField.setForeground(Color.LIGHT_GRAY); // Change text color when focus is lost
	        }
	    }

	    });
		
		// Creating JComboBox for gender selection
		String[] genders = {"Male", "Female"};
		genderComboBox = new JComboBox<>(genders);
		genderComboBox.setForeground(Color.red);
		genderComboBox.setBackground(Color.lightGray);
		genderComboBox.setFont(new Font("MV Boli", Font.BOLD, 20));
		submit = new JButton();
		submit.setBounds(150,60,190,90);
		submit.setText("Submit");
		submit.addActionListener(this); // or we can use an expression like button.addActionListener(e -> System.out.println("Hello Client!"); it will do the same thing
		submit.setFocusable(false); //gets rid of the rectangle around the text
		submit.setForeground(Color.black);
		submit.setFont(new Font("MV Boli",Font.BOLD,15));
		submit.setBackground(Color.lightGray);
		submit.setBorder(BorderFactory.createEtchedBorder());
		submit.addMouseListener(new java.awt.event.MouseAdapter() {
	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	        submit.setBackground(new Color(25, 156, 58));
	        submit.setForeground(new Color(255,255,255));
	        submit.setBorder(BorderFactory.createLineBorder(new Color(25, 156, 58), 2));
	        
	    }
	    public void mouseExited(java.awt.event.MouseEvent evt) {
	        submit.setBackground(Color.lightGray);
	        submit.setForeground(Color.black);
	        submit.setBorder(BorderFactory.createEtchedBorder());
	        
	    }
	});
		clear = new JButton();
		clear.setBounds(150,60,190,90);
		clear.setText("Clear");
		clear.addActionListener(this); // or we can use an expression like button.addActionListener(e -> System.out.println("Hello Client!"); it will do the same thing
		clear.setFocusable(false); //gets rid of the rectangle around the text
		clear.setForeground(Color.black);
		clear.setFont(new Font("MV Boli",Font.BOLD,15));
		clear.setBackground(Color.lightGray);
		clear.setBorder(BorderFactory.createEtchedBorder());
		clear.addMouseListener(new java.awt.event.MouseAdapter() {
	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	        clear.setBackground(new Color(255,0,0));
	        clear.setForeground(new Color(255,255,255));
	        clear.setBorder(BorderFactory.createLineBorder(new Color(255,0,0), 2));
	        
	    }
	    public void mouseExited(java.awt.event.MouseEvent evt) {
	        clear.setBackground(Color.lightGray);
	        clear.setForeground(Color.black);
	        clear.setBorder(BorderFactory.createEtchedBorder());
	        
	    }
	});
		

		// Creating JPanel for input fields
		JPanel inputPanel = new JPanel(new GridLayout(8, 2, 5, 5));
		inputPanel.add(ssnLabel);
		inputPanel.add(ssnField);
		inputPanel.add(genderLabel);
		inputPanel.add(genderComboBox);
		inputPanel.add(firstNameLabel);
		inputPanel.add(firstNameField);
		inputPanel.add(lastNameLabel);
		inputPanel.add(lastNameField);
		inputPanel.add(phoneLabel);
		inputPanel.add(phoneField);
		inputPanel.add(dobLabel);
		inputPanel.add(dobField);
		inputPanel.add(addressLabel);
		inputPanel.add(addressField);
		inputPanel.add(submit);
		inputPanel.add(clear);
		this.setTitle("Adding a patient");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setResizable(false); 
		//this.setSize(450,450); // eza badde just to resize depending on the components of the frame I just do : frame.pack();
		this.setLocationRelativeTo(null); // Center the JFrame on the screen
		ImageIcon image3 = new ImageIcon("hfc.png"); 
		this.setIconImage(image3.getImage()); 
		this.getContentPane().setBackground(new Color(255, 255, 255));
		this.add(inputPanel);
		this.pack();
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clear) {
			firstNameField.setText("Ibrahim");
            firstNameField.setForeground(Color.LIGHT_GRAY);
            lastNameField.setText("Bitar");
            lastNameField.setForeground(Color.LIGHT_GRAY);
            phoneField.setText("03 390 391");
            phoneField.setForeground(Color.LIGHT_GRAY);
            dobField.setText("1993-02-01");
            dobField.setForeground(Color.LIGHT_GRAY);
			genderComboBox.setSelectedIndex(0);
			ssnField.setText("433 434 435");
            ssnField.setForeground(Color.LIGHT_GRAY);
            addressField.setText("Beirut");
            addressField.setForeground(Color.LIGHT_GRAY);
		}else if (e.getSource() == submit) {
			// here we should get the data from the input fields and add it to the database
			// I will also display a message that will let the user know if the it was added successfully
			if (ssnField.getText().equals("433 434 435") || firstNameField.getText().equals("Ibrahim") || lastNameField.getText().equals("Bitar")
					|| phoneField.getText().equals("03 390 391") || dobField.getText().equals("1993-02-01")) {
				JOptionPane.showMessageDialog(null,"Please make sure that you fill all the fields","Warning", JOptionPane.WARNING_MESSAGE);
			}else {
				//counter++;
				int ssn = Integer.parseInt(ssnField.getText());
				String gender1 = (String) genderComboBox.getSelectedItem();
				char first = gender1.charAt(0);
				String gender = ""+first;
				String dob = dobField.getText();
				String fname = firstNameField.getText();
				String Lname = lastNameField.getText();
				String phoneNb = phoneField.getText();
				String address = addressField.getText();
				try { 
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/HospitalManagementSystem", "root", ""); 
					Statement stmt = (Statement) con.createStatement(); 
					       // … all DML and DDL are written here (See next) 
					String Query = "INSERT INTO patient (Gender, Patient_FirstName, Patient_LastName, PhoneNo, Date_of_Birth, SSN, Address) " +
				               "VALUES ('" + gender + "', '" + fname + "', '" + Lname + "', '" + phoneNb + "', '" + dob + "', '" + ssn + "', '" + address + "')";
					stmt.executeUpdate(Query);
					JOptionPane.showMessageDialog(null, "Successfully added the row to the database!", "Added",JOptionPane.INFORMATION_MESSAGE);
					stmt.close();
					con.close();      
		        }catch(SQLException e1) {
		        	JOptionPane.showMessageDialog(null,"Error adding the row to the database!","Warning", JOptionPane.WARNING_MESSAGE);
		        	System.out.println("SQL Exception: "+ e1.toString());} }
			//dispose();	
			}
			
		
	}


	
		}			
		
