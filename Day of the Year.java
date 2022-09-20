class Solution {
    public int dayOfYear(String date) {
        String[] splitedArr = date.split("-");
        int sum = 0;
        int month = Integer.valueOf(splitedArr[1]);
       switch(month-1){
            case 12:
               sum = sum + 31;
            case 11:
               sum = sum + 30;
            case 10:
               sum = sum + 31;
            case 9:
               sum = sum + 30;
            case 8:
               sum = sum + 31;
            case 7:
               sum = sum + 31;
            case 6:
               sum = sum + 30;
            case 5:
               sum = sum + 31;
            case 4:
               sum = sum + 30;
            case 3:
               sum = sum + 31;
            case 2:
               sum = sum + 28;
            case 1:
               sum = sum + 31;
         
       }
    int year = Integer.valueOf(splitedArr[0]);
    if ( month > 2 && (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)))
        sum++;
    sum = sum + Integer.valueOf(splitedArr[2]);
    return sum;
    }
}
