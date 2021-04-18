import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first name, last name and clan of warrior");
        Sworder sworder = new Sworder(input.next(), input.next(), input.next());
        sworder.printInfo();
        System.out.println("Please enter the first name, last name and clan of magican");
        Magican magican = new Magican(input.next(), input.next(), input.next());
        magican.printInfo();
        System.out.println("Please enter the first name, last name and clan of archer");
        Archer archer = new Archer(input.next(), input.next(), input.next());
        archer.printInfo();
        System.out.println("Please enter the first name, last name and clan of orc");
        Orc orc = new Orc(input.next(), input.next(), input.next());
        orc.printInfo();
        sworder.setPower(60.5);
        sworder.setDefence(40);
        sworder.setHealth(500);
        magican.setPower(75.15);
        magican.setDefence(30.15);
        magican.setHealth(500);
        archer.setPower(40);
        archer.setDefence(60.4);
        archer.setHealth(500);
        orc.setDefence(78.1);
        orc.setPower(58.4);
        orc.setHealth(500);

        String afterSwordAttack = null;
        String afterMagicAttack = null;

        for (int i = 0; i < 11; i++) {
            double swordAttack = sworder.startAttack();
            afterSwordAttack = magican.startDefence(swordAttack);
            double magicAttack = magican.startAttack();
            afterMagicAttack = sworder.startDefence(magicAttack);
            magican.print(afterSwordAttack);
            System.out.println();
            sworder.print(afterMagicAttack);
            System.out.println();
        }
    }
}
