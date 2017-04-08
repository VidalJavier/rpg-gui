package A.Ultron;

import java.awt.*;
import javax.swing.*;

public class ScreenPanel extends JPanel
{
	public static JTextArea screen;
	
	public ScreenPanel()
	{
		screen = new JTextArea(10,50);
		screen.setEditable(false);
		screen.setText("Ultron is wreaking havoc on NYC." +"\nHe plans to eliminate all living species." + 
				"\nStop him before it is too late!" + "\nPress START to begin ...");
		
		//Adds panel
		this.add(screen);
	}

	public void setText(String string) 
	{
		screen.setText(string);	
	}
}
