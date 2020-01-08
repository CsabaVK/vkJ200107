/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helsinki1952;

/**
 *
 * @author csabavk
 */
public class hclass {
    private int helyezes;
    private int sportoloszam;
    private String sporttag;
    private String versenyszam;

    public hclass(String sor) {
        String[] d = sor.split(" ");
        this.helyezes = Integer.parseInt(d[0]);
        this.sportoloszam = Integer.parseInt(d[0]);
        this.sporttag = d[2];
        this.versenyszam = d[3];
    }

    public int getHelyezes() {
        return helyezes;
    }

    public int getSportoloszam() {
        return sportoloszam;
    }

    public String getSporttag() {
        return sporttag;
    }

    public String getVersenyszam() {
        return versenyszam;
    }
    
}


