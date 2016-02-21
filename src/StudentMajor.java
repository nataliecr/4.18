import java.util.Scanner;

public class StudentMajor {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter two characters: ");
    String temp = input.nextLine();
    char major = temp.charAt(0);
    char status = temp.charAt(1);
    
    if ("MCI".indexOf(major) < 0 || "1234".indexOf(status) < 0){
      System.out.println("Invalid input ");
      System.exit(0);
    } // if  
    
    switch (major){
        case 'M': System.out.print("Mathematics "); break;
        case 'C': System.out.print("Computer Science "); break;
        case 'I': System.out.print("Information Technology "); break;
    } // switch(major)
    
    switch (status){
        case '1': System.out.println("Freshman"); break;
        case '2': System.out.println("Sophomore"); break;
        case '3': System.out.println("Junior"); break;
        case '4': System.out.println("Senior"); break;
    } // switch (status)
  } // main   
}  // StudentMajor
