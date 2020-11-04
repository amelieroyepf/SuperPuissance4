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
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;
    
    public Cellule(Jeton jCourant, boolean tNoir, boolean Desintegrateur){
        jetonCourant=jCourant;
        trouNoir=tNoir;
        desintegrateur=Desintegrateur;
    }
    public boolean affecterJeton(Jeton Jeton) {
        if (jetonCourant==null) {
            jetonCourant=Jeton;
            return true;
        }else {
            return false;
            
        }
    }
    public Jeton recupererJeton(){
        return jetonCourant;
    }
    public boolean supprimerJeton() {
        if (jetonCourant==null){
            return false;
        } else {
            jetonCourant=null;
            return true;
        }
    }
    
    public boolean placerTrouNoir(){
        if (trouNoir) {
            return false;
        }else{
            trouNoir=true;
            return true;
        }
        
    }
    
    public boolean placerDesintegrateur(){
     if (desintegrateur) {
            return false;
        }else{
            desintegrateur=true;
            return true;
        }   
    }
    
    public boolean presenceTrouNoir(){
        if (trouNoir) {
            return true;
        }else{
            return false;
        }
    }
    public boolean presenceDesintegrateur(){
        if (desintegrateur) {
            return true;
        }else{
            return false;
        }
    }
    public String lireCouleurDuJeton(){
        return jetonCourant.lireCouleur();
    }
    public boolean recupererDesintegrateur(){
        if (desintegrateur){
            desintegrateur=false;
            return true;
        }else{
            return false;
        }
    }
    public boolean activerTrouNoir(){
        if (trouNoir){
            supprimerJeton();
            trouNoir=false;
            return true;
        }else{
            return false;
        }
    }
}
