package A.Ultron;

import javax.swing.*;

public class UltronTester 
{
	public static void main(String[]args)
	{
		//Creates Main Frame
		JFrame mainWindow = new JFrame("Ultron");
		mainWindow.setResizable(false);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creates Panels
		JPanel mainPanel = new JPanel();
		UltronPanel panel = new UltronPanel();
		
		//Adds panel to main panel
		mainPanel.add(panel);
		mainWindow.getContentPane().add(panel);
		
		//makes it visible
		mainWindow.pack();
		mainWindow.setVisible(true);
	}
}
