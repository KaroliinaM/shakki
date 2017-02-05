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
public class Pelilauta {
    private int x;
     private int y;
    

    
    public Pelilauta()
    {
        
    }
    public void asetaPelaaja(Pelaaja pelaaja)
    {
        int eturivi=0;
        for(int i=0; i<pelaaja.montakoNappulaa(); i++)
        {
            if(i<8)
            {
                pelaaja.asetaNappula(i, i, 1);
            }
            else
            {
                int takarivi=i-8;
                pelaaja.asetaNappula(i, takarivi, 0);
                pelaaja.asetaNappula(i, pelaaja.montakoNappulaa()-takarivi, 0);
            }
        }
    }
    
}
