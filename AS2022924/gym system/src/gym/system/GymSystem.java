/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gym.system;

import java.util.Scanner;

/**
 *
 * @author Prageeth kaushalya
 */
public class GymSystem {

   static PremiumMembership[] MemberArry = new PremiumMembership[100];
   static Exercise[]  ExercisesArry = new Exercise[5];
   static Meal [] MealArry = new Meal [5];
   static Scanner input= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ReOption;
        do{
        //call the Main menu
        ReOption = MainMenu();
      
     
         switch(ReOption){
            
             //Register a new member
            case 1:
                NewMember();
                break;
                
              //Search for a member
            case 2:
                SearchMember();
                break;
                
                //Edit member details
            case 3:
                EditDetails();
                break;
                
                //Unregister a member
            case 4:
                UnregisterMember();
                break;
                
                //Add a schedule plan
            case 5:
                AddSchedule();
                break;
                
                //Add a diet plan
            case 6:
                DietPlan();
                break;
                
                //Update payments
            case 7:
                payments();
                break;
            case 8:
                System.out.println("Thank you");
                break;
            default:
                System.out.println("Invalid input");
               break;
        }
     }while(ReOption!=8);
        
        
    }
    
    
    
    //Main Menu:
    public static  int MainMenu(){
        System.out.print("\n        XYZ Sports Club\n\n" +
"Main Menu:\n" +
"1. Register a new member\n" +
"2. Search for a member\n" +
"3. Edit member details\n" +
"4. Unregister a member\n" +
"5. Add a schedule (gym routine) plan\n" +
"6. Add a diet plan\n" +
"7. Update payments\n" +
"8. Exit\n\n" +
 "Select Option:");
        
        Scanner scnOption = new Scanner(System.in);
            int Option = scnOption.nextInt();
            System.out.println();
            
 return Option;           
    }
    
    
  // Register a new member
  public static void NewMember(){
              
              System.out.print("Enter the name:");
              String name=input.nextLine();
              
              System.out.print("Enter the Date of birth:");
              String Date_of_birth = input.nextLine();
              
              System.out.print("Enter the Gender:");
              String Gender=input.nextLine();
              
              System.out.print("Enter the  Height(metres):");
              double Height=input.nextDouble();
              
              System.out.print("Enter the Weight(kilograms):");
              double Weight=input.nextDouble();
              
              System.out.print("Enter the fat Percentage:");
              double Fat_Percentage=input.nextDouble();
              
              System.out.print("Enter the Member type( premium-1 or  ordinary-0):");
              int MemberType=input.nextInt();
              
              

              MemberArry[Member.count]=new PremiumMembership(name,Date_of_birth,Gender,Height,Weight,Fat_Percentage,MemberType); 
             
              System.out.println("\n");
              
              input.nextLine();
  }
  
  public static void SearchMember(){
      System.out.print("Enter the Member name:");
      String name=input.nextLine();
      try {
      for(int i=0;i<100;i++){
          String val = MemberArry[i].getName();
             if(name.equals(val)){
             System.out.println("Name:"+MemberArry[i].getName());
             System.out.println("Date of birth:"+MemberArry[i].getDate_of_birth());
             System.out.println("Gendr:"+MemberArry[i].getGender());
             System.out.println("Height:"+MemberArry[i].getHeight());
             System.out.println("Whight:"+MemberArry[i].getWeight());
             System.out.println("Fat percentage:"+MemberArry[i].getFat_Percentage());
             System.out.println("BMI:"+MemberArry[i].getBMI());
             System.out.println("Member ID:"+MemberArry[i].getId());
                if(MemberArry[i].getMemberType()==1)
                    System.out.println("Member type:premium");
                
                else if(MemberArry[i].getMemberType()==0)
                    System.out.println("Member type:ordinary");
                
                if(MemberArry[i].getSchedule() != null ){
                     System.out.println(MemberArry[i].getSchedule());
                    }
                else{
                    System.out.println("The member does not have a schedule yet");
                }
                
                if(MemberArry[i].getMemberType() == 1){
                     System.out.println(MemberArry[i].getDietplan());
                }
                
                else if(MemberArry[i].getMemberType() == 0){
                     System.out.println("This memeber is an ordinary memeber,so there is no dietplan");
                }
                
                else{
                    System.out.println("The member does not have a dietplan yet");
                }
                
                int PayMent=MemberArry[i].getPayments();
                    if(PayMent == 1){
                         System.out.println("Member has paid for this year");   
                     }
                    else{
                        System.out.println("Member has not paid for this year");
                    }
                
                break;
            }
        }
        } catch (Exception e) {
             System.out.println("Not found\n");}
      
    }
  
  public static void  AddSchedule(){
      
      
      System.out.print("Enter the Member ID:");
      int memberId=input.nextInt();
      
      try {
          
      for (int j = 0; j < 100; j++) {
            if (memberId == MemberArry[j].getId()){ 
      
                     for(int i=0;i<5;i++){
                     System.out.print("Enter the Exercise Name:");
                         String ExerciseName = input.nextLine();
                         input.nextLine();

                      System.out.print("Enter the Intensity:");
                      String Intensity=input.nextLine();


                      System.out.print("Enter the Reps:");
                      int Reps=input.nextInt();

                      System.out.print("Enter the sets:");
                      int sets=input.nextInt();

                       ExercisesArry[i]=new Exercise(ExerciseName,Intensity,Reps,sets);
                          System.out.print("Do you want to do more exrcise(yes-1 No-0):");

                          int MoreExrcise=input.nextInt();
                            if (MoreExrcise == 0)
                            break;
                  }
                  Schedule Schedule1=new Schedule(ExercisesArry);
                  MemberArry[memberId-1].setSchedule(Schedule1);
                    break;
            }
            }
    }
                    catch (Exception e) {
                     System.out.println("No data entered");
      } 
      
  }

  
  
  public static  void DietPlan(){
      
      System.out.print("Enter the Member Id:");
      int MemberID=input.nextInt();
      boolean hasData = false;
      
      for (int i = 0; i < 100; i++) {
                if (MemberArry[i] != null) {
                    hasData = true;
                    break;
                }
            }
      
      if (hasData) {
          
          
         try {
            for (int j = 0; j < 100; j++) {
               if(MemberArry[j].getId() == MemberID ){

                   if (MemberArry[MemberID-1].getMemberType() == 1){
                       System.out.println("Enter the 3 main meals and 2 sub meals\n ");
                       for (int k=0;k<5;k++){
                           System.out.print("Enter the  Meal name:");
                           String  Mealname=input.nextLine();
                           
                           System.out.print("Enter the Portion Size:");
                           String PortionSize=input.nextLine();
                           
                           System.out.print("Enter the time:");
                           String  Time=input.nextLine();
                           
                           MealArry[k] = new Meal(Mealname,PortionSize,Time);
                       }
                       Dietplan Dietplan1 = new Dietplan(MealArry);
                       MemberArry[MemberID-1].setDietplan(Dietplan1);
                   }
                   
                   else if (MemberArry[MemberID-1].getMemberType() == 0){
                       System.out.println("This member is not a premium member.So there is no diet plan\n" );
                   }
                   
                   break;
                }
            }
            } catch (Exception e) {
               System.out.println("Member Not found");
             }
        }else {
                System.out.println("No data entered");
            }
  
  }
  
  public static void  payments(){
      
      System.out.print("Enter the Member Id:");
      int MemberID=input.nextInt();
      boolean hasData = false;
      
      for (int i = 0; i < 100; i++) {
                if (MemberArry[i] != null) {
                    hasData = true;
                    break;
                }
            }
      if (hasData) {
          try {
              for (int j = 0; j < 100; j++) {
               if(MemberArry[j].getId() == MemberID ){
                   System.out.print("Has the Member given money for this Year?(Yes-1 No-0):");
                   int payments = input.nextInt();
                   MemberArry[MemberID-1].setPayments(payments);
                break;
               }
              }              
          } catch (Exception e) {
              System.out.println("Member Not found\n");
          }
      }else {
                System.out.println("No data entered\n");
            }
    }
  public static void  UnregisterMember(){
  
  boolean hasData = false;
  
        System.out.print("Enter the Member Id:");
        int MemberID=input.nextInt();
          for (int i = 0; i < 100; i++) {
                if (MemberArry[i] != null && MemberID== MemberArry[i].getId() ) {
                    hasData = true;
                    break;
                }
            }
      
      if(hasData){
          MemberArry[MemberID-1]=null;
          
      }
      else 
          System.out.println("Member Not Found\n");
  }
  
  
  public static void EditDetails(){
  boolean hasData = false;
  
        System.out.print("Enter the Member Id:");
        int MemberID=input.nextInt();
          for (int i = 0; i < 100; i++) {
                if (MemberArry[i] != null && MemberID== MemberArry[i].getId() ) {
                    hasData = true;
                    break;
                }
            }
      
      if(hasData){
          System.out.println("What you need to reset? (Diet plan-1 or schedule-0)");
          int editData=input.nextInt();
          
          switch (editData) {
              case 0:
                  
                  for(int i=0;i<5;i++){
                     System.out.print("Enter the Exercise Name:");
                         String ExerciseName = input.nextLine();
                         input.nextLine();

                      System.out.print("Enter the Intensity:");
                      String Intensity=input.nextLine();


                      System.out.print("Enter the Reps:");
                      int Reps=input.nextInt();

                      System.out.print("Enter the sets:");
                      int sets=input.nextInt();

                       ExercisesArry[i]=new Exercise(ExerciseName,Intensity,Reps,sets);
                          System.out.print("Do you want to do more exrcise(yes-1 No-0):");

                          int MoreExrcise=input.nextInt();
                            if (MoreExrcise == 0)
                            break;
                  }
                  Schedule Schedule1=new Schedule(ExercisesArry);
                  MemberArry[MemberID-1].setSchedule(Schedule1);
                 break;
                 
              case 1:
                  if(MemberArry[MemberID-1].getMemberType()==1){
                  System.out.println("Enter the 3 main meals and 2 sub meals\n ");
                       for (int k=0;k<5;k++){
                           System.out.println("Enter the  Meal name:");
                           String  Mealname=input.nextLine();
                           
                           System.out.println("Enter the Portion Size:");
                           String PortionSize=input.nextLine();
                           
                           System.out.println("Enter the time:");
                           String  Time=input.nextLine();
                           
                           MealArry[k] = new Meal(Mealname,PortionSize,Time);
                       }
                       Dietplan Dietplan1 = new Dietplan(MealArry);
                       MemberArry[MemberID-1].setDietplan(Dietplan1);
                       
                       System.out.println(MemberArry[MemberID-1].getDietplan());
                  }
                  else{
                      System.out.println("He is not a preimium member,so there is no diet plan");
                  }
                  break;
              default:
                  System.out.println("Invalid input");
                  break;
          }
         
          
        }
      else 
          System.out.println("Member Not Found\n");
  }
  
}
  