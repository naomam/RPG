package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Human brave = new Brave("勇者",120,60);
		Human wizard = new Wizard("魔法使い",100,70);
		Human fighter = new Fighter("戦士",100,50);
		Monster slime = new Slime("スライム",80,30);
		Monster oak = new Slime("オーク",100,50);
		Monster dragon = new Slime("ドラゴン",200,100);
		
		List<String> Human = new ArrayList<>();
			Human.add("勇者");
			Human.add("魔法使い");
			Human.add("戦士");
		
		List<String> Monster = new ArrayList<>();
			Monster.add("スライム");
			Monster.add("オーク");
			Monster.add("ドラゴン");
	
		while(true) {
			((Living) Human).attack((Living) Monster);
			System.out.println("人間のターン！");
			
			if(((Living) Monster).hp <= 0) {
				System.out.println(((Living) Monster).name + "は倒れた。");
				break;
				
			}
			
			((Living) Monster).attack((Living) Human);
			System.out.println("モンスターのターン！");
			
			if(((Living) Human).hp <= 0) {
				System.out.println(((Living) Human).name + "は倒れた。");
				break;
			}
		}
	}
}
