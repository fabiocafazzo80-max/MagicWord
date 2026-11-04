import java.util.Scanner;
public class input {
    private static Scanner scanner;
    public static String readString(){
        if (scanner == null){
            scanner = new Scanner(System.in);
        }
        return scanner.nextLine();
    }
    public static int readInInt(){
        if (scanner == null){
            scanner = new Scanner(System.in);
        }
        return scanner.nextInt();
    }

}
