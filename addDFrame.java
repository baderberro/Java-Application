package Hospital;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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

public class addDFrame extends JFrame implements ActionListener{
	JLabel firstNameLabel, lastNameLabel, 
			snLabel, genderLabel, ssnLabel, 
			yearsOfExpLabel, emailLabel, 
			phoneLabel, salaryLabel, departmentLabel, 
			specialityLabel, dobLabel;
    JTextField firstNameField, lastNameField, 
    ssnField, yearsOfExpField,
    emailField, phoneField, salaryField, departmentField, specialityField, dobField;
    JButton submitButton, clearButton;
    JComboBox<String> genderComboBox;
    public addDFrame() {
        firstNameLabel = new JLabel(" First Name:");
        lastNameLabel = new JLabel(" Last Name:");
        ssnLabel = new JLabel(" SSN:");
        genderLabel = new JLabel(" Gender:");
        yearsOfExpLabel = new JLabel(" Years of Experience:");
        emailLabel = new JLabel(" Email:");
        phoneLabel = new JLabel(" Phone Number:");
        salaryLabel = new JLabel(" Salary: (USD)");
        departmentLabel = new JLabel(" Department:");
        specialityLabel = new JLabel(" Speciality:");
        dobLabel = new JLabel(" Date of Birth:");
        firstNameLabel.setForeground(new Color(39, 43, 48));
		firstNameLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		lastNameLabel.setForeground(new Color(39, 43, 48));
		lastNameLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		ssnLabel.setForeground(new Color(39, 43, 48));
		ssnLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		genderLabel.setForeground(new Color(39, 43, 48));
		genderLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		yearsOfExpLabel.setForeground(new Color(39, 43, 48));
		yearsOfExpLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
		emailLabel.setForeground(new Color(39, 43, 48));
		emailLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
        phoneLabel.setForeground(new Color(39, 43, 48));
        phoneLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
        salaryLabel.setForeground(new Color(39, 43, 48));
        salaryLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
        departmentLabel.setForeground(new Color(39, 43, 48));
        departmentLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
        specialityLabel.setForeground(new Color(39, 43, 48));
        specialityLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
        dobLabel.setForeground(new Color(39, 43, 48));
        dobLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
        firstNameField = new JTextField(20);
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
        lastNameField = new JTextField(20);
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
        ssnField = new JTextField(20);
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
		String[] genders = {"Male", "Female"};
		genderComboBox = new JComboBox<>(genders);
		genderComboBox.setForeground(new Color(219, 242, 10));
		genderComboBox.setBackground(new Color(0,0,0));
		genderComboBox.setFont(new Font("MV Boli", Font.BOLD, 20));
        yearsOfExpField = new JTextField(20);
        yearsOfExpField.setText("33"); // Set initial text
        yearsOfExpField.setForeground(Color.LIGHT_GRAY); // Set text color to light gray
        yearsOfExpField.setCaretColor(Color.LIGHT_GRAY);
        yearsOfExpField.setPreferredSize(new Dimension(150,35));
        yearsOfExpField.setFont(new Font("MV Boli",Font.BOLD,25));
        yearsOfExpField.addFocusListener(new FocusListener() {
	    @Override
	    public void focusGained(FocusEvent e) {
	    	yearsOfExpField.setText("");
	    	yearsOfExpField.setForeground(Color.BLACK); // Change text color when focus is gained
	        
	    }
	    @Override
	    public void focusLost(FocusEvent e) {
	        if (yearsOfExpField.getText().isEmpty()) {
	        	yearsOfExpField.setText("33");
	        	yearsOfExpField.setForeground(Color.LIGHT_GRAY); // Change text color when focus is lost
	        }
	    }

	    });
        emailField = new JTextField(20);
        emailField.setText("bob.bitar@lau.edu"); // Set initial text
        emailField.setForeground(Color.LIGHT_GRAY); // Set text color to light gray
        emailField.setCaretColor(Color.LIGHT_GRAY);
        emailField.setPreferredSize(new Dimension(150,35));
        emailField.setFont(new Font("MV Boli",Font.BOLD,25));
        emailField.addFocusListener(new FocusListener() {
	    @Override
	    public void focusGained(FocusEvent e) {
	    	emailField.setText("");
	    	emailField.setForeground(Color.BLACK); // Change text color when focus is gained
	        
	    }
	    @Override
	    public void focusLost(FocusEvent e) {
	        if (emailField.getText().isEmpty()) {
	        	emailField.setText("bob.bitar@lau.edu");
	        	emailField.setForeground(Color.LIGHT_GRAY); // Change text color when focus is lost
	        }
	    }

	    });
        
        phoneField = new JTextField(20);
        phoneField.setText("03 375 376"); // Set initial text
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
	        	phoneField.setText("03 375 376");
	        	phoneField.setForeground(Color.LIGHT_GRAY); // Change text color when focus is lost
	        }
	    }

	    });
        salaryField = new JTextField(20);
        salaryField.setText("1,000,000"); // Set initial text
        salaryField.setForeground(Color.LIGHT_GRAY); // Set text color to light gray
        salaryField.setCaretColor(Color.LIGHT_GRAY);
        salaryField.setPreferredSize(new Dimension(150,35));
        salaryField.setFont(new Font("MV Boli",Font.BOLD,25));
        salaryField.addFocusListener(new FocusListener() {
	    @Override
	    public void focusGained(FocusEvent e) {
	    	salaryField.setText("");
	    	salaryField.setForeground(Color.BLACK); // Change text color when focus is gained
	        
	    }
	    @Override
	    public void focusLost(FocusEvent e) {
	        if (salaryField.getText().isEmpty()) {
	        	salaryField.setText("1,000,000");
	        	salaryField.setForeground(Color.LIGHT_GRAY); // Change text color when focus is lost
	        }
	    }

	    });
        departmentField = new JTextField(20);
        departmentField.setText("Cardiology"); // Set initial text
        departmentField.setForeground(Color.LIGHT_GRAY); // Set text color to light gray
        departmentField.setCaretColor(Color.LIGHT_GRAY);
        departmentField.setPreferredSize(new Dimension(150,35));
        departmentField.setFont(new Font("MV Boli",Font.BOLD,25));
        departmentField.addFocusListener(new FocusListener() {
	    @Override
	    public void focusGained(FocusEvent e) {
	    	departmentField.setText("");
	    	departmentField.setForeground(Color.BLACK); // Change text color when focus is gained
	        
	    }
	    @Override
	    public void focusLost(FocusEvent e) {
	        if (departmentField.getText().isEmpty()) {
	        	departmentField.setText("Cardiology");
	        	departmentField.setForeground(Color.LIGHT_GRAY); // Change text color when focus is lost
	        }
	    }

	    });
        specialityField = new JTextField(20);
        specialityField.setText("Surgeon"); // Set initial text
        specialityField.setForeground(Color.LIGHT_GRAY); // Set text color to light gray
        specialityField.setCaretColor(Color.LIGHT_GRAY);
        specialityField.setPreferredSize(new Dimension(150,35));
        specialityField.setFont(new Font("MV Boli",Font.BOLD,25));
        specialityField.addFocusListener(new FocusListener() {
	    @Override
	    public void focusGained(FocusEvent e) {
	    	specialityField.setText("");
	    	specialityField.setForeground(Color.BLACK); // Change text color when focus is gained
	        
	    }
	    @Override
	    public void focusLost(FocusEvent e) {
	        if (specialityField.getText().isEmpty()) {
	        	specialityField.setText("Surgeon");
	        	specialityField.setForeground(Color.LIGHT_GRAY); // Change text color when focus is lost
	        }
	    }

	    });
        dobField = new JTextField(20);
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
        submitButton = new JButton(" Submit ");
        submitButton.setPreferredSize(new Dimension(200, 40));
        submitButton.addActionListener(this);
        submitButton.setFocusable(false); //gets rid of the rectangle around the text
        submitButton.setForeground(Color.black);
        submitButton.setFont(new Font("MV Boli",Font.BOLD,15));
        submitButton.setBackground(Color.lightGray);
        submitButton.setBorder(BorderFactory.createEtchedBorder());
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	submitButton.setBackground(new Color(25, 156, 58));
	    	submitButton.setForeground(new Color(255,255,255));
	    	submitButton.setBorder(BorderFactory.createLineBorder(new Color(25, 156, 58), 2));
	        
	    }
	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	submitButton.setBackground(Color.lightGray);
	    	submitButton.setForeground(Color.black);
	    	submitButton.setBorder(BorderFactory.createEtchedBorder());
	        
	    }
	});
        clearButton = new JButton(" Clear ");
        clearButton.setPreferredSize(new Dimension(200, 40));
        clearButton.addActionListener(this);
        clearButton.setFocusable(false); //gets rid of the rectangle around the text
        clearButton.setForeground(Color.black);
        clearButton.setFont(new Font("MV Boli",Font.BOLD,15));
        clearButton.setBackground(Color.lightGray);
        clearButton.setBorder(BorderFactory.createEtchedBorder());
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	clearButton.setBackground(new Color(255,0,0));
	    	clearButton.setForeground(new Color(255,255,255));
	    	clearButton.setBorder(BorderFactory.createLineBorder(new Color(255,0,0), 2));
	        
	    }
	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	clearButton.setBackground(Color.lightGray);
	    	clearButton.setForeground(Color.black);
	    	clearButton.setBorder(BorderFactory.createEtchedBorder());
	        
	    }
	});
        JPanel panel = new JPanel(new GridLayout(12, 2));
        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(ssnLabel);
        panel.add(ssnField);
        panel.add(genderLabel);
        panel.add(genderComboBox);
        panel.add(yearsOfExpLabel);
        panel.add(yearsOfExpField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(salaryLabel);
        panel.add(salaryField);
        panel.add(departmentLabel);
        panel.add(departmentField);
        panel.add(specialityLabel);
        panel.add(specialityField);
        panel.add(dobLabel);
        panel.add(dobField);
        add(panel, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(submitButton);
        buttonPanel.add(clearButton);
        add(buttonPanel, BorderLayout.SOUTH);
        setTitle("Adding a doctor");
        setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setResizable(false); 
		setLocationRelativeTo(null); 
		ImageIcon image3 = new ImageIcon("hfc.png"); 
		setIconImage(image3.getImage()); 
		getContentPane().setBackground(new Color(255, 255, 255));
		//pack();
		setVisible(true);

    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clearButton) {
			firstNameField.setText("Ibrahim"); 
            firstNameField.setForeground(Color.LIGHT_GRAY); 
            lastNameField.setText("Bitar");					
            lastNameField.setForeground(Color.LIGHT_GRAY);							
            ssnField.setText("433 434 435");
            ssnField.setForeground(Color.LIGHT_GRAY);
            genderComboBox.setSelectedIndex(0);
            yearsOfExpField.setText("33");                  
            yearsOfExpField.setForeground(Color.LIGHT_GRAY);
            emailField.setText("bob.bitar@lau.edu");           
            emailField.setForeground(Color.LIGHT_GRAY);
            phoneField.setText("03 375 376");					 
            phoneField.setForeground(Color.LIGHT_GRAY);
            salaryField.setText("1,000,000");					
            salaryField.setForeground(Color.LIGHT_GRAY);
            departmentField.setText("Cardiology");				
            departmentField.setForeground(Color.LIGHT_GRAY);
            specialityField.setText("Surgeon");					
        	specialityField.setForeground(Color.LIGHT_GRAY);
            dobField.setText("1993-02-01");
            dobField.setForeground(Color.LIGHT_GRAY);			
				
		}else if (e.getSource() == submitButton) {
			if (firstNameField.getText().equals("Ibrahim") || lastNameField.getText().equals("Bitar") ||
				ssnField.getText().equals("433 434 435") || emailField.getText().equals("bob.bitar@lau.edu") ||
				phoneField.getText().equals("03 375 376")) {
				JOptionPane.showMessageDialog(null,"Please make sure that you fill all the fields","Warning", JOptionPane.WARNING_MESSAGE);
			}
			// here we should get the data from the input fields and add it to the database
			// I will also display a message that will let the user know if the it was added successfully
			else {
				//INSERT INTO `staff` ( `SSN` , `S_FirstName` , `S_LastName` , `Gender` , `Years_Experience` , `Email` , `Phone_No` , `Salary` , `Department` )
//				VALUES (
//						'331465879', 'Yousra', 'Jaroudi', 'F', '1', 'yousra.jaroudi@outlook.com', '03321322', '100000', 'Urology'
//						);
			String fname = firstNameField.getText();
			String Lname = lastNameField.getText();
			String ssn = ssnField.getText();
			String gender1 = (String) genderComboBox.getSelectedItem();
			char first = gender1.charAt(0);
			String gender = ""+first;
			String yrsofExp = yearsOfExpField.getText();
			String email = emailField.getText();
			String phone =  phoneField.getText();
			String salary =  salaryField.getText();
			String dep =  departmentField.getText();
			String spc = specialityField.getText();
			String dob = dobField.getText();
			try { 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/HospitalManagementSystem", "root", ""); 
				Statement stmt = (Statement) con.createStatement(); 
				       // … all DML and DDL are written here (See next) 
				String Query = "INSERT INTO staff ( SSN , S_FirstName, S_LastName , Gender, Years_Experience, Email, Phone_No, Salary, Department) " +
                         "VALUES ( '" + ssn + "', '" + fname+ "', '" + Lname + "', '" + gender + "', '" + yrsofExp + "', '" + email + "', '" + phone + "', '" + salary + "', '"+dep+"' )";
				stmt.executeUpdate(Query);
				String query1 = "INSERT INTO doctor(SSN , Date_of_Birth , Specialty )"
						+ "VALUES ( '"+ ssn + "', '" +dob+"', '"+spc+"' );";
				stmt.executeUpdate(query1);
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
