import java.util.ArrayList;
public class BasicExcercises{
    public void printNumbers(){
        for(int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }

    public void printOddNumbers(){
        for(int i = 1; i <=255; i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }

    public void printAndSum(){
        int sum = 0;
        for(int i = 1; i<=255;i++){
            sum += i;
            System.out.println(i);
            System.out.println(sum);
        }
    }

    public void printValueArray(int[] array){
        for(int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }

    public Integer returnMax(int[] array){
        int max = array[0];
        for(int i = 0; i<array.length;i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public returnAverage(int[] array){
        int avg = 0;
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum +=array[i];
        }

        avg = sum/(array.length);

        return avg;
    }

    public Integer higherThanX(int[] array, int x){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > x){
                count+= 1;
            }
        }
        return count;
    }

    public Integer squareArray(int[] array){
        int[] squaredArray = new int[array.length];
        int element_2 = 0;
        for(int i = 0; i < array.length; i++){
            element_2 = array[i]*array[i];
            squaredArray[i] = element_2 ;
        }
        return squaredArray;
    }
}