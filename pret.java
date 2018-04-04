package com.company;

public class pret extends punktMaterialny {
    int L;
    public pret(){                                                  //konstruktor domyślny
        super();
        L = 1;
    }
    public pret(int m, int l){                                      //konstruktor z parametrami
        super(m);
        if(l > 0){
            L = 1;
        }
        else{
            System.out.println("Długość jest wielkośćią dodatnią!");
        }
    }
    public int getDlugosc(){                                        //akcesor
        System.out.println(L);
        return L;
    }
    public int zmianaDługosc(){                                     //metoda zmieniająca długość
        L =1;
        System.out.println(L);
        return L;
    }
    public double momentGlowny(){                                   //metoda obliczająca moment główny
        I = (1/12.0)*masa*L*L;
        System.out.println(I);
        return I;
    }
    public void opis(){                                             //metoda zwracająca opis obiektu
        System.out.println("Pręt");
    }
}
