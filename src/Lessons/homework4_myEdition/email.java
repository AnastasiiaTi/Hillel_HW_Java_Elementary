package Lessons.homework4_myEdition;

import java.util.ArrayList;

public class email {

    public static void main(String[] args) {

        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};


        int emailsWithoutDots = numUniqueEmails(emails);
        System.out.println(emailsWithoutDots);

    }

    public static int numUniqueEmails(String[] emails) {

        String stringWithoutPlus;
        String afterAt;
        emails = removeDots(emails);
        for (int i = 0; i < emails.length; i++) {
            afterAt = emails[i].substring(emails[i].lastIndexOf("@") + 1);
            stringWithoutPlus = emails[i].substring(0, emails[i].indexOf("+"));
            emails[i] = stringWithoutPlus + '@' + afterAt;
        }

        ArrayList finalListOfEmails = new ArrayList();
        for (int i = 0; i < emails.length - 1; i++) {
            if (emails[i] != (emails[i + 1])) {
                finalListOfEmails.add(emails[i]);
            }
        }
        int numberOfReceivers = finalListOfEmails.size();
        return numberOfReceivers;
    }

    public static String[] removeDots(String[] word) {
        String end;
        for (int i = 0; i < word.length; i++) {
            end = word[i].substring(word[i].lastIndexOf("@") + 1);
            word[i] = word[i].substring(0, word[i].indexOf("@")).replace(".", "");
            word[i] = word[i] + '@' + end;
        }
        return word;
    }
}

