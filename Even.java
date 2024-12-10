import java.util.Scanner;

public class Even {
    public static boolean isEven(int n){
       
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
        if(isEven(num)){
            System.out.print(num+" :Number is even");
        }
        else{
            System.out.print(num+" :Number is odd");
        }
        sc.close();
    }
}
