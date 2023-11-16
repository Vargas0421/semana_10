/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizz;

/**
 *
 * @author LABORATORIO 04
 */
public class iglesias {
    private String nombreIglesia;
    private String nombreDelPastor;
    private int cantidadDeFeligreses;

    public iglesias(String nombreIglesia, String nombreDelPastor, int cantidadDeFeligreses) {
        this.nombreIglesia = nombreIglesia;
        this.nombreDelPastor = nombreDelPastor;
        this.cantidadDeFeligreses = cantidadDeFeligreses;
    }

    public String getNombreIglesia() {
        return nombreIglesia;
    }

    public void setNombreIglesia(String nombreIglesia) {
        this.nombreIglesia = nombreIglesia;
    }

    public String getNombreDelPastor() {
        return nombreDelPastor;
    }

    public void setNombreDelPastor(String nombreDelPastor) {
        this.nombreDelPastor = nombreDelPastor;
    }

    public int getCantidadDeFeligreses() {
        return cantidadDeFeligreses;
    }

    public void setCantidadDeFeligreses(int cantidadDeFeligreses) {
        this.cantidadDeFeligreses = cantidadDeFeligreses;
    }
    
    
    

    
    
    

    
}
