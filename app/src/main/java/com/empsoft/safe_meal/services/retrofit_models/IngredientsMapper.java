package com.empsoft.safe_meal.services.retrofit_models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caynan on 17/02/17.
 */
public class IngredientsMapper {

    @SerializedName("fillIngredients")
    private boolean fillIngredients = false;

    @SerializedName("ingredients")
    private List<String> ingredients = new ArrayList<>();

    @SerializedName("limitLicense")
    private boolean limitLicense = false;

    @SerializedName("number")
    private int number = 5;

    @SerializedName("ranking")
    private int ranking = 1;

    public IngredientsMapper() {}

    public IngredientsMapper(boolean fillIngredients, List<String> ingredients,
                             boolean limitLicense, int number, int ranking) {

        this.fillIngredients = fillIngredients;
        this.ingredients = ingredients;
        this.limitLicense = limitLicense;
        this.number = number;
        this.ranking = ranking;
    }

    public boolean isFillIngredients() {
        return fillIngredients;
    }

    public void setFillIngredients(boolean fillIngredients) {
        this.fillIngredients = fillIngredients;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isLimitLicense() {
        return limitLicense;
    }

    public void setLimitLicense(boolean limitLicense) {
        this.limitLicense = limitLicense;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getIngredientsAsString(final String separator) {
        final String currentSeparator = (separator == null || separator.trim().isEmpty() ? "," : separator);
        StringBuilder ingredientsBuilder = new StringBuilder();
        if(ingredients == null || ingredients.isEmpty()) {
            return ingredientsBuilder.toString();
        }
        synchronized (ingredients) {
            int ingredientsSize = ingredients.size();
            int i;
            for (i = 0; i < ingredientsSize - 1; i++) {
                ingredientsBuilder.append(ingredients.get(i));
                ingredientsBuilder.append(currentSeparator);
            }
            ingredientsBuilder.append(ingredients.get(i));
        }
        return ingredientsBuilder.toString();
    }

    @Override
    public String toString() {
        return "IngredientsMapper{" +
                "fillIngredients=" + fillIngredients +
                ", ingredients=" + ingredients +
                ", limitLicense=" + limitLicense +
                ", number=" + number +
                ", ranking=" + ranking +
                '}';
    }
}
