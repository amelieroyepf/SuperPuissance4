/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_puissance_4_roy_perrin;

/**
 *
 * @author operrin
 */
public class Jeton {
    String Couleur;
    
    public Jeton(String uneCouleur ){
        Couleur=uneCouleur;
    }    
    public String lireCouleur() {
        return Couleur;
    }
}
