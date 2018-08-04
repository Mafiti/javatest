import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by TAO on 2018/8/4.
 */
public class Exam03 {

    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("请输入日期(格式为yyyy-mm-dd)：");
            String date = br.readLine();
            if (!getRightFormat(date)){
                System.out.print("您输入的日期格式不合法");
            }
            System.out.print("下一天为："+getNextDay(date));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  static String getNextDay(String currentDate){
        int sumDays = 0;
        String nextDate = null;
        int year = Integer.parseInt(currentDate.substring(0,4));
        int month = Integer.parseInt(currentDate.substring(5,7));
        int day = Integer.parseInt(currentDate.substring(8,10));
        int num =0;
        if((year%4==0&&year%100!=0||year%400==0)&&month>2){
            num=1;//将闰年的二月份多出的一天加上
        }

        int nextDay = day+1;
        int nextMonth = month +1;
        int nextYear = year +1;
        for(int i=1;i<month;i++){
            switch(i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    sumDays=31+num;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    sumDays=30+num;
                    break;
                case 2:sumDays=28+num;
            }
        }
        if (nextDay<=sumDays){
            nextDate = year+"-"+month+"-"+nextDay;
        }else if (nextMonth<=12){
            nextDate = year+"-"+nextMonth+"-"+"01";
        }else {
            nextDate = nextYear+"-"+"01"+"-"+"01";
        }
        return nextDate;
    }

    public static boolean getRightFormat(String s){
        String reg="((^\\d{4}-0\\d{1}-[0-3]{1}\\d{1})|(^\\d{4}-1[0-2]{1}-[0-3]{1}\\d{1}))$";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(s);
        boolean b = true;
        b=m.matches();
        return b;
    }
}
