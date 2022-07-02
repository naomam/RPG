package extend.practice;

public class Dragon extends Monster{
	
	public Dragon(String name, int hp, int offensive) {
	name = "ドラゴン";
	hp = 200;
	offensive = 100;
	}
	
	public void attack(Living target) {
		int nn = offensive * Rand.get(9);
		target.hp = target.hp - nn;
		System.out.println("ドラゴンが炎で攻撃！" + target + "に"  + nn + "のダメージ！");
	}
}
