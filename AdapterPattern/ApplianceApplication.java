package AdapterPattern;
import java.util.*;
public class ApplianceApplication {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        Laptop laptop = new Laptop();
        PowerOutlet laptopCharge = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorCooling = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger phoneCharger = new SmartphoneCharger();
        PowerOutlet phoneCharging = new SmartphoneAdapter(phoneCharger);

        MENU();
        System.out.print("\nChoose an appliance: ");
        Integer chosen = sc.nextInt();

        switch (chosen){
            case 1:
                System.out.println(laptopCharge.plugIn());
                break;
            case 2:
                System.out.println(refrigeratorCooling.plugIn());
                break;
            case 3:
                System.out.println(phoneCharging.plugIn());
                break;
            case 4:
                System.out.println("\n\nActivity: Adapter Pattern");
                System.out.println("Progammed by: Hannah Condada | 3 - BSCS - 1");
                System.exit(0);
        }

        System.out.println();
        main(args);

    }

    public static void MENU(){
        System.out.println("APPLIANCES");
        System.out.println("1. Laptop");
        System.out.println("2. Refrigerator");
        System.out.println("3. Smart Phone");
        System.out.println("4. Exit");
    }

}
