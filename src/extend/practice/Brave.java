package extend.practice;

import java.util.List;

public class Brave extends Human {
	
	public Brave(String name, int hp, int offensive) {
		name = "勇者";
		hp = 120;
		offensive = 60;
	}
	
	public void attack(List<String> monsters) {
		int nn = offensive * Rand.get(9);
		monsters.hp = monsters.hp - nn;
		System.out.println("勇者が剣で攻撃！" + monsters + "に"  + nn + "のダメージ！");
		
	}
}