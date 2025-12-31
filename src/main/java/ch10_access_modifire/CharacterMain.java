package ch10_access_modifire;

class Character{
// Preset Variable
    public String name;         // 캐릭터 이름 / 공개 가능
    private int health;         // 체력 / 읽기만 허용
    int power;                  // 공격력 / 같은 패키지만
    protected String skill;     // 스킬명 / 자식 클래스만
    private int exp;            // 경험치 / 외부에서 완전 차단
    int amount = 10;
// Contructor
    public Character(){
    }
// Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(int health) {
        if(health < 0){
            System.out.println("올바르지 않은 값입니다.");
            return;
        }
        this.health = health;
    }
    public void setPower(int power) {
        if(power < 0){
            System.out.println("올바르지 않은 값입니다.");
            return;
        }
        this.power = power;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
    public void setExp(int exp) {
        if(exp < 0){
            System.out.println("올바르지 않은 값입니다.");
            return;
        }
        this.exp = exp;
    }
// Getter
    public String getName() {
        return this.name;
    }
    public int getHealth() {
        return this.health;
    }
    public int getPower() {
        return this.power;
    }
    public String getSkill() {
        return this.skill;
    }
    public int getExp() {
        return this.exp;
    }
    // Method
    public void attack() {
        System.out.println(getName() + "가(이)" + getPower() + "로 공격!");
        getExp(amount);
    }
    public void heal() {
        setHealth(getHealth()+10);
        System.out.println("체력이 10 회복되었습니다. 현재 체력 : " + getHealth());
    }
    public void getExp(int amount){
        System.out.println(getName() + "이(가) 경험치 " + amount + "을(를) 얻었습니다.");
    }
}


public class CharacterMain {
    public static void main(String[] args) {
        Character warrior = new Character();

        warrior.setName("전사");
        warrior.setHealth(100);
        warrior.setPower(200);
        warrior.setSkill("세로 베기");
        warrior.setExp(30);


    }
}
