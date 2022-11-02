import java.util.Scanner;

public class Inputter{
  public static Scanner sc = new Scanner(System.in);
  public static String inputNonBlankStr(String msg){
    String data;
    do{
      System.out.print(msg);
      data = sc.nextLine().trim();
    }while(data.length()==0);
    return data;
  }
  public static String inputId(String msg, String pattern){
    String data;
    do{
      System.out.print(msg);
      data = sc.nextLine().trim();
    }while(!data.matches(pattern));
    return data;
  }
  public static String inputStr(String msg){
    System.out.print(msg);
    String data = sc.nextLine().trim();
    return data;
  }
  public static String inputChar(String msg){
    System.out.print(msg);
    String data = sc.nextLine().trim().toUpperCase();
    return data;
  }
}