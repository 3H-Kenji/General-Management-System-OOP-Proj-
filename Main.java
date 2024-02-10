package cite.oop;

import javax.swing.*;

 class Main{
	public static void main(String args[]){

	JFrame frame = new JFrame();
		frame.setSize(900,500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		LoginView logicView = new LoginView();

		logicView.loginView(frame);

}
}
