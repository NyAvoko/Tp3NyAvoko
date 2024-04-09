/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nyavoko.tp2denyavoko.jsf;

/**
 *
 * @author Avoko
 */
import java.util.ArrayList;
import java.util.List;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

@Named(value = "bean2")
@RequestScoped
public class Bean2 {

    private int nombre;
    private int nombrePrecedent;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }

    // Méthode pour retourner à la page formulaire_4 avec le nombre précédent
    public String retournerFormulaire() {
        return "formulaire__4?nombre=" + nombrePrecedent + "&amp;faces-redirect=true";
    }

    // Méthode pour afficher les nombres suivants
    public String afficher() {
        nombrePrecedent = nombre;
        return "affichage__4?nb=" + nombre + "&amp;faces-redirect=true";
    }
}
