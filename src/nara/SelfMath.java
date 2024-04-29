package nara;

import java.util.*;

public class SelfMath {
    
    public static void main(String[] args) {
        
        Map<Integer, Integer> primeMap = factorize(150);
        for(int key: primeMap.keySet()){
            System.out.println(key+":"+ primeMap.get(key));
        }

        System.out.println(GCD(36, 60));
    }

    public static HashMap<Integer, Integer> factorize(int n){
        HashMap<Integer, Integer> primes = new HashMap<>();

        for(int i=2; i*i <= n; i++){
            // 割り切れないならそもそもスルーで
            if( n % i > 0 ){
                continue;
            }
            int exp = 0;
            while ( n%i == 0) {
                exp++;
                n = n/i;
            }
            primes.put(i, exp);
        }

        if(n != 1){
            primes.put(n, 1);
        }

        return primes;
    }

    public static int GCD(int a, int b){
        HashMap<Integer, Integer> tableA = factorize(a);
        HashMap<Integer, Integer> tableB = factorize(b);
        HashMap<Integer, Integer> tableLCM = factorize(a);

        for(int prime : tableB.keySet()){
            if(tableA.containsKey(prime)){
                tableLCM.put(prime, Math.max(tableB.get(prime), tableA.get(prime)));
            }
            else{
                tableLCM.put(prime, tableB.get(prime));
            }
        }

        int lcm = 1;
        for(int prime : tableLCM.keySet()){
            for(int i=0; i<tableLCM.get(prime); i++){
                lcm = lcm*prime;
            }
        }

        return lcm;
    }

    
}
