
/**
 * @author SeyedehTahereh Houlari
 ** @version 1.0
 * @see Class Lab2Houlari
 * @since 11
 */

public class Lab2Houlari {

	/**
	 * @param args
	 * consider the main method in the class Lab2Houlari to calculate what we need in Lab2
	 */
//public class CovidStatistics
//{
public static void main(String[] args)
 {
   final int ROWS = 7;
   final int COLUMNS = 8;
   int	Total=0;//initialize the Total variable 
   int[][] patients = 
      { 
         {  2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
         {  5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, 
         {  1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 }, 
         {  1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 },
         {  1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
         {  1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 },
	     {  1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }
         
      };

   String[] provinces = 
      { 
         "             Ontario", 
         "              Quebec", 
         "         Nova Scotia",
         "       New Brunswick", 
         "            Manitoba", 
         "    British Columbia",
	     "Prince Edward Island"         
      };
   
   System.out.println("               Month         Feb      March      April      May      June      July      Aug      Sept");
   System.out.println();


   //use for to consider the rows for each province and the columns of each month to show the number of patients.
   for(int i = 0; i < ROWS; i++) {
   	System.out.printf( "%21s,",provinces[i]);
   		for(int j=0; j < COLUMNS; j++) {
   			System.out.printf("%10d", patients[i][j]);//print the number of patients in each row one by one to the end column
   		}
   		System.out.println();
   		  	
   }
   
   System.out.println();
   System.out.print("  Recovered Patients   ");
   
   //This method calculate the sum of all recovered patients from all the provinces for each month.
   for(int j=0; j < COLUMNS; j++) {  	
	   		for(int i = 0; i < ROWS; i++) {
	   			Total=Total+patients[i][j];//calculate the total number of patients from the first rows to the end row of each column
	   		}
	   		System.out.printf("%10d", Total);//print the total amount of each column
	   		Total=0;
	  
	   }
   
   System.out.println(); 
   System.out.println(); 
   System.out.println("               Vaccinate and maintain good health practices!" );//print the mentioned topic
}
}
