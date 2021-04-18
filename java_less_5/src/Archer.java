public class Archer extends Character{

    private String archType;

    protected Archer(String firstName, String lastname, String clan){
        super(firstName, lastname, clan);
        setArchType("Usual");
    }


    public String getArchType(){
        return this.archType;
    }

    public void setArchType(String archType){
        this.archType = archType;
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
