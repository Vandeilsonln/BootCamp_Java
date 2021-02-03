package Arrays;

public class Multidimensional {
    public static void main(String[] args){
        int[][] myArray = new int[5][5];

        for (int i=0; i < myArray.length; i++){
            for (int j=0; j < myArray[i].length; j++){
                myArray[i][j] = (i+1) * (j+1);
                System.out.println(myArray[i][j]);
            }
        }

        System.out.println(myArray.length);
        System.out.println(myArray[0].length);
    }
}
