class Solution {
    int solution(int n, int k) {
    int price = 12000*n + 2000*k;
    
    if(n >= 10) {
        int tmp = n/10;
        price -= 2000*tmp;
        
    }
        
    return price;
    }
}