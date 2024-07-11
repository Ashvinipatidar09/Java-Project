import java.util.Scanner;

interface FacultyActions {
    void hire(Faculty fac);
}

class Faculty {
    String name;
    String facultyId;
    String department;
    String subject;

    void setName(String n) {
        name = n;
    }

    void setFacultyId(String id) {
        facultyId = id;
    }

    void setDepartment(String dept) {
        department = dept;
    }

    void setSubject(String sub) {
        subject = sub;
    }

    void displayDetails() {
        System.out.println("Faculty Hired: " + name + ", ID: " + facultyId + ", Department: " + department + ", Subject: " + subject);
    }
}

class FacultyManagementSystem implements FacultyActions {

    @Override
    public void hire(Faculty fac) {
        fac.displayDetails();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FacultyManagementSystem fms = new FacultyManagementSystem();

        System.out.println("Enter Faculty Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Faculty ID: ");
        String facultyId = scanner.nextLine();

        System.out.println("Enter Faculty Department: ");
        String department = scanner.nextLine();

        System.out.println("Enter Faculty Subject: ");
        String subject = scanner.nextLine();

        Faculty newFaculty = new Faculty();
        newFaculty.setName(name);
        newFaculty.setFacultyId(facultyId);
        newFaculty.setDepartment(department);
        newFaculty.setSubject(subject);

        fms.hire(newFaculty);

        scanner.close();
    }
}
