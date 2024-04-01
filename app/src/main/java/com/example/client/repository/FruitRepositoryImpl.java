package com.example.client.repository;

import com.example.client.model.Fruit;
import com.example.client.repository.FruitRepository;

import com.example.client.R;
import java.util.ArrayList;
import java.util.List;

public class FruitRepositoryImpl implements FruitRepository{

    @Override
    public List<Fruit> getFruits() {
        List<Fruit> list = new ArrayList<>();
        list.add(new Fruit(1, "Tomato", "none", R.drawable.tomato, false));
        list.add(new Fruit(2, "Banana", "none", R.drawable.bananas, false));
        list.add(new Fruit(3, "Apple", "none", R.drawable.apples, false));
        list.add(new Fruit(4, "Watermelon", "none", R.drawable.watermelons, false));
        list.add(new Fruit(5, "Orange", "none", R.drawable.oranges, false));
        list.add(new Fruit(6, "Mango", "none", R.drawable.mangoes, false));
        list.add(new Fruit(7, "Pear", "none", R.drawable.pears, false));
        list.add(new Fruit(8, "Avocado", "none", R.drawable.avocadoes, false));
        list.add(new Fruit(9, "Grape", "none", R.drawable.grapes, false));
        list.add(new Fruit(10, "Pineapple", "none", R.drawable.pineapple, false));
        list.add(new Fruit(11, "Peach", "none", R.drawable.peach, false));
        list.add(new Fruit(12, "Pumpkin", "none", R.drawable.pumpkin, false));
        list.add(new Fruit(13, "Dates", "none", R.drawable.dates, false));
        list.add(new Fruit(14, "Papaya", "none", R.drawable.papaya, false));
        list.add(new Fruit(15, "Strawberry", "none", R.drawable.strawberry, false));
        return list;
    }
}
