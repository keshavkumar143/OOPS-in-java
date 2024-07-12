| **Characteristic** | **Interface** | **Abstract** |
| --- | --- | --- |
| **Definition** | A contract that specifies a set of methods that must be implemented | A class that provides a partial implementation and can be inherited by other classes |
| **Purpose** | Define a common set of methods that can be called by other classes | Provide a base class for other classes to inherit and build upon |
| **Methods** | Only method declarations, no implementation | Can have both method declarations and implementations |
| **Implementation** | Not provided | Partially provided |
| **Inheritance** | Multiple inheritance allowed | Single inheritance allowed |
| **Instantiation** | Cannot be instantiated | Cannot be instantiated |
| **Example** | A payment gateway interface that specifies methods for payment processing | An abstract class for a vehicle that provides a basic implementation for common vehicle functions |