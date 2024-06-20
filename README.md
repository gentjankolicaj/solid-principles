# solid-principles

Sample projects using SOLID principles

The following five concepts make up our SOLID principles:

- Single Responsibility
- Open/Closed
- Liskov Substitution
- Interface Segregation
- Dependency Inversion

### Single Responsibility

- "There should never be more than one reason for a class to change.In other words, every class
  should have only one responsibility"

Benefits :

- Testing - A class with one responsibility will have fewer test cases.
- Lower coupling - Less functionality in single class will have fewer dependencies.
- Organization - Smaller, well organized classes are easier to search/modify than bigger ones.

### Open/Closed

"Software entities ... should be open for extension, but closed for modification"

Benefits :

- Updates : We stop ourselves from modifying existing code and causing potential bugs

### Liskov Substitution

"Functions that use pointers or references to base classes must be able to use objects of derived
classes without knowing it".
Or simply pot if class A is a subtype of class B, we should be able to replace B with A without
disrupting the behaviour of program.

Benefits :

- Lower coupling : We replace super type with subtypes without disrupting behavior of program
- New state & behaviour : By replacing a super-type with a subtype we introduce sub states &
  behaviours.

### Interface Segregation

"Many client-specific interfaces are better than one general-purpose interface".Split big interfaces
to small ones (maybe one method/behaviour).
By doing so, we can ensure that implementing classes only need to be concerned about the methods
that are of interest to them.

Benefits :

- Easy & clean implementation : Classes implement only methods of interest to them.
- A variety of aggregated behaviours possible.

### Dependency Inversion

"Depend upon abstractions, concretions".This means decoupling of software modules.
Instead of high level modules depending on low level modules, both depend on abstractions.

## TO SUM IT UP :

- ### SEPARATE & DECOUPLE AS MUCH AS POSSIBLE (Behaviour & State)
- ### TO FIND GENERIC PATTERN/FLOW, MORE ABSTRACTION THE BETTER IT IS
