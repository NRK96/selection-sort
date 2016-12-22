public class selectionSort{
  public static void main(String[] args){
    int min = 0;
    int length = args.length;
    int[] array = new int[length];
    for(int i = 0; i < length; i++)
      array[i] = Integer.parseInt(args[i]);
    for(int i = 0; i < length; i++){
      min = i;
      for(int j = i+1; j < length; j++){
        if(array[min] > array[j])
          min = j;
      }
      swap(i, min, array);
    }
    print(array);
  }
  public static void swap(int a, int b, int[] arr){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
  public static void print(int[] arr){
    for(int i = 0; i < arr.length; i++)
      System.out.print(arr[i]+" ");
    System.out.println();
  }
}