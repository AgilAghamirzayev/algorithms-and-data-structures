package sorting.studentmanagement;

import java.util.UUID;

public class Student extends Person {

  private String id;
  private int enteredYear;

  public Student(String name, String surname, int enteredYear) {
    super(name, surname);
    this.id = UUID.randomUUID().toString();
    this.enteredYear = enteredYear;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int getEnteredYear() {
    return enteredYear;
  }

  public void setEnteredYear(int enteredYear) {
    this.enteredYear = enteredYear;
  }

  public void printInfo() {
    System.out.println("[ id: " + id + ", name: " + getName() + ", surname: " + getSurname()
        + ", enteredYear: " + enteredYear + " ]");
  }
}
