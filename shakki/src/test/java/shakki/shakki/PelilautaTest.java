/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shakki.shakki;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kape
 */
public class PelilautaTest {
    Pelilauta lauta;
    Pelaaja pelaaja;
    public PelilautaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        lauta=new Pelilauta();
        pelaaja=new Pelaaja("valkoinen");
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void asetaNappulat() {
        
        lauta.asetaPelaaja(pelaaja);
        assertEquals(pelaaja.palautaNappula(0).getX(), 0);
        assertEquals(pelaaja.palautaNappula(0).getY(), 1);
        
    }
}
