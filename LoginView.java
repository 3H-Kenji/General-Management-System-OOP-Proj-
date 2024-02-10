package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginView{

	void loginView(JFrame loginFrame){

		JPanel loginPanel = new JPanel();
		loginPanel.setSize(900,500);

		Color panelColor = new Color(23, 127, 117);
		loginPanel.setBackground(panelColor);
		loginPanel.setBounds(0,0,900,500);


		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setBounds(300,30,300,40);
		loginFrame.add(usernameLabel);

		JTextField usernameText = new JTextField();
		usernameText.setBounds(300,70,300,40);
		loginFrame.add(usernameText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(300,100,300,40);
		loginFrame.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField();
		passwordText.setBounds(300,140,300,40);
		loginFrame.add(passwordText);

		JButton loginButton = new JButton("LOGIN");
		loginButton.setBounds(300,200,300,50);
		loginFrame.add(loginButton);

		
		loginButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

////added logic in loginview

				Controller controller = new Controller();

				String username = usernameText.getText();
				String password = passwordText.getText();


				if(username.isEmpty() || password.isEmpty()){

					JOptionPane.showMessageDialog(null, "Please fill the blanks", "Registration", JOptionPane.PLAIN_MESSAGE);

				}else{

					switch (controller.verifyUser(username,password)) {

						case 1:

							Container frame = loginFrame.getContentPane();
					    	frame.removeAll();
							frame.repaint();
							frame.revalidate();
							ProfileView profView = new ProfileView(username);

							switch(controller.scanRole(username)){
								case 1:
								profView.employeeProfileView(loginFrame);
								break;
								case 2:
								profView.managerProfileView(loginFrame);
								break;
								case 3:
								profView.adminProfileView(loginFrame);
								break;
								default:

	                			System.out.println("ERROR");
							}
							break;

						case 2:

							JOptionPane.showMessageDialog(null, "Wrong Password", "userLogin", JOptionPane.PLAIN_MESSAGE);
							break;

						case 3: 

							JOptionPane.showMessageDialog(null, "Username doesn't exist", "userLogin", JOptionPane.PLAIN_MESSAGE);
							break;

						default:
							controller.registerUser("Kenji", "Middlename", "Patino", "user2", "pass2", "Talamban, Cebu City","09147382442", "20" , "January 17, 2023", "kenji@gmail.com","manager");
							controller.registerUser("Samson", "Amaca", "Casinillo", "user1", "pass1", "Budlaan, Cebu City","09152387562", "20" , "March 19, 2003", "samcas@gmail.com","employee");
	                		controller.registerUser("name", "middlename", "lastname", "admin", "adminpassword", "address","12345678910", "20" , "birthdate", "admin@gmail.com","admin");
	                		JOptionPane.showMessageDialog(null, "Username doesn't exist", "userLogin", JOptionPane.PLAIN_MESSAGE);
					}

				}
				
				
		}
	});

		JLabel label = new JLabel("Doesn't have an account? Grab a SNEAKER!");
		label.setBounds(300,240,350,40);
		loginFrame.add(label);

		JButton registerButton = new JButton("REGISTER");
		registerButton.setBounds(300,280,300,50);
		loginFrame.add(registerButton);

		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Container frame = loginFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

				RegisterView regisView = new RegisterView();
				regisView.registerView(loginFrame);
			}
		});

		loginFrame.add(loginPanel);
		loginPanel.setLayout(null);
		loginPanel.setVisible(true);
		

		loginFrame.setVisible(true);



}

}