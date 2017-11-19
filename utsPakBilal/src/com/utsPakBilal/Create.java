package com.utsPakBilal;

/*Dibuat Oleh M Harliansah W - Create.java
*/

import java.util.Scanner;

public class Create extends Actor{
    Scanner input_User = new Scanner(System.in);

    //Function Create Hero
    public void buatHero() {
        //Input user untuk membuat karakter
        System.out.println("\nBuat Karakter");
        System.out.println("Masukkan Nama Karakter : ");
        this.setSprite_Name(input_User.next());
        System.out.println("Masukkan Job karakter : ");
        this.setSprite_Job(input_User.next());
        System.out.println("Masukkan Heal : ");
        this.setBase_Heal(input_User.nextInt());
        System.out.println("Masukkan Atk : ");
        this.setBase_Atk(input_User.nextInt());
        System.out.println("Masukkan DEF : ");
        this.setBase_Def(input_User.nextInt());
        System.out.println("Masukkan Magic : ");
        this.setBase_Magic(input_User.nextInt());
        System.out.println("Masukkan Armor Head : ");
        this.equip_Head = input_User.next();
        System.out.println("Masukkan Armor Body : ");
        this.equip_Body = input_User.next();
        System.out.println("Masukkan Weapon : ");
        this.equip_Weapon = input_User.next();
        System.out.println("Masukkan Armor Aksesories : ");
        this.equip_Acc = input_User.next();
        System.out.println("Hero baru telah dibuat atas nama : " + this.getSprite_Name());
    }

    //Function Tampil Detail
    public void displayDetail(){
        System.out.println("\nDetail Hero  \n" +
                "Nama Hero : " + this.getSprite_Name() + "\n" +
                "Job Hero : " + this.getSprite_Job() + "\n" +
                "HEAL Hero : " + this.getBase_Heal() + "\n" +
                "ATK Hero : " + this.getBase_Atk() + "\n" +
                "DEF Hero : " + this.getBase_Def() + "\n" +
                "Magic Hero : " + this.getBase_Magic() + "\n" +
                "Equip Head Hero : " + this.equip_Head + "\n" +
                "Equip Body Hero : " + this.equip_Body + "\n" +
                "Equip Weapon Hero : " + this.equip_Weapon + "\n" +
                "Equip ACC Hero : " + this.equip_Acc + "\n"
        );
    }

}
