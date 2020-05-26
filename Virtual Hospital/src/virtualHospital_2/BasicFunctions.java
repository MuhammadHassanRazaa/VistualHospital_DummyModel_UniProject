/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualHospital_2;

import java.util.Scanner;

/**
 *
 * @author sshth
 */
public class BasicFunctions {
       public static int readInt() {// for inputting a int as a String for exception handling
        Scanner scan = new Scanner(System.in);
        boolean isInt = true;
        String integerreader = "";
        do {
            integerreader = scan.nextLine();
            for (int i = 0; i < integerreader.length(); i++) {
                char a = integerreader.charAt(i);
                if (!Character.isDigit(a)) {
                    isInt = false;
                    print("Sorry !! Invlaid Input.. \nPlease Enter only an integer value..");
                    break;
                } else {
                    isInt = true;
                }
            }
        } while (isInt == false);
        return Integer.parseInt(integerreader);
    }
       public static String readCOmpleteString(){
           Scanner scan = new Scanner(System.in);
           String address=scan.nextLine();
           return address;
           
       }

    public static String readString() {//for input a string only for name etc << exception ahnfled for input other than alpahbets and numbers << no special character allowed.
        Scanner scan = new Scanner(System.in);
        String stringreader = "";
        boolean isValidStringforNames = true;
        do {
            stringreader = scan.nextLine();
            for (int i = 0; i < stringreader.length(); i++) {
                char a = stringreader.charAt(i);
                if (!Character.isAlphabetic(a) && !Character.isWhitespace(a) ) {
                    isValidStringforNames = false;

                    print("Please Note that special Characters and numbers are not allowed for this item\nPlease Enter valid input...");
                    break;
                } else {
                    isValidStringforNames = true;
                }
            }
        } while (isValidStringforNames == false);

        return stringreader;
    }

    public static String readEmail() {//for input a emial<<complete exception handled dor invlaid emial
        Scanner scan = new Scanner(System.in);

        String emailreader = "";
        boolean isValidEmail = true;
        do {
            emailreader = scan.nextLine();
            for (int i = 0; i < emailreader.length(); i++) {
                char a = emailreader.charAt(i);
                if (!Character.isAlphabetic(a) && !Character.isWhitespace(a) && !Character.isDigit(a) && !(a == '@') && !(a == '.')) {
                    isValidEmail = false;

                    print("Please Enter valid Email...");
                    break;
                } else {
                    isValidEmail = true;
                }
            }
        } while (isValidEmail == false);

        return emailreader;
    }

    public static String readContact() {//for input a number<<complete exception handled dor invlaid number
        Scanner scan = new Scanner(System.in);

        String contactreader = "";
        boolean isValidContact = true;
        do {
            contactreader = scan.nextLine();
            for (int i = 0; i < contactreader.length(); i++) {
                char a = contactreader.charAt(i);
                if (!Character.isDigit(a)) {
                    isValidContact = false;
                    print("Please Enter Contact Number of vlaid length...+92");
                    break;
                }
                if (!(contactreader.length() == 10) ) {
                    isValidContact = false;
                    print("Please Enter Contact Number of vlaid length Please check the international format...+92");
                    break;
                } else {
                    isValidContact = true;
                }
            }
        } while (isValidContact == false);

        return contactreader;
    }

    public static void error(String a) {//prrint error
        System.err.println(a);
    }

    public static void println(String a) {// for printing
        System.out.println(a);
    }

    public static void print(String a) {//print withour new line
        System.out.print(a);
    }
}
