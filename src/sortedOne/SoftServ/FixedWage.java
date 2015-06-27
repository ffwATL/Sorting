package sortedOne.SoftServ;


public class FixedWage implements Wage{

    private double fixedMonthlyWage;

    public FixedWage(double  fixedMonthlyWage){
        this.fixedMonthlyWage = fixedMonthlyWage;
    }

    @Override
    public double getAvgMonthlySalary() {
        return this.fixedMonthlyWage;
    }

    @Override
    public void setWageRate(double fixedMonthlyWage) {
        this.fixedMonthlyWage = fixedMonthlyWage;
    }
}
