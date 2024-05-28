/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym.system;

/**
 *
 * @author Prageeth kaushalya
 */
public class Exercise {
    private String ExerciseName;
    private String Intensity;
    private int Reps;
    private int sets;

    public Exercise(String ExerciseName, String Intensity, int Reps, int sets) {
        this.ExerciseName = ExerciseName;
        this.Intensity = Intensity;
        this.Reps = Reps;
        this.sets = sets;
    }

    /**
     * @return the ExerciseName
     */
    public String getExerciseName() {
        return ExerciseName;
    }

    /**
     * @param ExerciseName the ExerciseName to set
     */
    public void setExerciseName(String ExerciseName) {
        this.ExerciseName = ExerciseName;
    }

    /**
     * @return the Intensity
     */
    public String getIntensity() {
        return Intensity;
    }

    /**
     * @param Intensity the Intensity to set
     */
    public void setIntensity(String Intensity) {
        this.Intensity = Intensity;
    }

    /**
     * @return the Reps
     */
    public int getReps() {
        return Reps;
    }

    /**
     * @param Reps the Reps to set
     */
    public void setReps(int Reps) {
        this.Reps = Reps;
    }

    /**
     * @return the sets
     */
    public int getSets() {
        return sets;
    }

    /**
     * @param sets the sets to set
     */
    public void setSets(int sets) {
        this.sets = sets;
    }
    public String toString() {
        return
                "\nExercise Name=  " + ExerciseName +
                "\nintensity=      " + Intensity +
                "\nreps=           " + Reps +
                "\nsets=           " + sets + " \n";
    }

    
}
