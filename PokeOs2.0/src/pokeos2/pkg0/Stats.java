/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeos2.pkg0;

/**
 *
 * @author carlos
 */
public class Stats {
    int hp;
    int atk;
    int Def;
    int spcatk;
    int spcdef;
    int speed;

    public Stats(String hp, String atk, String Def, String spcatk, String spcdef, String speed) {
        this.hp = Integer.valueOf(hp);
        this.atk = Integer.valueOf(atk);
        this.Def = Integer.valueOf(Def);
        this.spcatk = Integer.valueOf(spcatk);
        this.spcdef = Integer.valueOf(spcdef);
        this.speed = Integer.valueOf(speed);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return Def;
    }

    public void setDef(int Def) {
        this.Def = Def;
    }

    public int getSpcatk() {
        return spcatk;
    }

    public void setSpcatk(int spcatk) {
        this.spcatk = spcatk;
    }

    public int getSpcdef() {
        return spcdef;
    }

    public void setSpcdef(int spcdef) {
        this.spcdef = spcdef;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Stats" + "HP = " + hp + ", ATK = " + atk + ", DEF = " + Def + ", SPCATK = " + spcatk + ", SPCDEF =" + spcdef + ", SPEED = " + speed;
    }
    
    
}
