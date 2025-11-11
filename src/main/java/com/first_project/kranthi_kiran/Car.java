package com.first_project.kranthi_kiran;


public class Car {
    private static Engine eng;
    public Car(){
        System.out.println("Car Constructor......");
    }
    public void setEngine(Engine eng){
        this.eng = eng;
    }
    public void start(){
        int status = eng.start();
        if(status == 1){
            System.out.println("The Car is Started");
        }else{
            System.out.println("The Car is not Started");
        }
    };
}

