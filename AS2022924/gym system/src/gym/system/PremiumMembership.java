/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym.system;

/**
 *
 * @author Prageeth kaushalya
 */
public class PremiumMembership extends Member{
    
    private Dietplan Dietplan ;

    public PremiumMembership(String Name, String Date_of_birth, String Gender, double Height, double Weight, double Fat_Percentage, int MemberType) {
        super(Name, Date_of_birth, Gender, Height, Weight, Fat_Percentage, MemberType);
    }

    /**
     * @return the Dietplan
     */
    public Dietplan getDietplan() {
        return Dietplan;
    }

    /**
     * @param Dietplan the Dietplan to set
     */
    public void setDietplan(Dietplan Dietplan) {
        this.Dietplan = Dietplan;
    }
    
}
