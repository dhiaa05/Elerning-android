package com.example.dhiaapc.e_learning.model;

import java.util.ArrayList;

public class Specialite {

    public  int id;
    public String nomSpec;
    public String nmbModule;
    public ArrayList<String> specElem;

    public Specialite(String nom, String nbr)
    {
        this.nomSpec = nom;
        this.nmbModule = nbr;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setNomSpec(String nomSpec)
    {
        this.nomSpec = nomSpec;
    }

    public void setNmbModule(String nmbModule)
    {
        this.nmbModule = nmbModule;
    }
    public void setSpecElem(ArrayList<String> specElem)
    {
        this.specElem = specElem;
    }

    public int getId()
    {
        return this.id;
    }

    public String getNomSpec()
    {
        return this.nomSpec;
    }

    public String getNmbModule()
    {
        return this.nmbModule;
    }

    public ArrayList<String> getSpecElem() {
        return specElem;
    }
}
