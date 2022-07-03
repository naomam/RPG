package extend.practice;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Human brave = new Brave("勇者",120,60);
		Human wizard = new Wizard("魔法使い",100,70);
		Human fighter = new Fighter("戦士",100,50);
		Monster slime = new Slime("スライム",80,30);
		Monster oak = new Slime("オーク",100,50);
		Monster dragon = new Slime("ドラゴン",200,100);
		
		Human<Living> Humans = new ArrayList<>();
			Humans.add(brave);
			Humans.add(wizard);
			Humans.add(fighter);
		
		Monster<Living> Monsters = new ArrayList<>();
			Monsters.add(slime);
			Monsters.add(oak);
			Monsters.add(dragon);
	
			while(true) {
				Living.attack(Monsters);
				
			}
	}
	
	
	
}
