package com.mycompany.assignmentnew;

public abstract class AssignmentNew 
{
    public abstract float calculateInterest();

    public static void main(String[] args) 
    {
       
        
        CheckingAccount C1=new CheckingAccount();
        C1.setVAlueBalance(1000000);
        System.out.println("Balance:"+C1.getValueBalance());
        System.out.println("The interest:"+C1.calculateInterest());
        
       SavingAccount S1=new SavingAccount();
       S1.setVAlueBalance(20000000.00f);
         System.out.println("Balance:"+S1.getValueBalance());
        System.out.println("The interest:"+S1.calculateInterest());
        
        
      
       
    }
}
