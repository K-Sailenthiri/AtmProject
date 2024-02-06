package com.atmprogramming;
import java.util.HashMap;
import java.util.Map;

public class AtmOperation implements AtmOperations{
    Atm atm= new Atm();
     // Map<Double,String>ministatement = new HashMap<>();
     HashMap<Double,String> ministatement = new HashMap<Double,String>();
    @java.lang.Override
    public void viewBalance() {
        System.out.println("Available Balance is : "+ atm.getBalance());
    }

    @java.lang.Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount%500==0) {
            if (withdrawAmount <= atm.getBalance()) {
                 ministatement.put(withdrawAmount," amount withdrawn");
                System.out.println("Collect the cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance !!!");
            }
        }
        else {
            System.out.println("Please enter the amount in multiple of 500");
        }
    }

    @java.lang.Override
    public void depositAmount(double depositAmount) {
        ministatement.put(depositAmount," amount deposited");
        System.out.println(depositAmount + " Deposited Successfully !!!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();

    }

    @Override
    public void viewMiniStatement() {
/*      for (Map.Entry<Double,String>ministatement.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
*/

        for (Double i : ministatement.keySet()){
            // System.out.println(ministatement.get()+""+ministatement.values());
            System.out.println( i + ministatement.get(i));
        }
    }
}
