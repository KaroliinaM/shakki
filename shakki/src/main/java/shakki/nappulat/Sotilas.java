/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shakki.nappulat;

import shakki.shakki.Pelilauta;

/**
 *
 * @author kape
 */
public class Sotilas extends Nappula{
    
    public Sotilas()
    {
        super();
        super.tyyppi="Sotilas";
    }
    
    public void siirto(int n)
    {
        if(n==2)
        {
        super.x=+2;
        }
        
        
    }

    @Override
    public void vastustajanSyonti() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
