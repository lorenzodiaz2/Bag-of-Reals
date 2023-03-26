import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Insert the values of first bag, separated with comma = ");
    String strBag1 = input.nextLine();

    System.out.print("Insert the values of second bag, separated with comma = ");
    String strBag2 = input.nextLine();

    BagOfDoubles bag1 = new BagOfDoubles(StringUtils.createArray(strBag1));
    BagOfDoubles bag2 = new BagOfDoubles(StringUtils.createArray(strBag2));

    System.out.println("Values of bag1 : " + bag1);
    System.out.println("Values of bag2 : " + bag2);

    System.out.println("bag1 and bag2 are " + (bag1.equals(bag2) ? "" : "not ") + "equals");

  }
}