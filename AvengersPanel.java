package A.Ultron;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AvengersPanel extends JPanel implements ActionListener, Avengers 
{
	private int hero;
	private boolean status = false;
	private int health = START_HEALTH;
	private int special_attack = START_SPECIAL;
	private int ultron_health = ULTRON_START_HEALTH;
	private JButton start;
	private JButton restart;
	private JButton attack;
	private JButton defend;
	private JButton special;

	public AvengersPanel() 
	{
		// Creates buttons
		start = new JButton();
		restart = new JButton();
		attack = new JButton();
		attack.setPreferredSize(new Dimension(150, 150));
		defend = new JButton();
		defend.setPreferredSize(new Dimension(150, 150));
		special = new JButton();
		special.setPreferredSize(new Dimension(150, 150));

		// Sets buttons
		start.setText("START");
		restart.setText("RESTART");
		attack.setText("Attack");
		defend.setText("Defend");
		special.setText("Special");

		// Makes buttons work
		start.addActionListener(this);
		restart.addActionListener(this);
		attack.addActionListener(this);
		defend.addActionListener(this);
		special.addActionListener(this);

		// Adds
		this.add(start);
		this.add(restart);
		this.add(attack);
		this.add(defend);
		this.add(special);

	}

	public void selectHero() 
	{
		status = true;
		ScreenPanel.screen.setText("");
		Random generator = new Random();
		hero = generator.nextInt(4);
		ScreenPanel.screen.setText("Hero: " + HERO[hero] + "\nWeapon: " + WEAPON[hero] + "\nDescription: "
				+ DESCRIPTION[hero] + "\n\nChoose your next move ...");
	}

	public void restart() 
	{
		status = false;
		health = START_HEALTH;
		special_attack = START_SPECIAL;
		ultron_health = ULTRON_START_HEALTH;
	}

	public void attack() 
	{
		Random generator = new Random();
		int ultron_hit = generator.nextInt(11) + 5;
		int user_attack = generator.nextInt(11);
		health -= ultron_hit;
		ultron_health -= user_attack;
		if (health > 0 && ultron_health > 0)
			ScreenPanel.screen.setText("You attack the enemy..." + "\n\nYou took " + ultron_hit + " damage!"
					+ "\nYou dealt Ultron " + user_attack + " damage!" + "\n\nYour Health: " + getHealth()
					+ "\nUltron Health: " + getUltronHealth() + "\nSpecial: " + getSpecial());
		else if (health <= 0 && ultron_health > 0)
			ScreenPanel.screen.setText(
					"You attack the enemy..." + "\n\nYou took " + ultron_hit + " damage!" + "\nYou dealt Ultron "
							+ user_attack + " damage!" + "\n\nYour Health: 0" + "\nUltron Health: " + getUltronHealth()
							+ "\nSpecial: " + getSpecial() + "\n\nYou died and with you ... so does humanity.");
		else if (health > 0 && ultron_health <= 0)
			ScreenPanel.screen.setText("You attack the enemy..." + "\n\nYou took " + ultron_hit + " damage!"
					+ "\nYou dealt Ultron " + user_attack + " damage!" + "\n\nYour Health: " + getHealth()
					+ "\nUltron Health: 0" + "\nSpecial: " + getSpecial()
					+ "\n\nCongrats you saved the world...do you want a cookie?");
	}

	public void superAttack() 
	{
		Random generator = new Random();
		special_attack -= 2;
		int ultron_hit = generator.nextInt(21) + 5;
		int user_attack = generator.nextInt(21) + 5;
		health -= ultron_hit;
		ultron_health -= user_attack;
		if (health > 0 && ultron_health > 0)
			ScreenPanel.screen.setText("You like playing with fire huh ..." + "\n\nYou took " + ultron_hit + " damage!"
					+ "\nYou dealt Ultron " + user_attack + " damage!" + "\n\nYour Health: " + getHealth()
					+ "\nUltron Health: " + getUltronHealth() + "\nSpecial: " + getSpecial());
		else if (health <= 0 && ultron_health > 0)
			ScreenPanel.screen.setText("You like playing with fire huh ..." + "\n\nYou took " + ultron_hit + " damage!"
					+ "\nYou dealt Ultron " + user_attack + " damage!" + "\n\nYour Health: 0" + "\nUltron Health: "
					+ getUltronHealth() + "\nSpecial: " + getSpecial()
					+ "\n\nYou died and with you ... so does humanity.");
		else if (health > 0 && ultron_health <= 0)
			ScreenPanel.screen.setText("You like playing with fire huh ..." + "\n\nYou took " + ultron_hit + " damage!"
					+ "\nYou dealt Ultron " + user_attack + " damage!" + "\n\nYour Health: " + getHealth()
					+ "\nUltron Health: 0" + "\nSpecial: " + getSpecial()
					+ "\n\nCongrats you saved the world...do you want a cookie?");
	}

	public void defend() 
	{
		Random generator = new Random();
		int ultron_hit = generator.nextInt(6);
		int user_attack = generator.nextInt(6);
		health -= ultron_hit;
		ultron_health -= user_attack;
		if (health > 0 && ultron_health > 0)
			ScreenPanel.screen.setText("Sometimes you have to take the safe route ..." + "\n\nYou took " + ultron_hit
					+ " damage!" + "\nYou dealt Ultron " + user_attack + " damage!" + "\n\nYour Health: " + getHealth()
					+ "\nUltron Health: " + getUltronHealth() + "\nSpecial: " + getSpecial());
		else if (health <= 0 && ultron_health > 0)
			ScreenPanel.screen.setText("Sometimes you have to take the safe route ..." + "\n\nYou took " + ultron_hit
					+ " damage!" + "\nYou dealt Ultron " + user_attack + " damage!" + "\n\nYour Health: 0"
					+ "\nUltron Health: " + getUltronHealth() + "\nSpecial: " + getSpecial()
					+ "\n\nYou died and with you ... so does humanity.");
		else if (health > 0 && ultron_health <= 0)
			ScreenPanel.screen.setText("Sometimes you have to take the safe route ..." + "\n\nYou took " + ultron_hit
					+ " damage!" + "\nYou dealt Ultron " + user_attack + " damage!" + "\n\nYour Health: 0"
					+ "\nUltron Health: " + getUltronHealth() + "\nSpecial: " + getSpecial()
					+ "\n\nCongrats you saved the world...do you want a cookie?");
	}

	public int getHealth() 
	{
		return health;
	}

	public int getSpecial() 
	{
		return special_attack;
	}

	public int getUltronHealth() 
	{
		return ultron_health;
	}

	public void actionPerformed(ActionEvent event) 
	{
		if (event.getSource() == start && status == false)
			selectHero();
		if (event.getSource() == restart && status == true) 
		{
			restart();
			selectHero();
		}
		if (status == true && health > 0 && ultron_health > 0) 
		{
			if (event.getSource() == attack)
				attack();
			if (event.getSource() == defend)
				defend();
			if (event.getSource() == special && special_attack > 0)
				superAttack();
		}
	}
}
