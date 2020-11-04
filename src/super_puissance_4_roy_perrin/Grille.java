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
public class Grille {
    Cellule [][] Cellules;
     public final String ANSI_PURPLE = "\u001B[35m";
     public final String ANSI_YELLOW = "\u001B[33m";
     public final String ANSI_BLACK = "\u001B[30m";
     public final String ANSI_WHITE = "\u001B[37m";
        
    public Grille(){
        Cellules=new Cellule [6][7];
    }
    public boolean ajouterJetonDansColonne(Jeton jeton,int c){
      for (int l=0;l<Cellules[c].length;l++){
        if (Cellules[l][c]==null){
            Cellules[l][c].jetonCourant=jeton;
            return true;
        }
      }return false;  
    }
    public boolean etreRemplie(){
        for(int l=0;l<Cellules.length;l++){
            for (int c=0;c<Cellules[l].length;c++){
                if (Cellules[l][c]==null){
                    return false;
                 
                }
            }
        }return true;
    }
    public void viderGrille(){
        for(int l=0;l<Cellules.length;l++){
            for (int c=0;c<Cellules[l].length;c++){
                if (Cellules[l][c]!=null){
                    Cellules[l][c]=null;
                }
                }
            }
        }
    public void afficherGrilleSurConsole(){
       for(int l=0;l<Cellules.length;l++){
            for (int c=0;c<Cellules[l].length;c++){
                if (Cellules[l][c]==null){
                    System.out.println(ANSI_WHITE);
                }
                if (Cellules[l][c].trouNoir==true){
                    System.out.println(ANSI_BLACK);
                }
                if (Cellules[l][c].jetonCourant.lireCouleur()=="jaune"){
                    System.out.println(ANSI_YELLOW);
                }else if (Cellules[l][c].jetonCourant.lireCouleur()=="rouge"){
                    
                }
                }
            }
        
    }
    public boolean celluleOccupee(int l,int c){
        if (Cellules[l][c]!=null){
            return true;
        }
        else {
            return false;
        }
        
    }
    public String lireCouleurDuJeton(int l, int c){
        if (Cellules[l][c].jetonCourant.lireCouleur()=="jaune"){
            return "jaune"; 
        }
        else{
            return "rouge";
        }
    }
    public boolean etreGagnantePourJoueur(Joueur joueur){
        
        
    }
}
