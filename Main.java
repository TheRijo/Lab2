package com.company;

public class Main {

    public static void main(String[] args) {

        walec pierwszy = new walec(3,3);            //tworzy obiekt walca

        kula drugi = new kula (4,4);                //twrzy obiekt kuli

        pret trzeci = new pret (5,5);               //tworzy obiekt pręta

        pierwszy.opis();                                   //wywoływanie kolejnychmetod dla walca
        pierwszy.masa();
        pierwszy.getPromien();
        pierwszy.momentGlowny();
        pierwszy.momentStainer(4);

        drugi.opis();                                       //wywoływanie kolejnych metod dla kuli
        drugi.masa();
        drugi.getPromien();
        drugi.momentGlowny();
        drugi.momentStainer(4);

        trzeci.opis();                                      //wywoływanie kolejnych metod dla pręta
        trzeci.getDlugosc();
        trzeci.momentGlowny();
        trzeci.momentGlowny();
        trzeci.momentStainer(4);

        int a = 3;                                          //ustala wielkość tablicy
        punktMaterialny[] zbior = new punktMaterialny[a];   //tworzy tablicę obiektów
        for(int i = 1; i <= a/3; i++){                      //tworzy obiekty w tablicy
            walec x = new walec(i , i+1);
            zbior[i-1] = x;
            kula z = new kula(i,i+1);
            zbior[i] = z;
            pret y = new pret(i, i+1);
            zbior[i+1] = y;
        }
        for(int i = 0; i < a; i++){                         //wywoływanie kolejnych metod dla kolejnych obiektów tablicy
            zbior[i].opis();
            zbior[i].masa();
            zbior[i].momentGlowny();
            zbior[i].momentStainer(4);
        }
    }
}
