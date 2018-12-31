package com.example.dhiaapc.e_learning.model;

import java.util.ArrayList;

public class Etudiant extends Perssone {

    private ArrayList<String> moduleEtud;

    public void setModuleEtud(ArrayList<String> module)
    {
        this.moduleEtud = module;
    }

    public ArrayList<String> getModuleEtud() {
        return moduleEtud;
    }
}
