package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class MyApi {

    public static List<Etudiant> liste = new ArrayList<>() ;

    static {
        liste.add(new Etudiant(0,"A",19)) ;
        liste.add(new Etudiant(1,"B",15)) ;
        liste.add(new Etudiant(2,"C",14)) ;
        liste.add(new Etudiant(3,"D",17)) ;
    }

    @GetMapping(value="/getEtudiant")
    public Etudiant getEtudiant(int id){
        return liste.get(id) ;
    }

    @PostMapping(value = "/addEtudiant")
    public Etudiant addEtudiant(Etudiant etudiant) {
        liste.remove(etudiant);
        return etudiant;
    }

    @DeleteMapping(value = "/deleteEtudiant")
    public void deleteEtudiant(int id) {
        liste.remove(id);
    }

    @PutMapping(value = "/updateEtudiant")
    public void updateEtudiant(int id , String nom ) {
        liste.get(id).setNom(nom);
    }



    @GetMapping(value="/liste")
    public Collection<Etudiant> getAllEtudiant(){
        return liste;
    }

    @GetMapping(value ="/b")
    public String bonjour(){
        return "bonjour !";
    }

    @GetMapping(value ="/bn")
    public String bonsoir(){
        return "Bonsoir";
    }

    @GetMapping(value="/etudiant")
    public Etudiant getEtudiant(){
        return new Etudiant(1,"A",19) ;
    }

    @GetMapping(value="/somme")
    public double somme(double a, double b){
        return a+b;
    }

}
