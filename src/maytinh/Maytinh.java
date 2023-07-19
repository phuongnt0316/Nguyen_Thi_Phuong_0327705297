package maytinh;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;




public class Maytinh implements IMaytinh {
    private String code;
    private String name;
    private Double price;

    public Maytinh(String code, String name, Double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public Maytinh() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public void inputInfor() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap code: ");
        code=sc.nextLine();
        System.out.println("Nhap name:");
        name=sc.nextLine();
        boolean flag=true;
        do{
            try{
                System.out.println("Nhap price: ");
                price=Double.parseDouble(sc.nextLine());
                flag=false;
            }catch (Exception e){
                System.out.println("Khong dung kieu du lieu");
            }

        }while (flag);


    }

    @Override
    public void displayInfor() {
        System.out.print("Code: "+code+"--Name: "+name+"--Price: "+price);

    }

    @Override
    public void changeInfor() {

    }
}
