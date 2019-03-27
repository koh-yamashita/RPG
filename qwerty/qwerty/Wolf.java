package qwerty;
class Wolf extends Chara {
	Wolf(String name,int hp,int mp,int atk){
		super(name,hp,mp,atk);
	}
	public void introduce() {
		System.out.println("ボクは" + this.name + "だワン。HPは" + this.hp + "でMPは" + this.mp + "だワン。");
	}
	public void attack(Chara target) {
		System.out.println(this.name + "の攻撃！");
		target.damage(atk);
	}
}