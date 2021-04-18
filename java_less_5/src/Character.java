public class Character {
    private String firstName;
    private String lastName;
    private int age;
    private String clan;
    private double power;
    private double defence;
    private double health;
    private String characterType;

    public Character(String firstName, String lastName, String clan) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.clan = clan;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getClan() {
        return clan;
    }

    public double getPower() {
        return power;
    }

    public double getDefence() {
        return defence;
    }

    public String getCharacterType() {
        return characterType;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }


    public void setPower(double power) {
        this.power = power;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public void printInfo(){
        System.out.println(this.firstName + ' ' + this.lastName + " Clan is " + this.clan);
    }

    public double startAttack(){
        return this.power;

    }

    public String startDefence(double power){
        if (this.health > 0) {
            double result = (power - this.defence);
            if (result <= 0) {
                String finalConditon = String.valueOf(this.health);
                return finalConditon;
            } else {
                double finalHealth = this.health - result;
                String finalConditon = String.valueOf(finalHealth);
                return finalConditon;
            }
        }else {
            String dead = "Character is Dead!";
            return dead;
        }
    }

    public void print(String result){
        double finalResult = Double.parseDouble(String.valueOf(result));
        System.out.printf(" %s Health is %.2f",this.firstName,finalResult);

    }
}
