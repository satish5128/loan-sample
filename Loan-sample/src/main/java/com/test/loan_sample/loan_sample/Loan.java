package com.test.loan_sample.loan_sample;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Loan implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Amount")
   private int amount;
   @org.kie.api.definition.type.Label("Duration")
   private int duration;
   @org.kie.api.definition.type.Label("Interest Rate")
   private double interestRate;
   @org.kie.api.definition.type.Label("Approved")
   private boolean approved;

   @org.kie.api.definition.type.Label(value = "isApproved")
   private java.lang.String isApproved;

   public Loan()
   {
   }

   public int getAmount()
   {
      return this.amount;
   }

   public void setAmount(int amount)
   {
      this.amount = amount;
   }

   public int getDuration()
   {
      return this.duration;
   }

   public void setDuration(int duration)
   {
      this.duration = duration;
   }

   public double getInterestRate()
   {
      return this.interestRate;
   }

   public void setInterestRate(double interestRate)
   {
      this.interestRate = interestRate;
   }

   public boolean isApproved()
   {
      return this.approved;
   }

   public void setApproved(boolean approved)
   {
      this.approved = approved;
   }

   public java.lang.String getIsApproved()
   {
      return this.isApproved;
   }

   public void setIsApproved(java.lang.String isApproved)
   {
      this.isApproved = isApproved;
   }

   public Loan(int amount, int duration, double interestRate, boolean approved,
         java.lang.String isApproved)
   {
      this.amount = amount;
      this.duration = duration;
      this.interestRate = interestRate;
      this.approved = approved;
      this.isApproved = isApproved;
   }

}