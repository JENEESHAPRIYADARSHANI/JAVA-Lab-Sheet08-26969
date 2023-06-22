package com.mycompany.assignmentnew;



public abstract class BankAccount
{
   

    
    private int accountNumber;
    protected float balance;
    protected float interest;
    
    public void setVAlueAccNumber(int num)
    {
        this.accountNumber=num;
    }
    public int getValueAccNumber()
    {
        return accountNumber;
    }
     public void setVAlueBalance(float balance)
    {
        this.balance=balance;
    }
    public float getValueBalance()
    {
        return balance;
    }
}
