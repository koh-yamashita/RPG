package qwerty;
class Yusha extends Chara {
	Yusha(String name,int hp,int mp,int atk){
		super(name,hp,mp,atk);
	}
	public void introduce() {
		System.out.println("俺は" + this.name + "！HPは" + this.hp + "でMPは" + this.mp + "だぜ！。");
	}
	@Override
	public void attack(Chara target) {
		System.out.println(this.name + "の攻撃！");
		target.damage(atk);
	}
}
