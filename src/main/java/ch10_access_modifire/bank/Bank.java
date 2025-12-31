package ch10_access_modifire.bank;

public class Bank {
    private int accountNum;                 // (계좌번호, 정수)
    private String accountHolder;           // (예금주이름, 문자열)
    private int balance;                    // (잔액, 정수)
    private String pinNumber;                  // (비밀번호, 4 자리 정수 0 ~ 9999)
    // Constructor
        // 기본 생성자
    public Bank(){}
        // 계좌번호만 있는 생성자
    public Bank(int accountNum){
        setAccountNum(accountNum);
    }
        // 계좌번호, 예금주를 받는 생성자
    public Bank(int accountNum, String accountHolder){
        setAccountNum(accountNum);
        setAccountHolder(accountHolder);
    }
        // 계좌번호, 예금주, 초기 잔액을 받는 생성자
    public Bank(int accountNum, String accountHolder, int balance){
        setAccountNum(accountNum);
        setAccountHolder(accountHolder);
        setBalance(balance);
    }
        // 계좌번호, 예금주, 초기 잔액, 비밀번호를 받는 생성자
    public Bank(int accountNum, String accountHolder, int balance, String pinNumber){
        setAccountNum(accountNum);
        setAccountHolder(accountHolder);
        setBalance(balance);
        setPinNumber(pinNumber);
    }
    // Setter
    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void setBalance(int balance) {
        if(balance < 0){
            System.out.println("불가능한 입력 금액입니다.");
            return;
        }
        this.balance = balance;
    }
    public void setPinNumber(String pinNumber) {
        if(pinNumber.length() != 4){
            System.out.println("불가능한 비밀번호입니다.");
            return;
        }
        this.pinNumber = pinNumber;
    }
    // Getter
    public int getAccountNum() {
        return accountNum;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public int getBalance() {
        return balance;
    }
    public String getPinNumber() {
        return pinNumber;
    }
    // Method
    public void desposit(int amount, String inputPin){
        if(!getPinNumber().equals(inputPin)) {
            return;
        }
        System.out.print(amount + "원이 입금되었습니다. ");
        setBalance(getBalance()+amount);
        System.out.println("현재 잔액 : " + getBalance() + "원");
    }
    public void withdraw(int amount, String inputPin){
        int temp = getBalance()-amount;
        if(!getPinNumber().equals(inputPin)) {
            return;
        } else if(temp < 0) {
            System.out.println("출금 불가입니다.");
            return;
        }
        System.out.print(amount + "원이 출금되었습니다. ");
        setBalance(getBalance()-amount);
        System.out.println("현재 잔액 : " + getBalance() + "원");
    }
    public void showAccountInfo() {
        System.out.println("계좌 번호 : " + getAccountNum());
        System.out.println("계좌 소유자 : " + getAccountHolder());
        System.out.println("현재 잔액 : " + getBalance() + "원");
    }
}
