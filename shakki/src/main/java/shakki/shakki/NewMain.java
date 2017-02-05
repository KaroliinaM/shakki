/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shakki.shakki;

/**
 *
 * @author kape
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        Pelaaja pelaaja=new Pelaaja("valkoinen");
        Pelilauta lauta=new Pelilauta();
        lauta.asetaPelaaja(pelaaja);
        for(int i=0; i<pelaaja.montakoNappulaa(); i++)
        {
            System.out.println(pelaaja.palautaNappula(i).getX() + " " + pelaaja.palautaNappula(i).getY());
        }
        // TODO code application logic here
    }
    
}
