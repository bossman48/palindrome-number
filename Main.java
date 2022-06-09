public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1245421));
    }

    public static boolean isPalindrome(int number){
        int lenght = (int) (Math.log10(number)+1);

        if(lenght%2==0){
            return false;
        }
        else{
            int powNumber= (lenght-1)/2;
            int tempNumber= (int)Math.pow(10,powNumber);
            int powNumber2= (lenght-1)/2+1;
            int tempNumber2= (int)Math.pow(10,powNumber2);

            // 123 to 321
            int reversed=0;
            int num=number%tempNumber;
            for(;num != 0; num/=10){
                int digit=num%10;
                reversed = reversed * 10+digit;
            }
            //good idea

            if(reversed==Math.floor(number/tempNumber2)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}