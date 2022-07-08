package extend.practice;

public class Brave extends Human {
	
	public Brave(String name, int hp, int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}
	
	public void attack(Living target) {
		int nn = offensive * Rand.get(9);
		target.hp = target.hp - nn;
		System.out.println("勇者が剣で攻撃！" + target.name + "に"  + nn + "のダメージ！");
		
	}
}