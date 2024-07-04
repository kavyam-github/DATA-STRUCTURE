import java.util.Scanner;

public class convert_d {
    public static void main(String[] args) {
      Scanner sc = new  Scanner(System.in);
      System.out.println("enter number of day");
      int day=sc.nextInt();
      int year;
      int week;
     
      
      year=day/365;
      day=day%365;
      week=day/7;
      day=day%7;
      System.out.println("year : "+year+" "+"week : "+week+" "+"day : "+day);

}
}
    
