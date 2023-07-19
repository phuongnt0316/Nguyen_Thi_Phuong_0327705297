package maytinh.apple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import maytinh.Maytinh;

import java.util.Scanner;
public class Apple extends Maytinh {
    private int warranty;
    public Apple(String code, String name, Double price, int warranty) {
        super(code, name, price);
        this.warranty = warranty;
    }

    public Apple() {
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        boolean flag=true;
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Nhap Warranty: ");
                warranty=Integer.parseInt(sc.nextLine());
                flag=false;
            }catch (Exception e){
                System.out.println("Khong dung kieu du lieu");
            }

        }while (flag);

    }

    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println("--Warranty: "+warranty);
    }
}
