package controlStatementProject;
/**
 * @nim 1197050081
 * @kelas IF C
 * @author Muhamad Taopik
 */
import java.util.*;
public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month,year;
        // template
	    System.out.println("--------------------------------");
	    System.out.println("| Program Leap Year Calculator |");
	    System.out.println("|      By : Muhamad Taopik     |");
	    System.out.println("--------------------------------");
	    System.out.println();
        System.out.println("Type a month: ");
        month  = input.nextInt();
        System.out.println("Type a year: ");
        year  = input.nextInt();

        //menampilkan odd or even
        ODDEVEN(month);

        //menampilkan
        SWITCHCASE(month, year);
    }

    public static void  ODDEVEN(int month){
        String number;

        number = (month % 2 == 0) ? "Odd" : "Even";
        System.out.println();
        System.out.println("Result is..");
        System.out.println(number + " Month!");
    }

    public static void  SWITCHCASE(int month,int year){
        switch (month){
            case 1:{
                System.out.println("January's 31 day!");
                break;
            }
            case 2:{
                if (year % 4==0  && year % 100!=0){
                    System.out.println("February's 28 day!");
                }
                else if (year % 400==0){
                    System.out.println("February's 29 day!");
                }
                else
                    System.out.println("February's 31 day!");
                break;
            }

            case 3:{
                System.out.println("March's 30 day!");
                break;
            }
            case 4:{
                System.out.println("April's 30 day!");
                break;
            }
            case 5:{
                System.out.println("May's 31 day!");
                break;
            }
            case 6:{
                System.out.println("June's 30 day!");
                break;
            }
            case 7:{
                System.out.println("July's 31 day!");
                break;
            }
            case 8:{
                System.out.println("August's 31 day!");
                break;
            }
            case 9:{
                System.out.println("September's 30 day!");
                break;
            }
            case 10:{
                System.out.println("October's 31 day!");
                break;
            }
            case 11:{
                System.out.println("November's 30 day!");
                break;
            }
            case 12:{
                System.out.println("December's 31 day!");
                break;
            }
            default:{
                System.out.println("Error : wrong input!");
                break;
            }
        }
    }
}