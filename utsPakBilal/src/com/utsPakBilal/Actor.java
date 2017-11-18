package com.utsPakBilal;

/*Dibuat Oleh Virnanda Dwita - Actor.java
*/

public class Actor extends Sprite{
	//Equip hero.
    public String equip_Head, equip_Body, equip_Weapon, equip_Acc;


    //Function Kenalan
    public void heroKenalan(){
        System.out.println("Hallo nama saya " + getSprite_Name() +"\n"+
                "Saya seorang " + getSprite_Job() + "\n\n");
    }

    //Function Lari
    public void heroLari(){
        System.out.println("Saya lari..!\nKearah sesuai arah jalan." + "\n\n");
    }

    public void heroBerjalan(String arahJalan) {
        System.out.println("Hero berjalan ke-arah " + arahJalan + "\n\n");
    }

    public void heroLompat(int kaliLompat){
        System.out.println("Saya lompat.");
        for (int lompat=0; lompat<kaliLompat; lompat++){
            System.out.println("Hup");
        }
        System.out.println("\n\n");
    }
}
