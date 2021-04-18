public class Orc  extends Character{

    protected Orc(String firstName, String lastName, String clan){
        super(firstName, lastName, clan);
        setWeaponType("Usual");
    }
    private String weaponType;

    public String getWeaponType() {
        return this.weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
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
        super.print(result);
    }
}
