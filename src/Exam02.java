import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam02 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("请输入工资：");
            int salary = Integer.parseInt(br.readLine());
            int tax = salary - 3500;
           if (tax<=0){
               System.out.print("所需要交纳的税费为:0");
           }else if (tax<=1500){
               System.out.print("所需要交纳的税费为:"+tax*0.03);
           }else if (tax<=4500){
               System.out.print("所需要交纳的税费为:"+tax*0.1);
           }else if (tax<=9000){
               System.out.print("所需要交纳的税费为:"+tax*0.2);
           }else if (tax<=35000){
               System.out.print("所需要交纳的税费为:"+tax*0.25);
           }else if (tax<=55000){
               System.out.print("所需要交纳的税费为:"+tax*0.3);
           }else if (tax<=80000){
               System.out.print("所需要交纳的税费为:"+tax*0.35);
           }else{
               System.out.print("所需要交纳的税费为:"+tax*0.45);
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
