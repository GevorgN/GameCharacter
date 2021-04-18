public class Magican  extends Character{


    private String magicType;

    protected Magican(String firstName, String lastName, String clan) {
        super(firstName, lastName, clan);
        setCharacterType("Magican");
        setMagicType("Usual");
    }

    public String getMagicType(){
        return this.magicType;
    }


    public void setMagicType(String magicType){
        this.magicType = magicType;
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

        double updatedResult = Double.parseDouble(result);
        setHealth(updatedResult);
    }
}
