import java.util.Arrays;
public class BasicExcercisesTest{
    // Testing: Print 1 to 255
    // public static void main(String[] args){
    //     BasicExcercises iD = new BasicExcercises();
    //     // System.out.println(iD.printNumbers());
    //     iD.printNumbers();
    // }

    // Testing: Print Odd Numbers 1 to 255
    // public static void main(String[] args){
    //     BasicExcercises iD = new BasicExcercises();
    //     iD.printOddNumbers();
    // }
    
    
    // Testing: Print and Print Sum of 1 to 255.
    // public static void main(String[] args) {
    //     BasicExcercises iD = new BasicExcercises();
    //     iD.printAndSum();
    // }

    // Testing: Print every element from an Array.
    // public static void main(String[] args) {
    //     BasicExcercises iD = new BasicExcercises();
    //     int[] arrayTest = {1,3,5,7,9,13};
    //     iD.printValueArray(arrayTest);
    // }
    
    // Testing: Return Max
    // public static void main(String[] args){
    //     BasicExcercises iD = new BasicExcercises();
    //     // ArrayList<Integer> introArray = new ArrayList<Integer>;
    //     int[] introArray = {-3,-5,-7};
    //     System.out.println(iD.returnMax(introArray));

    // }

//    Testing: Return the elements of the array higher than X.
//     public static void main(String[] args) {
//        BasicExcercises iD = new BasicExcercises();
//        int[] arrayTest = {1,3,5,7};
//        System.out.println(iD.higherThanX(arrayTest, 3));
//    } 

    
    // Testing: Exp2 an array 

    // public static void main(String[] args){
    //     BasicExcercises iD = new BasicExcercises();
    //     int[] arrayTest = {1,5,10,-2};
    //     // int [] finalArray = iD.squareArray(arrayTest);
    //     System.out.println(Arrays.toString(iD.squareArray(arrayTest)));
    // }

    // Testing: Replace the negatives values of an array by 0.
    // public static void main(String[] args){
    //     BasicExcercises iD = new BasicExcercises();
    //     int[] arrayTest = {1,5,10,-2};
    //     System.out.println(Arrays.toString(iD.deleteNegatives(arrayTest)));
    // }

    // Testing: Return the max,min and avg of an array.
    // public static void main(String[] args){
    //     BasicExcercises iD = new BasicExcercises();
    //     int[] arrayTest = {1,5,10,-2};
    //     System.out.println(Arrays.toString(iD.maxMinAvg(arrayTest)));
    // }

    public static void main(String[] args){
        BasicExcercises iD = new BasicExcercises();
        int[] arrayTest = {1,5,10,7,-2};
        System.out.println(Arrays.toString(iD.changeValues(arrayTest)));
    }

}