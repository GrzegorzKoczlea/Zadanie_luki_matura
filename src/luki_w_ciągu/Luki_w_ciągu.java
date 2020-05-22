/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luki_w_ciągu;

import java.util.Random;

/**
 *
 * @author Dazth
 */
public class Luki_w_ciągu {
    
    public static void Generate(int[] tablica)
    {
        Random generator = new Random();
        
        for (int i = 0; i < tablica.length; i++) {
                tablica[i] = generator.nextInt(20);
                    }
    }
    
    public static void Wypisz_tablice(int[] tablica)
    {
        for (int i = 0; i < tablica.length; i++) 
        {
            System.out.println(tablica[i]);
        }
    }
    
    public static void Znajdz_najwieksza_luke (int [] tablica){
        int najwieksza_wartosc = 0;
        
        for (int i = 0; i < tablica.length - 1; i++) {
            if(tablica[i] > tablica[i + 1]){
                if (najwieksza_wartosc == 0) {
                    najwieksza_wartosc = tablica[i] - tablica[i + 1];
                }
                else if(tablica[i] - tablica[i + 1] > najwieksza_wartosc){
                    najwieksza_wartosc = tablica[i] - tablica[i + 1];
                }  
            }else if(tablica[i] < tablica[i + 1]){      
                if (najwieksza_wartosc == 0) {
                    najwieksza_wartosc = tablica[i + 1] - tablica[i];
                }
                else if(najwieksza_wartosc < tablica[i] - tablica[i + 1]){
                   najwieksza_wartosc = tablica[i + 1] - tablica[i];
                }   
            }
        }
        
        System.out.println("Największa luka: " + najwieksza_wartosc);
    }
    
    public static void Znajdz_najmniejsza_luke (int [] tablica){
        int najmniejsza_wartosc = 0;
        
        for (int i = 0; i < tablica.length - 1; i++) {
            if(tablica[i] > tablica[i + 1]){
                if (najmniejsza_wartosc == 0) {
                    System.out.println("Najmniejsza wartość przed " + i + ": " + najmniejsza_wartosc);
                    najmniejsza_wartosc = tablica[i] - tablica[i + 1];
                    System.out.println("Najmniejsza wartość po " + i + ": " + najmniejsza_wartosc);
                }
                else if(najmniejsza_wartosc > (tablica[i] - tablica[i + 1])){
                    System.out.println("Najmniejsza wartość przed " + i + ": " + najmniejsza_wartosc);
                    System.out.println(tablica[i]);
                    System.out.println(tablica[i+1]);
                    najmniejsza_wartosc = tablica[i] - tablica[i + 1];
                    System.out.println("Najmniejsza wartość po " + i + ": " + najmniejsza_wartosc);
                }  
            }else if(tablica[i] < tablica[i + 1]){      
                if (najmniejsza_wartosc == 0) {
                    System.out.println("Najmniejsza wartość przed " + i + ": " + najmniejsza_wartosc);
                    najmniejsza_wartosc = tablica[i + 1] - tablica[i];
                    System.out.println("Najmniejsza wartość po" + i + ": " + najmniejsza_wartosc);
                }
                else if(najmniejsza_wartosc > (tablica[i] - tablica[i + 1])){
                    System.out.println("Najmniejsza wartość przed" + i + ": " + najmniejsza_wartosc);
                    System.out.println(tablica[i]);
                    System.out.println(tablica[i+1]);
                   najmniejsza_wartosc = tablica[i + 1] - tablica[i];
                   System.out.println("Najmniejsza wartość po" + i + ": " + najmniejsza_wartosc);
                }   
            }
        }
        
        System.out.println("Najmniejsza luka: " + najmniejsza_wartosc);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int [] Wartosci_dane_txt_4 = new int [10] ;
        Generate(Wartosci_dane_txt_4);
        Wypisz_tablice(Wartosci_dane_txt_4);
        Znajdz_najwieksza_luke(Wartosci_dane_txt_4);
        Znajdz_najmniejsza_luke(Wartosci_dane_txt_4);
    
    }
    
}
