package com.in.pracice.pojo;

import java.util.*;

class Employee1 {

    private int id;
    private String name;
    private int salary;
    private int experience;

    public Employee1() {
    }

    public Employee1(int id, String name, int salary, int experience) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}

class EmployeeSalaryComparator implements Comparator<Employee1>{

    @Override
    public int compare(Employee1 e1, Employee1 e2) {
        return e1.getSalary()- e2.getSalary();
    }
}
class EmployeeExperienceComparator implements Comparator<Employee1>{

    @Override
    public int compare(Employee1 e1, Employee1 e2) {
        return e1.getExperience()- e2.getExperience();
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {
        List<Employee1> employeeList = new LinkedList<Employee1>();
        employeeList.add(new Employee1(101, "Vijay Patil",25000,3));
        employeeList.add(new Employee1(102, "Ramesh More",1200,1));
        employeeList.add(new Employee1(103, "Ganesh Kale",14000,2));
        employeeList.add(new Employee1(104, "Sanjay Savant",20000,3));
        employeeList.add(new Employee1(105, "Sumeet Gore",22000,4));

        Collections.sort(employeeList, new EmployeeExperienceComparator());

        System.out.println("After sorting  on Experience basis");
        Iterator<Employee1> empitr = employeeList.iterator();
        while (empitr.hasNext()){
            System.out.println(empitr.next());
        }

        Collections.sort(employeeList, new EmployeeSalaryComparator());

        System.out.println("After sorting  on Salary basis");
        Iterator<Employee1> empitr2 = employeeList.iterator();
        while (empitr2.hasNext()){
            System.out.println(empitr2.next());
        }
    }


}
