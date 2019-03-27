package qwerty;
class Touzoku extends Chara {
	Touzoku(String name,int hp,int mp,int atk){
		super(name,hp,mp,atk);
	}
	public void introduce() {
		System.out.println("オラは" + this.name + "だす。HPは" + this.hp + "でMPは" + this.mp + "だす。");
	}
	public void attack(Chara target) {
		System.out.println(this.name + "の攻撃！");
		target.damage(atk);
	}
}
