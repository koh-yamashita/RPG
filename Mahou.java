class Mahou extends Chara {
	Mahou(String name,int hp,int mp,int atk){
		super(name,hp,mp,atk);
	}

	public void introduce() {
		System.out.println("ウチは" + this.name + "どす。HPは" + this.hp + "でMPは" + this.mp + "どす。回復魔法が使えますえ。");
	}
	void hoimi(Chara target) {
		int heal = 10;
		this.mp -= 10;
		System.out.println(name + "はホイミをとなえた。");
		target.kaifuku(heal);
	}
}
