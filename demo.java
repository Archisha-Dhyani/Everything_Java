import java.sql.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

interface AdminCategory {
    void reviewApplicants(Connection connection);
}

interface ApplicantCategory {
    void displayDetails();

    void setStatus(Connection connection, String status);
    
    void saveToDatabase(Connection connection);
}

class Applicant implements ApplicantCategory {
    private int id;
    String name;
    String email;
    String phoneNumber;
    String status = "Applied";

    public Applicant(int id, String name, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Status: " + status);
    }

    @Override
    public void setStatus(Connection connection, String status) {
        this.status = status;
        try {
            String updateQuery = "UPDATE applicants SET status = ? WHERE id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
                preparedStatement.setString(1, status);
                preparedStatement.setInt(2, id);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("Error updating status in the database.");
        }
    }

    @Override
    public void saveToDatabase(Connection connection) {
        try {
            String insertQuery = "INSERT INTO applicants (name, email, phone_number, status) VALUES (?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, email);
                preparedStatement.setString(3, phoneNumber);
                preparedStatement.setString(4, status);
                preparedStatement.executeUpdate();

                try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        id = generatedKeys.getInt(1);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error saving applicant to the database.");
        }
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


class Admin implements AdminCategory {
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
    public void reviewApplicants(Connection connection) {
        ArrayList<ApplicantCategory> applicants = new ArrayList<>();
        try {
            String selectQuery = "SELECT * FROM applicants";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectQuery)) {

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String email = resultSet.getString("email");
                    String phoneNumber = resultSet.getString("phone_number");
                    String status = resultSet.getString("status");

                    Applicant applicant = new Applicant(id, name, email, phoneNumber);
                    applicant.setStatus(connection, status);
                    applicants.add(applicant);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving applicants from the database.");
        }

        for (ApplicantCategory applicant : applicants) {
            System.out.println("\nReviewing Applicant:");
            applicant.displayDetails();
            System.out.println("Enter new status for the applicant: ");
            String newStatus = new Scanner(System.in).nextLine();
            applicant.setStatus(connection, newStatus);
        }
    }
}

public class JobApplicationSystem {

    // Static block to initialize any static data
    static {
        System.out.println("Job Application System Initialized!");
    }

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobDB", "root", "sqlpass")) {
            ArrayList<ApplicantCategory> applicants = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

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
                            String name = scanner.nextLine();
                            System.out.print("Enter your email: ");
                            String email = scanner.nextLine();
                            System.out.print("Enter your phone number: ");
                            String phoneNumber = scanner.nextLine();

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
                                    Sales salesApplicant = new Sales(0, name, email, phoneNumber, experienceYears);
                                    salesApplicant.saveToDatabase(connection);
                                    applicants.add(salesApplicant);
                                    break;
                                case 2:
                                    System.out.print("Enter qualification: ");
                                    String qualification = scanner.nextLine();
                                    Management managementApplicant = new Management(0, name, email, phoneNumber, qualification);
                                    managementApplicant.saveToDatabase(connection);
                                    applicants.add(managementApplicant);
                                    break;
                                case 3:
                                    System.out.print("Enter programming language: ");
                                    String programmingLanguage = scanner.nextLine();
                                    Developer developerApplicant = new Developer(0, name, email, phoneNumber, programmingLanguage);
                                    developerApplicant.saveToDatabase(connection);
                                    applicants.add(developerApplicant);
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
                                        admin.reviewApplicants(connection);
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
        } catch (SQLException e) {
            System.out.println("Error connecting to the database.");
        }
    }
}
