package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TaskAssignManager{

	private String username;

	public TaskAssignManager(String username) {
        this.username = username;
    }

	void taskAssignManager(JFrame taskManagerAssignFrame){
		JPanel assignManagerPanel = new JPanel();
		assignManagerPanel.setBounds(0,0,900,500);

		Color panelColor = new Color(23, 127, 117);
		assignManagerPanel.setBackground(panelColor);
		assignManagerPanel.setBounds(0,0,900,500);


		JLabel managerName = new JLabel("Set Task for Manager");
		managerName.setBounds(50,50,150,30);
		assignManagerPanel.add(managerName);

		JLabel listOfTask = new JLabel("List of Task");
		listOfTask.setBounds(50,70,150,30);
		assignManagerPanel.add(listOfTask);

		//ANG STYLE DIRI IS I CHECK ANG BOX IF TAGAAN SYAG TASK
		JCheckBox task1 = new JCheckBox("Sample Task 1");
		task1.setBounds(50,100,150,30);
		assignManagerPanel.add(task1);

		JCheckBox task2 = new JCheckBox("Sample Task 2");
		task2.setBounds(50,120,150,30);
		assignManagerPanel.add(task2);

		JCheckBox task3 = new JCheckBox("Sample Task 3");
		task3.setBounds(50,140,150,30);
		assignManagerPanel.add(task3);

		JCheckBox task4 = new JCheckBox("Sample Task 4");
		task4.setBounds(50,160,150,30);
		assignManagerPanel.add(task4);

		JCheckBox task5 = new JCheckBox("Sample Task 5");
		task5.setBounds(50,180,150,30);
		assignManagerPanel.add(task5);

		JCheckBox task6 = new JCheckBox("Sample Task 6");
		task6.setBounds(50,200,150,30);
		assignManagerPanel.add(task6);

		JCheckBox task7 = new JCheckBox("Sample Task 7");
		task7.setBounds(50,220,150,30);
		assignManagerPanel.add(task7);

		JCheckBox task8 = new JCheckBox("Sample Task 8");
		task8.setBounds(50,240,150,30);
		assignManagerPanel.add(task8);

		JLabel taskDueDate = new JLabel("Task Due Date");
		taskDueDate.setBounds(200,100,100,30);
		assignManagerPanel.add(taskDueDate);

		JTextField taskDueDateText = new JTextField("Yr/Month/Day");
		taskDueDateText.setBounds(200,120,120,30);
		assignManagerPanel.add(taskDueDateText);

		Choice dayOrNight = new Choice();
		dayOrNight.setBounds(320,120,40,30);
		dayOrNight.add("AM");
		dayOrNight.add("PM");
		assignManagerPanel.add(dayOrNight);

		Choice specificTime = new Choice();
		specificTime.setBounds(360,120,40,30);
		specificTime.add("1");
		specificTime.add("2");
		specificTime.add("3");
		specificTime.add("4");
		specificTime.add("5");
		specificTime.add("6");
		specificTime.add("7");
		specificTime.add("8");
		specificTime.add("9");
		specificTime.add("10");
		specificTime.add("11");
		specificTime.add("12");
		assignManagerPanel.add(specificTime);

		//HIMOAN PANING MO POP UP ARI
		JButton saveTask = new JButton("Save Assignment");
		saveTask.setBounds(700,420,150,30);
		assignManagerPanel.add(saveTask);

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(10,420,150,30);
		assignManagerPanel.add(backBtn);

		saveTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(taskManagerAssignFrame,"Assignment has been given");
			}
		});

		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = taskManagerAssignFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			TaskManagerList backToTaskOptions = new TaskManagerList(username);
			backToTaskOptions.taskManagerList(taskManagerAssignFrame);
			}
		});

		taskManagerAssignFrame.add(assignManagerPanel);
		assignManagerPanel.setLayout(null);
		assignManagerPanel.setVisible(true);
		taskManagerAssignFrame.setVisible(true);
	}
} 