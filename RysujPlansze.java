import java.util.Scanner;

public class RysujPlansze {

    private String podajPole;
    private String znak;
    private String tab[][] = new String[3][3];
    public static String checkWin;
    public boolean stanWygranej = false;
    public boolean stanZajetosci = false;
    int u = 0;
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


    // jak zrobic aby w tabeli zamiast null bylo  " " ? ok
    {
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++)
                tab[j][k] = " ";
        }
    }


    //******************88

    public void podajPole(String podajPole, String znak) {
        this.podajPole = podajPole;
        this.znak = znak;


        do {



            //for (int i = 0; i < 20; i++) {
            System.out.println(" ");

            if (podajPole.equals("a1")) {
                if ((tab[0][0] == "X") || (tab[0][0] == "O")) {
                    System.out.println("     *************");
                    System.out.println("TO POLE JUZ JEST ZAJETE");
                    System.out.println("     *************\n");

                    System.out.println("   1  . 2 . 3");
                    System.out.println("  *************");
                    System.out.println("a | " + tab[0][0] + " | " + tab[0][1] + " | " + tab[0][2] + " |");
                    System.out.println("b | " + tab[1][0] + " | " + tab[1][1] + " | " + tab[1][2] + " |");
                    System.out.println("c | " + tab[2][0] + " | " + tab[2][1] + " | " + tab[2][2] + " |");
                    System.out.println("  *************");
                    //podajPole.
                    stanZajetosci = true;

                    return;
                } else {
                    if (znak.equals(" ")) {
                        tab[0][0] = "P";
                    } else if (znak.equals("x")) {
                        tab[0][0] = "X";
                    } else if (znak.equals("o")) {
                        tab[0][0] = "O";
                    } else {
                        System.out.println("Nie poprawny znak. Podaj współrzędne i znak jeszcze raz");
                    }
                }
            }
            if (podajPole.equals("a2")) {
                if ((tab[0][1] == "X") || (tab[0][1] == "O")) {
                    System.out.println("     *************");
                    System.out.println("TO POLE JUZ JEST ZAJETE");
                    System.out.println("     *************\n");

                    System.out.println("   1  . 2 . 3");
                    System.out.println("  *************");
                    System.out.println("a | " + tab[0][0] + " | " + tab[0][1] + " | " + tab[0][2] + " |");
                    System.out.println("b | " + tab[1][0] + " | " + tab[1][1] + " | " + tab[1][2] + " |");
                    System.out.println("c | " + tab[2][0] + " | " + tab[2][1] + " | " + tab[2][2] + " |");
                    System.out.println("  *************");
                    stanZajetosci = true;
                    return;
                } else {
                    if (znak.equals(" ")) {
                        tab[0][1] = "P";
                    } else if (znak.equals("x")) {
                        tab[0][1] = "X";
                    } else if (znak.equals("o")) {
                        tab[0][1] = "O";
                    } else {
                        System.out.println("Nie poprawny znak. Podaj współrzędne i znak jeszcze raz");
                    }
                }
            }

            if (podajPole.equals("a3")) {
                if ((tab[0][2] == "X") || (tab[0][2] == "O")) {
                    System.out.println("     *************");
                    System.out.println("TO POLE JUZ JEST ZAJETE");
                    System.out.println("     *************\n");

                    System.out.println("   1  . 2 . 3");
                    System.out.println("  *************");
                    System.out.println("a | " + tab[0][0] + " | " + tab[0][1] + " | " + tab[0][2] + " |");
                    System.out.println("b | " + tab[1][0] + " | " + tab[1][1] + " | " + tab[1][2] + " |");
                    System.out.println("c | " + tab[2][0] + " | " + tab[2][1] + " | " + tab[2][2] + " |");
                    System.out.println("  *************");
                    stanZajetosci = true;
                    return;
                } else {
                    if (znak.equals(" ")) {
                        tab[0][2] = "P";

                    } else if (znak.equals("x")) {
                        tab[0][2] = "X";

                    } else if (znak.equals("o")) {
                        tab[0][2] = "O";

                    } else {
                        System.out.println("Nie poprawny znak. Podaj współrzędne i znak jeszcze raz");
                    }
                }
            }

// Druga linia w tabeli
            if (podajPole.equals("b1")) {
                if ((tab[1][0] == "X") || (tab[1][0] == "O")) {
                    System.out.println("     *************");
                    System.out.println("TO POLE JUZ JEST ZAJETE");
                    System.out.println("     *************\n");

                    System.out.println("   1  . 2 . 3");
                    System.out.println("  *************");
                    System.out.println("a | " + tab[0][0] + " | " + tab[0][1] + " | " + tab[0][2] + " |");
                    System.out.println("b | " + tab[1][0] + " | " + tab[1][1] + " | " + tab[1][2] + " |");
                    System.out.println("c | " + tab[2][0] + " | " + tab[2][1] + " | " + tab[2][2] + " |");
                    System.out.println("  *************");
                    stanZajetosci = true;
                    return;
                } else {
                    if (znak.equals(" ")) {
                        tab[1][0] = "P";

                    } else if (znak.equals("x")) {
                        tab[1][0] = "X";

                    } else if (znak.equals("o")) {
                        tab[1][0] = "O";

                    } else {
                        System.out.println("Nie poprawny znak. Podaj współrzędne i znak jeszcze raz");
                    }
                }
            }
            if (podajPole.equals("b2")) {
                if ((tab[1][1] == "X") || (tab[1][1] == "O")) {
                    System.out.println("     *************");
                    System.out.println("TO POLE JUZ JEST ZAJETE");
                    System.out.println("     *************\n");

                    System.out.println("   1  . 2 . 3");
                    System.out.println("  *************");
                    System.out.println("a | " + tab[0][0] + " | " + tab[0][1] + " | " + tab[0][2] + " |");
                    System.out.println("b | " + tab[1][0] + " | " + tab[1][1] + " | " + tab[1][2] + " |");
                    System.out.println("c | " + tab[2][0] + " | " + tab[2][1] + " | " + tab[2][2] + " |");
                    System.out.println("  *************");
                    stanZajetosci = true;
                    return;
                }
                if (znak.equals(" ")) {
                    tab[1][1] = "P";

                } else if (znak.equals("x")) {
                    tab[1][1] = "X";

                } else if (znak.equals("o")) {
                    tab[1][1] = "O";

                } else {
                    System.out.println("Nie poprawny znak. Podaj współrzędne i znak jeszcze raz");
                }
            }
            if (podajPole.equals("b3")) {
                if ((tab[1][2] == "X") || (tab[1][2] == "O")) {
                    System.out.println("     *************");
                    System.out.println("TO POLE JUZ JEST ZAJETE");
                    System.out.println("     *************\n");

                    System.out.println("   1  . 2 . 3");
                    System.out.println("  *************");
                    System.out.println("a | " + tab[0][0] + " | " + tab[0][1] + " | " + tab[0][2] + " |");
                    System.out.println("b | " + tab[1][0] + " | " + tab[1][1] + " | " + tab[1][2] + " |");
                    System.out.println("c | " + tab[2][0] + " | " + tab[2][1] + " | " + tab[2][2] + " |");
                    System.out.println("  *************");
                    stanZajetosci = true;
                    return;
                } else {
                    if (znak.equals(" ")) {
                        tab[1][2] = "P";

                    } else if (znak.equals("x")) {
                        tab[1][2] = "X";

                    } else if (znak.equals("o")) {
                        tab[1][2] = "O";

                    } else {
                        System.out.println("Nie poprawny znak. Podaj współrzędne i znak jeszcze raz");
                    }
                }

            }

            if (podajPole.equals("c1")) {
                if ((tab[2][0] == "X") || (tab[2][0] == "O")) {
                    System.out.println("     *************");
                    System.out.println("TO POLE JUZ JEST ZAJETE");
                    System.out.println("     *************\n");

                    System.out.println("   1  . 2 . 3");
                    System.out.println("  *************");
                    System.out.println("a | " + tab[0][0] + " | " + tab[0][1] + " | " + tab[0][2] + " |");
                    System.out.println("b | " + tab[1][0] + " | " + tab[1][1] + " | " + tab[1][2] + " |");
                    System.out.println("c | " + tab[2][0] + " | " + tab[2][1] + " | " + tab[2][2] + " |");
                    System.out.println("  *************");
                    stanZajetosci = true;
                    return;
                } else {
                    if (znak.equals(" ")) {
                        tab[2][0] = "P";

                    } else if (znak.equals("x")) {
                        tab[2][0] = "X";

                    } else if (znak.equals("o")) {
                        tab[2][0] = "O";

                    } else {
                        System.out.println("Nie poprawny znak. Podaj współrzędne i znak jeszcze raz");
                    }
                }
            }
            if (podajPole.equals("c2")) {
                if ((tab[2][1] == "X") || (tab[2][1] == "O")) {
                    System.out.println("     *************");
                    System.out.println("TO POLE JUZ JEST ZAJETE");
                    System.out.println("     *************\n");

                    System.out.println("   1  . 2 . 3");
                    System.out.println("  *************");
                    System.out.println("a | " + tab[0][0] + " | " + tab[0][1] + " | " + tab[0][2] + " |");
                    System.out.println("b | " + tab[1][0] + " | " + tab[1][1] + " | " + tab[1][2] + " |");
                    System.out.println("c | " + tab[2][0] + " | " + tab[2][1] + " | " + tab[2][2] + " |");
                    System.out.println("  *************");
                    stanZajetosci = true;
                    return;
                }
                if (znak.equals(" ")) {
                    tab[2][1] = "P";

                } else if (znak.equals("x")) {
                    tab[2][1] = "X";

                } else if (znak.equals("o")) {
                    tab[2][1] = "O";

                } else {
                    System.out.println("Nie poprawny znak. Podaj współrzędne i znak jeszcze raz");
                }
            }
            if (podajPole.equals("c3")) {
                if ((tab[2][2] == "X") || (tab[2][2] == "O")) {
                    System.out.println("     *************");
                    System.out.println("TO POLE JUZ JEST ZAJETE");
                    System.out.println("     *************\n");

                    System.out.println("   1  . 2 . 3");
                    System.out.println("  *************");
                    System.out.println("a | " + tab[0][0] + " | " + tab[0][1] + " | " + tab[0][2] + " |");
                    System.out.println("b | " + tab[1][0] + " | " + tab[1][1] + " | " + tab[1][2] + " |");
                    System.out.println("c | " + tab[2][0] + " | " + tab[2][1] + " | " + tab[2][2] + " |");
                    System.out.println("  *************");
                    stanZajetosci = true;
                    return;
                } else {
                    if (znak.equals(" ")) {
                        tab[2][2] = "P";

                    } else if (znak.equals("x")) {
                        tab[2][2] = "X";

                    } else if (znak.equals("o")) {
                        tab[2][2] = "O";

                    } else {
                        System.out.println("Nie poprawny znak. Podaj współrzędne i znak jeszcze raz");
                    }
                }

            }// koniec if c3

            {
//koniec


                System.out.println("   1  . 2 . 3");
                System.out.println("  *************");
                System.out.println("a | " + tab[0][0] + " | " + tab[0][1] + " | " + tab[0][2] + " |");
                System.out.println("b | " + tab[1][0] + " | " + tab[1][1] + " | " + tab[1][2] + " |");
                System.out.println("c | " + tab[2][0] + " | " + tab[2][1] + " | " + tab[2][2] + " |");
                System.out.println("  *************");


            }
            // a moze tutaj sprawdzenie.
            //public String checkWin {
            //this.checkWin = checkWin;
// 1 rzad X
            if ((tab[0][0] == "X") && (tab[0][1] == "X") && (tab[0][2] == "X")) {
                System.out.println("WYGRANA X");
                this.stanWygranej = true;
            } else {
                //System.out.println("juz blisko");
            }

            // 2 rzad X
            if ((tab[1][0] == "X") && (tab[1][1] == "X") && (tab[1][2] == "X")) {
                System.out.println("WYGRANA X");
                this.stanWygranej = true;
            } else {
                //System.out.println("juz blisko");
            }

            // 3 razd X
            if ((tab[2][0] == "X") && (tab[2][1] == "X") && (tab[2][2] == "X")) {
                System.out.println("WYGRANA X");
                this.stanWygranej = true;
            } else {
                //System.out.println("juz blisko");
            }

            // 1 kolumna x
            if ((tab[0][0] == "X") && (tab[1][0] == "X") && (tab[2][0] == "X")) {
                System.out.println("WYGRANA X");
                this.stanWygranej = true;
            } else {
                //System.out.println("juz blisko");
            }
            // 2 kolumna x
            if ((tab[0][1] == "X") && (tab[1][1] == "X") && (tab[2][1] == "X")) {
                System.out.println("WYGRANA X");
                this.stanWygranej = true;
            } else {
                //System.out.println("juz blisko");
            }


            //3 kolumna X
            if ((tab[0][2] == "X") && (tab[1][2] == "X") && (tab[2][2] == "X")) {
                System.out.println("WYGRANA X");
                this.stanWygranej = true;
            } else {
                //System.out.println("juz blisko");
            }

            // na ukos z prawej do lewej X
            if ((tab[0][0] == "X") && (tab[1][1] == "X") && (tab[2][2] == "X")) {
                System.out.println("WYGRANA X");
                this.stanWygranej = true;
            } else {
                //System.out.println("juz blisko");
            }
            // na ukos z lewej do prawej


            if ((tab[0][2] == "X") && (tab[1][1] == "X") && (tab[2][0] == "X")) {
                System.out.println("WYGRANA X");
                this.stanWygranej = true;
            } else {
                //System.out.println("juz blisko");
            }
            // 1 rzad O************************************************************************
            // 1 rzad o
            if ((tab[0][0] == "O") && (tab[0][1] == "O") && (tab[0][2] == "O")) {
                System.out.println("WYGRANA O");
                this.stanWygranej = true;
            } else {
                //System.out.println("juz blisko");
            }

            // 2 rzad O
            if ((tab[1][0] == "O") && (tab[1][1] == "O") && (tab[1][2] == "O")) {
                System.out.println("WYGRANA O");
                this.stanWygranej = true;
            } else {
                //System.out.println("juz blisko");
            }

            // 3 razd O
            if ((tab[2][0] == "O") && (tab[2][1] == "O") && (tab[2][2] == "O")) {
                System.out.println("WYGRANA O");
                this.stanWygranej = true;
            } else {
                //System.out.println("juz blisko");
            }

            // 1 kolumna O
            if ((tab[0][0] == "O") && (tab[1][0] == "O") && (tab[2][0] == "O")) {
                System.out.println("WYGRANA O");
                this.stanWygranej = true;
            } else {
                //System.out.println("juz blisko");
            }
            // 2 kolumna O
            if ((tab[0][1] == "O") && (tab[1][1] == "O") && (tab[2][1] == "O")) {
                System.out.println("WYGRANA O");
                this.stanWygranej = true;
            } else {
                //System.out.println("juz blisko");
            }


            //3 kolumna O
            if ((tab[0][2] == "O") && (tab[1][2] == "O") && (tab[2][2] == "O")) {
                System.out.println("WYGRANA O");
                this.stanWygranej = true;
            } else {
                //System.out.println("juz blisko");
            }

            // na ukos z prawej do lewej O
            if ((tab[0][0] == "O") && (tab[1][1] == "O") && (tab[2][2] == "O")) {
                System.out.println("WYGRANA O");
                this.stanWygranej = true;
            } else {
                //System.out.println("juz blisko");
            }
            // na ukos z lewej do prawej O


            if ((tab[0][2] == "O") && (tab[1][1] == "O") && (tab[2][0] == "O")) {
                System.out.println("WYGRANA O");
                this.stanWygranej = true;
            } else {
                //System.out.println("juz blisko");
            }
            // Koniec ***********************************************************************88

            //this.stanWygranej = true;
            //System.out.println(" Sprawdz zy wygrana");
            //return checkWin;


        }while (u < 20) ;
    }
}


