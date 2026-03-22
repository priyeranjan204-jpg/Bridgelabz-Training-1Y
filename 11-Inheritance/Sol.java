package com.gla.Inheritance;

public class Sol {
        public static void main(String[] args) {

            Veh[] v = {
                    new Car(120, "Petrol", 5),
                    new Truck(80, "Diesel", 10),
                    new Bike(100, "Petrol")
            };

            for (Veh x : v) {
                x.info();
            }
        }
    }
