package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args, String Brave, String Wizard, String Fighter, String Slime, String Oak, String Dragon) {
		List<String> Humans = new ArrayList<>();
		Humans.add(Brave);
		Humans.add(Wizard);
		Humans.add(Fighter);
		
		List<String> Monsters = new ArrayList<>();
			Monsters.add(Slime);
			Monsters.add(Oak);
			Monsters.add(Dragon);
	
			while(true) {
				Humans.attack(Monsters);
				
			}
	}
	
	
	
}
