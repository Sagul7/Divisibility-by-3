import java.util.Scanner;

public class Divisibilityby3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++)
        {
            A[i] = sc.nextInt();
        }
        System.out.println(divisbleBy3(A,n));
    }
    public static int divisbleBy3(int A[],int n)
    {
        int sum = 0;//rule sum of digits divisible by 3 or not
        for(int x : A)
        {
            sum+=x;
        }
        return sum%3==0 ? 1 :0;
    }
}
/*
Divisibility by 3
Given a number in the form of an array A of size N. Each of the digits of the number is represented by A[i]. Check if the number is divisible by 3.

Example Input
Input 1:
A = [1, 2, 3]
Input 2:
A = [1, 0, 0, 1, 2]

Example Output
Output 1:1
Output 2: 0
 */
