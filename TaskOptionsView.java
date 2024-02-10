package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TaskOptionsView{

	private String username;

	public TaskOptionsView(String username) {
        this.username = username;
    }

	void managerTaskOptionsView(JFrame managerChoicesFrame){
		JPanel managerPanel = new JPanel();
		managerPanel.setBounds(0,0,900,500);

		Color panelColor = new Color(74, 123, 111);
		managerPanel.setBackground(panelColor);
		managerPanel.setBounds(0,0,900,500);

		JButton managerOptionTask = new JButton("Manager Task");
		managerOptionTask.setBounds(300,150,300,50);
		managerPanel.add(managerOptionTask);

		managerOptionTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = managerChoicesFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			TaskManagerView viewManagerTask = new TaskManagerView(username);
			viewManagerTask.taskManagerView(managerChoicesFrame);
			}
		});

		JButton employeeOptionTask = new JButton("Employee Task");
		employeeOptionTask.setBounds(300,300,300,50);
		managerPanel.add(employeeOptionTask);

		employeeOptionTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = managerChoicesFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			TaskEmployeeList emploTaskView = new TaskEmployeeList(username);
			emploTaskView.managerTaskEmployeeList(managerChoicesFrame);
			}
		});

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(700,10,150,30);
		managerPanel.add(backBtn);
				
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = managerChoicesFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			ProfileView backToProf = new ProfileView(username);
			backToProf.managerProfileView(managerChoicesFrame);
			}
		});

		managerChoicesFrame.add(managerPanel);
		managerPanel.setLayout(null);
		managerPanel.setVisible(true);
		managerChoicesFrame.setVisible(true);
	}
	void adminTaskOptionsView(JFrame adminTaskChoicesFrame){
		JPanel taskOptionPanel = new JPanel();
		taskOptionPanel.setBounds(0,0,900,500);

		Color panelColor = new Color(74, 123, 111);
		taskOptionPanel.setBackground(panelColor);
		taskOptionPanel.setBounds(0,0,900,500);

		JButton managerOptionTask = new JButton("Assign Task to Manager");
		managerOptionTask.setBounds(300,150,300,50);
		taskOptionPanel.add(managerOptionTask);		

		JButton employeeOptionTask = new JButton("Assign Task to Employee");
		employeeOptionTask.setBounds(300,300,300,50);
		taskOptionPanel.add(employeeOptionTask);

		managerOptionTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = adminTaskChoicesFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			TaskManagerList viewManagerList = new TaskManagerList(username);
			viewManagerList.taskManagerList(adminTaskChoicesFrame);
			}
		});

		employeeOptionTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = adminTaskChoicesFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			TaskEmployeeList emploTaskView = new TaskEmployeeList(username);
			emploTaskView.adminTaskEmployeeList(adminTaskChoicesFrame);
			}
		});

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(700,10,150,30);
		taskOptionPanel.add(backBtn);
				
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = adminTaskChoicesFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			ProfileView backToProf = new ProfileView(username);
			backToProf.adminProfileView(adminTaskChoicesFrame);
			}
		});

		adminTaskChoicesFrame.add(taskOptionPanel);
		taskOptionPanel.setLayout(null);
		taskOptionPanel.setVisible(true);
		adminTaskChoicesFrame.setVisible(true);
	}
}