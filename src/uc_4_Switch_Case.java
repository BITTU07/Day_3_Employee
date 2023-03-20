public class uc_4_Switch_Case {

    public static final  int IS_PART_TIME =1;
    public static final int Is_FULL_TIME =2;
    public static final int EMP_RATE_PER_HOUR =20;
    public static void main(String[] args) {
       //VARIABLE
        int empHrs =0;
        int empWage =0;
        //computation
        int empCheck=(int) Math.floor(Math.random() * 10 % 3);
        switch (empCheck)
        {
            case IS_PART_TIME :
                empHrs = 4;
                break;
            case Is_FULL_TIME :
                empHrs = 8;
                break;
            default :
                empHrs =0;

        }
        empWage =empHrs * EMP_RATE_PER_HOUR;
        System.out.println(" Emp Wage:" + empWage);
    }
}
