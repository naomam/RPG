package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Human brave = new Brave("勇者",120,60);
		Human wizard = new Wizard("魔法使い",100,70);
		Human fighter = new Fighter("戦士",100,50);
		Monster slime = new Slime("スライム",80,30);
		Monster oak = new Slime("オーク",100,50);
		Monster dragon = new Slime("ドラゴン",200,100);
		
		List<Human> humanList = new ArrayList<>();
			humanList.add(brave);
			humanList.add(wizard);
			humanList.add(fighter);
		
		List<Monster> monsterList = new ArrayList<>();
			monsterList.add(slime);
			monsterList.add(oak);
			monsterList.add(dragon);
	
		while(true) {
			int attacker = Rand.get(2);
			int target = Rand.get(2);
			
			Human human = humanList.get(attacker);
			Monster monster = monsterList.get(target);
			
			System.out.println("人間のターン！");
			
			human.attack(monster);
			
			if(monster.hp <= 0) {
				System.out.println(monster + "は倒れた。");
				monsterList.remove(monster);
				break;
				
			}
			
			System.out.println("モンスターのターン！");
			monster.attack(human);
			
			if(human.hp <= 0) {
				System.out.println(human + "は倒れた。");
				humanList.remove(human);
				break;
			}
		}
	}
}
