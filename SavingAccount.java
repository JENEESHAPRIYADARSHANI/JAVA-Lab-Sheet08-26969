package com.mycompany.assignmentnew;


public class SavingAccount extends BankAccount
{
    static final float SRate=0.2f;
    
    public float calculateInterest()
    {
        interest=balance*SRate;
        return interest;
    }
    
}
