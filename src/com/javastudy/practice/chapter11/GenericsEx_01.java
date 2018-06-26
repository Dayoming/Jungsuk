package com.javastudy.practice.chapter11;

import java.util.ArrayList;

class  Product { }
class  Tv extends  Product { }
class  Audio extends  Product { }

public class GenericsEx_01 {
    public static void main(String[] args) {
        ArrayList<Product> productsList = new ArrayList<Product>();
        ArrayList<Tv> tvList = new ArrayList<Tv>();

        productsList.add(new Tv());
        productsList.add(new Audio());

        tvList.add(new Tv());
        tvList.add(new Tv());

        printAll(productsList);
//        printAll(tvList);

    }

    public static void printAll (ArrayList<Product> list) {
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
