class Solution {
    public boolean lemonadeChange(int[] bills) {
        int bill5 = 0, bill10 = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                bill5++;
            }
            if(bills[i] == 10){
                if(bill5 == 0){
                    return false;
                }
                bill10++;
                bill5--;
            }
            if(bills[i] == 20){
                if (bill5 > 0 && bill10 > 0) {
                    bill5--;
                    bill10--;
                }else if(bill5 >=3){
                    bill5 -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}