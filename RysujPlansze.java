import java.util.Scanner;

public class RysujPlansze {

    private String podajPole;
    private String znak;
    private String tab[][] = new String[3][3];

    public String getPodajPole() {
        return podajPole;
    }

    public void setPodajPole(String podajPole) {
        this.podajPole = podajPole;
    }

    public String getZnak() {
        return znak;
    }

    public void setZnak(String znak) {
        this.znak = znak;
    }


    //for (int i =0; i< 3; i++)


    public void podajPole(String podajPole, String znak) {
        this.podajPole = podajPole;
        this.znak = znak;
        for (int i = 0; i < 20; i++) {
            System.out.println(" ");
        }
        if (podajPole.equals("a1")) {
            if ((tab[0][0] == "X") || (tab[0][0] == "O")) {
                System.out.println("te pole jest zajęte już");
                /*System.out.println(tab[0][0] + tab[0][1] + tab[0][2]);
                System.out.println(tab[1][0] + tab[1][1] + tab[1][2]);
                System.out.println(tab[2][0] + tab[2][1] + tab[2][2]);*/
                System.out.println("   1  . 2 . 3");
                System.out.println("  *************");
                System.out.println("a | "+tab[0][0]+" | "+tab[0][1] + " | " + tab[0][2]+" |");
                System.out.println("b | "+tab[1][0]+" | "+tab[1][1] + " | " + tab[1][2]+" |");
                System.out.println("c | "+tab[2][0]+" | "+tab[2][1] + " | " + tab[2][2]+" |");
                System.out.println("  *************");
                return;
            } else {
                if (znak.equals(" ")) {
                    tab[0][0] = "P";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                } else if (znak.equals("x")) {
                    tab[0][0] = "X";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                } else {
                    tab[0][0] = "O";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                }
            }
        }
        if (podajPole.equals("a2")) {
            if ((tab[0][1] == "X") || (tab[0][1] == "O")) {
                System.out.println("te pole jest zajęte już");
                /*System.out.println(tab[0][0] + tab[0][1] + tab[0][2]);
                System.out.println(tab[1][0] + tab[1][1] + tab[1][2]);
                System.out.println(tab[2][0] + tab[2][1] + tab[2][2]);*/
                System.out.println("   1  . 2 . 3");
                System.out.println("  *************");
                System.out.println("a | " + tab[0][0] + " | " + tab[0][1] + " | " + tab[0][2] + " |");
                System.out.println("b | " + tab[1][0] + " | " + tab[1][1] + " | " + tab[1][2] + " |");
                System.out.println("c | " + tab[2][0] + " | " + tab[2][1] + " | " + tab[2][2] + " |");
                System.out.println("  *************");
                return;
            }
            if (znak.equals(" ")) {
                tab[0][1] = "P";
                //tab[0][0] = "P";
                //tab[0][2] = "P";
            } else if (znak.equals("x")) {
                tab[0][1] = "X";
                //tab[0][0] = "P";
                //tab[0][2] = "P";
            } else {
                tab[0][1] = "O";
                //tab[0][0] = "P";
                //tab[0][2] = "P";
            }
        }
        if (podajPole.equals("a3")) {
            if ((tab[0][2] == "X") || (tab[0][2] == "O")) {
                System.out.println("te pole jest zajęte już");
                    /*System.out.println(tab[0][0] + tab[0][1] + tab[0][2]);
                    System.out.println(tab[1][0] + tab[1][1] + tab[1][2]);
                    System.out.println(tab[2][0] + tab[2][1] + tab[2][2]);*/
                System.out.println("   1  . 2 . 3");
                System.out.println("  *************");
                System.out.println("a | "+tab[0][0]+" | "+tab[0][1] + " | " + tab[0][2]+" |");
                System.out.println("b | "+tab[1][0]+" | "+tab[1][1] + " | " + tab[1][2]+" |");
                System.out.println("c | "+tab[2][0]+" | "+tab[2][1] + " | " + tab[2][2]+" |");
                System.out.println("  *************");
                return;
            } else {
                if (znak.equals(" ")) {
                    tab[0][2] = "P";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                } else if (znak.equals("x")) {
                    tab[0][2] = "X";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                } else {
                    tab[0][2] = "O";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                }
            }

        }
// Druga linia w tabeli
        if (podajPole.equals("b1")) {
            if ((tab[1][0] == "X") || (tab[1][0] == "O")) {
                System.out.println("te pole jest zajęte już");
                /*System.out.println(tab[0][0] + tab[0][1] + tab[0][2]);
                System.out.println(tab[1][0] + tab[1][1] + tab[1][2]);
                System.out.println(tab[2][0] + tab[2][1] + tab[2][2]);*/
                System.out.println("   1  . 2 . 3");
                System.out.println("  *************");
                System.out.println("a | "+tab[0][0]+" | "+tab[0][1] + " | " + tab[0][2]+" |");
                System.out.println("b | "+tab[1][0]+" | "+tab[1][1] + " | " + tab[1][2]+" |");
                System.out.println("c | "+tab[2][0]+" | "+tab[2][1] + " | " + tab[2][2]+" |");
                System.out.println("  *************");
                return;
            } else {
                if (znak.equals(" ")) {
                    tab[1][0] = "P";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                } else if (znak.equals("x")) {
                    tab[1][0] = "X";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                } else {
                    tab[1][0] = "O";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                }
            }
        }
        if (podajPole.equals("b2")) {
            if ((tab[1][1] == "X") || (tab[1][1] == "O")) {
                System.out.println("te pole jest zajęte już");
                /*System.out.println(tab[0][0] + tab[0][1] + tab[0][2]);
                System.out.println(tab[1][0] + tab[1][1] + tab[1][2]);
                System.out.println(tab[2][0] + tab[2][1] + tab[2][2]);*/
                System.out.println("   1  . 2 . 3");
                System.out.println("  *************");
                System.out.println("a | " + tab[0][0] + " | " + tab[0][1] + " | " + tab[0][2] + " |");
                System.out.println("b | " + tab[1][0] + " | " + tab[1][1] + " | " + tab[1][2] + " |");
                System.out.println("c | " + tab[2][0] + " | " + tab[2][1] + " | " + tab[2][2] + " |");
                System.out.println("  *************");
                return;
            }
            if (znak.equals(" ")) {
                tab[1][1] = "P";
                //tab[0][0] = "P";
                //tab[0][2] = "P";
            } else if (znak.equals("x")) {
                tab[1][1] = "X";
                //tab[0][0] = "P";
                //tab[0][2] = "P";
            } else {
                tab[1][1] = "O";
                //tab[0][0] = "P";
                //tab[0][2] = "P";
            }
        }
        if (podajPole.equals("b3")) {
            if ((tab[1][2] == "X") || (tab[1][2] == "O")) {
                System.out.println("te pole jest zajęte już");
                    /*System.out.println(tab[0][0] + tab[0][1] + tab[0][2]);
                    System.out.println(tab[1][0] + tab[1][1] + tab[1][2]);
                    System.out.println(tab[2][0] + tab[2][1] + tab[2][2]);*/
                System.out.println("   1  . 2 . 3");
                System.out.println("  *************");
                System.out.println("a | "+tab[0][0]+" | "+tab[0][1] + " | " + tab[0][2]+" |");
                System.out.println("b | "+tab[1][0]+" | "+tab[1][1] + " | " + tab[1][2]+" |");
                System.out.println("c | "+tab[2][0]+" | "+tab[2][1] + " | " + tab[2][2]+" |");
                System.out.println("  *************");
                return;
            } else {
                if (znak.equals(" ")) {
                    tab[1][2] = "P";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                } else if (znak.equals("x")) {
                    tab[1][2] = "X";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                } else {
                    tab[1][2] = "O";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                }
            }

        }

        if (podajPole.equals("c1")) {
            if ((tab[2][0] == "X") || (tab[2][0] == "O")) {
                System.out.println("te pole jest zajęte już");
                /*System.out.println(tab[0][0] + tab[0][1] + tab[0][2]);
                System.out.println(tab[1][0] + tab[1][1] + tab[1][2]);
                System.out.println(tab[2][0] + tab[2][1] + tab[2][2]);*/
                System.out.println("   1  . 2 . 3");
                System.out.println("  *************");
                System.out.println("a | "+tab[0][0]+" | "+tab[0][1] + " | " + tab[0][2]+" |");
                System.out.println("b | "+tab[1][0]+" | "+tab[1][1] + " | " + tab[1][2]+" |");
                System.out.println("c | "+tab[2][0]+" | "+tab[2][1] + " | " + tab[2][2]+" |");
                System.out.println("  *************");
                return;
            } else {
                if (znak.equals(" ")) {
                    tab[2][0] = "P";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                } else if (znak.equals("x")) {
                    tab[2][0] = "X";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                } else {
                    tab[2][0] = "O";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                }
            }
        }
        if (podajPole.equals("c2")) {
            if ((tab[2][1] == "X") || (tab[2][1] == "O")) {
                System.out.println("te pole jest zajęte już");
                /*System.out.println(tab[0][0] + tab[0][1] + tab[0][2]);
                System.out.println(tab[1][0] + tab[1][1] + tab[1][2]);
                System.out.println(tab[2][0] + tab[2][1] + tab[2][2]);*/
                System.out.println("   1  . 2 . 3");
                System.out.println("  *************");
                System.out.println("a | " + tab[0][0] + " | " + tab[0][1] + " | " + tab[0][2] + " |");
                System.out.println("b | " + tab[1][0] + " | " + tab[1][1] + " | " + tab[1][2] + " |");
                System.out.println("c | " + tab[2][0] + " | " + tab[2][1] + " | " + tab[2][2] + " |");
                System.out.println("  *************");
                return;
            }
            if (znak.equals(" ")) {
                tab[2][1] = "P";
                //tab[0][0] = "P";
                //tab[0][2] = "P";
            } else if (znak.equals("x")) {
                tab[2][1] = "X";
                //tab[0][0] = "P";
                //tab[0][2] = "P";
            } else {
                tab[2][1] = "O";
                //tab[0][0] = "P";
                //tab[0][2] = "P";
            }
        }
        if (podajPole.equals("c3")) {
            if ((tab[2][2] == "X") || (tab[2][2] == "O")) {
                System.out.println("te pole jest zajęte już");
                    /*System.out.println(tab[0][0] + tab[0][1] + tab[0][2]);
                    System.out.println(tab[1][0] + tab[1][1] + tab[1][2]);
                    System.out.println(tab[2][0] + tab[2][1] + tab[2][2]);*/
                System.out.println("   1  . 2 . 3");
                System.out.println("  *************");
                System.out.println("a | "+tab[0][0]+" | "+tab[0][1] + " | " + tab[0][2]+" |");
                System.out.println("b | "+tab[1][0]+" | "+tab[1][1] + " | " + tab[1][2]+" |");
                System.out.println("c | "+tab[2][0]+" | "+tab[2][1] + " | " + tab[2][2]+" |");
                System.out.println("  *************");
                return;
            } else {
                if (znak.equals(" ")) {
                    tab[2][2] = "P";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                } else if (znak.equals("x")) {
                    tab[2][2] = "X";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                } else {
                    tab[2][2] = "O";
                    //tab[0][1] = "P";
                    //tab[0][2] = "P";
                }
            }

        }

//koniec

        System.out.println("   1  . 2 . 3");
        System.out.println("  *************");
        System.out.println("a | "+tab[0][0]+" | "+tab[0][1] + " | " + tab[0][2]+" |");
        System.out.println("b | "+tab[1][0]+" | "+tab[1][1] + " | " + tab[1][2]+" |");
        System.out.println("c | "+tab[2][0]+" | "+tab[2][1] + " | " + tab[2][2]+" |");
        System.out.println("  *************");
    }}





