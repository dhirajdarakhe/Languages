import java.util.*;
public class switchs {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice) {
            case 1:  // 1 should be int or char or string or byte or short
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}
