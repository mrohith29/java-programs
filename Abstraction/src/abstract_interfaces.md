# Differences between Abstact classes and Interfaces in Java
___
## 👉  Abstaction

* Can have abstract (unimplemented) methods as well as concrete (implemented) methods.

* Can have instance variables (fields).

* Can have constructors.

* Allow single inheritance: A class can extend only one abstract class.
Are used to create a base class with some common functionality that can be inherited by subclasses.



    abstract class Shape {
    int x, y; // Instance variables
    Shape(int x, int y) {
          this.x = x;
          this.y = y;
        }
                    
        abstract void draw(); // Abstract method
        void moveTo(int newX, int newY) {
        x = newX;
        y = newY;
        }
    }

## 👉 Interfaces:

* Can have only abstract (unimplemented) methods (prior to Java 8). In Java 8 and later, they can have default and static methods with implementations.

* Cannot have instance variables (fields) or constructors.

* Allow multiple inheritance: A class can implement multiple interfaces.

* Are used to define a contract or set of behaviors that classes should adhere to.


    interface Drawable {
    void draw(); // Abstract method (before Java 8)    
        default void reset() {
            // Default method (Java 8 and later)
            System.out.println("Resetting to default state.");
        }
    }
