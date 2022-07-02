package extend.practice;

public class Fighter extends Human{
	
	public Fighter(String name, int hp, int offensive) {
	name = "戦士";
	hp = 100;
	offensive = 50;
	}
	
	public void attack(Living target) {
		int nn = offensive * Rand.get(9);
		target.hp = target.hp - nn;
		System.out.println("戦士が斧で攻撃！" + target + "に"  + nn + "のダメージ！");
	}
}
