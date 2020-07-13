package com.example.foodsapp.api;

import com.example.foodsapp.model.Categories;
import com.example.foodsapp.model.Meals;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FoodApi {

    @GET("search.php?f=a")
    Call<Meals> getMeal();

    @GET("categories.php")
    Call<Categories> getCategories();


}
