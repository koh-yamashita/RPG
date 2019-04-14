package qwerty;
class Wolf extends Chara {
	Wolf(String name,int hp,int mp,int atk){
		super(name,hp,mp,atk);
	}
	public void introduce() {
		if(hp<=0)return;
		System.out.println("ボクは" + this.name + "だワン。HPは" + this.hp + "でMPは" + this.mp + "だワン。");
	}
	@Override
	public void attack(Chara target) {
		if(hp<=0)return;
		System.out.println(this.name + "の攻撃！");
		target.damage(atk);
	}
}