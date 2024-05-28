/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym.system;
import java.util.Arrays;

/**
 *
 * @author Prageeth kaushalya
 */
public class Schedule {

private Exercise[]  ExercisesArry = new Exercise[5]; 

    public Schedule(Exercise[] Exercises) {
        ExercisesArry=Exercises;
    }

    /**
     * @return the ExercisesArry
     */
    public Exercise[] getExercisesArry() {
        return ExercisesArry;
    }

    /**
     * @param ExercisesArry the ExercisesArry to set
     */
    public void setExercisesArry(Exercise[] ExercisesArry) {
        this.ExercisesArry = ExercisesArry;
    }

    
    
    @Override
    public String toString() {

        String variable = " " ;
        for (int i = 0 ; i <  5 ;i++){
            variable = variable+ExercisesArry[i].toString();
        }

        return variable;
    }

    
}
