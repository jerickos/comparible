package com.example.comparable;

import java.util.ArrayList;
import java.util.List;

public class FruitDriver {
    public static void main(String[] args){
        Fruit apple = new Fruit("Apple");
        Fruit orange = new Fruit("Orange");
        Fruit bannana = new Fruit("Bannana");
        Fruit peach = new Fruit("Peach");
        Fruit tangurine = new Fruit("Trangurine");

        List<Fruit> fruit = new ArrayList<>();

        fruit.add(apple);
        fruit.add(orange);
        fruit.add(bannana);
        fruit.add(peach);
        fruit.add(tangurine);



    }
}
