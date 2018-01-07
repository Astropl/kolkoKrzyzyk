import javafx.scene.control.Tab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD

=======
String tab[][] = new String[3][3];
>>>>>>> master
        Scanner sc = new Scanner(System.in);
        PlanszaPierwsza planszaPierwsza = new PlanszaPierwsza();
        RysujPlansze rysujPlansze = new RysujPlansze();
        planszaPierwsza.planszaPierwsza();
<<<<<<< HEAD
        for (int i = 0; i < 9; i++) {
            System.out.println("\nPodaj pole i po enterze znak ( a1 ) x lub o");
=======
        for (int i = 0; i < 100; i++) {// ZMIenic pozniej na petle while
            System.out.println("\nPodaj pole np a1,a2,a3  b1,b2,b3  c1,c2,c3  i po enterze nacisnij znak x lub o :");


>>>>>>> master
            String podajPole = sc.nextLine();
            String znak = sc.nextLine();

            //rysujPlansze.podajPole(podajPole);
            rysujPlansze.podajPole(podajPole, znak);
        }
//rysujPlansze(podajPole,znak)
<<<<<<< HEAD
=======

        // zrobic obsługę wygranych :>


>>>>>>> master
    }
}