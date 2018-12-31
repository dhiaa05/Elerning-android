package com.example.dhiaapc.e_learning.model;

public class Perssone {

    private int id;
    private String nom;
    private String prenom;
    private String password;
    private String dep;
    private String email;

    public void setId(int id)
    {
        this.id = id;
    }
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public void setPassword(String pass)
    {
        this.password = pass;
    }
    public void setDep(String dep)
    {
        this.dep = dep;
    }

    public int getId() {
        return this.id;
    }
    public String getNom()
    {
        return this.nom;
    }
    public String getPrenom()
    {
        return this.prenom;
    }

    public String getDep() {
        return dep;
    }

    public String getPassword() {
        return password;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getemail() {
        return this.email;
    }

}
