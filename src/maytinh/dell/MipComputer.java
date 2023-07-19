package maytinh.dell;

import maytinh.Maytinh;
import maytinh.apple.Apple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MipComputer {
    public static List<Maytinh> maytinh=new ArrayList<>();
    public static int showMenu() {
        boolean flag=true;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.println("Nhap chuc nang 1-5");
            try {
                Scanner sc = new Scanner(System.in);
                return Integer.parseInt(sc.nextLine());

            } catch (Exception e) {
                System.out.println("Nhap so: ");
            }


        }while (flag);
        return 0;
    }
    public static void nhapThongTin() {
        boolean flag = true;
        do {
            System.out.println("1. Nhap may tinh dell");
            System.out.println("2. Nhap may tinh apple");
            System.out.println("3. Thoat");
            System.out.println("Chon 1 hoac 2");
            int m;
            Scanner sc = new Scanner(System.in);
            m = Integer.parseInt(sc.nextLine());
            switch (m) {
                case 1:
                    Dell dell=new Dell();
                    dell.inputInfor();
                    maytinh.add(dell);
                    break;
                case 2:
                    Apple apple=new Apple();
                    apple.inputInfor();
                    maytinh.add(apple);
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Nhap so 1-3: ");
                    break;
            }
        } while (flag);


    }
    public static void hienthi(){
        for (Maytinh item:maytinh){
            item.displayInfor();
        }
    }
    public static void sapxep(){
        Collections.sort(maytinh,(x, y)->{
            int warantyx = x instanceof Dell ? ((Dell) x).getWarranty() : ((Apple) x).getWarranty();
            int warantyy = y instanceof Dell ? ((Dell) y).getWarranty() : ((Apple) y).getWarranty();
            return warantyx - warantyy;
        });

        for(Maytinh item:maytinh){
            item.displayInfor();

        }
    }
    public static void timkiem(){
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten can tim kiem: ");
        name=sc.nextLine();
        boolean flag=true;
        for (Maytinh item:maytinh){
            if(item.getName().equals(name)) {
                item.displayInfor();
                flag=false;
            }
        }
        if (flag){
            System.out.println("Khong tim thay!");
        }

    }

    public static void main(String[] args) {
        Dell dell=new Dell("dell1","dell",120.0,6);
        Dell dell1=new Dell("dell2","dell",125.0,5);
        Dell dell2=new Dell("dell3","dell",126.0,2);

        Apple apple=new Apple("apple1","apple",122.0,3);
        Apple apple1=new Apple("apple2","apple",120.0,2);
        Apple apple2=new Apple("apple3","apple",123.0,12);

        maytinh.add(dell);
        maytinh.add(dell1);
        maytinh.add(dell2);
    maytinh.add(apple);
    maytinh.add(apple1);
    maytinh.add(apple2);


        boolean flag=true;
        do{
            int n=showMenu();
            switch (n){
                case 1:
                    nhapThongTin();
                    break;
                case 2:
                    hienthi();
                    break;
                case 3:
                    System.out.println("Truoc sap xep: ");
                    hienthi();
                    System.out.println("Sau sap xep: ");
                    sapxep();
                    break;
                case 4:
                    timkiem();
                    break;
                case 5:
                    flag=false;
                    break;
                default:
                    System.out.println("Nhap lai:");

            }
        }while (flag);
    }
}
