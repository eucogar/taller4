/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

/**
 *
 * @author eucog
 */
public class Libro {
    
    String titulo,edicion,autor,pais,paginas,fecha,ISBM;
    
    public Libro (){ }
    
    public String getTitulo(){return this.titulo;}
    public String getEdicion (){return this.edicion;}
    public String getAutor (){return this.autor;}
    public String getPais (){return this.pais;}
    public String getPaginas (){return this.paginas;}
    public String getFecha (){return this.fecha;}
    public String getiSBM (){return this.ISBM;}
    
    public void setTitulo(String t){this.titulo=t;}
    public void setEdicion (String e){this.edicion=e;}
    public void setAutor(String a){this.autor=a;}
    public void setPais (String p){this.pais=p;}
    public void setPaginas (String p){this.paginas=p;}
    public void setFecha(String f){this.fecha=f;}
    public void setiSBM (String i){this.ISBM=i;}
    
    
}