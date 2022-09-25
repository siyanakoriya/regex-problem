
package com.bridgelabz;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println(firstName("Pragati"));
        System.out.println(lastName("Nakoriya"));
        System.out.println(email("pragatinakoriya@gmail.com"));
        System.out.println(mobile("91 9309546984"));
        System.out.println(password("Mypassword pragati234"));
    }

    /*
     validate first name with 1st letter capital and at least 3 words
     */
    public static boolean firstName(String firstName) {
        return firstName.matches("[A-Z][a-z]{3,}");
    }

    /*
 validate last name with 1st letter capital and at least 3 words
 */
    public static boolean lastName(String lastName) {
        return lastName.matches("[A-Z][a-z]{3,}");
    }

    /*
      validate the email address
      */
    public static boolean email(String email) {
        return email.matches("[a-zA-Z0-9]+[@][a-zA-Z]{3,15}[.][a-zA-Z]{2,5}");
    }

    /*
    validate the mobile number
    */
    public static boolean mobile(String mobile) {
        return mobile.matches("91{1}" + "" + "[0-9]{10}");
    }

    /*
       validate the password of minimum 8 character  and 1 uppercase
       */
    public static boolean password(String password) {
        return password.matches("^[A-Z]{1}[a-zA-Z0-9]{7,}$");
    }
}