# spring-migration-example
Spring migration example with openrewrite

**Step to run :**
`mvn -U org.openrewrite.maven:rewrite-maven-plugin:dryRun -Drewrite.recipeArtifactCoordinates=org.openrewrite.recipe:rewrite-spring:RELEASE -Drewrite.activeRecipes=org.openrewrite.java.spring.boot3.UpgradeSpringBoot_3_2`

**Please open the `console.log.txt` file for the console logs:**
