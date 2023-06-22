
package com.mycompany.assignmentnew;

public class CheckingAccount extends BankAccount
{
     static final float Rate=1.2f;
    public float calculateInterest()
    {
        
        interest=balance*Rate;
        return interest;
    }
    
}
