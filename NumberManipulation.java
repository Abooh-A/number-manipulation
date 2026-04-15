/*
* NumberManipulation.java
* @author AAgyekum
*/

public class NumberManipulation{
    //data members
    private int num [];
    private int arrLength, sum, avg, searchNum; // reused
    private int maxNum, minNum, foundPosition;
    private String aboveAvg, evenNums, oddNums, found;
    
    //constructors
    public  NumberManipulation(){
        arrLength = 1;
        num = new int[arrLength];
    }

    
    //set methods - 1 for each input
    public void setArrLength(int arrLength){
        this.arrLength = arrLength;
    }
    public void setNum (int num[]){
        this.num = num;
    }
    public void setSearchNum(int searchNum){
        this.searchNum = searchNum;
    }


    //get methods - 1 for each output
    public int getFirst_1(){
        return num[0];
    }
    public int getMiddle_2(){
        //chose to select the upper middle number in case of even number of nums
        return num[arrLength/2];
    }
    public int getLast_3(){
        return num[arrLength-1];
    }

    public int getSum_4(){
        return sum;
    }

    public int getMaxNum_5(){
        return maxNum;
    }
    public int getMinNum_6(){
        return minNum;
    }

    public int getAvg_7(){
        return avg;
    }

    public String getAboveAvg_8(){
        return aboveAvg;
    }

    public String getEvenNums_9(){
        return evenNums;
    }

    public String getOddNums_10(){
        return oddNums;
    }

    public String getFindNum_11(){
        return found;
    }

    public int getFindNumIndex_12(){
        return foundPosition;
    }

    //other methods
    public void sum_4(){
        sum = 0;
        for(int i = 0; i < arrLength; i++){
            sum += num[i];
        }
    }
    public void biggestNum_5(){
        maxNum = num[0];
        for(int i = 0; i < arrLength; i++){
            if(maxNum < num[i]){
                maxNum = num[i];
            }
        }
    }

    public void smallestNum_6(){
        minNum = num[0];
        for(int i = 0; i < arrLength; i++){
            if(minNum > num[i]){
                minNum = num[i];
            }
        }
    }

    public void avg_7(){
        sum_4();
        avg = sum/arrLength;
    }
    
    public void aboveAvg_8(){
        avg_7();
        StringBuffer sb = new StringBuffer();
        int j = 0;
        for(int i = 0; i < arrLength; i++){
            if(avg < num[i]){
                sb.append(num[i]);
                sb.append(", ");
                j++;
            }
        }
        if (j>0) {
            sb.deleteCharAt(sb.lastIndexOf(","));  
        }else {
            sb.append("None of the numbers are above average");
        }
        aboveAvg = sb.toString();
    }

    public void evenNums_9(){
        StringBuffer sb = new StringBuffer();
        int numOfEvens = 0;
        for(int i = 0; i < arrLength; i++){
            if(num[i]%2 == 0){
                sb.append(num[i]);
                sb.append(", ");
                numOfEvens++;
            }
        }
        
        if (numOfEvens == 0) {
            sb.append("None of the numbers are even");
        }else {
            sb.append("Number of even numbers: ");
            sb.append(numOfEvens);
            sb.replace(sb.lastIndexOf(","), (sb.lastIndexOf(",")+1),".");
        }
        evenNums = sb.toString();
    }

    public void oddNums_10(){
        StringBuffer sb = new StringBuffer();
        int numOfOdds = 0;
        for(int i = 0; i < arrLength; i++){
            if(num[i]%2 != 0){
                sb.append(num[i]);
                sb.append(", ");
                numOfOdds++;
            }
        }
        
        if (numOfOdds == 0) {
            sb.append("None of the numbers are odd");
        }else {
            sb.deleteCharAt(sb.lastIndexOf(",")+1); // removing space as well
            sb.deleteCharAt(sb.lastIndexOf(","));
            sb.append(". ");

            sb.append("Number of odd numbers: ");
            sb.append(numOfOdds);
        }
        
        oddNums = sb.toString();
    }

    public void findNum_11(){
        findNumIndex_12();
        found = "This number was not found";
        if (foundPosition != -1){
            found = "Your number was found";
        }
    }

    public void findNumIndex_12(){
        foundPosition = -1;
        for(int i = 0; i < arrLength; i++){
            if (searchNum == num[i]){
                foundPosition = i;
                break; 
            }
        }
    }
}