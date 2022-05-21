package Task06_eBookStore;

import java.util.Scanner;

public class viewOder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chose;
        do {
            System.out.println("1. Hien thi 30 don hang moi tiep nhan");
            System.out.println("2. Hien thi don hang theo ma khach hang");
            System.out.println("3. Hien thi trang thai don hang theo ma don hang");
            System.out.println("4. Hien thi thong tin chi tiet cua 1 don hang theo ma don nhap vao");
            System.out.println("5. Hien thi don hang dang cho xu li (status = 2)");
            System.out.println("6. Hien thi don hang da dong goi (status = 3)");
            System.out.println("7. Hien thi don hang da gui van chuyen (status = 4)");
            System.out.println("8. Hien thi don hang da giao thanh cong (status = 5)");
            System.out.println("9. Hien thi don hang bi khach hang huy (status = 0)");
            chose = scan.nextInt();
            scan.nextLine();
            switch (chose) {
                case 1 :
                    Task06_eBookStore.Print p1 = new Task06_eBookStore.Print("select * from Oders limit 30");
                    p1.conec2();
                    break;
                case 2 :
                    System.out.println("Nhap ma khach hang");
                    int s2 = scan.nextInt();
                    scan.nextLine();
                    Task06_eBookStore.Print p2 = new Task06_eBookStore.Print("select * from Oders a join Customers b ON a.CusId = b.CusId And a.CusId = " + s2);
                    p2.conec2();
                    break;
                case 3 :
                    System.out.println("Nhap ma don hang");
                    int s3 = scan.nextInt();
                    scan.nextLine();
                    Task06_eBookStore.Print p3 = new Task06_eBookStore.Print("select * from Oders a join OderDetail b ON a.CusId = b.CusId And a.CusId = " + s3);
                    p3.conec2();
                    break;
                case 4 :
                    System.out.println("Nhap ma don hang");
                    int s4 = scan.nextInt();
                    scan.nextLine();
                    Task06_eBookStore.Print p4 = new Task06_eBookStore.Print("select * from Oders a join OderDetail b ON a.OderId = b.OderId And a.OderId = " + s4);
                    p4.conec2();
                    break;
                case 5 :
                    Task06_eBookStore.Print p5 = new Task06_eBookStore.Print("select * from Oders a JOIN OderDetail b ON a.OderId = b.OderId And b.statust = 2");
                    p5.conec2();
                    break;
                case 6 :
                    Task06_eBookStore.Print p6 = new Task06_eBookStore.Print("select * from Oders a JOIN OderDetail b ON a.OderId = b.OderId And b.statust = 3");
                    p6.conec2();
                    break;
                case 7 :
                    Task06_eBookStore.Print p7 = new Task06_eBookStore.Print("select * from Oders a JOIN OderDetail b ON a.OderId = b.OderId And b.statust = 4");
                    p7.conec2();
                    break;
                case 8 :
                    Task06_eBookStore.Print p8 = new Task06_eBookStore.Print("select * from Oders a JOIN OderDetail b ON a.OderId = b.OderId And b.statust = 5");
                    p8.conec2();
                    break;
                case 9 :
                    Task06_eBookStore.Print p9 = new Task06_eBookStore.Print("select * from Oders a JOIN OderDetail b ON a.OderId = b.OderId And b.statust = 0");
                    p9.conec2();
                    break;
            }
        }while (chose<10);
    }
}

