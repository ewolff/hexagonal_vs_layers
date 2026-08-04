# Hexagonal vs Layers Example in Java

This is an extremly stripped down project in Java to show the
difference between a layered architecture and a hexaagonal
architecture. I used it in a workshop and it seemed useful despite its
simplicity.

## Compile and run

Use `mvn test` to build both examples and test them. The tests check
whether the system works and whether the architecture is correctly
implemented (see below).

## Layers

![Layers class diagram](layers.png)

The UI packages uses the logic package which in turn uses the database
package.

Problem: Business logic depends on database - that doesn't seem very
clean. In fact this dependency might make it hard to exchange the
database layer. For example, specific database exceptions might be
used caught in the business logic. For tests, replacing the database
layer with a mock might be needed and hard due to the dependencies.

## Hexagonal

![Hexagonal class diagram](hexagonal.png)

If we extract the interface for the database layer and move it into
the business logic, database depends on business logic. To make it
more clear why hexagoal is also called "ports and adapters", the
interface is in `logic.database_port` and the implementation in
`database_adapter`.

For the UI an interface in `logic.ui_port` is defined. This is used by
`ui_adapter` to call the business logic.

## ArchUnit

To enforce the dependencies, [ArchUnit](https://www.archunit.org/) is
used.

For layers, the
[ArchitectureTest](layers/src/test/java/com/ewolff/hexagonal_vs_layers/ArchitectureTest.java)
ensures:
* Logic accesses database
* Logic doesn't access UI
* UI only accesses logic

For hexagonal, the
[ArchitectureTest](hexagonal/src/test/java/com/ewolff/hexagonal_vs_layers/ArchitectureTest.java)
ensures:
* Logic doesn't accesses database
* Logic doesn't access UI
* UI adapter only accesses UI port in logic
* Database adapter only accesses database port in logic

ArchUnit also has a [fluent
API](https://www.archunit.org/userguide/html/000_Index.html#_getting_started)
for more complex rules. Both layers and onion (aka hexagonal) are also
[predefined](https://www.archunit.org/userguide/html/000_Index.html#_architectures).

## Generating the class diagram

You can generate the class diagrams with the script
`generate-diagram.sh`. It expects PlantUML to be present in the file
`~/Downloads/plantuml-1.2026.6.jar` . 

## Links

* [Tom Homberg's more complex example](https://github.com/thombergs/buckpal)

