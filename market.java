package gauri;
import java.util.Scanner;

class market {
    Scanner obj = new Scanner(System.in);

    float z, e, d, r, v;

    public void mango() {
        System.out.println("Cost of mangoes is 500rs per kg");
        int i = 500;
        System.out.println("Enter the weight of mangoes:");
        float m = obj.nextFloat();
        z = i * m;
        System.out.println("The total cost of mangoes: " + z);
    }

    public void apple() {
        System.out.println("Cost of apple is 100rs per kg");
        int j = 100;
        System.out.println("Enter the weight of apples:");
        float a = obj.nextFloat();
        e = j * a;
        System.out.println("The total cost of apples: " + e);
    }

    public void coconut() {
        System.out.println("Cost of coconut is 40rs each");
        int k = 40;
        System.out.println("Enter the quantity of coconut:");
        float c = obj.nextFloat();
        d = k * c;
        System.out.println("The total cost of coconut: " + d);
    }

    public void banana() {
        System.out.println("Cost of banana is 50rs per dozen");
        int l = 50;
        System.out.println("Enter the quantity of bananas:");
        float b = obj.nextFloat();
        r = l * b;
        System.out.println("The total cost of bananas: " + r);
    }

    public void chiku() {
        System.out.println("Cost of chiku is 100rs per kg");
        int n = 100;
        System.out.println("Enter the weight of chiku:");
        float h = obj.nextFloat();
        v = n * h;
        System.out.println("The total cost of chiku: " + v);
    }

    public void choice() {
        System.out.println("*****MAHALAKSHMI SUPERMARKET*****");
        System.out.println("Welcome to our special fruit market");
        System.out.println("1.MANGO");
        System.out.println("2.APPLE");
        System.out.println("3.COCONUT");
        System.out.println("4.BANANA");
        System.out.println("5.CHIKU");
        System.out.println("6.EXIT");

        int p = obj.nextInt();

        switch (p) {
            case 1:
                mango();
                choice();
                break;
            case 2:
                apple();
                choice();
                break;
            case 3:
                coconut();
                choice();
                break;
            case 4:
                banana();
                choice();
                break;
            case 5:
                chiku();
                choice();
                break;
            case 6:
                exit();
                break;
        }
    }

    public void exit() {
        System.out.println("==================================");
        System.out.println("ITEM        RATE        TOTAL");
        System.out.println("==================================");
        if (z > 0) {
            System.out.println("MANGO       500/KG     " + z);
        }
        if (e > 0) {
            System.out.println("APPLE       100/KG     " + e);
        }
        if (d > 0) {
            System.out.println("COCONUT     40 each    " + d);
        }
        if (r > 0) {
            System.out.println("BANANA      50/DOZEN   " + r);
        }
        if (v > 0) {
            System.out.println("CHIKU       100/KG     " + v);
        }
        System.out.println("==================================");
        System.out.println("GRAND TOTAL = " + (z + e + d + r + v));
    }
}
