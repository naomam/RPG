package extend.practice;

public class Oak extends Monster{
	
	public Oak(String name, int hp, int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}
	
	public void attack(Living target) {
		int nn = offensive * Rand.get(9);
		target.hp = target.hp - nn;
		System.out.println("オークが槍で攻撃！" + target.name + "に"  + nn + "のダメージ！");
	}
}
