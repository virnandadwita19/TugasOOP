package com.utsPakBilal;

/*Dibuat Oleh Ardi Wibowo - Sprite.java
*/

public class Sprite {
	//detail karakter
    private String sprite_Name, sprite_Job;

    //base Atribut karakter
    private int base_Heal, base_Atk, base_Def, base_Magic;

    public String getSprite_Name() {
        return sprite_Name;
    }

    public String getSprite_Job() {
        return sprite_Job;
    }

    public int getBase_Heal() {
        return base_Heal;
    }

    public int getBase_Atk() {
        return base_Atk;
    }

    public int getBase_Def() {
        return base_Def;
    }

    public int getBase_Magic() {
        return base_Magic;
    }

    public void setSprite_Name(String sprite_Name) {
        this.sprite_Name = sprite_Name;
    }

    public void setSprite_Job(String sprite_Job) {
        this.sprite_Job = sprite_Job;
    }

    public void setBase_Heal(int base_Heal) {
        this.base_Heal = base_Heal;
    }

    public void setBase_Atk(int base_Atk) {
        this.base_Atk = base_Atk;
    }

    public void setBase_Def(int base_Def) {
        this.base_Def = base_Def;
    }

    public void setBase_Magic(int base_Magic) {
        this.base_Magic = base_Magic;
    }
}
