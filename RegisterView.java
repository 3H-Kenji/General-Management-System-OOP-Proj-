package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegisterView {
	void registerView(JFrame regisFrame) {
		JPanel regisPanel = new JPanel();
		regisPanel.setBounds(0,0,900,500);

		Color panelColor = new Color(23, 127, 117);
		regisPanel.setBackground(panelColor);
		regisPanel.setBounds(0,0,900,500);
		
		JLabel regisName = new JLabel("Name");
		regisName.setBounds(50,25,100,30);
		regisPanel.add(regisName);

		JTextField regisNameText = new JTextField();
		regisNameText.setBounds(50,50,200,30);
		regisPanel.add(regisNameText);

		JLabel regisMidName = new JLabel("Middle Name");
		regisMidName.setBounds(50,75,100,30);
		regisPanel.add(regisMidName);

		JTextField regisMidNametext = new JTextField();
		regisMidNametext.setBounds(50,100,200,30);
		regisPanel.add(regisMidNametext);

		JLabel regisLastName = new JLabel("Last Name");
		regisLastName.setBounds(50,125,100,30);
		regisPanel.add(regisLastName);

		JTextField regisLastNameText = new JTextField();
		regisLastNameText.setBounds(50,150,200,30);
		regisPanel.add(regisLastNameText);

		JLabel regisUser = new JLabel("Username");
		regisUser.setBounds(50,175,100,30);
		regisPanel.add(regisUser);

		JTextField regisUserText = new JTextField();
		regisUserText.setBounds(50,200,200,30);
		regisPanel.add(regisUserText);

		JLabel regisPass = new JLabel("Password");
		regisPass.setBounds(50,225,100,30);
		regisPanel.add(regisPass);

		JPasswordField regisPassText = new JPasswordField();
		regisPassText.setBounds(50,250,200,30);
		regisPanel.add(regisPassText);

		JLabel addLabel = new JLabel("Address");
		addLabel.setBounds(500,25,200,30);
		regisPanel.add(addLabel);

		JTextField addText = new JTextField();
		addText.setBounds(500,50,200,30);
		regisPanel.add(addText);

		JLabel contactLabel = new JLabel("Contact No.");
		contactLabel.setBounds(500,75,100,30);
		regisPanel.add(contactLabel);

		JTextField contactText = new JTextField();
		contactText.setBounds(500,100,200,30);
		regisPanel.add(contactText);

		JLabel ageLabel = new JLabel("Age");
		ageLabel.setBounds(500,125,100,30);
		regisPanel.add(ageLabel);

		JTextField ageText = new JTextField();
		ageText.setBounds(500,150,200,30);
		regisPanel.add(ageText);

		JLabel birthLabel = new JLabel("Birthdate");
		birthLabel.setBounds(500,175,100,30);
		regisPanel.add(birthLabel);
		
		Choice month = new Choice();
		month.setBounds(500,210,75,30);
		month.add("January");
		month.add("February");
		month.add("March");
		month.add("April");
		month.add("May");
		month.add("June");
		month.add("July");
		month.add("August");
		month.add("September");
		month.add("October");
		month.add("November");
		month.add("December");
		regisPanel.add(month);

		Choice day = new Choice();
		day.setBounds(575,210,40,30);
		day.add("1");
		day.add("2");
		day.add("3");
		day.add("4");
		day.add("5");
		day.add("6");
		day.add("7");
		day.add("8");
		day.add("9");
		day.add("10");
		day.add("11");
		day.add("12");
		day.add("13");
		day.add("14");
		day.add("15");
		day.add("16");
		day.add("17");
		day.add("18");
		day.add("19");
		day.add("20");
		day.add("21");
		day.add("22");
		day.add("23");
		day.add("24");
		day.add("25");
		day.add("26");
		day.add("27");
		day.add("28");
		day.add("29");
		day.add("30");
		day.add("31");
		regisPanel.add(day);

		Choice year = new Choice();
		year.setBounds(615,210,55,30);
		year.add("1990");
		year.add("1991");
		year.add("1992");
		year.add("1993");
		year.add("1994");
		year.add("1995");
		year.add("1996");
		year.add("1997");
		year.add("1998");
		year.add("1999");
		year.add("2000");
		year.add("2001");
		year.add("2002");
		year.add("2003");
		year.add("2004");
		year.add("2005");
		year.add("2006");
		year.add("2007");
		year.add("2008");
		year.add("2009");
		year.add("2010");
		year.add("2011");
		year.add("2012");
		year.add("2013");
		year.add("2014");
		year.add("2015");
		year.add("2016");
		year.add("2017");
		year.add("2018");
		year.add("2019");
		year.add("2020");
		year.add("2021");
		year.add("2022");
		year.add("2023");
		year.add("2024");
		regisPanel.add(year);

		JLabel emailAddLabel = new JLabel("Email Address");
		emailAddLabel.setBounds(500,225,100,30);
		regisPanel.add(emailAddLabel);

		JTextField emailAddtext = new JTextField();
		emailAddtext.setBounds(500,250,200,30);
		regisPanel.add(emailAddtext);

		JButton registerButton = new JButton("Register");
		registerButton.setBounds(275,290,200,30);
		regisPanel.add(registerButton);


////////added actionListener for register

		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String name = regisNameText.getText().trim();
				String middlename = regisMidNametext.getText().trim();
				String lastname = regisLastNameText.getText().trim();
				String username = regisUserText.getText().trim();
				String password = regisPassText.getText().trim();
				String addreSs = addText.getText().trim();
				String contaCt = contactText.getText().trim();
				String aGe = ageText.getText().trim();
				String emailaDd = emailAddtext.getText().trim();

				String selectedMonth = month.getSelectedItem();
				String selectedDay = day.getSelectedItem();
				String selectedYear = year.getSelectedItem();

				String birthDate = selectedMonth + " " + selectedDay + ", " + selectedYear;

				Controller controller = new Controller();

				if(name.isEmpty() || middlename.isEmpty() || lastname.isEmpty() || username.isEmpty() || password.isEmpty() || addreSs.isEmpty() || contaCt.isEmpty() || aGe.isEmpty() || emailaDd.isEmpty()){
					
					JOptionPane.showMessageDialog(null, "Please fill the blanks", "Registration", JOptionPane.PLAIN_MESSAGE);

				}else{

					 if(!aGe.matches("\\d+") || !(contaCt.matches("\\d+"))){
						
						JOptionPane.showMessageDialog(null, "Age and Contact NO. should be a number", "Registration", JOptionPane.PLAIN_MESSAGE);
					 }else{
						  if(controller.isUsernameAlreadyExist(username)){

						     JOptionPane.showMessageDialog(null, "Username already exist", "Registration", JOptionPane.PLAIN_MESSAGE);

						    }else{

							     if(controller.isNameAlreadyExist(name, middlename, lastname)){

							         JOptionPane.showMessageDialog(null, "This person is already a member", "Registration", JOptionPane.PLAIN_MESSAGE);

							     }else{

								     controller.registerUser(name, middlename, lastname, username, password , addreSs, contaCt, aGe, birthDate, emailaDd);
								     JOptionPane.showMessageDialog(null, "Registered Successfully", "Registration", JOptionPane.PLAIN_MESSAGE);
							 	 }
							}
						}

					}
				}	
			
			});
/////
		JButton backButton = new JButton("Back");
		backButton.setBounds(275,330,200,30);
		regisPanel.add(backButton);

		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = regisFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

				LoginView loginBack = new LoginView();
				loginBack.loginView(regisFrame);
			}
		});

		
		regisFrame.add(regisPanel);

		regisPanel.setLayout(null);
		regisPanel.setVisible(true);

		regisFrame.setVisible(true);
	}
}