import javafx.scene.control.Tab;

public class Main {

    public static void main(String[] args) {
        int x=0, y=0;
        String okreslPole ="";
        Tab tab = new Tab();
        RysujTablice rysujTablice = new RysujTablice();
        rysujTablice.tablica(okreslPole,x,y);
        //tab ();
        OkreslRuch okreslRuch = new OkreslRuch();
        String wstaw = "";
        okreslPole = "";
        okreslRuch.ruch(wstaw, okreslPole, x, y);
        //okreslRuch.ruch();

        //okreslPole();


    }

    private static void tab() {

    }
}
