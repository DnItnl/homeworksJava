package org.example.first;

public class Car {
    private String name;          
    private String manufacturer;  
    private int year;         
    private double engineVolume;  

    public Car(String name, String manufacturer, int year, double engineVolume) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        if (year > 1885 && year <= 2025) { 
            this.year = year;
        } else {
            System.out.println("Некорректный год выпуска!");
        }
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            System.out.println("Объём двигателя должен быть положительным!");
        }
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Год выпуска: " + year);
        System.out.println("Объём двигателя: " + engineVolume + " л");
    }

    public void printInfo(boolean brief) {
        if (brief) {
            System.out.println(name + " (" + manufacturer + "), " + year);
        } else {
            printInfo();
        }
    }


}

