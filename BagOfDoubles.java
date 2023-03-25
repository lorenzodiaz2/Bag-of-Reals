import java.util.Arrays;

public class BagOfDoubles {
  private double[] values;

  public BagOfDoubles(double... values) {
    Arrays.sort(values);
    this.values = values;
  }

  @Override
  public String toString() {
    return Arrays.toString(values);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    BagOfDoubles other = (BagOfDoubles) obj;

    return Arrays.equals(this.values, other.values);
  }
}