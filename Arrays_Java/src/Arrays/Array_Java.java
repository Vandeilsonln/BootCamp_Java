package Arrays;

public class Array_Java {
    public static void main(String[] args){
        int[] myArray = new int[7];

        for (int i=0; i < myArray.length; i++){
            myArray[i] = (i+1) * 10;
            System.out.println(myArray[i]);
        }
        System.out.println(myArray);
    }

}
