public class PrimitiveTypes {
  public static void main (String [] args) {
    PrimitiveTypes types = new PrimitiveTypes();
    //types.CheckByte();
    // types.checkChar();
    types.checkBoolean();
  }
  /*
  public void CheckByte() {
    byte byteMin = - 128;
    byte byteMax = 127;
    System.out.println("byteMin = "+byteMin);
    System.out.println("byteMax = "+byteMax);
    byteMin = (byte)(byteMin-1);
    byteMax = (byte)(byteMax+1);
    System.out.println("byteMin-1 = "+byteMin);
    System.out.println("byteMax-1 = "+byteMax);
  }

  public void checkChar() {
    char charMin = '\u0000';
    char charMax = '\uffff';
    System.out.println("charMin=["+charMin"]");
    System.out.println("charMax=["+charMax"]");
    int intValue = 'a';
    System.out.println("intValue=["+intValue"]");
  }
  */

  public void checkBoolean() {
    boolean flag = true;
    System.out.println(flag);
    flag = false;
    System.out.println(flag);
  }
}
