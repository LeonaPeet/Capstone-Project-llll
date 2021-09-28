package Level2_task7;

import java.util.Scanner;

public class Poise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Person Input
        System.out.println("Person Name: ");
        String personName = input.nextLine();
        System.out.println("Person Cell Number: ");
        String personCellNumber = input.nextLine();
        System.out.println("Person Email: ");
        String personEmail = input.nextLine();
        System.out.println("Person Address: ");
        String personAddress = input.nextLine();

        // Project Input
        System.out.println("Project Number: ");
        int projectNumber = input.nextInt();
        input.nextLine();
        System.out.println("Project Name: ");
        String projectName = input.nextLine();
        System.out.println("Project Type: ");
        String projectType = input.nextLine();
        System.out.println("Project Address: ");
        String projectAddress = input.nextLine();
        System.out.println("Project Erf: ");
        String projectErf = input.nextLine();
        System.out.println("Project Fee: ");
        float projectFee = input.nextFloat();
        System.out.println("Project Paid: ");
        float projectPaid = input.nextFloat();
        System.out.println("Project Deadline: ");
        String projectDeadline = input.nextLine();
        input.nextLine();

        // Creating the objects
        Person contractor = new Person(personName, personCellNumber, personEmail, personAddress);
        Project number = new Project(projectNumber, projectName, projectType, projectAddress, projectErf, projectFee, projectPaid, projectDeadline, contractor);
        System.out.println(number);
        System.out.println(number.getDeadline());

        // Allow the user to edit
        System.out.println("Would you like to edit this project? 'Yes' or 'No': ");
        String projectEdit = input.nextLine();

        // Offer the user to change the deadline and the amount the customer has paid to date.
        if (projectEdit.equalsIgnoreCase("yes")) {
            System.out.println("Deadline date: ");
            String newDate = input.nextLine();
            number.setDeadline(newDate);
            System.out.println("Fee paid: ");
            float addPaid = input.nextFloat();
            number.setPaid(projectPaid + addPaid);

            // Let the user know the changes have been made.
            System.out.println("Thank you, the Fee Paid to date is R " + number.getPaid() + ".");
            System.out.println("Thank you, the new deadline for the project has been saved as " + number.getDeadline() + ".");
        }
        else System.exit(0);

    }

}
