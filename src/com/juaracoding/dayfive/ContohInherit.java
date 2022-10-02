package com.juaracoding.dayfive;

class Calculation {
    int hasil;
    void pengurangan(int a, int b){
        hasil = a-b;
        System.out.println(hasil);
    }
}

public class ContohInherit extends Calculation {

    void perkalian(int a, int b){
        hasil = a * b;
        System.out.println(hasil);
    }

    public static void main(String[] args) {
        ContohInherit contohInherit = new ContohInherit();
        contohInherit.perkalian(10, 5);
        contohInherit.pengurangan(20, 9);

//        Calculation calculation = new Calculation();
    }
}
