package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AttendanceManagerCheck{

	private String username;

	 public AttendanceManagerCheck(String username) {
        this.username = username;
    }

	void attendanceManagerCheck(JFrame managerCheckFrame){
		JPanel attendancePanel = new JPanel();
		attendancePanel.setBounds(0,0,900,500);

		Color panelColor = new Color(23, 127, 117);
		attendancePanel.setBackground(panelColor);
		attendancePanel.setBounds(0,0,900,500);

		JLabel profTitle = new JLabel("MANAGERS ATTENDANCE");
		profTitle.setBounds(50,50,200,50);
		attendancePanel.add(profTitle);

		//WALA PA GI FINALIZE ANG TABLE SO UNYA NA INIG ABOT SA CONTROLLER
		String data[][] = {{"Date", "Time In", "Time Out", "Signature"},
                			{"23/12/30", "8:00", "5:00", "pinakatay"},
                			{"-", "-", "-", "-"},
                			{"-", "-", "-", "-"}};

        String column[] = {"Date", "Time In", "Time Out", "Signature"};

		JTable attendanceTable = new JTable(data,column);
		attendanceTable.setBounds(50,100,800,400);
		attendancePanel.add(attendanceTable);

		JButton managerAttendanceList = new JButton("Employee's List");
		managerAttendanceList.setBounds(700,10,150,30);
		attendancePanel.add(managerAttendanceList);

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(50,10,150,30);
		attendancePanel.add(backBtn);

		managerAttendanceList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = managerCheckFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			AttendanceEmployeeList backToList = new AttendanceEmployeeList(username);
			backToList.adminAttendanceEmployeeList(managerCheckFrame);
			}
		});

		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = managerCheckFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			AttendanceManagerList backToList = new AttendanceManagerList(username);
			backToList.attendanceManagerList(managerCheckFrame);
			}
		});

		managerCheckFrame.add(attendancePanel);
		attendancePanel.setLayout(null);
		attendancePanel.setVisible(true);
		managerCheckFrame.setVisible(true);
	}
}