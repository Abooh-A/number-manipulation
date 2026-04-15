/*
* NumberManipulationApp.java
* @author AAgyekum
*/
import java.util.Scanner;
public class NumberManipulationApp{
    public static void main(String[] args){
        //variables
        int arrLength, option, searchNum;
        int num[];

        //objects 
        Scanner in = new Scanner(System.in);
        NumberManipulation myManipulator = new NumberManipulation();

        //requesting inputs
        int error = 0;
        do{
            if(error > 0){ // error statement
               System.out.println("The number you've entered is invalid, please enter a valid number");
            }
            System.out.println("How many numbers would you like to enter? or enter 0 to exit");
            arrLength = in.nextInt();

            if(arrLength == 0){//exiting program
                return;
            }

            error++;
        }while(arrLength < 0);

        myManipulator.setArrLength(arrLength);
        num = new int [arrLength];

        for(int i=0; i<arrLength; i++){
            System.out.println("Please enter your number "+(i+1)+":");
            num[i] = in.nextInt();
        }
        myManipulator.setNum(num);
        
        do { 
            System.out.println("The Options for this app are:\n\t1. Display the 1st number. \n\t2. Display the middle number. \n\t3. Display the last number. \n\t4. Display the sum of all numbers. \n\t5. Display the biggest number. \n\t6. Display the smallest number. \n\t7. Display the average of all the numbers. \n\t8. Find and display the numbers that are above average. \n\t9. Find how many numbers are even and display them. \n\t10.Find how many numbers are odd and display them. \n\t11. Search for a number given by the user \n\t12. If you found the number in the search, show the index of the number \n\t13. Exit \nWhat would you like to do?");
            option = in.nextInt();

            if( option > 0 && option < 14){
                switch(option){
                    case 1:
                        System.out.println("First number: "+myManipulator.getFirst_1());
                        break;

                    case 2:
                        System.out.println("Middle number: "+myManipulator.getMiddle_2());
                        break;

                    case 3:
                        System.out.println("Last number: "+myManipulator.getLast_3());
                        break;

                    case 4:
                        myManipulator.sum_4();
                        System.out.println("Sum of the numbers: "+ myManipulator.getSum_4());
                        break;

                    case 5:
                        myManipulator.biggestNum_5();
                        System.out.println("Biggest number: "+ myManipulator.getMaxNum_5());
                        break;

                    case 6:
                        myManipulator.smallestNum_6();
                        System.out.println("Smallest number: "+ myManipulator.getMinNum_6());
                        break;

                    case 7:
                        myManipulator.avg_7();
                        System.out.println("Average number: "+ myManipulator.getAvg_7());
                        break;

                    case 8:
                        myManipulator.aboveAvg_8();
                        System.out.println("Above average numbers: "+ myManipulator.getAboveAvg_8());
                        break;

                    case 9:
                        myManipulator.evenNums_9();
                        System.out.println("Even numbers: "+ myManipulator.getEvenNums_9());
                        break;

                    case 10:
                        myManipulator.oddNums_10();
                        System.out.println("Odd Numbers: "+ myManipulator.getOddNums_10());
                        break;

                    case 11:
                        System.out.println("What number would you like to search for in your array?");
                        searchNum = in.nextInt();
                        myManipulator.setSearchNum(searchNum);

                        myManipulator.findNum_11();
                        System.out.println(myManipulator.getFindNum_11());
                        break;
                    case 12:
                        System.out.println("What number would you like to search for in your array?");
                        searchNum = in.nextInt();
                        myManipulator.setSearchNum(searchNum);

                        myManipulator.findNumIndex_12();
                        if(myManipulator.getFindNumIndex_12() != -1){
                            System.out.println("Number was found in the position: "+ myManipulator.getFindNumIndex_12());
                        }else{
                            System.out.println("Number was not found");
                        }
                        break;
                }

            }else{
                System.out.println("You have not entered a valid menu option");
            }
            
        } while (option != 13);

    }
}