/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eucog
 */
public class Rectangulo {


    private double longitud, ancho,area,perimetro;
    
    public Rectangulo( ){  
    }
    
    public double getLongitud (){return this.longitud;}
    public double getAncho(){return this.ancho;}
    public double getArera(){return this.area;}
    public double getPerimetro(){return this.perimetro;}
    
    public void setLongitud (double l){this.longitud=l;}
    public void setAncho (double a){this.ancho=a;}

    public double calcularArea (){ return longitud * ancho;}
    public double cacularperimetro () {return 2*(longitud + ancho);}

    
   
}