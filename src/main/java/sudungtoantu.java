import java.util.Scanner;

public class sudungtoantu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width");
        width = sc.nextFloat();
        System.out.println("Enter height");
        height = sc.nextFloat();
        float area = width*height;
        System.out.println("dien tich hinh chu nhat la " + area);
    }
}
