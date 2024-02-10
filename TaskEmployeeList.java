package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TaskEmployeeList{

	private String username;

	public TaskEmployeeList(String username) {
        this.username = username;
    }

	void managerTaskEmployeeList(JFrame taskEmployeeListFrame){
		JPanel taskEmployeeListPanel = new JPanel();
		taskEmployeeListPanel.setBounds(0,0,900,500);

		Color panelColor = new Color(74, 123, 111);
		taskEmployeeListPanel.setBackground(panelColor);
		taskEmployeeListPanel.setBounds(0,0,900,500);

		//WALA PA GI FINALIZE ANG TABLE SO UNYA NA INIG ABOT SA CONTROLLER

		Controller controller = new Controller();
		Object data[][] = controller.getMemberList();
        Object column[] = {"Name", "Age", "Address", "Contact info", "Email Address"};
        
		JTable employeeTable = new JTable(data, column);

		JScrollPane scrollPane = new JScrollPane(employeeTable);
		scrollPane.setBounds(50, 50, 800, 350);
		taskEmployeeListPanel.add(scrollPane);
		

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(10,420,150,30);
		taskEmployeeListPanel.add(backBtn);

		JButton checkTask = new JButton("Check Task");
		checkTask.setBounds(700,420,150,30);
		taskEmployeeListPanel.add(checkTask);

		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = taskEmployeeListFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			AttendanceView backToManagerAtt = new AttendanceView(username);
			backToManagerAtt.managerAttendanceView(taskEmployeeListFrame);
			}
		});

		checkTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = taskEmployeeListFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			TaskEmployeeView viewTask = new TaskEmployeeView(username);
			viewTask.taskEmployeeView(taskEmployeeListFrame);
			}
		});

		taskEmployeeListFrame.add(taskEmployeeListPanel);
		taskEmployeeListPanel.setLayout(null);
		taskEmployeeListPanel.setVisible(true);
		taskEmployeeListFrame.setVisible(true);
	}
	void adminTaskEmployeeList(JFrame taskEmployeeListFrame){
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

		JButton assignTask = new JButton("Assign Task");
		assignTask.setBounds(700,420,150,30);
		employeeListPanel.add(assignTask);

		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = taskEmployeeListFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			TaskOptionsView backToTaskOptions = new TaskOptionsView(username);
			backToTaskOptions.adminTaskOptionsView(taskEmployeeListFrame);
			}
		});

		assignTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = taskEmployeeListFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			TaskAssignEmployee assignEmployee = new TaskAssignEmployee(username);
			assignEmployee.taskAssignEmployee(taskEmployeeListFrame);
			}
		});

		taskEmployeeListFrame.add(employeeListPanel);
		employeeListPanel.setLayout(null);
		employeeListPanel.setVisible(true);
		taskEmployeeListFrame.setVisible(true);
	}
}