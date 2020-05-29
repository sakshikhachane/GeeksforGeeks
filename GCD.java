package Mathematics;
// Java program to find GCD of two or 
// more numbers 

//Approach 1: Recursion

public class GCD { 
	// Function to return gcd of a and b 
	static int gcd(final int a, final int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // Function to find gcd of array of
    // numbers
    static int findGCD(final int arr[], final int n) {
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = gcd(arr[i], result);

            if (result == 1) {
                return 1;
            }
        }

        return result;
    }

    public static void main(final String[] args) {
        final int arr[] = { 2, 4, 6, 8, 16 };
        final int n = arr.length;
		System.out.println(findGCD(arr, n)); 
	} 
} 
 

/*Approach 2:
public class GCD {

    public static void main(String[] args) {

        int n1 = 81, n2 = 153, gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }

        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
    }
}

//Approach 3: (Only positive numbers)
public class GCD {

    public static void main(String[] args) {

        int n1 = 81, n2 = 153;

        while(n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }

        System.out.println("G.C.D = " + n1);
    }
}

//Approach 4: (Contains both positive and negative numbers)
public class GCD {

    public static void main(String[] args) {

        int n1 = 81, n2 = -153;

        // Always set to positive
        n1 = ( n1 > 0) ? n1 : -n1;
        n2 = ( n2 > 0) ? n2 : -n2;

        while(n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }

        System.out.println("G.C.D = " + n1);
    }
}
*/