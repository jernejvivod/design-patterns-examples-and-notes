# Dependency Injection

Dependency injection is a design pattern in which an object of function receives other objects or functions that it depends on. A form of inversion of control,
dependency injection aims to separate the concerns of constructing objects and using them, leading to more loosely coupled code.

The pattern ensures that an object or function which wants to use a given service should not have to know how to construct those services. Instead, the receiving 'client' (object or function)
is provided with its dependencies by external code (an 'injector'), which it is not aware of. Dependency helps by making implicit dependencies explicit and helps solve the following problems:
- How can a class be independent of the creation of the objects it depends on?
- How can an application, and the objects it uses support different configurations?
- How can the behavior of a piece of code be changed without editing it directly?

In addition, dependency injection is used for keeping code in-line with the dependency inversion principle.

An example of inversion of control without dependency injection is the template method pattern, where polymorphism is achieved through subclassing. In contrast,
dependency injection implements inversion of control through composition, and is often similar to the strategy pattern. A difference is that the strategy pattern is intended for dependencies
that are interchangeable throughout an object's lifetime, whereas with dependency injection typically only a single instance of a dependency is used.

## Roles

Dependency injection involves four roles: services, clients, interfaces, and injectors.

### Services and Clients

A service is any class which contains useful functionality. In turn, a client is any class which uses services.

Any object can be a service or a client; the names relate only to the roles the objects play in an injection. The same object may even be both a client
(it uses injected services) and a service (it is injected into other objects). Upon injection, the service is made part of the client's state, available for use.

### Interfaces

Clients should not know how their dependencies are implemented, only their names and API. A service which retrieves email, for instance, may use the IMAP or POP3 protocols, but this detail is likely irrelevant to calling code
that merely wants an email retrieved. By ignoring implementation detail, clients do not need to change when their dependencies do.

### Injectors

The injector (sometimes called an assembler, container, provider or factory) introduces services to the client.

The role of injectors is to construct and connect complex object graphs, where objects may be both clients and services.


### Types of Dependency Injection

There are three main ways in which a client can receive injected services:
- Constructor injection
- Setter injection
- Interface injection (the dependency's interface provides an injector method that will inject the dependency into any client passed to it)


### Inversion of Control

Inversion of control is a design pattern in which custom-written portions of a computer program receive the flow of control from a generic framework. The framework calls into the custom,
or task-specific code.

Inversion of control is used to increase the modularity of a program and make it extensible. The general concept is also related to event-driven programming in that it is often implemented using inversion of control
so that the custom code is commonly only concerned with the handling of events, whereas the event loop and dispatch of events/messages is handled by the framework or the runtime environment.

Inversion of control serves the following design purposes:
- To decouple the execution of a task from implementation
- To focus a module on the task it is designed for
- To free modules from assumptions about how other systems do what they do and instead rely on contracts
- To prevent side effects when replacing a module


In object-oriented programming, there are several basic techniques to implement inversion of control. These are:
- Using a service locator pattern
- Using dependency injection
- Using a contextualized lookup
- Using the template method design pattern
- Using the strategy design pattern

### Dependency Inversion Principle

In object-oriented design, the dependency inversion principle is a specific methodology for loosely coupling software modules. When following this principle, the conventional dependency relationship
established from high-level, policy-setting modules to low-level, dependency modules are reversed, thus rendering high-level modules independent of the low-level module implementation details. The principle states:
- High-level modules should not import anything from low-level modules. Both should depend on abstractions (e.g. interfaces).
- Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions (e.g. interface).

By dictating that both high-level and low-level objects must depend on the same abstraction, this design principle inverts the way some people may think about object-oriented programming.


