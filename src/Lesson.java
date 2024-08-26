import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        while(y >= 60) {
            System.out.println("y must be lower than 60");
            System.out.print("Enter y: ");
            y = scanner.nextInt();
        }

        for(int i = x; i >= 0; i--) {
            String iStr = i + "";
            if(i < 10) iStr = 0 + iStr;
            for(int j = y; j >= 0; j--) {
                String jStr = j + "";
                if(j < 10) jStr = 0 + jStr;
                System.out.println(iStr + ":" + jStr);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            y = 59;
        }


    }
}
