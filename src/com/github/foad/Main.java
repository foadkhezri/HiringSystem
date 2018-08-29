package com.github.foad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static String name;
    private static long id;
    private static int workExperience;
    private static String lastDegree;
    private static String lastWorkPosition;
    private static String languageUsed;
    private static int publishedAppNo;
    private static String applicationType;
    private static Scanner input = new Scanner(System.in);
    private static char ans;

    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/HiringSystem",
                            "postgres", "faha20ayash");
            stmt = c.createStatement();
            String sql = "CREATE TABLE APPLICANTS " +
                    "(ID BIGINT PRIMARY KEY     NOT NULL," +
                    " NAME           TEXT    NOT NULL, " +
                    " AGE            INT     NOT NULL, " +
                    " ADDRESS        CHAR(50), " +
                    " SALARY         REAL)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
        ArrayList<MobileApplicant> mobileApplicants = new ArrayList<>();
        ArrayList<AccountantApplicant> accountantApplicants = new ArrayList<>();
        ArrayList<WebApplicant> webApplicants = new ArrayList<>();

        do {
            mainInput();
            switch (applicationType) {
                case "web":
                    webInput(webApplicants);
                    break;
                case "mobile":
                    mobileInput(mobileApplicants);
                    break;
                case "accountant":
                    accountantInput(accountantApplicants);
                    break;
                default:
                    System.out.println("invalid type ! Please enter it again.");
                    mainInput();
            }
            System.out.println("do you want to insert another applicant (y/n) : ");
            ans = input.next().charAt(0);
        } while (ans == 'y');

        System.out.println("applicants information are :");
        System.out.println(mobileApplicants + "\n" + webApplicants + "\n" + accountantApplicants);

    }

    private static void mobileInput(ArrayList<MobileApplicant> mobileApplicants) {

        try {
            System.out.println("Enter your name :");
            input.nextLine();
            name = input.nextLine();
            System.out.println("Enter your governmental ID :");
            id = input.nextLong();
            System.out.println("Enter your work experience (years):");
            workExperience = input.nextInt();
            System.out.println("Enter your last work position :");
            input.nextLine();
            lastWorkPosition = input.nextLine();
            System.out.println("Enter your published app number :");
            publishedAppNo = input.nextInt();
            mobileApplicants.add(new MobileApplicant(name, id, workExperience, lastWorkPosition, publishedAppNo));
        }catch (Exception e) {
            System.out.println("An error has occur. Please try again.");
            mobileInput(mobileApplicants);
        }

    }

    private static void accountantInput(ArrayList<AccountantApplicant> accountantApplicants) {
        try {
            System.out.println("Enter your name :");
            input.nextLine();
            name = input.nextLine();
            System.out.println("Enter your governmental ID :");
            id = input.nextLong();
            System.out.println("Enter your work experience (years):");
            workExperience = input.nextInt();
            System.out.println("Enter your last degree obtained :");
            input.nextLine();
            lastDegree = input.nextLine();
            accountantApplicants.add(new AccountantApplicant(name, id, workExperience, lastDegree));
        }catch (Exception e) {
            System.out.println("An error has occur. Please try again.");
            accountantInput(accountantApplicants);
        }
    }

    private static void webInput(ArrayList<WebApplicant> webApplicants) {
        try {
            System.out.println("Enter your name :");
            input.nextLine();
            name = input.nextLine();
            System.out.println("Enter your governmental ID :");
            id = input.nextLong();
            System.out.println("Enter your work experience (years):");
            workExperience = input.nextInt();
            System.out.println("Enter your last work position :");
            input.nextLine();
            lastWorkPosition = input.nextLine();
            System.out.println("Enter your language used :");
            languageUsed = input.nextLine();
            webApplicants.add(new WebApplicant(name, id, workExperience, lastWorkPosition, languageUsed));
        }catch (Exception e) {
            System.out.println("An error has occur. Please try again.");
            webInput(webApplicants);
        }
    }

    private static void mainInput() {
        try {
            System.out.println("Please enter your application type (web, mobile, accountant) : ");
            applicationType = input.next();
        } catch (Exception e) {
            System.out.println("An error has occur. Please try again.");
            mainInput();
        }
    }
}