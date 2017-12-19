import java.util.Scanner;

public class OkreslRuch {
    public void ruch(String wstaw, String okreslPole, int x, int y) {
        System.out.println(" Okresl miejsce gdzie chcesz wstawić X \n np wpisz a1, a2, a3, b1, b2, b3, c1 ,c2, c3");
        Scanner sc = new Scanner(System.in);
        wstaw = sc.next();
        if (wstaw.equals("a1")) {
            okreslPole = "X";
            x = 0;
            y = 0;
            RysujTablice rysujTablice = new RysujTablice();
            //rysujTablice(wstaw);
            rysujTablice.tablica(okreslPole, x, y);
        }
            else if (wstaw.equals("a2")) {
                okreslPole = "X";
                x = 0;
                y = 1;
                RysujTablice rysujTablice = new RysujTablice();
                //rysujTablice(wstaw);
                rysujTablice.tablica(okreslPole,x,y);
            return;

        }


        return;
    }

}
