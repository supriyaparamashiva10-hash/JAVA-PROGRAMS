public class University {
    private String universityName;

    University(String universityName) {
        this.universityName = universityName;
    }

    static class Department {
        private String departmentName;

        Department(String departmentName) {
            this.departmentName = departmentName;
        }

        void display() {
            System.out.println("Department: " + departmentName);
        }
    }

    class Faculty {
        private String facultyName;
        private String designation;

        Faculty(String facultyName, String designation) {
            this.facultyName = facultyName;
            this.designation = designation;
        }

        void display() {
            System.out.println("Faculty: " + facultyName);
            System.out.println("Designation: " + designation);
            System.out.println("University: " + universityName);
        }
    }

    void displayUniversity() {
        System.out.println("University: " + universityName);
    }

    public static void main(String[] args) {
        University u = new University("ABC University");

        Department d = new Department("Computer Science");
        Faculty f = u.new Faculty("Ravi", "Professor");

        u.displayUniversity();
        d.display();
        f.display();
    }
}
