/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.users;

import com.google.gson.Gson;
import java.util.ArrayList;

/**
 *
 * @author marqu
 */
public class GetWs {
    WebService ws = new WebService();
    String resultado = null;
    public GetWs(){
    }
    public void setWs(String cp){
        resultado = ws.ws(cp);
    }
    public String getWs(){
        return resultado;
    }
    public CodigoPostal cp(){
        Gson gson = new Gson();
        CodigoPostal cp = gson.fromJson(resultado,CodigoPostal.class);
        System.out.println("Municipio: " + cp.getMunicipio());
        String entero = cp.getMunicipio();
        System.out.println("Entero: " + entero.charAt(0));
        char[] c = new char[entero.length()];
        int[] a = new int[entero.length()];
        ArrayList<Character> cara = new ArrayList<>();
        ArrayList<Integer> ascii = new ArrayList<>();
        for (int i = 0; i < entero.length(); i++) {
            System.out.println("Posicion: "+ i);
              c[i]=entero.charAt(i);
              System.out.println("Es caracter " + i + " es: " + c[i]);
              a[i]= (int) c[i];
              System.out.println("Es ascii " + i + " es: " + a[i]);
        }
        System.out.println("El caracter cero es T por lo tanto aqui hay:" + Character.toString((char)a[0]));
        String full = "";
        for (int i = 0; i < a.length; i++) {
            full+=Character.toString((char)a[i]);
        }
        System.out.println("PUES FULL Y TODO PENDEJO: " + full);
        return null;
    }
    
    public String getMunicipio(){
        Gson gson = new Gson();
        CodigoPostal cp = gson.fromJson(resultado,CodigoPostal.class);
        return cp.getMunicipio();
    }
}
