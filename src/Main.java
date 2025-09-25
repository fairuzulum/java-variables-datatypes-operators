//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    // === 1. Variables & Data Types ===
    int age = 25; // integer
    double height = 170.5; // floating point
    char grade = 'A'; // single character
    boolean isStudent = true; // true or false
    String name = "Fairuz"; // text (bukan primitif, tapi sering dipakai)

    System.out.println("=== Variables & Data Types ===");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Height: " + height + " cm");
    System.out.println("Grade: " + grade);
    System.out.println("Is Student? " + isStudent);

    // === 2. Operators ===
    int a = 10, b = 3;

    // Arithmetic
    System.out.println("\n=== Arithmetic Operators ===");
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a / b = " + (a / b));
    System.out.println("a % b = " + (a % b));

    // Comparison
    System.out.println("\n=== Comparison Operators ===");
    System.out.println("a == b ? " + (a == b));
    System.out.println("a != b ? " + (a != b));
    System.out.println("a > b ? " + (a > b));
    System.out.println("a < b ? " + (a < b));

    // Logical
    System.out.println("\n=== Logical Operators ===");
    boolean x = true, y = false;
    System.out.println("x && y = " + (x && y)); // AND
    System.out.println("x || y = " + (x || y)); // OR
    System.out.println("!x = " + (!x)); // NOT

    // === 3. Type Casting ===
    System.out.println("\n=== Type Casting ===");
    double d = 9.78;
    int i = (int) d; // explicit casting: double -> int
    System.out.println("Double value: " + d);
    System.out.println("After casting to int: " + i);

    int num = 100;
    double numDouble = num; // implicit casting: int -> double
    System.out.println("Int value: " + num);
    System.out.println("After casting to double: " + numDouble);

}
