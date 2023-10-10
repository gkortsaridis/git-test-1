public class HelloWorld {
public static void main(String[] args) {
java.util.Scanner scan = new java.util.Scanner(System.in);
System.out.println("Hello World!");
System.out.println("What’s your name?");
String s = scan.nextLine();
System.out.println("Hello " + s + "!");
}
}


