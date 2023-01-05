package week1;

public class Task3 {

    public static void main(String[] args) {

        String result = "";
        for (int i = 1; i <= 30 ; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                result += "FINRA";
                continue;
            }else if ( i % 3  == 0){
                result += "FIN";
                continue;
            } else if ( i % 5 == 0){
                result += "RA";
                continue;
            }
            result += "" + i;
        }

        System.out.println(result);


    }
}


/*
FINRA :
Write a method which prints out the numbers from 1 to 30 but
 for numbers which are a multiple of 3print "FIN" instead of
 the number and for numbers which are a multiple of 5,
 print "RA" instead of the number. for numbers which are
 a multiple of both 3 and 5, print "FINRA" instead of the number.
 */