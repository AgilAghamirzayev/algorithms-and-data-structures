package lists;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee(1, "Jane", "Jones");
        Employee tomJerry = new Employee(1, "Tom", "Jerry");
        Employee aqilZeka = new Employee(1, "Agil", "Zeka");
        Employee orxanDeniz = new Employee(1, "Orxan", "Deniz");
        Employee laleHacizade = new Employee(1, "Lale", "Hacizade");

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(janeJones);
        list.addToFront(tomJerry);
        list.addToFront(aqilZeka);
        list.addToFront(orxanDeniz);
        list.addToFront(laleHacizade);

        list.printList();
    }
}
