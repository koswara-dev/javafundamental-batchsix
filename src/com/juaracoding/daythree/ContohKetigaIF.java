package com.juaracoding.daythree;

public class ContohKetigaIF {
    public static void main(String[] args) {
        //Konversi Nilai ke Predikat
        // A = 91 - 100, B = 85 - 90, C = 78 - 84
        double nilai = 91;
        if (nilai > 90){ // 90 > 90
            System.out.println("Predikat A");
        } else if(nilai > 84) { // 90 > 84
            System.out.println("Predikat B");
        } else {
            System.out.println("Predikat C");
        }
    }
}
