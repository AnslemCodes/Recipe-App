package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodData = new FoodData("BANANA BREAD WITH HONEY, OATS & WALNUTS", "A super simple to make, moist, melt in your mouth delicious Banana Bread with Honey, Oats & Walnuts. This one’s perfect to freeze slice and eat whenever you want.", "$ 850", R.drawable.image1);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("GRILLED CHICKEN WITH FRESH CHERRY SALSA\n", "Juicy grilled chicken breasts, topped with a delicious ruby-red cherry salsa, made from the season’s best local cherries. Quick, easy and super yummy, this the ultimate summer plate!", "$ 900", R.drawable.image2);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("INDIAN STYLE SHAKSHOUKA ON CRISPY POTATO STRAWS (PARSI- SALI PAR EDU)", "Shakshouka meets crispy hash browns! This Parsi-Indian version of Shakshouka is serious comfort food with it’s soft poached eggs nestled in spicy tomato sauce, on a bed of crispy potato sticks. It makes one of the best breakfast/ brunch dish or an even better breakfast for dinner meal!", "$ 1000", R.drawable.image3);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("MINT CHIMICHURRI SAUCE", "A refreshing twist to a traditional chimichurri, this mint version pairs perfectly with lamb, chicken & pork", "$ 1500", R.drawable.image4);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("LAMB BOLOGNESE WITH FETA & MINT", "A hearty and traditional pasta sauce favorite with a ground lamb makeover. Served with a twist of feta and mint, this is the perfect stick to your ribs comfort dish!", "$ 1700", R.drawable.image5);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("RASPBERRY HEARTS (RASPBERRY, CREAM CHEESE PASTRIES)", "Puff pastry hearts filled with sweet cream cheese and topped with gorgeous glazed raspberries, the perfect Valentine’s Day dessert.", "$ 1800", R.drawable.image6);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("SALMON CHOWDER WITH LEEKS & POTATOES", "A Pacific Northwest style creamy and hearty salmon chowder with leeks, capers & cream cheese, a perfect meal for a cold winter day!", "$ 2000", R.drawable.image7);

        myFoodList.add(mFoodData);


        MyAdapter myAdapter = new MyAdapter(MainActivity.this, myFoodList);
        mRecyclerView.setAdapter(myAdapter);
    }


}
