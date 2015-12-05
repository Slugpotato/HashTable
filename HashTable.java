//#################################
//# Name: Andrew Lee & Leo Gomez  #
//# CruzID: ale915@ & legomez@    #
//# Class: CMPS101-Spr15          #
//# Date: Dec 3, 2015             #
//# filename: HashTable.java      #
//# Details: Creates a customer id#
//# and adds it into a hashtable. #
//#################################
//
import java.io.File;
import static java.lang.System.*;
import java.io.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.*;
import java.util.Random;


public class HashTable {

   public static void main(String args[]) {

      Scanner in = new Scanner(System.in);
	
      String userin;
      
      System.out.println("Enter User ID that is less than 16 characters with no symbols");
      userin = in.nextLine();

      // Check if entered ID is more than 16 characters 
      if (userin.length() > 16){
      System.out.print("Entered ID is too long");
      System.out.println("");
       main(args);
      }
      
      // Adding zeros to the end of the userin till it is 16 characters
      if (userin.length() <16){
	System.out.print("Initial length of the UserID is '"+userin);
	for(int i= userin.length(); i<16; i++)
	userin = userin +"0";
	System.out.println("New UserID is "+userin);
      }

      System.out.print("Your User ID '"+userin);
      boolean available = isAlphaNumeric(userin);

      // Will end program if 
       if(available == false){
	 System.out.print("' is the incorrect format");
	 System.out.println("");
	 main(args);
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

///////////////////////////////////////////////////////////////////////////////
//First Switch case to translate the digits in the userID to six digits binary
///////////////////////////////////////////////////////////////////////////////

	String sumString = "";
	for (int i = 0; i<userin.length(); i++){
	 char c = userin.charAt(i);
	 System.out.println ("Iterated char= "+c);	 

	 String charString;
	 switch (c) {
            case '0':  charString = "000001";
                     break;
            case '1':  charString = "000010";
                     break;
            case '2':  charString = "000011";
                     break;
            case '3':  charString = "000100";
                     break;
            case '4':  charString = "000101";
                     break;
            case '5':  charString = "000110";
                     break;
            case '6':  charString = "000111";
                     break;
            case '7':  charString = "001000";
                     break;
            case '8':  charString = "001001";
                     break;
            case '9':  charString = "001010";
                     break;
            case 'a': charString = "001011";
                     break;
            case 'b': charString = "001100";
                     break;
	    case 'c': charString = "001101";
                     break;
	    case 'd': charString = "001110";
                     break;
            case 'e': charString = "001111";
                     break;
            case 'f': charString = "010000";
                     break;
	    case 'g': charString = "010001";
                     break;
            case 'h': charString = "010010";
                     break;
            case 'i': charString = "010011";
                     break;
            case 'j': charString = "010100";
                     break;
            case 'k': charString = "010101";
                     break;
            case 'l': charString = "010110";
                     break;
            case 'm': charString = "010111";
                     break;
            case 'n': charString = "011000";
                     break;
            case 'o': charString = "011001";
                     break;
            case 'p': charString = "011010";
                     break;
            case 'q': charString = "011011";
                     break;
            case 'r': charString = "011100";
                     break;
	    case 's': charString = "011101";
                     break;
            case 't': charString = "011110";
                     break;
            case 'u': charString = "011111";
                     break;
	    case 'v': charString = "100000";
                     break;
            case 'w': charString = "100001";
                     break;
            case 'x': charString = "100010";
                     break;
	    case 'y': charString = "100011";
                     break;
            case 'z': charString = "100100";
                     break;
            case 'A': charString = "100101";
                     break;
	    case 'B': charString = "100110";
                     break;
	    case 'C': charString = "100111";
                     break;
	    case 'D': charString = "101000";
                     break;
            case 'E': charString = "101001";
                     break;
            case 'F': charString = "101010";
                     break;
	    case 'G': charString = "101011";
                     break;
            case 'H': charString = "101100";
                     break;
            case 'I': charString = "101101";
                     break;
            case 'J': charString = "101110";
                     break;
            case 'K': charString = "101111";
                     break;
            case 'L': charString = "110000";
                     break;
	    case 'M': charString = "110001";
                     break;
            case 'N': charString = "110010";
                     break;
            case 'O': charString = "110011";
                     break;
            case 'P': charString = "110100";
                     break;
            case 'Q': charString = "110101";
                     break;
            case 'R': charString = "110110";
                     break;
            case 'S': charString = "110111";
                     break;
            case 'T': charString = "111000";
                     break;
            case 'U': charString = "111001";
                     break;
            case 'V': charString = "111010";
                     break;
            case 'W': charString = "111011";
                     break;
            case 'X': charString = "111100";
                     break;
	    case 'Y': charString = "111101";
                     break;
            case 'Z': charString = "111110";
                     break;
            default: charString  = "Incorrect Digit";
                     break;
         }
	  System.out.println("Bit translated to: " +charString);
	  sumString = sumString+charString;
        }
	System.out.println("Total string equals to: " +sumString);
////////////////////////////////////////////////////////
////////////////////////////////////////////////////////

      










      // Entering new user into hashtable
      balance.put(userin, new Double(300.00));
      
      balance.put("Zara", new Double(3434.34));
      balance.put("Mahnaz", new Double(123.22));

      // Show all balances in hash table.
      names = balance.keys();
      while(names.hasMoreElements()) {
//	 System.out.println("");
         str = (String) names.nextElement();
//         System.out.println(str + ": " +
//         balance.get(str));
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


