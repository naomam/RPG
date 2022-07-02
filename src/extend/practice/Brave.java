package extend.practice;

public class Brave extends Human {
	
	public Brave(String name, int hp, int offensive) {
		name = "勇者";
		hp = 120;
		offensive = 60;
	}
	
	public void attack(Living target) {
		int nn = offensive * Rand.get(9);
		target.hp = target.hp - nn;
		System.out.println("勇者が剣で攻撃！" + target + "に"  + nn + "のダメージ！");
		
	}
}