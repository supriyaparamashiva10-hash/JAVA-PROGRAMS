import java.util.Scanner;
public class Children
{
    String USN;
    String Name;
    String Branch;
    String Phone;

    Children(String USN, String Name, String Branch, String Phone)
    {
        this.USN = USN;
        this.Name = Name;                                                    
        this.Branch = Branch;
        this.Phone = Phone;
    }
    void display()
    {
        System.out.printf("%-15s %-20s %-15s %-15s%n",
                USN, Name, Branch, Phone);
    }
    public class StudentDetails
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of Children: ");
            int n = sc.nextInt();
            sc.nextLine();
            Children[] Children = new Children[n];
            // Read student details
            for (int i = 0; i < n; i++)
            {
                System.out.println("\nEnter details of Children" + (i + 1));
                System.out.print("USN : ");
                String usn = sc.nextLine();
                System.out.print("Name : ");
                String name = sc.nextLine();
                System.out.print("Branch : ");
                String branch = sc.nextLine();
                System.out.print("Phone : ");
                String phone = sc.nextLine();
                Children[i] = new Children(usn, name, branch, phone);
            }
            // Display Children details
            System.out.println("\n-------------------------------");
            System.out.println("                     STUDENT DETAILS");
            System.out.println("---------------------------------------------------------------");
            System.out.printf("%-15s %-20s %-15s %-15s%n","USN", "Name", "Branch", "Phone");
            System.out.println("---------------------------------------------------------------");
            for (int i = 0; i < n; i++)
            {
                Children[i].display();
            }
            System.out.println("---------------------------------------------------------------");
            sc.close();
        }
    }
}