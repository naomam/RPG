package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Human brave = new Brave("勇者",120,60);
		Human wizard = new Wizard("魔法使い",100,70);
		Human fighter = new Fighter("戦士",100,50);
		Monster slime = new Slime("スライム",80,30);
		Monster oak = new Oak("オーク",100,50);
		Monster dragon = new Dragon("ドラゴン",200,100);
		
		List<Human> humanList = new ArrayList<>();
			humanList.add(brave);
			humanList.add(wizard);
			humanList.add(fighter);
		
		List<Monster> monsterList = new ArrayList<>();
			monsterList.add(slime);
			monsterList.add(oak);
			monsterList.add(dragon);
	
		while(true) {
			int attacker = Rand.get(humanList.size());
			int defender = Rand.get(monsterList.size());
			
			Human human = humanList.get(attacker);
			Monster monster = monsterList.get(defender);
			
			System.out.println("人間のターン！");
			
			human.attack(monster);
			
			if(monster.hp <= 0) {
				System.out.println(monster.name + "は倒れた。");
				monsterList.remove(monster);
				
				if(monsterList.size() == 0) {
					System.out.println("勇者達は勝利した!");
					break;	
				}
				
			}
			
			 attacker = Rand.get(monsterList.size());
			 defender = Rand.get(humanList.size());
			
			 System.out.println("モンスターのターン！");
			 
			 monster.attack(human);
			
			if(human.hp <= 0) {
				System.out.println(human.name + "は倒れた。");
				humanList.remove(human);
				
				if(humanList.size() == 0) {
					System.out.println("スライム達は勝利した!");
					break;
				}

			}
		}
	}
}
