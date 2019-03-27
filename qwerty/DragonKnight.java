package qwerty;
class DragonKnight extends Chara {
	DragonKnight(String name,int hp,int mp,int atk){
		super(name,hp,mp,atk);
	}
	
	public void introduce() {
		System.out.println("俺は" + name + "。HPは" + hp + "でMPは" + mp + "だぜ。ドラゴンに変身できるぜ。");
	}
	public void attack(Chara target) {
		this.mp -= 30;
		System.out.println(name + "はドラゴンに変身した！");
		System.out.println(name + "は炎をはいた！");
		target.damage(atk);
		this.flame(target);
	}
	void flame(Chara target) {
		int flame = 20;
		target.yakedo(flame);
	}
}
