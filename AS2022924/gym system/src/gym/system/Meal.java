/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym.system;

/**
 *
 * @author Prageeth kaushalya
 */
public class Meal {
    private String MealName;
    private String PortionSize;
    private String Time;

    public Meal(String MealName, String PortionSize, String Time) {
        this.MealName = MealName;
        this.PortionSize = PortionSize;
        this.Time = Time;
    }

    /**
     * @return the MealName
     */
    public String getMealName() {
        return MealName;
    }

    /**
     * @param MealName the MealName to set
     */
    public void setMealName(String MealName) {
        this.MealName = MealName;
    }

    /**
     * @return the PortionSize
     */
    public String getPortionSize() {
        return PortionSize;
    }

    /**
     * @param PortionSize the PortionSize to set
     */
    public void setPortionSize(String PortionSize) {
        this.PortionSize = PortionSize;
    }

    /**
     * @return the Time
     */
    public String getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(String Time) {
        this.Time = Time;
    }
    
     public String toString() {
        return
                "\nmealName=    " + MealName +
                "\nportionSize= " + PortionSize +
                "\nmealTime=    " + Time + " \n"
                ;
    }

    
}
