/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizz;

/**
 *
 * @author LABORATORIO 04
 */
public class feligreses {
    private String nombreDelFeligres;
    private int id;
    private int diezmo;

    public feligreses(String nombreDelFeligres, int id, int diezmo) {
        this.nombreDelFeligres = nombreDelFeligres;
        this.id = id;
        this.diezmo = diezmo;
    }

    public String getNombreDelFeligres() {
        return nombreDelFeligres;
    }

    public void setNombreDelFeligres(String nombreDelFeligres) {
        this.nombreDelFeligres = nombreDelFeligres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiezmo() {
        return diezmo;
    }

    public void setDiezmo(int diezmo) {
        this.diezmo = diezmo;
    }

   
    
}
