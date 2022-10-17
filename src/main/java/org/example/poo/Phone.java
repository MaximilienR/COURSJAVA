package org.example.poo;

public class Phone extends Product{

    int prix;

    public Phone(){

    };
    public  Phone(int prix){

    }

    public Phone(int id,String name,int prix){
        super(id,name);
        this.prix =prix;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }


    public void WhatIam(){
        super.whatIam();
        System.out.println("je suis un Phone");

    }

    @Override
    public String toString() {
        return "Phone{" +
                "prix = " + prix +
                "name = "+name+
                "id = "+id+
                '}';
    }


}
