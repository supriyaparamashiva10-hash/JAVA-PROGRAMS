import java.util.Scanner;
class Stud {
    String USN;
    String Name;
    String Branch;
    String Phone;

    void getDetails(Scanner sc) {
        System.out.print("Enter USN: ");
        USN = sc.nextLine();

        System.out.print("Enter Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Branch: ");
        Branch = sc.nextLine();

        System.out.print("Enter Phone: ");
        Phone = sc.nextLine();
    }

    void displayDetails() {
        System.out.println(USN + "\t" + Name + "\t" +
                Branch + "\t" + Phone);
    }
}

class studDemo {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Stud[] s = new Stud[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Stu " + (i + 1));
            s[i] = new Stud();
            s[i].getDetails(sc);
        }

        System.out.println("\n--------- STUD DETAILS ---------");
        System.out.println("USN\t\tName\tBranch\tPhone");

        for (int i = 0; i < n; i++)
        {
            s[i].displayDetails();
        }

        sc.close();
    }
}

