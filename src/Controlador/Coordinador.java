/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Gerente;
import Modelo.Logica;
import Vista.Primer_ingreso_gerente;

/**
 *
 * @author William Cadenas
 */
public class Coordinador {

    private Primer_ingreso_gerente primeraVentana;
    private Logica miLogica;
    private Gerente gerente;

    void setLogin_de_Gerente(Primer_ingreso_gerente primeraVentana) {
        this.primeraVentana = primeraVentana;
    }

    void setLogica(Logica miLogica) {
        this.miLogica = miLogica;
    }

    public void setMiLogica(Logica miLogica) {
        this.miLogica = miLogica;
    }

    public void agregarEmpleado(String text, String text0, String text1, Object value, String text2) {
        
    }
    
}
