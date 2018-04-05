package com.sainz.preaddressbook;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String option;
        Person newPerson;


        ArrayList<Person> persons = new ArrayList<>();

        for (int x=1; x<=5; x++ )

        {
            newPerson = new Person();
            System.out.println("Enter five people's information - keep going until you have input information for all five of them");
            System.out.println("Enter this person's first name");
            newPerson.setFirstName(scan.nextLine());
            System.out.println("Enter this person's last name");
            newPerson.setLastName(scan.nextLine());
            System.out.println("Enter this person's home address");
            newPerson.setHomeAddress(scan.nextLine());
            System.out.println("Enter this person's phone number");
            newPerson.setPhoneNumber(scan.nextLine());
            System.out.println("Enter this person's email address");
            newPerson.setEmailAddress(scan.nextLine());

            persons.add(newPerson);

            }

            for (Person eachPerson : persons)

            {

                System.out.println("========");
                System.out.println("This person's first name is:" + " " + eachPerson.getFirstName());
            }
        }
}
