package Java100Plus;

public class Q17 {
    public static void main(String[] args) {
        int num =15657623;
        int reverseNum=0;
        int original=num;
         while(num>0){
             int digit=num%10;
             reverseNum=reverseNum*10 +digit;
             num=num/10;
         }
        System.out.print(original + " in words: ");
         while (reverseNum>0){
             int digit=reverseNum%10;

             switch (digit) {
                 case 0 -> System.out.print("Zero ");
                 case 1 -> System.out.print("One ");
                 case 2 -> System.out.print("Two ");
                 case 3 -> System.out.print("Three ");
                 case 4 -> System.out.print("Four ");
                 case 5 -> System.out.print("Five ");
                 case 6 -> System.out.print("Six ");
                 case 7 -> System.out.print("Seven ");
                 case 8 -> System.out.print("Eight ");
                 case 9 -> System.out.print("Nine ");
             }
             reverseNum=reverseNum/10;
    }
}
}
