package Hospital;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class updateDFrame extends JFrame implements ActionListener{
	JComboBox<Integer> ssnComboBox;
    JComboBox<String> genderComboBox;
    JLabel firstNameLabel, lastNameLabel, 
	snLabel, genderLabel, ssnLabel, 
	yearsOfExpLabel, emailLabel, 
	phoneLabel, salaryLabel, departmentLabel, 
	specialityLabel, dobLabel;
    JTextField firstNameField, lastNameField, yearsOfExpField,
    emailField, phoneField, salaryField, departmentField, specialityField, dobField;
    JButton getInfoButton;  
    JButton updateButton;
    JButton deleteButton;
    public updateDFrame() {
    	super("Doctor Information");
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
        firstNameField = new JTextField(20);
        firstNameField.setEditable(false);
        lastNameField = new JTextField(20);
        lastNameField.setEditable(false);	
        genderComboBox = new JComboBox<>();
        genderComboBox.addActionListener(this);
        genderComboBox.setForeground(new Color(252, 3, 69));
        genderComboBox.setBorder(BorderFactory.createLineBorder(new Color(129, 15, 217), 2)	);
        genderComboBox.setFont(new Font("Consolas", Font.BOLD, 20));
        genderComboBox.setEditable(false);
        genderComboBox.setEnabled(false);
        yearsOfExpField = new JTextField(20);
        yearsOfExpField.setEditable(false);	
        emailField = new JTextField(20);
        emailField.setEditable(false);	
        phoneField = new JTextField(20);
        phoneField.setEditable(false);	
        salaryField = new JTextField(20);
        salaryField.setEditable(false);	
        departmentField = new JTextField(20);
        departmentField.setEditable(false);	
        specialityField = new JTextField(20);
        specialityField.setEditable(false);	
        dobField = new JTextField(20);
        dobField.setEditable(false);	
        firstNameField.setFont(new Font("Consolas",Font.BOLD,25));
        firstNameField.setForeground(new Color(252, 3, 69));
        firstNameField.setBorder(BorderFactory.createLineBorder(new Color(129, 15, 217), 2));
        firstNameField.setCaretColor(Color.cyan);
        lastNameField.setFont(new Font("Consolas",Font.BOLD,25));
        lastNameField.setForeground(new Color(252, 3, 69));
        lastNameField.setBorder(BorderFactory.createLineBorder(new Color(129, 15, 217), 2));
        lastNameField.setCaretColor(Color.cyan);
        yearsOfExpField.setFont(new Font("Consolas",Font.BOLD,25));
        yearsOfExpField.setForeground(new Color(252, 3, 69));
        yearsOfExpField.setBorder(BorderFactory.createLineBorder(new Color(129, 15, 217), 2));
        yearsOfExpField.setCaretColor(Color.cyan);
        emailField.setFont(new Font("Consolas",Font.BOLD,25));
        emailField.setForeground(new Color(252, 3, 69));
        emailField.setBorder(BorderFactory.createLineBorder(new Color(129, 15, 217), 2));
        emailField.setCaretColor(Color.cyan);
        phoneField.setFont(new Font("Consolas",Font.BOLD,25));
        phoneField.setForeground(new Color(252, 3, 69));
        phoneField.setBorder(BorderFactory.createLineBorder(new Color(129, 15, 217), 2));
        phoneField.setCaretColor(Color.cyan);
        salaryField.setFont(new Font("Consolas",Font.BOLD,25));
        salaryField.setForeground(new Color(252, 3, 69));
        salaryField.setBorder(BorderFactory.createLineBorder(new Color(129, 15, 217), 2));
        salaryField.setCaretColor(Color.cyan);
        departmentField.setFont(new Font("Consolas",Font.BOLD,25));
        departmentField.setForeground(new Color(252, 3, 69));
        departmentField.setBorder(BorderFactory.createLineBorder(new Color(129, 15, 217), 2));
        departmentField.setCaretColor(Color.cyan);
        specialityField.setFont(new Font("Consolas",Font.BOLD,25));
        specialityField.setForeground(new Color(252, 3, 69));
        specialityField.setBorder(BorderFactory.createLineBorder(new Color(129, 15, 217), 2));
        specialityField.setCaretColor(Color.cyan);
        dobField.setFont(new Font("Consolas",Font.BOLD,25));
        dobField.setForeground(new Color(252, 3, 69));
        dobField.setBorder(BorderFactory.createLineBorder(new Color(129, 15, 217), 2));
        dobField.setCaretColor(Color.cyan);
        
        // create combo box for SSN selection
        ssnComboBox = new JComboBox<>();
        ssnComboBox.addActionListener(this);
		ssnComboBox.setForeground(new Color(53, 160, 242));
		ssnComboBox.setBorder(BorderFactory.createLineBorder(new Color(129, 15, 217), 2));
		ssnComboBox.setFont(new Font("Consolas", Font.BOLD, 20));
		String query2="Select ssn from doctor";
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
            ssnComboBox.addItem(+ssnList.get(i));
		
		
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
    	JPanel ssnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 20)); 
        ssnPanel.add(ssnLabel);
        ssnPanel.add(ssnComboBox);
        ssnPanel.add(getInfoButton);
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        JPanel mainPanel = new JPanel(new GridLayout(11, 2, 10, 10));
        mainPanel.add(firstNameLabel);
        mainPanel.add(firstNameField);
        mainPanel.add(lastNameLabel);
        mainPanel.add(lastNameField);
        mainPanel.add(genderLabel);
        mainPanel.add(genderComboBox);
        mainPanel.add(yearsOfExpLabel);
        mainPanel.add(yearsOfExpField); 
        mainPanel.add(emailLabel);
        mainPanel.add(emailField);
        mainPanel.add(emailLabel); 
        mainPanel.add(emailField);
        mainPanel.add(phoneLabel); 
        mainPanel.add(phoneField);
        mainPanel.add(salaryLabel); 
        mainPanel.add(salaryField);
        mainPanel.add(departmentLabel); 
        mainPanel.add(departmentField);
        mainPanel.add(specialityLabel); 
        mainPanel.add(specialityField);
        mainPanel.add(dobLabel); 
        mainPanel.add(dobField);
        add(ssnPanel,BorderLayout.NORTH);
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
		if (e.getSource() == getInfoButton) {
			int ssn = (int) ssnComboBox.getSelectedItem();
			String query ="SELECT * FROM doctor where ssn="+ssn;
			String query3 = "SELECT * FROM staff where ssn="+ssn;
			Connection con;
	    	Statement stmt;
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost/HospitalManagementSystem", "root", "");
				stmt = (Statement) con.createStatement();
				ResultSet rs = stmt.executeQuery(query3);
				while(rs.next()) {
					firstNameField.setText(rs.getString("S_FirstName"));
					firstNameField.setEditable(true);
					lastNameField.setText(rs.getString("S_LastName"));
					genderComboBox.removeAllItems();
					genderComboBox.addItem("Male");
					genderComboBox.addItem("Female");
					genderComboBox.setEnabled(true);
					if (rs.getString("Gender").equals("M")){
						genderComboBox.setSelectedItem("Male");
					}else {
						genderComboBox.setSelectedItem("Female");
					}
					yearsOfExpField.setText(rs.getString("Years_Experience"));
					yearsOfExpField.setEditable(true);
					emailField.setText(rs.getString("Email"));
					emailField.setEditable(true);
					phoneField.setText(rs.getString("Phone_No"));
					phoneField.setEditable(true);
					salaryField.setText(rs.getString("Salary"));
					salaryField.setEditable(true);
					departmentField.setText(rs.getString("Department"));
					departmentField.setEditable(true);
					
				}
				rs = stmt.executeQuery(query);
				 while(rs.next()) {
					dobField.setText(rs.getString("Date_of_Birth"));
					dobField.setEditable(true);
					specialityField.setText(rs.getString("Specialty"));
					specialityField.setEditable(true);
					
		         }
				 stmt.close();
				 con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} 
		}else if (e.getSource() == deleteButton) {
			if (firstNameField.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please select an SSN first.", "Watch out!",JOptionPane.INFORMATION_MESSAGE);
			}else {
				Connection con;
		    	Statement stmt;
				try {
					int ssn = (int) ssnComboBox.getSelectedItem();
					String query="DELETE FROM doctor where ssn="+ ssn;
					String query4="DELETE FROM staff where ssn="+ ssn;
					con = DriverManager.getConnection("jdbc:mysql://localhost/HospitalManagementSystem", "root", "");
					stmt = (Statement) con.createStatement();
					stmt.executeUpdate(query);
					stmt.executeUpdate(query4);
					for (int i = 0; i < ssnComboBox.getItemCount(); i++) {
				    if (ssnComboBox.getItemAt(i).equals(ssn)) {
				    	ssnComboBox.removeItemAt(i);
				        break;
				    }
					}
					firstNameField.setText("");
					lastNameField.setText("");
					genderComboBox.removeAllItems();
					phoneField.setText("");
					dobField.setText("");
					yearsOfExpField.setText("");
					emailField.setText("");
					phoneField.setText("");
					salaryField.setText("");
					departmentField.setText("");
					specialityField.setText("");
					firstNameField.setEditable(false);
					lastNameField.setEditable(false);
					phoneField.setEditable(false);
					dobField.setEditable(false);
					yearsOfExpField.setEditable(false);
					emailField.setEditable(false);
					phoneField.setEditable(false);
					salaryField.setEditable(false);
					departmentField.setEditable(false);
					specialityField.setEditable(false);
					JOptionPane.showMessageDialog(null, "Deleted row successfully!", "Success",JOptionPane.INFORMATION_MESSAGE);
					stmt.close();
					con.close();
			}catch (SQLException ex){
				JOptionPane.showMessageDialog(null, "Error deleting row!", "Warning",JOptionPane.WARNING_MESSAGE);
			}
			}
		}else if (e.getSource() == updateButton ) {
			if (firstNameField.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please select an SSN first.", "Watch out!",JOptionPane.INFORMATION_MESSAGE);
			}else {
				Connection con;
		    	Statement stmt;
				try {
					String fname = firstNameField.getText();
					String Lname = lastNameField.getText();
					String phone = phoneField.getText();
					String dob = dobField.getText();
					String yearsofExp = yearsOfExpField.getText();
					String email = emailField.getText();
					String salary = salaryField.getText();
					String dep = departmentField.getText();
					String spc = specialityField.getText();
					String gender1 = (String) genderComboBox.getSelectedItem();
					char first = gender1.charAt(0);
					String gender = ""+first;
					int ssn = (int) ssnComboBox.getSelectedItem();
					String query="UPDATE doctor SET Date_of_Birth = '"+dob+"', Specialty = '"+spc+"' where ssn="+ ssn;
					String query4="UPDATE staff SET S_FirstName = '"+fname+"', S_LastName = '"+Lname+"', Gender = '"+gender+"', "
							+ "Years_Experience = '"+yearsofExp+"', Email = '"+email+"', Phone_No = '"+phone+"',"
							+ "Salary = '"+salary+"', Department = '"+dep+"' where ssn="+ ssn;
					con = DriverManager.getConnection("jdbc:mysql://localhost/HospitalManagementSystem", "root", "");
					stmt = (Statement) con.createStatement();
					stmt.executeUpdate(query);
					stmt.executeUpdate(query4);
					JOptionPane.showMessageDialog(null, "Updated row successfully!", "Success",JOptionPane.INFORMATION_MESSAGE);
					stmt.close();
					con.close();
					firstNameField.setText("");
					lastNameField.setText("");
					genderComboBox.removeAllItems();
					phoneField.setText("");
					dobField.setText("");
					yearsOfExpField.setText("");
					emailField.setText("");
					phoneField.setText("");
					salaryField.setText("");
					departmentField.setText("");
					specialityField.setText("");
					firstNameField.setEditable(false);
					lastNameField.setEditable(false);
					phoneField.setEditable(false);
					dobField.setEditable(false);
					yearsOfExpField.setEditable(false);
					emailField.setEditable(false);
					phoneField.setEditable(false);
					salaryField.setEditable(false);
					departmentField.setEditable(false);
					specialityField.setEditable(false);
					
					
			}catch (SQLException ex){
				JOptionPane.showMessageDialog(null, "Error deleting row!", "Warning",JOptionPane.WARNING_MESSAGE);
			}
				
				
			}
		}
		
	}

}
