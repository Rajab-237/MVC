package com.company;
import java.util.Scanner;
public class PassView {
    private int passId;

    /**
     * This method takes the input from user directly and compare with the one stored .
     **/
    public void getInputFromUser()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the passport Number  of the person whom " +
                "you want to verify .");
        passId = scanner.nextInt();
    }

    /**
     * This method is used by controller to get the passID that is unique and that the
     * user entered.
     **/
    public int getPassId()
    {
        return passId;
    }

    /**
     * This method prints information related to the passport number the given
     * to verify user's info
     * @param Name The full name of the person corresponding to the given passport number
     * @param Country the where that person belongs to according to his/her passport
     * @param Profession The job carried out by the person as stated on his passport
     */
    public void printPassportDetails(String Name,String Country ,
                                     String Profession)
    {
        System.out.println("Passport Details: ");
        System.out.println("Name: " + Name);
        System.out.println("Country: " + Country);
        System.out.println("Profession: " + Profession);
    }
}
