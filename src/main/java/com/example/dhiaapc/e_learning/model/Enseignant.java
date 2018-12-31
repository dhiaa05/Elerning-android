package com.example.dhiaapc.e_learning.model;

import java.util.ArrayList;

public class Enseignant extends Perssone{

    private ArrayList<String> moduleEns;

    public void setModuleEns(ArrayList<String> module)
    {
        this.moduleEns = module;
    }

    public ArrayList<String> getModuleEns() {
        return moduleEns;
    }
}
