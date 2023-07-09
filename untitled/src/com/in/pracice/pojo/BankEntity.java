package com.in.pracice.pojo;

import java.util.HashMap;
import java.util.Map;

public class BankEntity {

    private Double  rateOfInterest = 15.10;


    public Double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(Double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public BankEntity(Double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }
    public BankEntity() {
        super();
    }
}

class BranchEntity extends BankEntity {

    private String branchName;

    public static void main(String[] args) {

        BranchEntity bankEntity = new BranchEntity();
        bankEntity.setRateOfInterest(20.15);
        System.out.println(bankEntity.getRateOfInterest());

        Map<Integer, String> map1 = new HashMap<Integer, String>();

        map1.put(101,"aaa");
        map1.put(102,"bbb");
        map1.put(103,"ccc");



        int no = 20;
        if(no >10)
            throw new ArithmeticException();
    }

    public void setRateOfInterest(Double rateOfInterest) throws  ArithmeticException, ArrayIndexOutOfBoundsException
     {
       rateOfInterest = rateOfInterest;
    }

}

class Employee2{
    private Long id;
    private String name;
    private Double salary;
    private Long deptId;
}
class Department{

    private Long id;
    private String name;

}

//select e.id, e.name, e.salary d.id from employee e left join department on d e.deptid = d.id;