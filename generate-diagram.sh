#!/bin/sh
./mvnw test plantuml-generator:generate
java -jar ~/Downloads/plantuml-1.2026.6.jar hexagonal/target/generated-docs/classes.puml
java -jar ~/Downloads/plantuml-1.2026.6.jar layers/target/generated-docs/classes.puml
cp hexagonal/target/generated-docs/classes.png hexagonal.png
cp layers/target/generated-docs/classes.png layers.png
