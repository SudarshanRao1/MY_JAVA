import java.util.Scanner;

class A{
    
    int[] a;
    int n;
    int max;
    int secondone = 0;

    A(int n){
        this.n = n;
        a = new int[n];
        max = a[0];
    }

    void checking(){
        for (int i = 0 ; i < n ; i++){
            if (a[i] > max){
                max = a[i];
            }
        }

        for (int i = 0 ; i < n ; i++){
            if (a[i] != max && a[i] > secondone){
                secondone = a[i];
            }
        }

        for(int i = 0 ; i < n ; i++){
            if (a[i] == secondone){
                System.out.println("the positation: " + i);
                System.out.println("Element is " + secondone);
            }
        }
    }
}

public class Question6{
    public static void main(String[] args) {
        A a = new A(5);
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i < 5 ; i++){
            a.a[i] = sc.nextInt();
        }

        a.checking();
    }
}
