package com.company;

public class Computer implements Comparable<Computer> {
    private String Producent;
    private String Model;
    private int Price;

    public Computer() {
    }

    public Computer(String producent, String model, int price) {
        Producent = producent;
        Model = model;
        Price = price;
    }

    public String getProducent() {
        return Producent;
    }

    public void setProducent(String producent) {
        Producent = producent;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Producent = " + Producent + ", Model= " + Model + ", Price = " + Price + ".";
    }

    @Override
    public int compareTo(Computer computer) {
        if (Price > computer.Price){
            return 1;
        }
        else if (Price < computer.Price){
            return -1;
        }
        int producent = Producent.compareTo(computer.Producent);
        if (producent!=0){
            return producent;
        }
        return Model.compareTo(computer.Model);
    }
}
