import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

public class Practice3Test {

  private final int ARR_SIZE = 10000;

  @Test
  public void insertionSort(){
    InsertionSort insertionSort = new InsertionSort();
    int[] arr = createRandomArray();
    int[] arr2 = new int[ARR_SIZE];
    System.arraycopy(arr, 0, arr2, 0, arr.length);
    insertionSort.sort(arr);
    Arrays.sort(arr2);
    assertArrayEquals(arr, arr2);
  }

  @Test
  public void mergeSort(){
    MergeSort mergeSort = new MergeSort();
    int[] arr = createRandomArray();
    int[] arr2 = new int[ARR_SIZE];
    System.arraycopy(arr, 0, arr2, 0, arr.length);
    mergeSort.sort(arr);
    Arrays.sort(arr2);
    assertArrayEquals(arr, arr2);
  }

  @Test
  public void quickSort(){
    QuickSort quickSort = new QuickSort();
    int[] arr = createRandomArray();
    int[] arr2 = new int[ARR_SIZE];
    System.arraycopy(arr, 0, arr2, 0, arr.length);
    quickSort.sort(arr);
    Arrays.sort(arr2);
    assertArrayEquals(arr, arr2);
  }

  @Test
  public void selectionSort(){
    SelectionSort selectionSort = new SelectionSort();
    int[] arr = createRandomArray();
    int[] arr2 = new int[ARR_SIZE];
    System.arraycopy(arr, 0, arr2, 0, arr.length);
    selectionSort.sort(arr);
    Arrays.sort(arr2);
    assertArrayEquals(arr, arr2);
  }

  @Test
  public void bubbleSort(){
    BubbleSort bubbleSort = new BubbleSort();
    int[] arr = createRandomArray();
    int[] arr2 = new int[ARR_SIZE];
    System.arraycopy(arr, 0, arr2, 0, arr.length);
    bubbleSort.sort(arr);
    Arrays.sort(arr2);
    assertArrayEquals(arr, arr2);
  }

  private int[] createRandomArray() {
    int[] arr = new int[ARR_SIZE];
    Random r = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = r.nextInt();
    }
    return arr;
  }
}
