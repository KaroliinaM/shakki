/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shakki.nappulat;

/**
 *
 * @author kape
 */
public abstract class Nappula {
    
    protected int x;
    protected int y;
    protected boolean pelissa;
    protected String tyyppi;
    
    public Nappula()
    {
        pelissa=true;
    }
    public void syonti()
    {
        pelissa=false;
    }
    
    public abstract void siirto();
    
    public String getTyyppi()
    {
        return this.tyyppi;
    }
    public boolean onkoPelissa()
    {
        return pelissa;
    }
    public int getX()
    {
        return this.x;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public int getY()
    {
        return this.y;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    
}
