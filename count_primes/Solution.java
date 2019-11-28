class Solution {
    
    static public boolean isPrime(int num){
        double top = Math.sqrt(num);
        boolean prime = true; 
        for(int i = 2; i <= top; i++){
            if((num % i) == 0){
                System.out.println(num);
                prime = false;
                break;
            }
        }
        return prime;
    }
    static public int countPrimes(int n) {
        int counter = 0;
        for(int i = 2; i < n; i++){
            if(isPrime(i)) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        countPrimes(10);
    }
}