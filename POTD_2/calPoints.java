class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        int record[] = new int[n];
        int j = 0;
        for(int i =0; i<n; i++){
            if(operations[i].matches("[+-]?\\d+")){
                record[j] = Integer.parseInt(operations[i]);
                j++;
            }
            if(operations[i].equals("+")){
                if( j>=2 ){
                    record[j] = record[j-2]+record[j-1];
                    j++;
                }
            }
            if(operations[i].equals("C")){
                j--;
                record[j] = 0;
            }
            if(operations[i].equals("D")){
                record[j] = record[j-1] *2;
                j++;
            }
        }
        int sum = 0;
        for(int i = 0; i<record.length; i++){
            sum = sum + record[i];
        }
        return sum;
    }
}