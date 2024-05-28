/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym.system;

/**
 *
 * @author Prageeth kaushalya
 */
public class Dietplan {
    private Meal[] MealArry = new Meal[5];

    public Dietplan(Meal[] MealArry) {
        this.MealArry=MealArry;    }

    /**
     * @return the MealArry
     */
    public Meal[] getMealArry() {
        return MealArry;
    }

    /**
     * @param MealArry the MealArry to set
     */
    public void setMealArry(Meal[] MealArry) {
        this.MealArry = MealArry;
    }
     @Override
    public String toString() {

        String displayItems = " " ;
        for (int i = 0 ; i <  5 ;i++){
            displayItems = displayItems+MealArry[i].toString();
        }

        return displayItems;
    }

}

