package zhangyi.insight.basic.builder;/*                                                                      *\
**                                                                      **
**      __  __ _________ _____          ©Mort BI                        **
**     |  \/  / () | () |_   _|         (c) 2015                        **
**     |_|\/|_\____|_|\_\ |_|           http://www.bigeyedata.com       **
**                                                                      **
\*                                                                      */

public class NutritionFacts {
    private final int servingSize;  // (mL)              required
    private final int servings;     // (per container)   required
    private final int calories;     //                   optional
    private final int fat;          // (g)               opitonal
    private final int sodium;       // (g)               opitonal
    private final int carbohydrate; // (g)               opitonal

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public void print() {
        printMessage("serving size", this.servingSize);
        printMessage("servings", this.servings);
        printMessage("calories", this.calories);
        printMessage("fat", this.fat);
        printMessage("sodium", this.sodium);
        printMessage("carbohydrate", this.carbohydrate);
    }

    private void printMessage(String name, int value) {
        if (value != 0) {
            System.out.println(String.format("the %s is %d", name, value));
        }
    }
}
