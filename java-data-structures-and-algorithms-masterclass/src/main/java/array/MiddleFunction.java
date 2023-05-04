package array;

public class MiddleFunction {

  public static int[] middle(int[] array) {
    int l = array.length;
    return l % 2 != 0 ? new int[]{array[l / 2]} : new int[]{array[l / 2], array[l / 2 + 1]};
  }

  public static int[] middlev(int[] array) {

    if (array.length % 2 == 0) {
      return new int[]{array[(array.length - 1) / 2], array[((array.length - 1) / 2) + 1]};
    }
    return new int[]{array[array.length / 2]};

  }
}
