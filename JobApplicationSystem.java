import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Interface for reviewing applicants
interface AdminCategory {
    void reviewApplicants(ArrayList<ApplicantCategory> applicants);
}

// Interface representing job categories
interface ApplicantCategory {
    void displayDetails();
    void setStatus(String status) ;
}

// Base class for applicants
class Applicant implements ApplicantCategory {
    String name;
    String email;
    String phoneNumber;
    String status= "Applied ";

    // Constructor for initializing applicant details
    public Applicant(String name, String email, String phoneNumber) {
        // use of this keyword
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Display applicant details
    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Status: " + status);
    }
    public void setStatus(String status) {
        this.status = status;
    }

    
}

// Child class representing Sales job applicants
class Sales extends Applicant {
    int experienceYears;

    // Constructor for initializing sales applicant details
    public Sales(String name, String email, String phoneNumber, int experienceYears) {
        super(name, email, phoneNumber);
        this.experienceYears = experienceYears;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Experience Years: " + experienceYears);
    }
}

class Management extends Applicant {
    String qualification;

    // Constructor for initializing management applicant details
    public Management(String name, String email, String phoneNumber, String qualification) {
        //use of super 
        super(name, email, phoneNumber);
        this.qualification = qualification;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Qualification: " + qualification);
    }
}

// Child class representing Developer job applicants
class Developer extends Applicant {
    String programmingLanguage;

    // Constructor for initializing developer applicant details
    public Developer(String name, String email, String phoneNumber, String programmingLanguage) {
        super(name, email, phoneNumber);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}


// Admin class implementing the Reviewable interface
class Admin implements AdminCategory  {
    static int pass= 123;
    String name;
    Admin ()
    {
        name=" ";
    }
    Admin(String name)
    {
        this.name=name;
    }
    public void reviewApplicants(ArrayList<ApplicantCategory> applicants) {
        for (ApplicantCategory applicant : applicants) {
            System.out.println("\nReviewing Applicant:");
            applicant.displayDetails();
            System.out.println("Enter new status for the applicant: ");
            String newStatus = new Scanner(System.in).nextLine();
            applicant.setStatus(newStatus);
        }
            
        
    }
}

public class JobApplicationSystem {
    // Static block to initialize any static data
    static {
        System.out.println("Job Application System Initialized!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ApplicantCategory> applicants = new ArrayList<>();
        

        while (true) {
            System.out.println("\nJob Application System Menu:");
            System.out.println("1. Apply for a Job");
            System.out.println("2. Admin Menu");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter your name: ");
                        String name = new String(scanner.nextLine()); // Creating a String object
                        System.out.print("Enter your email: ");
                        String email = new String(scanner.nextLine()); // Creating a String object
                        System.out.print("Enter your phone number: ");
                        String phoneNumber = new String(scanner.nextLine()); // Creating a String object

                        System.out.println("\nJob Categories:");
                        System.out.println("1. Sales");
                        System.out.println("2. Management");
                        System.out.println("3. Developer");
                        System.out.print("Enter job category: ");
                        int jobCategory = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character

                        switch (jobCategory) {
                            case 1:
                                System.out.print("Enter years of experience: ");
                                int experienceYears = scanner.nextInt();
                                applicants.add(new Sales(name, email, phoneNumber, experienceYears));
                                break;
                            case 2:
                                System.out.print("Enter qualification: ");
                                String qualification = new String(scanner.nextLine()); // Creating a String object
                                applicants.add(new Management(name, email, phoneNumber, qualification));
                                break;
                            case 3:
                                System.out.print("Enter programming language: ");
                                String programmingLanguage = new String(scanner.nextLine()); // Creating a String object
                                applicants.add(new Developer(name, email, phoneNumber, programmingLanguage));
                                break;
                            default:
                                System.out.println("Invalid choice!");
                        }
                        break;

                        case 2:
                        System.out.println("Enter password: ");
                        int password = scanner.nextInt();
                        Admin admin = null;
                        int attempts = 3;
                    
                        while (attempts > 0) {
                            if (Admin.pass == password) {
                                System.out.println("Enter admin name: ");
                                scanner.nextLine(); // Consume the newline character
                                String str = scanner.nextLine();
                                admin = new Admin(str);
                                System.out.println("Admin logged in : ");
                                break;
                            } else {
                                System.out.println("Wrong Password. Attempts left: " + (--attempts));
                                if (attempts > 0) {
                                    System.out.println("Enter password again: ");
                                    password = scanner.nextInt();
                                }
                            }
                        }
                    
                        if (admin != null) {
                            System.out.println("\nAdmin Menu:");
                            System.out.println("1. Review Applicants");
                            System.out.println("2. Back to Main Menu");
                            System.out.print("Enter your choice: ");
                            int adminChoice = scanner.nextInt();
                    
                            switch (adminChoice) {
                                case 1:
                                    admin.reviewApplicants(applicants);
                                    break;
                                case 2:
                                    break;
                                default:
                                    System.out.println("Invalid choice!");
                            }
                        } else {
                            System.out.println("Login failed. Exiting...");
                        }
                        break;
                    
                    case 3:
                        System.out.println("Exiting the program. Goodbye!");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }
    }
}
