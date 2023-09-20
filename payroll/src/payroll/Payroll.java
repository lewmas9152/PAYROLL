package payroll;

import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
	String empNo;
	String empName;
	String designation;
	int days;
	int payRate;
	String genDate;
	int basicPay;
	int pF;
	int profTax;
	Scanner input = new Scanner(System.in);
	System.out.print("NAME : ");
	empName = input.nextLine();
	System.out.print("DESIGNATION : ");
	designation = input.nextLine();
	System.out.print("DAYS : ");
	days = input.nextInt();
	System.out.print("PAY : ");
	payRate = input.nextInt();
	System.out.println(" ");
	System.out.print("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP :1");
	empNo = input.nextLine();
	System.out.println(" ");
	System.out.println("                         SHREE KRISHNA CHEMISTS AND DRUGGIST11");
	System.out.println("                                 SALARY MONTH 9 2013");
	System.out.println(" ");
	System.out.println("       "+"EMP.NO.:1 "+empNo + "                 "+ "EMP.NAME:" +empName + "        " +"DESIGNATION:" + designation);
	System.out.println("       "+"DAYS.WORKED: "+days + "            "+ "PAY RATE:" +payRate + "           " +"GEN.DATE:" + "15/9/2013");
	String hyphen = new String(new char[70]).replace('\0','_');
	System.out.println("       "+hyphen);
	System.out.println("       "+"EARNINGS "+"       "+ "AMOUNT(RS.)" +"            " +"DEDUCTIONS" + "      "+"AMOUNT(RS.)");
	System.out.println("       "+hyphen);
	basicPay = days*payRate;
	pF = basicPay/10;
	profTax = (int)(pF*0.2);
	System.out.println("       "+"BASIC PAY "+"      "+  basicPay +"                  " +"P.F." + "              "+pF );
	System.out.println("                                              " +"PROF.TAX" + "          "+profTax );
	System.out.println("       "+hyphen);
	System.out.println("       "+"GROSS EARN "+"     "+  basicPay +"                  " +"TOTAL DEDUCT." + "     "+ (pF+profTax) );
	System.out.println("                                              " +"NET PAY" + "           "+ (basicPay -(pF+profTax)));
	System.out.println("       "+hyphen);
	
	
	
	
	
	
	
	
	

	}

}
