public class Sorts{

  public static void selectionSort(int[] ary) {

    for (int i = 0; i < ary.length-1; i++){
      int min = i;
      for (int j = i+1; j < ary.length; j++){
        if (ary[j] <= ary[min]){
          min = j;
        }
      }
        int temp = ary[min];
        ary[min] = ary[i];
        ary[i] = temp;
      }
    }

public static void bubbleSort(int[] data){
int swaps = 0;

  for (int i = 0; i < data.length; i++){
    for (int j = 0; j < data.length-1; j++){
    if (data[j] > data[j+1]){
      int temp = data[j+1];
      data[j+1] = data[j];
      data[j] = temp;
      swaps += 1;
      }
    }
    if (swaps == 0){
      i = data.length;
    }
  }
}

public static void insertionSort(int[] data){
  int orig;
  int current;
  for (int i = 1; i < data.length; i++){
    orig = i-1;
    current = data[i];
    while (orig >= 0 && current < data[orig]){
       data[orig+1] = data[orig];
       orig = orig-1;
      }
      data[orig+1] = current;
    }
  }

public static String printArray(int[] ary) {
    String output = "[";
    for(int i = 0; i < ary.length -1 ; i++) {
      output += ary[i] + ", ";
    }
    return output += ary[ary.length-1] + "]";
}


public static void main(String[] args) {


    String sorted = "";

    // 8 nums, [0:10]
    int[] test_a = { 3, 4, 7, 1, 6, 2, 8, 6 };
    System.out.println(printArray(test_a));               // [3, 4, 7, 1, 6, 2, 8, 6]

    insertionSort(test_a);

    sorted = printArray(test_a);
    System.out.println(sorted);               // [1, 2, 3, 4, 6, 6, 7, 8]


    if(sorted.equals("[1, 2, 3, 4, 6, 6, 7, 8]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 12 nums, [0:20]
  //   int[] test_b = { 17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17 };
  //   System.out.println(printArray(test_b));   // [17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17]
  //
  //   bubbleSort(test_b);
  //
  //   sorted = printArray(test_b);
  //   System.out.println(sorted);               // [1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]
  //
  //   if(sorted.equals("[1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]")) {
  //     System.out.println("TEST CASE - PASS");
  //   } else {
  //     System.out.println("TEST CASE - FAIL");
  //   }
  //
  //   // 20 nums, [0:100]
  //   int[] test_c = { 14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52 };
  //   System.out.println(printArray(test_c));   // [14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52]
  //
  //   bubbleSort(test_c);
  //
  //   sorted = printArray(test_c);
  //   System.out.println(sorted);               // [1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]
  //
  //   if(sorted.equals("[1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]")) {
  //     System.out.println("TEST CASE - PASS");
  //   } else {
  //     System.out.println("TEST CASE - FAIL");
  //   }
  //
  //   //TEST D
  //   int[] test_d = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
  //   System.out.println(printArray(test_d));
  //
  //   insertionSort(test_d);
  //
  //   sorted = printArray(test_d);
  //   System.out.println(sorted);
  //
  //   if(sorted.equals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]")) {
  //     System.out.println("TEST CASE - PASS");
  //   } else {
  //     System.out.println("TEST CASE - FAIL");
  //   }
  //
  //   //TEST E
  //   int[] test_e = {0,0,0,0,0};
  //   System.out.println(printArray(test_e));
  //
  //   bubbleSort(test_e);
  //
  //   sorted = printArray(test_e);
  //   System.out.println(sorted);
  //
  //   if(sorted.equals("[0, 0, 0, 0, 0]")) {
  //     System.out.println("TEST CASE - PASS");
  //   } else {
  //     System.out.println("TEST CASE - FAIL");
  //   }
  //
  //   //TEST F
  //   int[] test_f = {5,4,3,2,1};
  //   System.out.println(printArray(test_f));
  //
  //   bubbleSort(test_f);
  //
  //   sorted = printArray(test_f);
  //   System.out.println(sorted);
  //
  //   if(sorted.equals("[1, 2, 3, 4, 5]")) {
  //     System.out.println("TEST CASE - PASS");
  //   } else {
  //     System.out.println("TEST CASE - FAIL");
  //   }
  //
   }
}
