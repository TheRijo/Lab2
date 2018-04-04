package com.company;

public class kula extends punktMaterialny {
    int R;
    public kula(){                      //konstruktor domyślny
        super();
        R = 1;
    }
    public kula(int m, int r){          //konstruktor z parametrem
        super(m);
        if (r > 0){
            R = r;
        }
        else{
            System.out.println("Promień jest wielkością dodatnią!");
        }
    }
    public int getPromien(){             //akcesor
        System.out.println(R);
        return R;
    }
    public int zmianaPromien(int r){    //metoda zmieniająca promienia
        R = r;
        System.out.println(R);
        return R;
    }
    public double momentGlowny(){       //metody obliczająca moment glówny
        I = (2/5.0)*masa*R*R;
        System.out.println(I);
        return I;
    }
    public void opis(){                 //metoda zwracająca opis obiektu
        System.out.println("Kula");
    }
}
