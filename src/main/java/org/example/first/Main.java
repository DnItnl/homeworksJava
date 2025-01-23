package org.example.first;

public class Main {
    public static void main(String[] args) {
        testBook();
        testCar();
    }

    private static void testBook(){
        Book book = new Book("1984", "George Orwell", 1949, "Secker & Warburg", "Dystopian", 328);
        book.printInfo(true); 
    }

    private static void testCar(){ 
        Car car = new Car("Model S", "Tesla", 2020, 2.0);
        car.printInfo(true);
    }
}