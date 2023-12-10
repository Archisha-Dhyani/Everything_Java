import java.util.Scanner;

interface AdminLogin {
    
    //public void viewApplicants();
    void perform_functions(Applicant[] applicant_array);
    void analyzeResume(Applicant applicant);
    void changeApplicationStatus(Applicant applicant, String status);
    void scheduleAppointment(Applicant applicant, String dateTime);
    
}

interface ApplicantLogin {
    
    String getName();
    String getEmail();
    //String getStatus();
    String getResume();
    public void change_status(String status);

}

 class Admin implements AdminLogin {
    static int pass = 500109324;
    String name;
    //Applicant[] applicants;
    Admin(String name) {
        this.name = name;
        
        
    }
   public void perform_functions(Applicant[] applicant_array){
    // System.out.println("Enter 1: display applicants ");
    // System.out.println(applicant_array[0].getName());
    // //viewApplicants();

   }

    public void viewApplicants() {
        // int n = Applicant.c;
        // for (int i=0;i<n;i++) {
        //     // Review applicant attributes
        //     System.out.println("Applicant Name: " + applicants[i].getName());
        //     System.out.println("Email: " + applicants[i].getEmail());
        //     System.out.println("Resume : " + applicants[i].getResume());

            

        //     System.out.println("-----------------------------------");
        //}
    }


 
    public void analyzeResume(Applicant applicant) {
        // logic
    }


    public void changeApplicationStatus(Applicant applicant, String status) {
        // logic
    }

    public void scheduleAppointment(Applicant applicant, String dateTime) {
        // logic
    }
}

class Applicant implements ApplicantLogin {
    String name;
    String email;
    String resume;
    String status;
    static int c=0;
    Applicant(String name, String email, String resume) {
        this.name = name;
        this.email = email;
        this.resume = resume;
        status= "Applied";
        System.out.println("Thank you for applying in XYZ.tech");
        c++;
    }

    public String getName()
     {
        return name;
     }
    public String getEmail(){
        return email;
    }
    public String getResume(){
        return resume;
    }
    public String geStatus(){
        return status;
    }
    public void change_status(String status){
        this.status=status;
    }
    
    
}

// class Sales extends Applicant {
//     Sales(String name, String email, String resume) {
//         super(name, email, resume);
//         System.out.println("Successfully applied in the Sales Vertical \nTHANK YOU");
//     }
// }

// class Management extends Applicant {
//     Management(String name, String email, String resume) {
//         super(name, email, resume);
//         System.out.println("Successfully applied in the Management Vertical \nTHANK YOU");
//     }
// }

// class Development extends Applicant {
//     Development(String name, String email, String resume) {
//         super(name, email, resume);
//         System.out.println("Successfully applied in the Development Vertical \nTHANK YOU");
//     }
// }


public class Job_app {
    static {
        System.out.println("WELCOME TO XYZ.TECH PORTAL ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Enter 1: admin login\n      2: User login\n      0: Exit the portal");
        Applicant applicant_array[] = new Applicant[10] ;
        int ch = sc.nextInt();
        int i=0;
        switch (ch) {       // wrapper class bhi add kr 
            case 1:
                System.out.println("Enter password: ");
                int password = sc.nextInt();
                Admin admin = null;
                int attempts = 3;

                while (attempts > 0) {
                    if (Admin.pass==password) {
                        System.out.println("Enter admin name: ");
                        sc.next();
                        String name = sc.nextLine();
                        //Applicant[] applicants = new Applicant[];
                        admin = new Admin(name);
                        System.out.println(applicant_array[1].getName());
                        break;
                        
                    } else {
                        System.out.println("Wrong Password. Attempts left: " + (--attempts));
                        if (attempts > 0) {
                            System.out.println("Enter password again: ");
                            password = sc.nextInt();
                        }
                    }
                }

                if (admin != null) {
                    // Admin functions call krna 
                    
                } else {
                    System.out.println("Login failed. Exiting...");
                }
                break;

            case 2:
                System.out.println("Enter your name: ");
                sc.nextLine(); // Consume the newline character
                String name = sc.nextLine();
                System.out.println("Enter your email: ");
                String email = sc.nextLine();
                System.out.println("Attach the word document of your resume");
                String resume = sc.nextLine();

                System.out.println("Choose domain:\n1: Sales\n2: Management\n3: Development");
                int domainChoice = sc.nextInt();

                switch (domainChoice) {
                    case 1:
                        Applicant obj= new Applicant(name, email, resume);  // add variable for domain name also
                        applicant_array[1] =  obj;
                        System.out.println(applicant_array[1].getName());
                        // add sales pitch 
                        // Perform applicant tasks for Sales domain using salesApplicant object
                        break;
                    // Implement cases for Management and Development domains if needed
                    case 2:
                        applicant_array[i++] = new Applicant(name, email, resume);  // upcasting
                        // add management pitch
                        break;
                    case 3:
                        applicant_array[i++] = new Applicant(name, email, resume);  // upcasting
                        //add tech stack 
                        break;
                    default:
                        System.out.println("Wrong choice");
                
                 

                }
                break;
                case 0:
                    System.out.println("------------------------------THANK YOU-----------------------------");
                    
                    System.exit(0);
            default:
                System.out.println("Invalid choice. Exiting...");
        }
    }
}
}
