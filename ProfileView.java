package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ProfileView {

	 Controller controlUI = new Controller();
	 private String username;

	 public ProfileView(String username) {
        this.username = username;
    }

	

	void employeeProfileView(JFrame profileFrame) {

		String userInfo = controlUI.getUserInfo(username);

		String[] userDetails = userInfo.split("\\^");

		String name = userDetails[0];
		String address = userDetails[1];
		String contact = userDetails[2];
		String age = userDetails[3];
		String birthdate = userDetails[4];
		String emailadd = userDetails[5];
		

		JPanel profilePanel = new JPanel();
		profilePanel.setBounds(0,0,900,500);

		Color panelColor = new Color( 9, 112, 84);
		profilePanel.setBackground(panelColor);
		profilePanel.setBounds(0,0,900,500);

		JLabel employeeLabel = new JLabel("EMPLOYEE'S PROFILE");
		employeeLabel.setBounds(50,50,200,50);
		profilePanel.add(employeeLabel);

		JLabel employeeName = new JLabel("Employee Name: " + name);
		employeeName.setBounds(100,100,480,30);
		profilePanel.add(employeeName);

		JLabel employeeAdd = new JLabel("Address: " + address);
		employeeAdd.setBounds(100,130,480,30);
		profilePanel.add(employeeAdd);

		JLabel employeeAge = new JLabel("Age: " + age);
		employeeAge.setBounds(100,160,480,30);
		profilePanel.add(employeeAge);

		JLabel employeeBirth = new JLabel("Birthdate: " + birthdate);
		employeeBirth.setBounds(100,190,480,30);
		profilePanel.add(employeeBirth);

		JLabel employeeContact = new JLabel("Contact Info.: " + contact);
		employeeContact.setBounds(100,220,480,30);
		profilePanel.add(employeeContact);

		JLabel employeeEmail = new JLabel("Email Address: " + emailadd);
		employeeEmail.setBounds(100,250,480,30);
		profilePanel.add(employeeEmail);

		JButton attendanceBtn = new JButton("Attendance");
		attendanceBtn.setBounds(700,50,100,30);
		profilePanel.add(attendanceBtn);

		JButton salaryBtn = new JButton("Salary");
		salaryBtn.setBounds(700,100,100,30);
		profilePanel.add(salaryBtn);

		JButton taskBtn = new JButton("Task");
		taskBtn.setBounds(700,150,100,30);
		profilePanel.add(taskBtn);

		JButton newsPromoteBtn = new JButton("News!");
		newsPromoteBtn.setBounds(10,400,150,30);
		profilePanel.add(newsPromoteBtn);

		taskBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Container frame = profileFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

				TaskView taskInfoView = new TaskView(username);
				taskInfoView.taskView(profileFrame);

			}
		});

		salaryBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Container frame = profileFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

				SalaryView salView = new SalaryView(username);
				salView.employeeSalaryView(profileFrame);
			}
		});

		attendanceBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = profileFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

			AttendanceView attendView = new AttendanceView(username);
			attendView.employeeAttendanceView(profileFrame);
			}
		});

		newsPromoteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(profileFrame,"Congratulations for being promoted to Manager, keep up the good work!");

				Container frame = profileFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

			ProfileView promoteToManagerView = new ProfileView(username);
			promoteToManagerView.managerProfileView(profileFrame);
			}
		});

		JButton logoutBtn = new JButton("Logout");
		logoutBtn.setBounds(10,20,150,30);
		profilePanel.add(logoutBtn);

		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = profileFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

			LoginView loginBack = new LoginView();
			loginBack.loginView(profileFrame);
			}
		});

		profileFrame.add(profilePanel);
		profilePanel.setLayout(null);
		profilePanel.setVisible(true);
		profileFrame.setVisible(true);
	}

	void managerProfileView(JFrame managerProfileFrame) {

		String userInfo = controlUI.getUserInfo(username);

		String[] userDetails = userInfo.split("\\^");

		String name = userDetails[0];
		String address = userDetails[1];
		String contact = userDetails[2];
		String age = userDetails[3];
		String birthdate = userDetails[4];
		String emailadd = userDetails[5];

		JPanel profilePanel = new JPanel();
		profilePanel.setBounds(0,0,900,500);

		Color panelColor = new Color( 9, 112, 84);
		profilePanel.setBackground(panelColor);
		profilePanel.setBounds(0,0,900,500);

		JLabel managerLabel = new JLabel("MANAGER'S PROFILE");
		managerLabel.setBounds(50,50,200,50);
		profilePanel.add(managerLabel);

		JLabel managerName = new JLabel("Manager Name: " + name );
		managerName.setBounds(100,100,480,30);
		profilePanel.add(managerName);

		JLabel managerAdd = new JLabel("Address: " + address);
		managerAdd.setBounds(100,130,480,30);
		profilePanel.add(managerAdd);

		JLabel managerAge = new JLabel("Age: " + age);
		managerAge.setBounds(100,160,480,30);
		profilePanel.add(managerAge);

		JLabel managerBirth = new JLabel("Birthdate: " + birthdate);
		managerBirth.setBounds(100,190,480,30);
		profilePanel.add(managerBirth);

		JLabel managerContact = new JLabel("Contact Info.: " + contact);
		managerContact.setBounds(100,220,480,30);
		profilePanel.add(managerContact);

		JLabel managerEmail = new JLabel("Email Address: " + emailadd);
		managerEmail.setBounds(100,250,480,30);
		profilePanel.add(managerEmail);

		JButton managerAttendanceBtn = new JButton("Attendance");
		managerAttendanceBtn.setBounds(700,50,100,30);
		profilePanel.add(managerAttendanceBtn);

		JButton managerSalaryBtn = new JButton("Salary");
		managerSalaryBtn.setBounds(700,100,100,30);
		profilePanel.add(managerSalaryBtn);

		JButton managerTaskBtn = new JButton("Task");
		managerTaskBtn.setBounds(700,150,100,30);
		profilePanel.add(managerTaskBtn);

		JButton newsDemoteBtn = new JButton("News!");
		newsDemoteBtn.setBounds(10,400,150,30);
		profilePanel.add(newsDemoteBtn);

		managerTaskBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Container frame = managerProfileFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

				TaskOptionsView taskInfoView = new TaskOptionsView(username);
				taskInfoView.managerTaskOptionsView(managerProfileFrame);

			}
		});

		managerSalaryBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Container frame = managerProfileFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

				SalaryView salView = new SalaryView(username);
				salView.managerSalaryView(managerProfileFrame);
			}
		});

		managerAttendanceBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = managerProfileFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

			AttendanceView attendView = new AttendanceView(username);
			attendView.managerAttendanceView(managerProfileFrame);
			}
		});

		newsDemoteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(managerProfileFrame,"You have been Demoted for having bad performance in the company, better luck next time");

				Container frame = managerProfileFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

			ProfileView demoteToEmployeeView = new ProfileView(username);
			demoteToEmployeeView.employeeProfileView(managerProfileFrame);
			}
		});


		JButton logoutBtn = new JButton("Logout");
		logoutBtn.setBounds(10,20,150,30);
		profilePanel.add(logoutBtn);

		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = managerProfileFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

			LoginView loginBack = new LoginView();
			loginBack.loginView(managerProfileFrame);
			}
		});

		managerProfileFrame.add(profilePanel);
		profilePanel.setLayout(null);
		profilePanel.setVisible(true);
		managerProfileFrame.setVisible(true);

	}

	
	void adminProfileView(JFrame adminProfileFrame) {

		String userInfo = controlUI.getUserInfo(username);

		String[] userDetails = userInfo.split("\\^");

		String name = userDetails[0];
		String address = userDetails[1];
		String contact = userDetails[2];
		String age = userDetails[3];
		String birthdate = userDetails[4];
		String emailadd = userDetails[5];

		JPanel profilePanel = new JPanel();
		profilePanel.setBounds(0,0,900,500);

		Color panelColor = new Color( 9, 112, 84);
		profilePanel.setBackground(panelColor);
		profilePanel.setBounds(0,0,900,500);

		JLabel adminLabel = new JLabel("ADMIN'S PROFILE");
		adminLabel.setBounds(50,50,200,50);
		profilePanel.add(adminLabel);

		JLabel adminName = new JLabel("Admin Name: " + name);
		adminName.setBounds(100,100,480,30);
		profilePanel.add(adminName);

		JLabel adminAdd = new JLabel("Address: " + address);
		adminAdd.setBounds(100,130,480,30);
		profilePanel.add(adminAdd);

		JLabel adminAge = new JLabel("Age: " + age);
		adminAge.setBounds(100,160,480,30);
		profilePanel.add(adminAge);

		JLabel adminBirth = new JLabel("Birthdate: " + birthdate);
		adminBirth.setBounds(100,190,480,30);
		profilePanel.add(adminBirth);

		JLabel adminContact = new JLabel("Contact Info.: " + contact);
		adminContact.setBounds(100,220,480,30);
		profilePanel.add(adminContact);

		JLabel adminEmail = new JLabel("Email Address: " + emailadd);
		adminEmail.setBounds(100,250,480,30);
		profilePanel.add(adminEmail);

		JButton adminAttendanceBtn = new JButton("Attendance");
		adminAttendanceBtn.setBounds(700,50,100,30);
		profilePanel.add(adminAttendanceBtn);

		JButton adminSalaryBtn = new JButton("Salary");
		adminSalaryBtn.setBounds(700,100,100,30);
		profilePanel.add(adminSalaryBtn);

		JButton adminTaskBtn = new JButton("Task");
		adminTaskBtn.setBounds(700,150,100,30);
		profilePanel.add(adminTaskBtn);

		JButton adminPromoteBtn = new JButton("Promote/Demote");
		adminPromoteBtn.setBounds(10,400,150,30);
		profilePanel.add(adminPromoteBtn);

		adminTaskBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Container frame = adminProfileFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

				TaskOptionsView taskInfoView = new TaskOptionsView(username);
				taskInfoView.adminTaskOptionsView(adminProfileFrame);

			}
		});

		adminSalaryBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Container frame = adminProfileFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

			SalaryOptionsView salView = new SalaryOptionsView(username);
			salView.salaryOptionsView(adminProfileFrame);
			}
		});

		adminAttendanceBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = adminProfileFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

			AttendanceView attendView = new AttendanceView(username);
			attendView.adminAttendanceView(adminProfileFrame);
			}
		});

		adminPromoteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = adminProfileFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

			PromoteOptionsView promoteView = new PromoteOptionsView(username);
			promoteView.promoteOptionsView(adminProfileFrame);
			}
		});

		JButton logoutBtn = new JButton("Logout");
		logoutBtn.setBounds(10,20,150,30);
		profilePanel.add(logoutBtn);

		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = adminProfileFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

			LoginView loginBack = new LoginView();
			loginBack.loginView(adminProfileFrame);
			}
		});

		adminProfileFrame.add(profilePanel);
		profilePanel.setLayout(null);
		profilePanel.setVisible(true);
		adminProfileFrame.setVisible(true);
	}
}