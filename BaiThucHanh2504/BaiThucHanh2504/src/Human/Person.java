package Human;
import java.util.Scanner;

public class Person {
    public String ten;
    public String soDienThoai;

    public Person(){

}
public void nhapSoDienThoai(){
    System.out.println("Nhap so dien thoai: ");
    Scanner sc = new Scanner(System.in);
    soDienThoai = sc.nextLine();
}

public void inSoDienThoai(){
    System.out.println("So dien thoai: " + soDienThoai);
}

public void nhapTen(){
    System.out.println("Nhap ten: ");
    Scanner sc = new Scanner(System.in);
    ten = sc.nextLine();
}

public void inTen(){
    System.out.println("Ten: " + ten);
}

}
