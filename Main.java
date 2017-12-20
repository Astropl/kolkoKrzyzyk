import javafx.scene.control.Tab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PlanszaPierwsza planszaPierwsza = new PlanszaPierwsza();
        RysujPlansze rysujPlansze = new RysujPlansze();
        planszaPierwsza.planszaPierwsza();
        for (int i = 0; i < 9; i++) {
            System.out.println("\nPodaj pole i po enterze znak ( a1 ) x lub o");
            String podajPole = sc.nextLine();
            String znak = sc.nextLine();

            //rysujPlansze.podajPole(podajPole);
            rysujPlansze.podajPole(podajPole, znak);
        }
//rysujPlansze(podajPole,znak)
    }
}