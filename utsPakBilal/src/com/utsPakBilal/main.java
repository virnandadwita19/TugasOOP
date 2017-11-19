package com.utsPakBilal;

/*Dibuat Oleh GRUB A

Program Membuat Karakter dengan system OOP. Yang beranggotakan 4 orang
1. Moch Fiqih Burhanuddin - Test.java(main.java)
2. Ardi Wibowo - Sprite.java
3. Virnanda Dwita - Actor.java
4. M Harliansah W - Create.java
*/

import java.util.Scanner;

public class main {
    public static void main(String[]args) {
		// Dibuat Oleh Moch Fiqih Burhanuddin
		
		Scanner userAction = new Scanner(System.in);
        int menuChoose;
        Create hero = new Create();
        do {
            System.out.println("Membuat Karakter");
            System.out.println(
                    "1. Buat Karakter\n" +
                    "2. Kelakuan /  behavior\n" +
                    "0. Exit Aplikasi\n" +
                    "Masukkan kode pilihan anda  : "
            );
            menuChoose = userAction.nextInt();
            if (menuChoose == 1){
                hero.buatHero();
            }else if (menuChoose == 2){
                do {menuChoose = 0;
                    System.out.println("\nBehavior / kelakuan \n" +
                            "1. Kenalan\n" +
                            "2. Berjalan\n" +
                            "3. Lari\n" +
                            "4. Lompat\n" +
                            "5. Display detail Hero\n" +
                            "99. Exit Behavior\n" +
                            "Masukkan kode pilihan anda  : "
                    );
                    menuChoose = userAction.nextInt();
                    if (menuChoose == 1){
                        hero.heroKenalan();
                    }else if(menuChoose == 2){
                        String arahJalan;
                        System.out.println("Masukkan Arah Jalan hero : ");
                        arahJalan = userAction.next();
                        hero.heroBerjalan(arahJalan);
                        System.out.println("\n\n");
                    }else if (menuChoose == 3){
                        hero.heroLari();
                    }else if(menuChoose == 4){
                        int lompat;
                        System.out.println("Berapa Kali : ");
                        lompat = userAction.nextInt();
                        hero.heroLompat(lompat);
                    }else if (menuChoose == 5){
                    hero.displayDetail();
                    }
                }while (menuChoose!=99);
            }
        }while (menuChoose!=0);
    }
}
