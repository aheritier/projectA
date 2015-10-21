package net.aheritier.demo;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    // internal proprietary API is reported
    String sResult = new sun.misc.BASE64Encoder().encode("yo".getBytes());
    OtherClass thatClass = new OtherClass();
    // Using a deprecated methods from another class is also reported
    thatClass.theOldWay();
    // But not if it is in the same class
    // http://stackoverflow.com/questions/13108112/why-isnt-the-deprecated-annotation-triggering-a-compiler-warning-about-a-metho
    // http://docs.oracle.com/javase/specs/jls/se7/html/jls-9.html#jls-9.6.3.6
    // A Java compiler must produce a deprecation warning when a type, method,
    // field, or constructor whose declaration is annotated with the annotation
    // @Deprecated is used (i.e. overridden, invoked, or referenced by name),
    // unless:
    //
    // * The use is within an entity that is itself annotated with the annotation
    // @Deprecated; or
    // * The use is within an entity that is annotated to suppress the warning
    // with the annotation @SuppressWarnings("deprecation"); or
    // * >>>>> The use and declaration are both within the same outermost class.
    notToBeUsed();
    System.out.println("Hello World!");
  }

  @Deprecated
  public static void notToBeUsed() {
    System.out.println("You shouldn't see that!");
  }
}
