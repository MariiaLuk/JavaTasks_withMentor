package week2;

public class Task3 {

    public static void main(String[] args) {

        printNumbers(24);

    }

    public static void printNumbers( int n ){
        String result = "";
        for (int i = 1; i <= n; i++) {
            if( i % 2== 0 || i % 3 == 0 || i % 5 ==0){
                if(i % 2 == 0){
                    result +="Codility";
                }
                if(i % 3 == 0){
                    result += "Test";
                }
                if(i % 5 == 0){
                    result += "Coders";
                }
            }else{
                result += "" + i;
            }
            result += "\n";
        }
        System.out.println(result);
    }

}

