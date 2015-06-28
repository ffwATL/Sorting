package sortedOne.SoftServ;


import java.io.Serializable;

public class Employee implements Comparable<Employee>, Serializable {
    private int id;
    private String name;
    private int age;
    private Wage wage;

    public Employee(String name, int age, Wage wage, int id){
        this.name = name;
        this.age = age;
        this.setWage(wage);
        this.id = id;
    }

    public double avgMonthlySalary(){
        return this.wage.getAvgMonthlySalary();
    }

    public void setWage(Wage wage){
        if(wage == null) throw new IllegalArgumentException();
        this.wage = wage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Employee o) {
        if(o == null) return 1;
        else if(o.avgMonthlySalary() < this.avgMonthlySalary()) return 1;
        else if(o.avgMonthlySalary() == this.avgMonthlySalary()) return 0;
        return -1;
    }

     @Override
    public String toString(){
         return  "id:"+id+" name: " +name+" avg salary="+avgMonthlySalary();
     }
}
