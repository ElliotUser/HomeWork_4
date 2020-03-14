package ru.rick_Sanchez.company.homeWork;

public class Employee {
    static int count = 1;
    private String firstName;
    private String position;
    private int age;
    private int salary;
    private int id;


    public Employee(String firstName, String position, int age, int salary){
        this.firstName = firstName;
        this.position = position;
        this.age = age;
        this.salary = salary;
        id = count++;
    }

    public int toRaiseWages(){
        if(age > 45){
            return salary+=5000;
        }return salary;
    }

    public void showAllInfo(){
        System.out.println("id: " + getId()+ '\n'  +"First name: " + getFirstName() + '\n'+"Position: " + position
                + '\n' + "Age: "+ getAge() + '\n'+ "Salary: "+ getSalary() + '\n');
    }

    public void showInfo(){
        System.out.println("First name: " + getFirstName() + '\n'+"Position: " + position
                + '\n');
    }


    public String getFirstName() {
        return firstName;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
