package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AttendanceView {

	private String username;

	 public AttendanceView(String username) {
        this.username = username;
    }

	void employeeAttendanceView(JFrame attendanceFrame) {
		JPanel attendancePanel = new JPanel();
		attendancePanel.setBounds(0,0,900,500);

		Color panelColor = new Color(23, 127, 117);
		attendancePanel.setBackground(panelColor);
		attendancePanel.setBounds(0,0,900,500);

		JLabel profTitle = new JLabel("EMPLOYEES ATTENDANCE");
		profTitle.setBounds(50,10,200,50);
		attendancePanel.add(profTitle);

		String data[][] = {{"Date", "Time In", "Time Out", "Signature"},
                			{"23/12/30", "8:00", "5:00", "pinakatay"},
                			{"0", "0", "0", "0"},
                			{"0", "0", "0", "0"}};

        String column[] = {"Date", "Time In", "Time Out", "Signature"};

		JTable attendanceTable = new JTable(data,column);
		attendanceTable.setBounds(50,50,800,350);
		attendancePanel.add(attendanceTable);

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(700,10,150,30);
		attendancePanel.add(backBtn);

		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = attendanceFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			ProfileView backToProf = new ProfileView(username);
			backToProf.employeeProfileView(attendanceFrame);
			}
		});

		attendanceFrame.add(attendancePanel);
		attendancePanel.setLayout(null);
		attendancePanel.setVisible(true);
		attendanceFrame.setVisible(true);
	}
	void managerAttendanceView(JFrame managerAttendanceFrame) {
		JPanel managerAttendancePanel = new JPanel();
		managerAttendancePanel.setBounds(0,0,900,500);

		Color panelColor = new Color(23, 127, 117);
		managerAttendancePanel.setBackground(panelColor);
		managerAttendancePanel.setBounds(0,0,900,500);


		JLabel profTitle = new JLabel("MANAGERS ATTENDANCE");
		profTitle.setBounds(50,50,200,50);
		managerAttendancePanel.add(profTitle);


		//WALA PA GI FINALIZE ANG TABLE SO UNYA NA INIG ABOT SA CONTROLLER
		String data[][] = {{"Date", "Time In", "Time Out", "Signature"},
                			{"23/12/30", "8:00", "5:00", "pinakatay"},
                			{"-", "-", "-", "-"},
                			{"-", "-", "-", "-"}};

        String column[] = {"Date", "Time In", "Time Out", "Signature"};

		JTable attendanceTable = new JTable(data,column);
		attendanceTable.setBounds(50,100,800,350);
		managerAttendancePanel.add(attendanceTable);

		JButton emploAttendanceList = new JButton("Employee's List");
		emploAttendanceList.setBounds(700,10,150,30);
		managerAttendancePanel.add(emploAttendanceList);

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(50,10,150,30);
		managerAttendancePanel.add(backBtn);

		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = managerAttendanceFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			ProfileView backToProf = new ProfileView(username);
			backToProf.managerProfileView(managerAttendanceFrame);
			}
		});

		emploAttendanceList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = managerAttendanceFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			AttendanceEmployeeList listView = new AttendanceEmployeeList(username);
			listView.managerAttendanceEmployeeList(managerAttendanceFrame);
			}
		});

		managerAttendanceFrame.add(managerAttendancePanel);
		managerAttendancePanel.setLayout(null);
		managerAttendancePanel.setVisible(true);
		managerAttendanceFrame.setVisible(true);
	}
	void adminAttendanceView(JFrame adminAttendanceFrame) {
		JPanel adminAttendancePanel = new JPanel();
		adminAttendancePanel.setBounds(0,0,900,500);

		Color panelColor = new Color(23, 127, 117);
		adminAttendancePanel.setBackground(panelColor);
		adminAttendancePanel.setBounds(0,0,900,500);

		JLabel profTitle = new JLabel("ADMINS ATTENDANCE");
		profTitle.setBounds(50,50,200,50);
		adminAttendancePanel.add(profTitle);


		//WALA PA GI FINALIZE ANG TABLE SO UNYA NA INIG ABOT SA CONTROLLER

		String data[][] = {{"Date", "Time In", "Time Out", "Signature"},
                			{"23/12/30", "8:00", "5:00", "pinakatay"},
                			{"-", "-", "-", "-"},
                			{"-", "-", "-", "-"}};

        String column[] = {"Date", "Time In", "Time Out", "Signature"};


		JTable attendanceTable = new JTable(data,column);
		attendanceTable.setBounds(50,100,800,350);
		adminAttendancePanel.add(attendanceTable);

		JButton managerAttendanceList = new JButton("Managers's List");
		managerAttendanceList.setBounds(700,10,150,30);
		adminAttendancePanel.add(managerAttendanceList);

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(50,10,150,30);
		adminAttendancePanel.add(backBtn);

		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = adminAttendanceFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			ProfileView backToProf = new ProfileView(username);
			backToProf.adminProfileView(adminAttendanceFrame);
			}
		});

		managerAttendanceList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = adminAttendanceFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			AttendanceManagerList listView = new AttendanceManagerList(username);
			listView.attendanceManagerList(adminAttendanceFrame);
			}
		});

		adminAttendanceFrame.add(adminAttendancePanel);
		adminAttendancePanel.setLayout(null);
		adminAttendancePanel.setVisible(true);
		adminAttendanceFrame.setVisible(true);
	}
}