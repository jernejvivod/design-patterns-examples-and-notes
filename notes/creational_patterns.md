# Creational Pattern

Creational design patterns are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.

Creational design patterns are composed of two dominant ideas. One is encapsulating knowledge about which concrete classes the system uses. Another is hiding how instances of these
concrete classes are created and combined.

Creational design patterns are further categorized into object-creational patterns and class-creational patterns, where object-creational patterns deal
with object creation and class-creational patterns deal with class-instantiation.

Object-creational patterns defer parts of its object creation to another object, while class-creational patterns defer its object creation to subclasses.


## Definition

The creational patterns aim to separate a system from how its objects are created, composed, and represented. They increase the system's flexibility in terms of the what, who, how, and when of object creation.

## When to Consider Applying Creational Patterns

Consider applying creational patterns when:
- A system should be independent of how its objects and products are created.
- A set of related objects is designed to be used together.
- Hiding the implementations of a class library or product, revealing only their interfaces.
- Constructing different representation of independent complex objects.
- A class wants its subclass to implement the object it creates.
- The class instantiations are specified at run-time
- There must be a single instance and client can access this instance at all times.
- Instance should be extensible without being modified.


