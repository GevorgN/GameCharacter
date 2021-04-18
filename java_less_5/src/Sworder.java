
public class Sworder extends Character{

    private String swordType;
    private String secondWeapon;

    protected Sworder(String firstName, String lastName, String clan) {
        super(firstName, lastName, clan);
        setCharacterType("Warrior");
        setSwordType("Usual");
        setSecondWeapon("None");
    }

    public String getSwordType(){
        this.swordType = swordType;
        return  this.swordType;
    }

    public String getSecondWeapon(){
        this.secondWeapon = secondWeapon;
        return  this.secondWeapon;
    }

    public void setSwordType (String swordType){
        this.swordType = swordType;
    }

    public void setSecondWeapon(String secondWeapon){
        this.secondWeapon = secondWeapon;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    public double startAttack() {
        return super.startAttack();
    }

    @Override
    public String startDefence(double power) {
        return super.startDefence(power);
    }

    @Override
    public void print(String result) {
        System.out.printf("%s - ", getCharacterType());
        super.print(result);
    }
}
