/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym.system;

/**
 *
 * @author Prageeth kaushalya
 */
public class Member {
private String Name;
private String Date_of_birth;
private String Gender;
private double Height;
private double Weight;
private double Fat_Percentage;
private int MemberType;
private int id;
private int payments;

private Schedule schedule;

public static int count=0;
    /**
     * @return the Name
     */
    
    
    public Member(String Name, String Date_of_birth, String Gender, double Height, double Weight, double Fat_Percentage,int MemberType) {
        count++;
        id= count;
        this.Name = Name;
        this.Date_of_birth = Date_of_birth;
        this.Gender = Gender;
        this.Height = Height;
        this.Weight = Weight;
        this.Fat_Percentage = Fat_Percentage;
        this.MemberType=MemberType;
        
    }

    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Date_of_birth
     */
    public String getDate_of_birth() {
        return Date_of_birth;
    }

    /**
     * @param Date_of_birth the Date_of_birth to set
     */
    public void setDate_of_birth(String Date_of_birth) {
        this.Date_of_birth = Date_of_birth;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the Height
     */
    public double getHeight() {
        return Height;
    }

    /**
     * @param Height the Height to set
     */
    public void setHeight(double Height) {
        this.Height = Height;
    }

    /**
     * @return the Weight
     */
    public double getWeight() {
        return Weight;
    }

    /**
     * @param Weight the Weight to set
     */
    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    /**
     * @return the Fat_Percentage
     */
    public double getFat_Percentage() {
        return Fat_Percentage;
    }

    /**
     * @param Fat_Percentage the Fat_Percentage to set
     */
    public void setFat_Percentage(double Fat_Percentage) {
        this.Fat_Percentage = Fat_Percentage;
    }
    
    public double getBMI(){
    return Weight/(Height*Height);
    }

    /**
     * @return the MemberType
     */
    public int getMemberType() {
        return MemberType;
    }

    /**
     * @param MemberType the MemberType to set
     */
    public void setMemberType(int MemberType) {
        this.MemberType = MemberType;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the schedule
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * @param schedule the schedule to set
     */
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * @return the payments
     */
    public int getPayments() {
        return payments;
    }

    /**
     * @param payments the payments to set
     */
    public void setPayments(int payments) {
        this.payments = payments;
    }
    
    
}
