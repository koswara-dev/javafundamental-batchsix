package com.juaracoding.daythree;

public class ContohNestedIF {
    public static void main(String[] args) {
        //Program Donor Darah
        //Usia min 17 tahun dan BB min 55
        int usia = 16, beratBadan = 55;
        if (usia >= 17){ // 16 >= 17
            if(beratBadan >= 55){
                System.out.println("Bisa donor darah");
            } else {
                System.out.println("Belum bisa donor darah karena berat badan kurang dari 55");
            }
        } else {
            System.out.println("Belum bisa donor darah karena usia kurang dari 17 tahun");
        }

        /*
         * Laki-laki belum menikah 10%, menikah 5%
         * Perempuan belum menikah 5%, menikah 2%
         * Pendapatan > 7jt wajib pajak
         */
    }
}
