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
    public Character(String name , int health, String skill){
        setName(name);
        setHealth(health);
        setSkill(skill);
    }
    public Character(String name , int health, int power, String skill, int exp){
        setName(name);
        setHealth(health);
        setPower(power);
        setSkill(skill);
        setExp(exp);
    }
// Setter
    public void setName(String name) {
        this.name = name;
    }
    protected void setHealth(int health) {
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
    protected void setExp(int exp) {
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
    public int gainExp() {
        return this.exp;
    }
    // Method
    public void attack() {
        System.out.println(getName() + "가(이)" + getPower() + "로 공격!");
        gainExp(amount);
    }
    public void heal() {
        setHealth(getHealth()+10);
        System.out.println("체력이 10 회복되었습니다. 현재 체력 : " + getHealth());
    }
    private void gainExp(int amount){
        System.out.println(getName() + "이(가) 경험치 " + amount + "을(를) 얻었습니다.");
        setExp(gainExp()+amount);
    }
}


public class CharacterMain {
    public static void main(String[] args) {
        Character warrior = new Character("전사", 100, 200, "세로 베기", 30);
        warrior.attack();
        warrior.heal();

        Character healer = new Character("힐러", 100, "힐");
    }
}
