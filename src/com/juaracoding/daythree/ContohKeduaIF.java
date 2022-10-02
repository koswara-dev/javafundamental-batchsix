package com.juaracoding.daythree;

public class ContohKeduaIF {
    public static void main(String[] args) {
        //Program mendeteksi bilangan ganjil atau genap
        int platNomor = 3028;
        if(platNomor % 2 == 1){ // 0 == 1
            System.out.println("Plat Nomor "+platNomor+" adalah ganjil");
        } else {
            System.out.println("Plat Nomor "+platNomor+" adalah genap");
        }
    }
}
