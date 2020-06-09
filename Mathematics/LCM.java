
public class LCM {
    public static void main(String[] args) {

        int n1 = 72, n2 = 120, lcm;

        // maximum number between n1 and n2 is stored in lcm
        lcm = (n1 > n2) ? n1 : n2;

        // Always true
        while(true)
        {
            if( lcm % n1 == 0 && lcm % n2 == 0 )
            {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            ++lcm;
        }
    }
}

/*Approach 2:

LCM = (n1 * n2) / GCD

public class LCM {
    public static void main(String[] args) {

        int n1 = 72, n2 = 120, gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        int lcm = (n1 * n2) / gcd;
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
    }
}
*/