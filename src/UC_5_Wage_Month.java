public class UC_5_Wage_Month {


       public static final  int IS_PART_TIME =1;
         public static final int Is_FULL_TIME =2;
        public static final int EMP_RATE_PER_HOUR =20;
        public static final int NUM_OF_WORKING_DAYS =2;
    public static void main(String[] args) {

            //VARIABLE
            int empHrs =0;
            int empWage =0;
            int totalWage =0;
            //computation
            for (int day =0; day < NUM_OF_WORKING_DAYS; day++)
            {
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
            totalWage +=empWage;
            System.out.println(" Emp Wage:" + empWage);
        }
            System.out.println(" Total Wage: " + totalWage);
    }

}

