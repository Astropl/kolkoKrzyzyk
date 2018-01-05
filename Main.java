import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String tab[][] = new String[3][3];
        String znak; //= "0";
        String podajPole = "0";
        //String checkWin;
        CheckWin checkWin = new CheckWin();
        Boolean stanWygranej = false;
        //String checkWin;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        PlanszaPierwsza planszaPierwsza = new PlanszaPierwsza();
        RysujPlansze rysujPlansze = new RysujPlansze();
        planszaPierwsza.planszaPierwsza();
        System.out.println("Wybierz czy grasz z kolegą czy z komputerem.\n1. Z komputerem.\n2. Z kolegą");
        int wybor = 0; // WYBOR to wybor 1 komputer 2 z kolega
        do {
            wybor = sc.nextInt();
            if (wybor == 1) {
                System.out.println(" Grasz z komputerem. Twój pierwszy ruch.\nGrasz znakami X");
            } else if (wybor == 2) {
                System.out.println(" Grasz z kolegą Twój pierwszy ruch.\nGrasz znakami X, a kolega O");
            } else {
                System.out.println(" Wybrany zły numer. Wybierz ponownie");
            }
        } while ((wybor != 1) && (wybor != 2));

        for (int i = 0; i < 100; i++) {// ZMIenic pozniej na petle while

            // musze zrobic dwa wybory. jeden dla kmputera z czlowiekem drugi dla czlowiek - czlowiek
            if ( wybor ==1)
            {System.out.println("\nPodaj pole np a1,a2,a3  b1,b2,b3  c1,c2,c3  i po enterze nacisnij znak x lub o :");
                podajPole = sc.next();// SPrawdzic
                // Sprawdzic czy podane a1 a2 ...


                znak = sc.next();

                //sprawdzic czy podal x lub o
                rysujPlansze.podajPole(podajPole, znak);
                //rysujPlansze.checkWin();
                if (rysujPlansze.stanWygranej == true) {
                    System.out.println("Koniec.");
                    i = 100;
                }

                int znak1 = rd.nextInt(9);
                if (znak1 == 1) {
                    podajPole = "a1";
                } else if (znak1 == 2) {
                    podajPole = "a2";
                } else if (znak1 == 3) {
                    podajPole = "a3";
                } else if (znak1 == 4) {
                    podajPole = "b1";
                } else if (znak1 == 5) {
                    podajPole = "b2";
                } else if (znak1 == 6) {
                    podajPole = "b3";
                } else if (znak1 == 7) {
                    podajPole = "c1";
                } else if (znak1 == 8) {
                    podajPole = "c2";
                } else if (znak1 == 9) {
                    podajPole = "c3";
                }

                //System.out.println(" Cos poszło nie tak. Losuję jeszcze raz.");}

            }


// wybor gracza czy komputer zrobie za pomoca modulo.

//=====================================================================
   /*         if (wybor == 1) {
                int znak1 = rd.nextInt(9);
// teraz przypisuje kazdemu rd nowy znak 1 = a1 2 = a2 itd
                if (znak1 == 1) {
                    podajPole = "a1";
                } else if (znak1 == 2) {
                    podajPole = "a2";
                } else if (znak1 == 3) {
                    podajPole = "a3";
                } else if (znak1 == 4) {
                    podajPole = "b1";
                } else if (znak1 == 5) {
                    podajPole = "b2";
                } else if (znak1 == 6) {
                    podajPole = "b3";
                } else if (znak1 == 7) {
                    podajPole = "c1";
                } else if (znak1 == 8) {
                    podajPole = "c2";
                } else if (znak1 == 9) {
                    podajPole = "c3";
                }

                //System.out.println(" Cos poszło nie tak. Losuję jeszcze raz.");}
                else {
                    //zabrałem z toad
                }
            }// trzeba zrobic aby znak sie sam podawał przy wyborze  gry z komputerem*/
           // podajPole = sc.next();
           znak = "o";
            //rysujPlansze.podajPole(podajPole);

            rysujPlansze.podajPole(podajPole, znak);
            //rysujPlansze.checkWin();
            if (rysujPlansze.stanWygranej == true) {
                System.out.println("Koniec.");
                i = 100;
            }
            //checkWin.checkWin();

        }
//rysujPlansze(podajPole,znak)

        // zrobic obsługę wygranych :>


    }

}

