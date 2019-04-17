package math;

public class ReplaceFor {

    // print out 1 - 25, if a number can be divided by 5,print buzz, if can be divided by 3 print fuzz,
    // if can be by both 3 & 5 print fuzzBuzz

    public static void main(String[] args) {

        for(int i=0;i<16;i++){
            if ((i%3)==0 || (i%5)==0){
                System.out.println("fuzzBuzz");
            }else if ((i%3)==0){
                System.out.println("fuzz");
            }else if((i%5)==0){
                System.out.println("buzz");
            }else
                System.out.println(i);
        }
    }

}
