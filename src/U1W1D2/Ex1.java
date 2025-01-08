package U1W1D2;

import java.util.Scanner;
public class Ex1 {

    //es. 1 - if-else if
    public boolean stringaPariDispari(String str){
        if(str.length() % 2 == 0){
            return true;
        }else{
            return false;
        }
        //OR
        // return str.length() % 2 == 0    ? true : false;
        }
    //es. 1 - anno bisestile
    public boolean annoBisestile(int year){
        if(year % 400 == 0){
            return true;
        }else if(year % 4 == 0 && year % 100 != 0){
            return true;
        }else{
            return false;
        }
    }






}