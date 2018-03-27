package flower;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Flowers flower0 = new Flowers("Rose", "White", 15, 1);
        Flowers flower1 = new Flowers("Rose", "White", 15, 1);
        Flowers flower2 = new Flowers("Rose", "White", 15, 2);
        Flowers flower3 = new Flowers("Rose", "Red", 15, 4);
        Flowers flower4 = new Flowers("Rose", "Red", 15, 2);
        Flowers flower5 = new Flowers("Rose", "Pink", 15, 3);
        Flowers flower6 = new Flowers("Rose", "Pink", 15, 1);
        Flowers flower7 = new Flowers("Rose", "Pink", 15, 1);
        Flowers flower8 = new Flowers("Rose", "Pink", 15, 4);
        Flowers flower9 = new Flowers("Rose", "Pink", 15, 1);


        Flowers flower00 = new Flowers("Tulip", "White", 10, 1);
        Flowers flower01 = new Flowers("Tulip", "White", 10, 1);
        Flowers flower02 = new Flowers("Tulip", "White", 10, 2);
        Flowers flower03 = new Flowers("Tulip", "Red", 10, 4);
        Flowers flower04 = new Flowers("Tulip", "Red", 10, 2);
        Flowers flower05 = new Flowers("Tulip", "Red", 10, 3);
        Flowers flower06 = new Flowers("Tulip", "Pink", 10, 1);
        Flowers flower07 = new Flowers("Tulip", "Pink", 10, 1);
        Flowers flower08 = new Flowers("Tulip", "Pink", 10, 4);
        Flowers flower09 = new Flowers("Tulip", "Pink", 10, 1);

        Flowers flower000 = new Flowers("Narcissus", "White", 13, 1);
        Flowers flower001 = new Flowers("Narcissus", "White", 13, 1);
        Flowers flower002 = new Flowers("Narcissus", "White", 13, 2);
        Flowers flower003 = new Flowers("Narcissus", "Red", 13, 4);
        Flowers flower004 = new Flowers("Narcissus", "Red", 13, 2);
        Flowers flower005 = new Flowers("Narcissus", "Red", 13, 3);
        Flowers flower006 = new Flowers("Narcissus", "Pink", 13, 1);
        Flowers flower007 = new Flowers("Narcissus", "Pink", 13, 1);
        Flowers flower008 = new Flowers("Narcissus", "Pink", 13, 4);
        Flowers flower009 = new Flowers("Narcissus", "Pink", 13, 1);

//______________________________________________________________________________________________________________________

       Bucket Mybucket= new Bucket();

        Mybucket.addFlower(flower0);
        Mybucket.addFlower(flower1);
        Mybucket.addFlower(flower2);
        Mybucket.addFlower(flower3);
        Mybucket.addFlower(flower4);
        Mybucket.addFlower(flower5);
        Mybucket.addFlower(flower6);
        Mybucket.addFlower(flower7);
        Mybucket.addFlower(flower8);
        Mybucket.addFlower(flower9);

        Mybucket.addFlower(flower00);
        Mybucket.addFlower(flower01);
        Mybucket.addFlower(flower02);
        Mybucket.addFlower(flower03);
        Mybucket.addFlower(flower04);
        Mybucket.addFlower(flower05);
        Mybucket.addFlower(flower06);
        Mybucket.addFlower(flower07);
        Mybucket.addFlower(flower08);
        Mybucket.addFlower(flower09);

        Mybucket.addFlower(flower000);
        Mybucket.addFlower(flower001);
        Mybucket.addFlower(flower002);
        Mybucket.addFlower(flower003);
        Mybucket.addFlower(flower004);
        Mybucket.addFlower(flower005);
        Mybucket.addFlower(flower006);
        Mybucket.addFlower(flower007);
        Mybucket.addFlower(flower008);
        Mybucket.addFlower(flower009);


//______________________________________________________________________________________________________________________


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the desired flower(Rose/Tulip/Narcissus) ");
        String flowerName = sc.next();

        System.out.println("Enter the color of the desired flower(Red/Pink/White) ");
        String flowerColor = sc.next();





        Mybucket.SortBucket(flowerName, flowerColor);
        System.out.println("Your flowers"
                + ""
                + ": ");

        Mybucket.ShowBucket();
        System.out.println("Your boucket price: " + Mybucket.Price() + "grn");
        System.out.println("");
     
            Mybucket.Freshness();
      






    }
}