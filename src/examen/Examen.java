/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Elias
 */
public class Examen {
    private String Nro_Leg;
    private String Cod_Esp;
    private boolean getNro_Leg;
    private boolean getCod_Esp;
    
    /**
     *
     * @return
     */
    public String getNro_Leg() {
        return Nro_Leg;
        
    }

    /**
     *
     * @param Nro_Leg
     */
    public void setNro_Leg(String Nro_Leg) {
        this.Nro_Leg = Nro_Leg;
    }

    /**
     *
     * @return
     */
    public String getCod_Esp() {
        return Cod_Esp;
    }

    /**
     *
     * @param Cod_Esp
     */
    public void setCod_Esp(String Cod_Esp) {
        this.Cod_Esp = Cod_Esp;
    }


    public static void main(String[] args) {
       Examen Especialidades_Medicos = new Examen();
       Scanner entrada = new Scanner(System.in);
       
       Especialidades_Medicos.setNro_Leg(entrada.nextLine());
       Especialidades_Medicos.setCod_Esp(entrada.nextLine());
      
       System.out.println(Especialidades_Medicos.getNro_Leg);
       System.out.println(Especialidades_Medicos.getCod_Esp);
      
                
    }
    
}
