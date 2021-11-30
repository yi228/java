public class Monster{
	public String kind; //몬스터 종류
	public double hp; //체력
	public double power; //공격력
	public static int num; //몬스터 종류 배열 인덱스 선택
	
	public Monster() {
		this("none",0,0);
	}
	
	public Monster(String kind, double hp, double power) {
		this.kind = kind;
		this.hp = hp;
		this.power = power;
	}
	
	public void getInfo() { //몬스터 정보 출력
		System.out.printf("몬스터 : %s   HP : %.2f   공격력 : %.2f\n", kind, hp, power);
	}
	
	public void getHp() { //몬스터 남은 체력 출력
		System.out.printf("%s의 남은 HP : %.2f\n", kind, hp);
	}
}

class Boss extends Monster{ //보스 몬스터
	int fullhp;
	int index;
	
	public Boss() {
		hp = 150;
		power = 45;
		fullhp = 150;
		index = 0;
	}
	
	public String bossSelect() {
		String[] bossKind = {"펜릴", "요르문간드", "오우거킹", "드래곤"}; //보스 종류
		return bossKind[index%4];
	}
	
	public void levelUp() {
		hp = fullhp;
		hp *= 1.8;
		fullhp *= 1.8;
		power *= 1.8;
		index++;
	}
}