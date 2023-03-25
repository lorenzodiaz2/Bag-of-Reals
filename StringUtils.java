public class StringUtils {
  public static double[] createArray(String strBag) {

    strBag = strBag.replaceAll(" ", "");

    if (strBag.length() > 0) {
      int arrayLength = 0;
      for (int i = 0; i < strBag.length(); i++) {
        if (strBag.charAt(i) == ',') {
          arrayLength++;
        }
      }

      double[] bag = new double[arrayLength + 1];

      String number = "";
      int j = 0;
      for (int i = 0; i < strBag.length(); i++) {

        if (strBag.charAt(i) != ',') {
          number += strBag.charAt(i);
        }
        if (strBag.charAt(i) == ',' || i == strBag.length() - 1) {
          bag[j] = Double.parseDouble(number);
          number = "";
          j++;
        }
      }
      return bag;
    }
    return new double[0];
  }
}