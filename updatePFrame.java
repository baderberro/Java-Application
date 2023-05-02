package Hospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class updatePFrame extends JFrame implements ActionListener {
    JComboBox<Integer> ssnComboBox;
    JComboBox<String> genderComboBox;
    JTextField firstNameTextField, lastNameTextField, phoneTextField, dobTextField, addressTextField;
    JButton getInfoButton;  
    JButton updateButton;
    JButton deleteButton;
    public updatePFrame() {
		super("Patient Information");

        // create labels for the fields
        JLabel ssnLabel = new JLabel("SSN:");
        JLabel firstNameLabel = new JLabel("First Name:");
        JLabel lastNameLabel = new JLabel("Last Name:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel phoneLabel = new JLabel("Phone Number:");
        JLabel dobLabel = new JLabel("Date of Birth:");
        JLabel addressLabel = new JLabel("Address:");
        // Create a "Get Info" button
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
        getInfoButton = new JButton(" Get Info ");
        getInfoButton.addActionListener(this); // or we can use an expression like button.addActionListener(e -> System.out.println("Hello Client!"); it will do the same thing
        getInfoButton.setFocusable(false); //gets rid of the rectangle around the text
        getInfoButton.setForeground(Color.white);
        getInfoButton.setFont(new Font("MV Boli",Font.BOLD,25));
        getInfoButton.setBackground(new Color(34, 156, 186));
        getInfoButton.setBorder(BorderFactory.createEtchedBorder());
        getInfoButton.addMouseListener(new java.awt.event.MouseAdapter() {
	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	getInfoButton.setBackground(new Color(0, 0, 255));
	    	getInfoButton.setForeground(new Color(255,255,255));
	    	getInfoButton.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 255), 2));
	        
	    }
	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	getInfoButton.setBackground(new Color(34, 156, 186));
	    	getInfoButton.setForeground(Color.white);
	    	getInfoButton.setBorder(BorderFactory.createEtchedBorder());
	        
	    }
	});	
        // create combo box for SSN selection
        ssnComboBox = new JComboBox<>();
        ssnComboBox.addActionListener(this);
		ssnComboBox.setForeground(new Color(0x00FF00));
		ssnComboBox.setBackground(Color.black);
		ssnComboBox.setFont(new Font("Consolas", Font.BOLD, 20));
		String query2="Select ssn from patient";
		ArrayList<Integer> ssnList = new ArrayList<>();
    	Connection con;
    	Statement stmt;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/HospitalManagementSystem", "root", "");
			stmt = (Statement) con.createStatement();
			ResultSet rs = stmt.executeQuery(query2);
			 while(rs.next())
	         {
	             ssnList.add(rs.getInt("ssn"));
	         }
			 stmt.close();
			 con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		for(int i=0; i<ssnList.size();i++)
            ssnComboBox.addItem(ssnList.get(i));

		
        // create text fields for user info display
        firstNameTextField = new JTextField(20);
        firstNameTextField.setEditable(false);
        lastNameTextField = new JTextField(20);
        lastNameTextField.setEditable(false);
        genderComboBox = new JComboBox<>();
        genderComboBox.addActionListener(this);
        genderComboBox.setForeground(new Color(0x00FF00));
        genderComboBox.setBackground(Color.black);
        genderComboBox.setFont(new Font("Consolas", Font.BOLD, 20));
        genderComboBox.setEditable(false);
        //genderComboBox.setEnabled(false);
        phoneTextField = new JTextField(15);
        phoneTextField.setEditable(false);
        dobTextField = new JTextField(10);
        dobTextField.setEditable(false);
        addressTextField = new JTextField(30);
        addressTextField.setEditable(false);
        firstNameTextField.setFont(new Font("Consolas",Font.BOLD,25));
        firstNameTextField.setForeground(new Color(0x00FF00));
        firstNameTextField.setBackground(Color.black);
        firstNameTextField.setCaretColor(Color.cyan);
        lastNameTextField.setFont(new Font("Consolas",Font.BOLD,25));
        lastNameTextField.setForeground(new Color(0x00FF00));
        lastNameTextField.setBackground(Color.black);
        lastNameTextField.setCaretColor(Color.cyan);
        dobTextField.setFont(new Font("Consolas",Font.BOLD,25));
        dobTextField.setForeground(new Color(0x00FF00));
        dobTextField.setBackground(Color.black);
        dobTextField.setCaretColor(Color.cyan);
        phoneTextField.setFont(new Font("Consolas",Font.BOLD,25));
        phoneTextField.setForeground(new Color(0x00FF00));
        phoneTextField.setBackground(Color.black);
        phoneTextField.setCaretColor(Color.cyan);
        addressTextField.setFont(new Font("Consolas",Font.BOLD,25));
        addressTextField.setForeground(new Color(0x00FF00));
        addressTextField.setBackground(Color.black);
        addressTextField.setCaretColor(Color.cyan);
        
        
        // create buttons for update and delete
        updateButton = new JButton(" Update ");
        updateButton.addActionListener(this);
        updateButton.setFocusable(false); //gets rid of the rectangle around the text
        updateButton.setForeground(Color.white);
        updateButton.setFont(new Font("MV Boli",Font.BOLD,25));
        updateButton.setBackground(new Color(113, 176, 49));
        updateButton.setBorder(BorderFactory.createEtchedBorder());
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	updateButton.setBackground(new Color(0, 255,0));
	    	updateButton.setForeground(new Color(255,255,255));
	    	updateButton.setBorder(BorderFactory.createLineBorder(new Color(0, 255,0), 2));
	        
	    }
	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	updateButton.setBackground(new Color(113, 176, 49));
	    	updateButton.setForeground(Color.white);
	    	updateButton.setBorder(BorderFactory.createEtchedBorder());
	        
	    }
	});	
       
        deleteButton = new JButton(" Delete ");
        deleteButton.addActionListener(this);
        deleteButton.setFocusable(false); //gets rid of the rectangle around the text
        deleteButton.setForeground(Color.white);
        deleteButton.setFont(new Font("MV Boli",Font.BOLD,25));
        deleteButton.setBackground(new Color(222, 147, 9));
        deleteButton.setBorder(BorderFactory.createEtchedBorder());
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	deleteButton.setBackground(new Color(255, 0,0));
	    	deleteButton.setForeground(new Color(255,255,255));
	    	deleteButton.setBorder(BorderFactory.createLineBorder(new Color(255,0 ,0), 2));
	        
	    }
	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	deleteButton.setBackground(new Color(222, 147, 9));
	    	deleteButton.setForeground(Color.white);
	    	deleteButton.setBorder(BorderFactory.createEtchedBorder());
	        
	    }
	});		

        // create panel for combo box and label
        JPanel ssnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 20)); 
        ssnPanel.add(ssnLabel);
        ssnPanel.add(ssnComboBox);
        ssnPanel.add(getInfoButton);
        

       

        // create panel for first name and last name fields
        JPanel namePanel = new JPanel(new GridLayout(2, 2, 10, 5));
        namePanel.add(firstNameLabel);
        namePanel.add(firstNameTextField);
        namePanel.add(lastNameLabel);
        namePanel.add(lastNameTextField);

        // create panel for gender and phone fields
        JPanel contactPanel = new JPanel(new GridLayout(2, 2, 10, 5));
        contactPanel.add(genderLabel);
        contactPanel.add(genderComboBox);
        contactPanel.add(phoneLabel);
        contactPanel.add(phoneTextField);

        // create panel for DOB and address fields
        JPanel addressPanel = new JPanel(new GridLayout(2, 2, 10, 5));
        addressPanel.add(dobLabel);
        addressPanel.add(dobTextField);
        addressPanel.add(addressLabel);
        addressPanel.add(addressTextField);

        // create panel for update and delete buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);

        // create main panel for all components
        JPanel mainPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(ssnPanel);
        mainPanel.add(namePanel);
        mainPanel.add(contactPanel);
        mainPanel.add(addressPanel);

        // add all panels to the frame
        add(mainPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image3 = new ImageIcon("hfc.png"); 
		setIconImage(image3.getImage()); 
		getContentPane().setBackground(new Color(255, 255, 255));
		setVisible(true);
    }
    

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==getInfoButton) {
			int ssn = (int) ssnComboBox.getSelectedItem();
			String query ="SELECT * FROM patient where ssn="+ssn;
			Connection con;
	    	Statement stmt;
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost/HospitalManagementSystem", "root", "");
				stmt = (Statement) con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				 while(rs.next()) {
					firstNameTextField.setText(rs.getString("Patient_FirstName"));
					firstNameTextField.setEditable(true);
					lastNameTextField.setText(rs.getString("Patient_LastName"));
					lastNameTextField.setEditable(true);
					genderComboBox.removeAllItems();
					genderComboBox.addItem("Male");
					genderComboBox.addItem("Female");
					if (rs.getString("Gender").equals("M")){
						genderComboBox.setSelectedItem("Male");
					}else {
						genderComboBox.setSelectedItem("Female");
					}
					
					phoneTextField.setText(rs.getString("PhoneNo"));
					phoneTextField.setEditable(true);
					dobTextField.setText(rs.getString("Date_of_Birth"));
					dobTextField.setEditable(true);
					addressTextField.setText(rs.getString("Address"));
					addressTextField.setEditable(true);
		         }
				 stmt.close();
				 con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} 
			
		
	}else if (e.getSource() == updateButton) {
		int patientID = 0;
		if (firstNameTextField.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please select an SSN first.", "Watch out!",JOptionPane.INFORMATION_MESSAGE);
		}else {
			Connection con;
	    	Statement stmt;
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost/HospitalManagementSystem", "root", "");
				stmt = (Statement) con.createStatement();
				int ssn = (int) ssnComboBox.getSelectedItem();
				String query ="SELECT Patient_ID FROM patient where ssn='" + ssn + "'";
				ResultSet rs = stmt.executeQuery(query);
				if (rs.next()) {
				    patientID = rs.getInt("Patient_ID");
				}
			    stmt.close();
				con.close();        
				}catch (SQLException ex){
					JOptionPane.showMessageDialog(null, "Error updating row!", "Warning",JOptionPane.WARNING_MESSAGE);
				}
			}
			Connection con1;
			Statement stmt1;
			try {
				int ssn = (int) ssnComboBox.getSelectedItem();
				String gender1 = (String) genderComboBox.getSelectedItem();
				char first = gender1.charAt(0);
				String gender = ""+first;
				String fname = firstNameTextField.getText();
				String Lname = lastNameTextField.getText();
				String phoneNb = phoneTextField.getText();
				String dateOfBirth = dobTextField.getText();
				String address = addressTextField.getText();
				String query1 = "UPDATE patient SET Patient_FirstName = '"+fname+"',Patient_LastName = '"+Lname+"', Gender = '"+gender+"' , PhoneNo = '"+phoneNb+"' , Date_of_Birth = '"+dateOfBirth+"' , SSN = '"+ssn+"', Address = '"+address+"' WHERE Patient_ID ='"+patientID+"' LIMIT 1";
				con1 = DriverManager.getConnection("jdbc:mysql://localhost/HospitalManagementSystem", "root", "");
				stmt1 = (Statement) con1.createStatement();
				stmt1.executeUpdate(query1);
				JOptionPane.showMessageDialog(null, "Successfully updated row!", "Success",JOptionPane.INFORMATION_MESSAGE);
				stmt1.close();
				con1.close();
				firstNameTextField.setText("");
				lastNameTextField.setText("");
				genderComboBox.removeAllItems();
				phoneTextField.setText("");
				dobTextField.setText("");
				addressTextField.setText("");
				firstNameTextField.setEditable(false);
				lastNameTextField.setEditable(false);
				phoneTextField.setEditable(false);
				dobTextField.setEditable(false);
				addressTextField.setEditable(false);
		}catch (SQLException ex){
			JOptionPane.showMessageDialog(null, "Error updating row!", "Warning",JOptionPane.WARNING_MESSAGE);
		}
}		else if (e.getSource() == deleteButton) {
		if (firstNameTextField.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please select an SSN first.", "Watch out!",JOptionPane.INFORMATION_MESSAGE);
		}else {
			Connection con;
	    	Statement stmt;
			try {
				int ssn = (int) ssnComboBox.getSelectedItem();
				String query="DELETE FROM patient where ssn="+ ssn;
				con = DriverManager.getConnection("jdbc:mysql://localhost/HospitalManagementSystem", "root", "");
				stmt = (Statement) con.createStatement();
				stmt.executeUpdate(query);
				for (int i = 0; i < ssnComboBox.getItemCount(); i++) {
			    if (ssnComboBox.getItemAt(i).equals(ssn)) {
			    	ssnComboBox.removeItemAt(i);
			        break;
			    }
				}
				firstNameTextField.setText("");
				lastNameTextField.setText("");
				genderComboBox.removeAllItems();
				phoneTextField.setText("");
				dobTextField.setText("");
				addressTextField.setText("");
				firstNameTextField.setEditable(false);
				lastNameTextField.setEditable(false);
				phoneTextField.setEditable(false);
				dobTextField.setEditable(false);
				addressTextField.setEditable(false);
				JOptionPane.showMessageDialog(null, "Deleted row successfully!", "Success",JOptionPane.INFORMATION_MESSAGE);
				stmt.close();
				con.close();
		}catch (SQLException ex){
			JOptionPane.showMessageDialog(null, "Error deleting row!", "Warning",JOptionPane.WARNING_MESSAGE);
		}
	}
}
}
}
