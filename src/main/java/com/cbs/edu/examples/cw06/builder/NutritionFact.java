package com.cbs.edu.examples.cw06.builder;

public class NutritionFact {

    private final int servingSize;  // required
    private final int servings;     // required
    private final int calories;     // optional
    private final int fat;          // optional
    private final int sodium;       // optional
    private final int carbohydrate; // optional

    private static class NutritionFactsBuilder {
        private int servingSize;  // required
        private int servings;     // required
        private int calories;     // optional
        private int fat;          // optional
        private int sodium;       // optional
        private int carbohydrate; // optional

        public NutritionFactsBuilder setCalories(int value) {
            calories = value;
            return this;
        }

        public NutritionFactsBuilder setFat(int value) {
            fat = value;
            return this;
        }

        public NutritionFactsBuilder setSodium(int value) {
            sodium = value;
            return this;
        }

        public NutritionFactsBuilder setCarbohydrate(int value) {
            carbohydrate = value;
            return this;
        }

        public NutritionFactsBuilder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public NutritionFact build() {
            return new NutritionFact(this);
        }
    }

    private NutritionFact(NutritionFactsBuilder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFact build = new NutritionFactsBuilder(100, 56).setFat(900).setSodium(700).build();
    }
}
