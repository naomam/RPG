package extend.practice;

public class Wizard extends Human{
	
	public Wizard(String name, int hp, int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}
	
	public void attack(Living target) {
		int nn = offensive * Rand.get(9);
		target.hp = target.hp - nn;
		System.out.println("魔法使いが魔法で攻撃！" + target.name + "に"  + nn + "のダメージ！");
	}
}
