package A.Ultron;

import java.awt.*;
import javax.swing.*;

public class UltronPanel extends JPanel
{
	private AvengersPanel avengers;
	private ScreenPanel screen;
	
	public UltronPanel()
	{
		setLayout(new GridLayout(2,2));
		
		screen = new ScreenPanel();
		avengers = new AvengersPanel();
		
		this.add(screen);
		this.add(avengers);
	}
}
