package com.company;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        int a = 0;
        while(a==0){
            int wybor;
            System.out.println("Wybierz rodzaj bryły:\n1.Walec\n2.Kula\n3.Pręt\n4.Zakończ"); //menu
            Scanner co = new Scanner(System.in);
            wybor = co.nextInt();

            switch(wybor){
                case 1:{
                    System.out.println("Wybrano walec.\nPodaj masę walca: ");
                    Scanner ile1 = new Scanner(System.in);
                    int m = ile1.nextInt();

                    System.out.println("Podaj promień walca: ");
                    Scanner ile2 = new Scanner(System.in);
                    int r = ile2.nextInt();

                    walec nowy = new walec(m,r);
                    nowy.momentGlowny();

                    System.out.println("Podaj odległość od osi: ");
                    Scanner ile3 = new Scanner(System.in);
                    int l = ile3.nextInt();

                    nowy.momentStainer(1);
                    break;
                }
                case 2:{
                    System.out.println("Wybrano kulę.\nPodaj masę kuli: ");
                    Scanner ile1 = new Scanner(System.in);
                    int m = ile1.nextInt();

                    System.out.println("Podaj promień kuli: ");
                    Scanner ile2 = new Scanner(System.in);
                    int r = ile2.nextInt();

                    kula nowy = new kula(m,r);
                    nowy.momentGlowny();

                    System.out.println("Podaj odległość od osi: ");
                    Scanner ile3 = new Scanner(System.in);
                    int l = ile3.nextInt();

                    nowy.momentStainer(1);
                    break;
                }
                case 3:{
                    System.out.println("Wybrano pręt.\nPodaj masę pręta: ");
                    Scanner ile1 = new Scanner(System.in);
                    int m = ile1.nextInt();

                    System.out.println("Podaj długość pręta: ");
                    Scanner ile2 = new Scanner(System.in);
                    int r = ile2.nextInt();

                    pret nowy = new pret(m,r);
                    nowy.momentGlowny();

                    System.out.println("Podaj odległość od osi: ");
                    Scanner ile3 = new Scanner(System.in);
                    int l = ile3.nextInt();

                    nowy.momentStainer(1);
                    break;
                }
                case 4:{
                    a = 1;
                    break;
                }
            }
        }
    }
}
