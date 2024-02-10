package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AttendanceEmployeeCheck{

	private String username;

	 public AttendanceEmployeeCheck(String username) {
        this.username = username;
    }

	void managerAttendanceEmployeeCheck(JFrame employeeCheckFrame){
		JPanel attendancePanel = new JPanel();
		attendancePanel.setBounds(0,0,900,500);

		Color panelColor = new Color(23, 127, 117);
		attendancePanel.setBackground(panelColor);
		attendancePanel.setBounds(0,0,900,500);

		JLabel profTitle = new JLabel("EMPLOYEES ATTENDANCE");
		profTitle.setBounds(50,10,200,50);
		attendancePanel.add(profTitle);

		//WALA PA GI FINALIZE ANG TABLE SO UNYA NA INIG ABOT SA CONTROLLER
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
				Container frame = employeeCheckFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			AttendanceEmployeeList backToList = new AttendanceEmployeeList(username);
			backToList.managerAttendanceEmployeeList(employeeCheckFrame);
			}
		});

		employeeCheckFrame.add(attendancePanel);
		attendancePanel.setLayout(null);
		attendancePanel.setVisible(true);
		employeeCheckFrame.setVisible(true);
	}
	void adminAttendanceEmployeeCheck(JFrame employeeCheckFrame){
		JPanel attendancePanel = new JPanel();
		attendancePanel.setBounds(0,0,900,500);

		Color panelColor = new Color(23, 127, 117);
		attendancePanel.setBackground(panelColor);
		attendancePanel.setBounds(0,0,900,500);


		JLabel profTitle = new JLabel("EMPLOYEES ATTENDANCE");
		profTitle.setBounds(50,10,200,50);
		attendancePanel.add(profTitle);	

		//WALA PA GI FINALIZE ANG TABLE SO UNYA NA INIG ABOT SA CONTROLLER
		String data[][] = {{"Date", "Time In", "Time Out", "Signature"},
                			{"23/12/30", "8:00", "5:00", "pinakatay"},
                			{"-", "-", "-", "-"},
                			{"-", "-", "-", "-"}};

        String column[] = {"Date", "Time In", "Time Out", "Signature"};

		JTable attendanceTable = new JTable(data,column);
		attendanceTable.setBounds(50,50,800,400);
		attendancePanel.add(attendanceTable);

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(700,10,150,30);
		attendancePanel.add(backBtn);

		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = employeeCheckFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			AttendanceEmployeeList backToList = new AttendanceEmployeeList(username);
			backToList.adminAttendanceEmployeeList(employeeCheckFrame);
			}
		});

		employeeCheckFrame.add(attendancePanel);
		attendancePanel.setLayout(null);
		attendancePanel.setVisible(true);
		employeeCheckFrame.setVisible(true);
	}
}