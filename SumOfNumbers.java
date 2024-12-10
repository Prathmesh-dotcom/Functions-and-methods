public class SumOfNumbers {
    public static int CalculateSum(int a, int b){
        int sum= a+b;
        return sum;
    }

    public static int Multiply(int a, int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        System.out.println(CalculateSum(25, 10));
        System.out.println(Multiply(25, 10));
    }
}
