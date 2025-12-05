class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        while(low <= high){
            String num = String.valueOf(low);
            int n = num.length();
            low++;
            if(n%2 != 0)
                continue;
            int i = 0;
            int j = n-1;
            int sum1 = 0;
            int sum2 = 0;
            while( true){
                sum1 = sum1 + (num.charAt(i) - '0');
                sum2 = sum2 + (num.charAt(j) - '0');
                i++;
                j--;
                if(i >= j )
                    break;
            }

            if(sum1 == sum2){
                count ++;
            }
           
        }

        return count;
    }
}