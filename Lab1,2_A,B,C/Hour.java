import java.util.Scanner;
public class Hour {
    public static void main(String[] args) {
            Scanner sc = new  Scanner(System.in);
      System.out.println("enter second");
      int ss=sc.nextInt();
      int HH;
      int MM;
      HH=ss/3600;
      ss=ss%3600;
      MM=ss/60;
      ss=ss%60;
      System.out.println(HH+":"+MM+":"+ss);
}
}

