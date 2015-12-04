// HashTable function

import java.util.*;
import java.util.Scanner;

public class HashTable {

   public static void main(String args[]) {

      Scanner in = new Scanner(System.in);
	
      String userin;
      
      System.out.println("Enter User ID");
      userin = in.nextLine();
      System.out.print("Your User ID '"+userin);
      boolean available = isAlphaNumeric(userin);
	if(available == false){
	 System.out.print("' is the incorrect format");
	}else{
	 System.out.print("' is the correct format");
	}
      System.out.println("");
      System.out.println ("Returned variable = "+available);

      // Create a hash map
      Hashtable balance = new Hashtable();
      Enumeration names;
      String str;
      double bal;
      
      balance.put("Zara", new Double(3434.34));
      balance.put("Mahnaz", new Double(123.22));
      balance.put("Ayan", new Double(1378.00));
      balance.put("Daisy", new Double(99.22));
      balance.put("Qadir", new Double(-19.08));

      // Show all balances in hash table.
      names = balance.keys();
      while(names.hasMoreElements()) {
         str = (String) names.nextElement();
         System.out.println(str + ": " +
         balance.get(str));
      }
      System.out.println();
      // Deposit 1,000 into Zara's account
      bal = ((Double)balance.get("Zara")).doubleValue();
      balance.put("Zara", new Double(bal+1000));
      System.out.println("Zara's new balance: " +
      balance.get("Zara"));
   }

// Check if only AlphaNumeric, no symbols in userID
   public static  boolean isAlphaNumeric(String s){
	String pattern= "^[a-zA-Z0-9]*$";
        if(s.matches(pattern)){
            return true;
        }
        return false;   
   }
}
