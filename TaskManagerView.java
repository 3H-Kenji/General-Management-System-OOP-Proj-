package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TaskManagerView{

	private String username;

	public TaskManagerView(String username) {
        this.username = username;
    }

	void taskManagerView(JFrame taskManagerFrame){
		JPanel managerTaskPanel = new JPanel();
		managerTaskPanel.setBounds(0,0,900,500);

		Color panelColor = new Color(23, 127, 117);
		managerTaskPanel.setBackground(panelColor);
		managerTaskPanel.setBounds(0,0,900,500);


		JLabel managerTask = new JLabel("Manager's Task");
		managerTask.setBounds(50,10,200,30);
		managerTaskPanel.add(managerTask);

		//EXAMPLE RANING TABLE ARI REPRESENTATION RANIS UNSAY NAWNG WALA PANI NA FINALIZE
		String data[][] = {{"Date Received", "Task Name", "Due Date"},
                			{"23/12/28", "Embalsamador", "Next week"},
                			{"0", "0", "0"},
                			{"0", "0", "0"}};

        String column[] = {"Date Received", "Task Name", "Due Date"};

		JTable managerTaskTable = new JTable(data,column);
		managerTaskTable.setBounds(50,50,800,350);
		managerTaskPanel.add(managerTaskTable);
		
	/*	*enable scrolling when the table contains a 
			large number of rows or columns.

		JScrollPane sp = new JScrollPane(managerTaskTable);
		managerTaskPanel.add(sp)
	*/	

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(700,10,150,30);
		managerTaskPanel.add(backBtn);

		backBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Container frame = taskManagerFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

			TaskOptionsView backToOptions = new TaskOptionsView(username);
			backToOptions.managerTaskOptionsView(taskManagerFrame);
			}
		});

		taskManagerFrame.add(managerTaskPanel);
		managerTaskPanel.setLayout(null);
		managerTaskPanel.setVisible(true);
		taskManagerFrame.setVisible(true);
	}
}