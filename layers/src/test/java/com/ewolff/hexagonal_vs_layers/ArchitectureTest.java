package com.ewolff.hexagonal_vs_layers;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = "hexagonal_vs_layers")
public class ArchitectureTest {

	@ArchTest
	static final ArchRule logicShouldAccessDatabase = classes().that().resideInAnyPackage("..logic..").should()
			.dependOnClassesThat().resideInAnyPackage("..database..", "java..");

	@ArchTest
	static final ArchRule logicShouldNotAccessUI = noClasses().that().resideInAnyPackage("..logic..").should()
			.accessClassesThat().resideInAnyPackage("..ui..");

	@ArchTest
	static final ArchRule uiShoulOnlyAccessLogic = classes().that().resideInAnyPackage("..ui..").should()
			.dependOnClassesThat().resideInAnyPackage("..logic..", "java..");

}
