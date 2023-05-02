package sorting.studentmanagement;

import java.util.Scanner;

public class StudentService {

  private final Scanner scanner = new Scanner(System.in);
  private Student[] students = new Student[]{};

  public void register() {
    int count = scanner.nextInt();
    students = new Student[count];

    for (int index = 0; index < count; index++) {
      System.out.print("Enter name: ");
      String name = scanner.next();

      System.out.print("Enter surname: ");
      String surname = scanner.next();

      System.out.print("Enter year: ");
      int year = scanner.nextInt();

      Student student = new Student(name, surname, year);

      addStudent(index, student);
    }
  }

  public void addStudent(int index, Student student) {
    students[index] = student;
  }

  public void show() {
    System.out.println(" -------  Student Information -------");
    for (int index = 0; index < students.length; index++) {
      System.out.print(index + 1 + " ");
      students[index].printInfo();
      System.out.println("-------------------------------------");
    }
  }

  public void findStudent() {
    System.out.print("Enter name or surname: ");
    String nameOrSurname = scanner.next();
    boolean hasStudent = false;

    for (Student student : students) {
      if (student.getName().toLowerCase().contains(nameOrSurname) ||
          student.getSurname().toLowerCase().contains(nameOrSurname)) {
        student.printInfo();
        hasStudent = true;
      }
    }

    if (!hasStudent) {
      System.out.println("There are no student name or surname contained " + nameOrSurname);
    }
  }


}
