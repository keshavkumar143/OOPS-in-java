# Multiple Inheritance in Java

## Overview

Multiple inheritance allows a class to inherit from more than one parent class. Java does not support multiple inheritance with classes to avoid complexity and ambiguity but supports it through interfaces.

## Multiple Inheritance via Interfaces

In Java, a class can implement multiple interfaces, allowing it to inherit the abstract methods from various sources.

## Problems with Multiple Inheritance

### 1. **The Diamond Problem**

When a class inherits from two classes that both inherit from a common base class, it creates ambiguity about which version of a method to inherit.

### 2. **Ambiguity in Method Resolution**

If multiple parent classes have methods with the same signature, it can cause conflicts and ambiguity in determining which method to use.

### 3. **Increased Complexity**

Managing and understanding the relationships and behaviors of multiple inherited classes can be complex and error-prone.

## Conclusion

Java avoids the complications of multiple inheritance by allowing it only through interfaces, ensuring a simpler and more consistent inheritance model.