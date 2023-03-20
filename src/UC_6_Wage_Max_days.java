public class UC_6_Wage_Max_days {
    public static final  int IS_PART_TIME =1;
    public static final int Is_FULL_TIME =2;
    public static final int EMP_RATE_PER_HOUR =20;
    public static final int NUM_OF_WORKING_DAYS =2;
    public static final int MAX_HRS_IN_MONTH =10;

    public static void main(String[] args) {
        //variable
        int empHrs =0, totalEmpHr =0, totalWorkingDays =0;
        //computing
        while (totalEmpHr <= MAX_HRS_IN_MONTH  && totalWorkingDays < NUM_OF_WORKING_DAYS)
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
        int totalEmpWage =totalEmpHr * EMP_RATE_PER_HOUR;
        System.out.println(" Total Emp Wage: " + totalEmpWage);
    }
}
