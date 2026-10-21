/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fidelitas.clase03.ZooHerencia;

/**
 *
 * @author camoe
 */
public class ZooHerencia {

    public static void main(String[] args) {
        Animal perro = new Husky ("Fido");
        Mamifero gato = new Mainecoon ("Luna");
        
        Animal pato = new Ave ("Lucas");
        Cayuga otroPato = new Cayuga ("Donald");
        Ave elOtroPato = new Pato ("Pato");
        
        System.out.println(perro.hacerSonido());
        System.out.println(gato.hacerSonido());
        System.out.println(pato.hacerSonido());
        System.out.println(otroPato.hacerSonido());
        System.out.println(elOtroPato.hacerSonido());
    }
    
}
