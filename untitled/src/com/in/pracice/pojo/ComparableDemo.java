package com.in.pracice.pojo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private int salary;
    private int experience;

    public Employee() {
    }

    public Employee(int id, String name, int salary, int experience) {
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
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }


    @Override
    public int compareTo(Employee e) {
//        if(getSalary()==e.getSalary())
//            return 0;
//        else if (getSalary()>e.getSalary()) {
//            return 1;
//        } else
//            return -1;
        return getSalary()-e.getSalary();
    }
}

public class ComparableDemo{
    public static void main(String[] args) {
        List<Employee> employeeList = new LinkedList<Employee>();
        employeeList.add(new Employee(101, "Vijay Patil",25000,3));
        employeeList.add(new Employee(102, "Ramesh More",1200,1));
        employeeList.add(new Employee(103, "Ganesh Kale",14000,2));
        employeeList.add(new Employee(104, "Sanjay Savant",20000,3));
        employeeList.add(new Employee(105, "Sumeet Gore",22000,4));

        Collections.sort(employeeList);

        System.out.println("After sorting  on Salary basis");
        Iterator<Employee> empitr = employeeList.iterator();
        while (empitr.hasNext()){
            System.out.println(empitr.next());
        }
    }
}
