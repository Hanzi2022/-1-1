// заполнение массива и поиск минимального, максимального и среднего
public class BigArray {
    public static void main(String[] args) {
        int[][] array = new int[5][7];
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                array[i][j] = (int)(Math.random()*100);
            }
        }
        float mid=0;
        int min,max;
        min=array[0][0];
        max=array[0][0];
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                if (array[i][j]>max) {
                    max = array[i][j];
                }
                if (array[i][j]<min) {
                    min = array[i][j];
                }
                mid += array[i][j];
            }
        }
        mid = mid/(array.length*array[0].length);

        System.out.println("Array:");
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("Mid: "+mid);
    }
}