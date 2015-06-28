package sortedOne.SoftServ;


import java.io.Serializable;

public class HourlyWage implements Wage, Serializable{

    private double hourlyRate;

    public HourlyWage(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void setWageRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getAvgMonthlySalary() {
        return 20.8*8*this.hourlyRate;
    }
}
