package extend.practice;

public class Fighter extends Human{
	
	public Fighter(String name, int hp, int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}
	
	public void attack(Living target) {
		int nn = offensive * Rand.get(9);
		target.hp = target.hp - nn;
		System.out.println("戦士が斧で攻撃！" + target.name + "に"  + nn + "のダメージ！");
	}
}
