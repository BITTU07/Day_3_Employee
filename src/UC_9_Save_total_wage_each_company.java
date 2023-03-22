public class UC_9_Save_total_wage_each_company {
    public static final  int IS_PART_TIME =1;
    public static final int Is_FULL_TIME =2;
    private final String company;
    private final String empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;
    private int totalEmphr;

    public UC_9_Save_total_wage_each_company( String company, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHourPerMonth;
        //variable


    }
    public void  computeEmpWage() {
        int empHrs = 0,  totalEmpHr = 0, totalWorkingDays = 0;
        //computing
        int maxHourPerMonth;
        while (totalEmpHr <= maxHourPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                case Is_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHr += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }
        totalEmpWage = totalEmphr * empRatePerHour;
    }
    public String toString() {

        return "Total empwage for company:" + company + "is:" + totalEmpWage;
    }



    public static void main(String[] args) {
        UC_9_Save_total_wage_each_company Dmart = new UC_9_Save_total_wage_each_company("DMart", 20, 2, 10);
        UC_9_Save_total_wage_each_company Relaince= new UC_9_Save_total_wage_each_company("Reliance", 10,4, 20);
        Dmart.computeEmpWage();
        System.out.println(Dmart);
        Relaince.computeEmpWage();
        System.out.println(Relaince);
    }
}
