public class OperatorComparision {
  public static void main (String args []) {
    OperatorComparision operator = new OperatorComparision();
    operator.comparision();
  }

  public void comparision() {
    int intValue1 = 1;
    int intValue2 = 2;
    int intValue3 = 1;
    System.out.println(intValue1 == intValue2);
    System.out.println(intValue1 == intValue3);

    System.out.println(intValue1 != intValue2);
    System.out.println(intValue1 != intValue3);
  }
}
