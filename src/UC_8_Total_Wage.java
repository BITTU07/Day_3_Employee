public class UC_8_Total_Wage {

    public static final  int IS_PART_TIME =1;
    public static final int Is_FULL_TIME =2;

    public static int computeEmpWage( String company, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth){
        //variable
        int empHrs =0, totalEmpHr =0, totalWorkingDays =0;
        //computing
        while (totalEmpHr <= maxHourPerMonth && totalWorkingDays < numOfWorkingDays)
        {
            totalWorkingDays++;
            int empCheck =(int) Math.floor(Math.floor(Math.random() * 10) % 3);
            switch (empCheck)
            {
                case IS_PART_TIME:
                    empHrs =4;
                case Is_FULL_TIME:
                    empHrs =8;
                    break;
                default:
                    empHrs =0;
            }
            totalEmpHr +=empHrs;
            System.out.println("Day#: "+ totalWorkingDays + " Emp Hr: " +empHrs);
        }
        int totalEmpWage =totalEmpHr * empRatePerHour;
        System.out.println(" Total Emp Wage: " +company+"is: "+ totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeEmpWage("DMart", 20, 2, 10);
        computeEmpWage("Reliance", 10,4, 20);
    }
}


