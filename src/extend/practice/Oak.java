package extend.practice;

public class Oak extends Monster{
	
	public Oak(String name, int hp, int offensive) {
	name = "オーク";
	hp = 100;
	offensive = 50;
	}
	
	public void attack(Living target) {
		int nn = offensive * Rand.get(9);
		target.hp = target.hp - nn;
		System.out.println("オークが槍で攻撃！" + target + "に"  + nn + "のダメージ！");
	}
}
