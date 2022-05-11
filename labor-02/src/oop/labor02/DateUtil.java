 package oop.labor02;

public class DateUtil {

private int ev,honap,nap;
public DateUtil(int year, int month, int day){
    this.ev=year;
    this.honap=month;
    this.nap=day;

}
public DateUtil(){

}

    public static boolean leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                if (year % 400 == 0);
                return true;
            }
        }
        return false;
    }

    public static boolean isValidDate(int year, int ho, int day) {
        if (year < 1)
            return false;
        if (day > 31 || day < 1)
            return false;
        if (ho < 1 || ho > 12)
            return false;
        if (day == 31 && (ho == 4 || ho == 6 || ho == 9 || ho == 11))
            return false;
        if (ho == 2 && day > 29)
            return false;
        if (day > 28)
            return leapYear(year);
        else return false;

    }

}


