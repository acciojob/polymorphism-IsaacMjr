package com.driver;

public class Main {

    public static class Product{
        public int product(int x, int y){
            return x*y;
        }

        public double product(double x, double y){
            return x*y;
        }
    }

   public static void main(String[] args){
        Product p = new Product();
       System.out.println(p.product(1.2,2.4));

   }

}