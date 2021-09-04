/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Peter Perri
 */

/*
Exercise:
Create a program that prompts for an input string
and displays output that shows the input string and
the number of characters the string contains.

Pseudocode:
create a new scanner called 'input'
create an empty string variable called 'str'
create an empty int variable called 'length'
prompt the user to enter a string
assign the user's entry to the 'str' variable
find the length or 'str' and assign its value to 'length'
print 'length'

 */

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        String str;

        System.out.println("Enter a string: ");
        str = input.nextLine();
        length = str.length();
        System.out.printf("%s is %d characters long.", str, length);
    }
}
