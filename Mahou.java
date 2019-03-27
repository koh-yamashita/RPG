class Mahou extends Chara {
	Mahou(String name,int hp,int mp,int atk){
		super(name,hp,mp,atk);
	}

	public void introduce() {
		System.out.println("ウチは" + this.name + "どす。HPは" + this.hp + "でMPは" + this.mp + "どす。回復魔法が使えますえ。");
	}
	public void attack(Chara target) {
		System.out.println(this.name + "の攻撃！");
		target.damage(atk);
	}

	void hoimi(Chara teamA) {
		int heal = 10;
		this.mp -= 10;
		System.out.println(name + "はホイミをとなえた。");
		teamA.kaifuku(heal);
	}
}
