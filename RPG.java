package qwerty;
public class RPG {
	public static void main(String[] args) {

		Chara teamA[] = new Chara[3];
		Chara teamB[] = new Chara[2];
		teamA[0] = new Yusha("勇者",100,80,20);
		teamA[1] = new Mahou("魔法使い",90,100,10);
		teamA[2] = new DragonKnight("竜騎士",150,80,30);
		teamB[0] = new Touzoku("盗賊",80,18,13);
		teamB[1] = new Wolf("オオカミ",50,0,20);
		DanceMan dance = new DanceMan();

		for(int i=0; i<teamA.length; i++) {
			teamA[i].introduce();
			if(teamB[0].hp >= 0){
				teamA[i].attack(teamB[0]);
			}
			else {
				teamA[i].attack(teamB[1]);
			}
			dance.move(teamA[0]);
		}
		for(int j=0; j<teamB.length; j++) {
			teamB[j].introduce();
			if(teamA[0].hp >= 0){
				teamB[j].attack(teamA[0]);
			}
			else {
				teamB[j].attack(teamA[1]);
			}
		}
	}
}
