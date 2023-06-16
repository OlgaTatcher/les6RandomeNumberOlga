public class RandomNum {
    public static void main(String [] args){
        int sum=0;
        int min=11;
        int max=100_011;
        int num=(int) (Math.random() * (max-min+1)+min);
        System.out.println("Число "+num);
        while(num!=0){
            sum+=(num%10);
            num/=10;
        }
        System.out.println("Сума розрядів числа: "+sum);

    }
}
