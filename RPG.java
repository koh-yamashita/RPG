public class RPG {
	public static void main(String[] args) {
		Chara a = new Chara("勇者",100,80,20);
		Chara b = new Chara("盗賊",50,18,13);
		Mahou x = new Mahou("魔法使い",90,100,10);
		DragonKnight y = new DragonKnight("竜騎士",150,80,30);

		a.introduce();
		b.introduce();
		x.introduce();
		y.introduce();
		b.attack(a);
		x.hoimi(a);
		System.out.println("（確認用）"+ a.name +"のHPは"+ a.hp + "になりました。");
		System.out.println("（確認用）"+ x.name +"のMPは"+ x.mp + "になりました。");
		y.attack(b);
		System.out.println("（確認用）"+ b.name +"のHPは"+ b.hp + "になりました。");
		b.dead();
	}
}
