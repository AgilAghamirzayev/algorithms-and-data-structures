package searching;

public class LinearSearch {

  public static int linearSearch(int[] array, int n, int value) {
    int result = -1;

    for (int i = 0; i < n; i++) {
      if (array[i] == value) {
        result = array[i];
      }
    }
    return result;
  }

  public static int betterLinearSearch(int[] array, int n, int value) {
    int result = -1;

    for (int i = 0; i < n; i++) {
      if (array[i] == value) {
        return array[i];
      }
    }
    return result;
  }


  public static int sentinelLinearSearch(int[] array, int n, int value) {
    int last = array[n - 1];
    array[n - 1] = value;

    int i = 1;

    while (array[i] != value) {
      i++;
    }

    array[n - 1] = last;
    if (i < n || array[n] == value) {
      return i;
    }
    return -1; 
  }
}
