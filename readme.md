# Spring Container
1. Creates and manages objects
2. Injects object's dependencies

## Spring development process

1. Configure spring beans
2. Create a spring container
3. Retrieve beans from the spring container

## Spring container is generally known as application context and it has specialized implementations.

1. ClassPathXmlApplicationContext
2. AnnotationConfigApplicationContext
3. GenericWebApplicationContext
and others

There are different types of injection most often used of them are 
1. Constructor injection
2. Setter injection 

## Bean Lifecycle

Container start
Bean Instantiated
Dependencies Injected
Internal Spring factory
Customn initialization code
Bean is ready for use
Custom destroy method
Stop

Init and Destroy methods must be public, void and must not have any arguments.

Prototype bean destroy will not be handled by spring container