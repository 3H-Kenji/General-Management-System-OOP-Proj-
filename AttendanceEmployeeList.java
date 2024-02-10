package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AttendanceEmployeeList{

	private String username;

	 public AttendanceEmployeeList(String username) {
        this.username = username;
    }

	void managerAttendanceEmployeeList(JFrame attendaceEmployeeListFrame){
		JPanel employeeListPanel = new JPanel();
		employeeListPanel.setBounds(0,0,900,500);

		Color panelColor = new Color(74, 123, 111);
		employeeListPanel.setBackground(panelColor);
		employeeListPanel.setBounds(0,0,900,500);

		//WALA PA GI FINALIZE ANG TABLE SO UNYA NA INIG ABOT SA CONTROLLER
		JLabel employeeListLabel = new JLabel("EMPLOYEE LIST");
		employeeListLabel.setBounds(50,10,100,30);
		employeeListPanel.add(employeeListLabel);


		

		Controller controller = new Controller();
		Object data[][] = controller.getMemberList();
        Object column[] = {"Name", "Age", "Address", "Contact info", "Email Address"};
        
		JTable employeeTable = new JTable(data, column);

		JScrollPane scrollPane = new JScrollPane(employeeTable);
		scrollPane.setBounds(50, 50, 800, 350);
		employeeListPanel.add(scrollPane);

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(10,420,150,30);
		employeeListPanel.add(backBtn);

		JButton checkAttendance = new JButton("Check Attendance");
		checkAttendance.setBounds(700,420,150,30);
		employeeListPanel.add(checkAttendance);

		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = attendaceEmployeeListFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			AttendanceView backToManagerAtt = new AttendanceView(username);
			backToManagerAtt.managerAttendanceView(attendaceEmployeeListFrame);
			}
		});

		checkAttendance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = attendaceEmployeeListFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			AttendanceEmployeeCheck viewAttendance = new AttendanceEmployeeCheck(username);
			viewAttendance.managerAttendanceEmployeeCheck(attendaceEmployeeListFrame);
			}
		});

		attendaceEmployeeListFrame.add(employeeListPanel);
		employeeListPanel.setLayout(null);
		employeeListPanel.setVisible(true);
		attendaceEmployeeListFrame.setVisible(true);
	}

	void adminAttendanceEmployeeList(JFrame attendaceEmployeeListFrame){
		JPanel employeeListPanel = new JPanel();
		employeeListPanel.setBounds(0,0,900,500);

		Color panelColor = new Color(74, 123, 111);
		employeeListPanel.setBackground(panelColor);
		employeeListPanel.setBounds(0,0,900,500);

		JLabel employeeListLabel = new JLabel("EMPLOYEE LIST");
		employeeListLabel.setBounds(50,10,100,30);
		employeeListPanel.add(employeeListLabel);


		//WALA PA GI FINALIZE ANG TABLE SO UNYA NA INIG ABOT SA CONTROLLER

		Controller controller = new Controller();
		Object data[][] = controller.getMemberList();
        Object column[] = {"Name", "Age", "Address", "Contact info", "Email Address"};

		JTable employeeTable = new JTable(data, column);

		JScrollPane scrollPane = new JScrollPane(employeeTable); 
		scrollPane.setBounds(50, 50, 800, 350);
		employeeListPanel.add(scrollPane);

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(10,420,150,30);
		employeeListPanel.add(backBtn);

		JButton checkAttendance = new JButton("Check Attendance");
		checkAttendance.setBounds(700,420,150,30);
		employeeListPanel.add(checkAttendance);

		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = attendaceEmployeeListFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			AttendanceManagerCheck backToManagerAtt = new AttendanceManagerCheck(username);
			backToManagerAtt.attendanceManagerCheck(attendaceEmployeeListFrame);
			}
		});

		checkAttendance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = attendaceEmployeeListFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			AttendanceEmployeeCheck viewAttendance = new AttendanceEmployeeCheck(username);
			viewAttendance.adminAttendanceEmployeeCheck(attendaceEmployeeListFrame);
			}
		});

		attendaceEmployeeListFrame.add(employeeListPanel);
		employeeListPanel.setLayout(null);
		employeeListPanel.setVisible(true);
		attendaceEmployeeListFrame.setVisible(true);
	}
}