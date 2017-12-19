public class RysujTablice {

    public void tablica()

    {
        String[][] tab = new String[3][3];
        tab[0][0] = " ";
        tab[0][1] = " ";
        tab[0][2] = " ";
        tab[1][0] = " ";
        tab[1][1] = " ";
        tab[1][2] = " ";
        tab[2][0] = " ";
        tab[2][1] = " ";
        tab[2][2] = " ";
        System.out.println("    1 , 2 , 3 ");
        System.out.println("  -------------");
        System.out.println("a | "+ tab[0][0] + " | "+ tab[0][1]+" | "+ tab[0][2]+" |");
        System.out.println("b | "+ tab[1][0] + " | "+ tab[1][1]+" | "+ tab[1][2]+" |");
        System.out.println("c | "+ tab[2][0] + " | "+ tab[2][1]+" | "+ tab[2][2]+" |");
        System.out.println("  -------------");

        //return;

    }

    /*int[][] tablica = new int[3][3];
    tablica[2][1]=5;
    int zmienna = tablica[2][1];*/

}