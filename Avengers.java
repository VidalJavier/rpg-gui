package A.Ultron;

public interface Avengers 
{
	//Constants
	public final int START_HEALTH = 100;
	public final int ULTRON_START_HEALTH = 100;
	public final int START_SPECIAL = 10;
	public final String[]HERO = {"CAPTAIN AMERICA", "HULK", "IRON MAN", "THOR"};
	public final String[]WEAPON = {"Vibranium Shield", "Fists", "Jarvis", "Mjölnir"};
	public final String[]DESCRIPTION = {"Strongest metal on Earth.","Hulk see, Hulk smash", 
			"AI second to none", "Incredibly well balanced"};
	
	//Methods
	public void selectHero();
	public void attack();
	public void superAttack();
	public void defend();	
	public int getHealth();
	public int getSpecial();
	public int getUltronHealth();
}