package Cofee_Machine;

import java.util.Scanner;

public class Cofee {
    
    public static void main(String[] args) {
        int  howManySugar = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(" Hangi kahveyi istersiniz. . \n" +
                "1. Turkish Cofee \n" +
                "2. Filetered Cofee \n" +
                "3. Expresso ");
        String whichCofee = input.nextLine();   //.equalsIgnoreCase();
        switch (whichCofee) {
            case "Turkish Cofee":
                System.out.println("Turkish coffee being prepared");
                break;
            case " Filetered Cofee":
                System.out.println("Filetered coffee being prepared");
                break;
            case "Expresso":
                System.out.println("Expresso being prepared");
                break;
            default:
                System.out.println("You have made a mistake..");
        }
        System.out.println();
        //MILK
        System.out.println("Do you want to add milk --> YES, NO ");
        String milk = input.next();
        if (milk.equalsIgnoreCase("YES")) {
            System.out.println("Milk being added");
        } else {
            System.out.println("Milk isn't being added");
        }
        //SUGAR
        System.out.println("Do you want to add SUGAR --> YES, NO ");
        String sugar = input.next();
        if (sugar.equalsIgnoreCase("YES")) {
            System.out.println("How many sugar do you want?");
            //String bosKod = input.nextLine();
            howManySugar = input.nextInt();
            if (howManySugar == 1) {
                System.out.println(howManySugar + " sugar being added ");
            } else {
                System.out.println(howManySugar + " sugars being added ");
            }


        } else {
            System.out.println("Sugar isn't being added");
        }
        System.out.println("which size of Cofee do you prefer.. SMALL - - MEDIUM - - LARGE");
        String cofeeSize = input.next();
        if (cofeeSize.equalsIgnoreCase("large")){
            System.out.println(whichCofee+" is being prepared  LARGE size . . ");
        }else if (cofeeSize.equalsIgnoreCase("medium")) {
            System.out.println(whichCofee+"  is being prepared  MEDIUM size . . ");
        }else if (cofeeSize.equalsIgnoreCase("SMALL")) {
            System.out.println(whichCofee+"  is being prepared  SMALL size . . ");
        }
        System.out.println();
        System.out.println(cofeeSize+" "+whichCofee+" is ready. Enjoy it . .  ");
        System.out.println("____I N G R E D I E N T S____\n" +
                "MILK : "+milk +"\n" +
                "SUGAR : " + sugar+"  "+ howManySugar+" sugar");


    }
}
