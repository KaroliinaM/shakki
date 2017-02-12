/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shakki.shakki;

import java.util.ArrayList;
import shakki.nappulat.Kuningas;
import shakki.nappulat.Kuningatar;
import shakki.nappulat.Lahetti;
import shakki.nappulat.Nappula;
import shakki.nappulat.Ratsu;
import shakki.nappulat.Sotilas;
import shakki.nappulat.Torni;

/**
 *
 * @author kape
 */
public class Pelaaja {

    String vari;
    ArrayList<Nappula> nappulat;

    public Pelaaja(String vari, Pelilauta lauta) {
        this.vari = vari;
        this.nappulat=new ArrayList<Nappula>();
        luoNappulat(lauta);

    }

    public void lisaaNappula(Nappula nappula) {
        this.nappulat.add(nappula);
    }

    public int montakoNappulaa() {
        return nappulat.size();
    }

    public Nappula palautaNappula(int mones) {
        return nappulat.get(mones);
    }

    public int palautaMones(int x, int y) {
        int palautettava = -1;

        for (Nappula n : nappulat) {
            if (n.getX() == x && n.getY() == y) {
                palautettava = nappulat.indexOf(n);
            }
        }
        return palautettava;

    }

    public void asetaNappula(int mones, int x, int y) {

    }

    public void luoNappulat(Pelilauta lauta) {
        for (int i = 0; i < 8; i++) {
            Nappula nappula = new Sotilas(lauta);
            nappulat.add(nappula);
        }
        for (int i = 0; i < 2; i++) {
            Nappula nappula = new Torni(lauta);
            nappulat.add(nappula);
        }
        for (int i = 0; i < 2; i++) {
            Nappula nappula = new Ratsu(lauta);
            nappulat.add(nappula);
        }
        for (int i = 0; i < 2; i++) {
            Nappula nappula = new Lahetti(lauta);
            nappulat.add(nappula);
        }
        Nappula kuningatar = new Kuningatar(lauta);
        nappulat.add(kuningatar);
        Nappula kuningas = new Kuningas(lauta);
        nappulat.add(kuningas);
    }

}
