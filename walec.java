package com.company;

public class walec extends punktMaterialny {
    int R;
    public walec(){                                             //konstruktor domyślny
        super();
        R = 1;
    }
    public walec(int m, int r){                                 //konstruktor z paramatrami
        super(m);
        if(r > 0){
            R = r;
        }
        else{
            System.out.println("Promień jest wielkością dodatnią!");
        }
    }
    public int getPromien(){                                    //akcesor promienia
        System.out.println(R);
        return R;
    }
    public int zmianaPromien(int r){                            //metoda zmieniająca promień
        R = r;
        System.out.println(R);
        return R;
    }
    public double momentGlowny(){                               //metoda obliczająca moment główny
        I = (1/2.0)*masa*R*R;
        System.out.println(I);
        return I;
    }
    public void opis(){                                         //metoda zwracająca opis obiektu
        System.out.println("Walec");
    }
}
