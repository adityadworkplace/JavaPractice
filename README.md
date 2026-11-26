# Java Backend Development Roadmap

A practical, exercise-driven journey from Java fundamentals to independently designing, building, testing, securing, and deploying production-oriented backend applications.

## End Goal

Become proficient in Java programming and capable of independently developing real-world backend applications using Java, Spring Boot, PostgreSQL, and the surrounding ecosystem.


---


# Index

## Track 1 — Java Programming

- [Phase 1: Java Fundamentals](#phase-1-java-fundamentals)

- [Phase 2: Object-Oriented Programming](#phase-2-object-oriented-programming)

- [Phase 3: Core Java and Standard Libraries](#phase-3-core-java-and-standard-libraries)

- [Phase 4: Java Tools, Testing and Engineering Practices](#phase-4-java-tools-testing-and-engineering-practices)

## Track 2 — Backend Development

- [Phase 5: SQL, Databases and JDBC](#phase-5-sql-databases-and-jdbc)

- [Phase 6: Spring and Spring Boot](#phase-6-spring-and-spring-boot)

- [Phase 7: Persistence and Backend Security](#phase-7-persistence-and-backend-security)

- [Phase 8: Backend Engineering and Architecture](#phase-8-backend-engineering-and-architecture)

- [Phase 9: Deployment and Production Practices](#phase-9-deployment-and-production-practices)

## Track 3 — Independent Projects

- [Beginner Projects](#beginner-projects)

- [Intermediate Projects](#intermediate-projects)

- [Advanced Projects](#advanced-projects)

- [Final Capstone](#final-capstone-project)

## Progress

- [Skills Coverage Ledger](#skills-coverage-ledger)

---

# TRACK 1: JAVA PROGRAMMING

# Phase 1: Java Fundamentals

**Objective:** Become comfortable solving programming problems independently using Java's basic language constructs.

The exercises in this phase progressively introduce programming logic, data manipulation, control flow, methods, arrays, strings, and basic problem-solving techniques.

## 1. Development Environment and First Programs

### Exercise 1 — Console Greeting

This exercise records the functionality demonstrated by your submitted `Name` and `Hello` classes.

**Implemented in your submitted code**

- [x] Create separate `Name` and `Hello` classes.

- [x] Create a `Name` object using `new`.

- [x] Define and call an instance method.

- [x] Return a `String` from `askName()`.

- [x] Read console input using `Scanner`.

- [x] Print a greeting using string concatenation.

**Done when**

- [x] The program accepts and displays a full name, including spaces.

- [x] Unused imports have been removed.

### Environment and first-program checklist

- [x] Install and configure the JDK.

- [x] Configure Java in VS Code.

- [x] Write a basic greeting program.

- [x] Run the program successfully.

- [x] Create a Java project in VS Code.

- [x] Compile and execute a program using the terminal.

- [x] Create a program using multiple Java classes.

- [x] Create a simple program using packages.

**Concepts covered:** JDK, JVM, bytecode, compilation, execution, project structure, packages, imports, classes, `main()`.

---

## 2. Basic Programming and Input/Output

### Exercise 2 — Personal Information Console

**Objective:** Build a program that collects and displays information about a user.

**Requirements**

- [x] Collect name, age, city, and other personal information.

- [x] Store values using appropriate data types.

- [x] Display the information in a formatted manner.

- [x] Calculate the user's age after five years.

- [x] Handle names containing spaces.

**Concepts required**

- Variables and constants.

- Primitive and reference data types.

- Type casting and conversion.

- Scanner and console input.

- String concatenation and formatting.

- Arithmetic operators.

**Done when**

- [x] All information is collected and displayed correctly.

- [x] Appropriate data types are used.

- [x] Inputs containing spaces are handled correctly.

### Exercise 3 — Smart Calculator

**Objective:** Build a calculator that supports multiple mathematical operations.

**Requirements**

- [x] Addition, subtraction, multiplication, division, and modulus.

- [x] Accept multiple operations.

- [x] Support decimal numbers.

- [x] Display meaningful results.

- [x] Prevent division by zero.

- [x] Allow the user to choose operations.

**Concepts required**

- Operators and expressions.

- Conditional statements.

- Switch statements and expressions.

- Numeric types and conversion.

- Input validation.

**Done when**

- [x] All supported operations work.

- [x] Invalid operations are handled.

- [x] Division by zero does not produce an uncontrolled failure.

---

## 3. Conditional Logic and Number Problems

### Exercise 4 — Number Analyzer

**Objective:** Build a program that analyzes numbers and identifies their mathematical properties.

**Requirements**

- [x] Check whether a number is positive, negative, or zero.

- [x] Identify even and odd numbers.

- [x] Check whether a number is prime.

- [x] Check whether a number is an Armstrong number.

- [x] Check whether a number is a palindrome.

- [x] Identify perfect numbers.

- [x] Calculate the sum of digits.

- [x] Reverse a number.

**Concepts required**

- If, else-if, and else.

- Nested conditions.

- Modulus and division.

- Loops.

- Boolean expressions.

- Methods and return values.

**Done when**

- [x] Each analysis produces correct results.

- [x] Boundary cases such as zero, negative numbers, and single-digit numbers are handled appropriately.

- [x] Individual operations are organized into reusable methods.

### Exercise 5 — Number Guessing Game

**Objective:** Create an interactive number guessing game.

**Requirements**

- [x] Generate a random number.

- [x] Accept guesses from the user.

- [x] Tell the user whether the guess is too high or too low.

- [x] Count the number of attempts.

- [x] Support a maximum attempt limit.

- [x] Allow the user to restart.

**Concepts required**

- Random number generation.

- While loops.

- Do-while loops.

- Break and continue.

- Conditional logic.

- Input validation.

**Implementation constraint**

- [x] Use both `while` and `do-while`loop.

**Done when**

- [x] The game behaves correctly for valid and invalid guesses.

- [x] The attempt count is accurate.

- [x] Restarting works.

### Exercise 6 — Iteration, Pattern and Sequence Processor

**Objective:** Build a program that generates mathematical patterns and processes numerical sequences. This exercise introduces array-based processing while combining traditional and nested iteration in one practical task.

**Requirements**

- [ ] Generate multiplication tables.

- [ ] Generate triangular number patterns.

- [ ] Generate pyramid and inverted patterns.

- [ ] Generate number sequences.

- [ ] Allow the user to select a pattern.

- [ ] Accept a sequence of numbers and store it in an array.

- [ ] Calculate sum, average, minimum, and maximum.

- [ ] Count even and odd numbers.

- [ ] Search for a particular value.

- [ ] Display values satisfying selected conditions.

**Concepts required**

- Applying traditional `for` loops and nested `for` loops already practised.

- Enhanced `for` loops.

- Arrays and array traversal.

- Iteration patterns and loop control.

- Basic searching and aggregation.

- Arithmetic expressions.

**Implementation constraints**

- [ ] Generate the requested patterns using nested loops where appropriate.

- [ ] Process the same numerical sequence using both a traditional `for` loop and an enhanced `for` loop.

- [ ] Use a selection mechanism so the user can choose which operation or pattern to run.

- [ ] Handle empty input, invalid sizes, and boundary values without producing incorrect results.

**Done when**

- [ ] All patterns are generated correctly for different sizes.

- [ ] All sequence statistics are correct.

- [ ] Searching and conditional filtering produce the expected results.

- [ ] You have implemented each required iteration style.

- [ ] You can explain when each iteration style is useful.

---

## 5. Methods and Reusable Logic

### Exercise 7 — Mathematical Utility and Recursive Problem Solver

**Objective:** Create a reusable mathematical utility library and solve selected problems using both iterative and recursive approaches.

**Requirements**

- [ ] Implement factorial.

- [ ] Implement Fibonacci calculations.

- [ ] Calculate powers.

- [ ] Find GCD and LCM.

- [ ] Implement overloaded methods for selected operations.

- [ ] Reverse a string using recursion.

- [ ] Calculate the sum of array elements using recursion.

- [ ] Implement binary search using recursion.

- [ ] Provide iterative and recursive implementations for selected problems.

**Concepts required**

- Method overloading.

- Variable scope and lifetime.

- Static and instance methods.

- Pass-by-value.

- Recursive methods.

- Base cases and recursive cases.

- Method call stack and stack overflow.

- Iterative versus recursive approaches.

- Reusable method design, parameters, and return values (apply the methods already used in earlier exercises).

**Implementation constraints**

- [ ] Organize each operation into an appropriately named reusable method.

- [ ] Use method overloading for selected operations with different parameter lists.

- [ ] Implement factorial and Fibonacci using recursion.

- [ ] Implement recursive string reversal, recursive array summation, and recursive binary search.

- [ ] Implement iterative and recursive versions of factorial and binary search so their behavior can be compared.

- [ ] Compare the behavior, readability, and limitations of the iterative and recursive solutions.

**Done when**

- [ ] All mathematical operations produce correct results.

- [ ] Methods accept appropriate parameters and return appropriate values.

- [ ] Overloaded methods work correctly.

- [ ] Recursive solutions terminate correctly and handle base cases.

- [ ] You can explain the difference between recursive and iterative solutions and identify cases where recursion is unsuitable.

---

## 6. Arrays and Data Manipulation

### Exercise 8 — Array and Matrix Management Utility

**Objective:** Build a program for managing numerical arrays and performing matrix operations. Apply the iteration techniques learned earlier to increasingly complex data structures.

**Requirements**

- [ ] Insert and update values in an array.

- [ ] Delete values.

- [ ] Sort elements.

- [ ] Find and remove duplicate values.

- [ ] Merge arrays.

- [ ] Reverse arrays.

- [ ] Work with two-dimensional arrays.

- [ ] Perform matrix addition and subtraction.

- [ ] Perform matrix multiplication.

- [ ] Calculate matrix transpose.

- [ ] Validate matrix dimensions before performing operations.

- [ ] Compare matrices for equality.

**Concepts required**

- One-dimensional and multidimensional arrays.

- Array traversal and copying.

- Sorting and array manipulation.

- Matrix dimensions and valid dimension combinations.

- Basic algorithm complexity.

- Applying nested iteration to multidimensional data.

- Methods for separating array and matrix operations.

**Done when**

- [ ] All array operations work correctly.

- [ ] Empty arrays and invalid indexes are handled.

- [ ] Sorting and array manipulation produce correct results.

- [ ] Matrix operations work for valid dimensions.

- [ ] Invalid matrix dimension combinations are rejected.

- [ ] You can explain the time and space implications of the implemented operations.

---

## 7. Strings and Text Processing

### Exercise 9 — Text Analyzer

**Objective:** Build a program that analyzes text entered by a user.

**Requirements**

- [ ] Count characters, words, and sentences.

- [ ] Count vowels and consonants.

- [ ] Reverse text.

- [ ] Check for palindromes.

- [ ] Find repeated characters.

- [ ] Find the most frequently occurring character.

- [ ] Remove duplicate characters.

- [ ] Compare two strings.

**Concepts required**

- String class.

- String methods.

- String immutability.

- StringBuilder.

- Character processing.

**Done when**

- [ ] Text analysis produces correct results.

- [ ] Empty strings and spaces are handled.

- [ ] String comparisons are performed correctly.

---

# Phase 2: Object-Oriented Programming

**Objective:** Learn to design applications using classes, objects, responsibilities, and relationships rather than writing everything in a single program.

## 1. Banking Application

### Exercise 10 — Bank Account Simulator

**Requirements**

- [ ] Create multiple bank accounts.

- [ ] Support deposits and withdrawals.

- [ ] Maintain account balances.

- [ ] Prevent overdrafts.

- [ ] Display account information.

- [ ] Track transactions.

- [ ] Support account creation and closure.

**Concepts required**

- Classes and objects.

- Fields and methods.

- Constructors.

- Constructor overloading.

- `this` keyword.

- Static and instance members.

- Access modifiers.

- Encapsulation.

- Object references.

**Done when**

- [ ] Multiple accounts can operate independently.

- [ ] Account data cannot be modified through uncontrolled access.

- [ ] Account operations follow the specified rules.

## 2. Object Relationships

### Exercise 11 — Library Management System

**Requirements**

- [ ] Manage books and members.

- [ ] Issue and return books.

- [ ] Track borrowing records.

- [ ] Prevent issuing unavailable books.

- [ ] Maintain member borrowing history.

- [ ] Search books by title, author, and identifier.

**Concepts required**

- Association.

- Aggregation.

- Composition.

- Encapsulation.

- Constructors.

- Object references.

- Collections.

- Enums.

**Done when**

- [ ] Relationships between books, members, and borrowing records are correctly represented.

- [ ] Business rules are enforced.

- [ ] Responsibilities are separated across appropriate classes.

## 3. Inheritance and Polymorphism

### Exercise 12 — Employee Management System

**Requirements**

- [ ] Support different employee types.

- [ ] Store employee information.

- [ ] Calculate salaries according to employee type.

- [ ] Generate employee reports.

- [ ] Apply different rules to different employee categories.

**Concepts required**

- Inheritance.

- Method overriding.

- Polymorphism.

- Abstract classes.

- Interfaces.

- `super` keyword.

- `final` keyword.

- Upcasting and downcasting.

**Done when**

- [ ] Different employee types can be handled through common abstractions.

- [ ] Specialized behavior is implemented without unnecessary duplication.

- [ ] You can explain when inheritance is appropriate.

## 4. Interfaces and Composition

### Exercise 13 — Payment Processing Simulator

**Requirements**

- [ ] Support multiple payment methods.

- [ ] Process payments through a common interface.

- [ ] Support payment validation.

- [ ] Generate transaction receipts.

- [ ] Add a new payment method without rewriting existing payment logic.

**Concepts required**

- Applying interfaces, abstract classes, and polymorphism practised in the employee-management exercise.

- Composition and object collaboration.

- Dependency inversion fundamentals.

- Default and static interface methods (optional extension).

**Done when**

- [ ] Different payment implementations can be substituted.

- [ ] The main payment workflow does not depend on specific implementations.

## 5. Object Design and Equality

### Exercise 14 — Custom Domain Model

**Requirements**

- [ ] Create a set of domain classes for an application of your choice.

- [ ] Implement meaningful object equality.

- [ ] Provide readable object representations.

- [ ] Implement immutable value objects and keep them immutable where their role requires it.

**Concepts required**

- Object class.

- `toString()`.

- `equals()` and `hashCode()`.

- Immutable objects.

- Object immutability and defensive design.

**Done when**

- [ ] Object equality behaves correctly.

- [ ] Immutable objects cannot be modified after creation.

- [ ] Object representations are useful for debugging.

---

# Phase 3: Core Java and Standard Libraries

**Objective:** Become comfortable using Java's standard libraries to build reliable, maintainable applications.

## 1. Exception Handling

### Exercise 15 — Reliable Banking Application

Extend the banking application to handle invalid operations safely.

**Requirements**

- [ ] Handle invalid input.

- [ ] Prevent invalid deposits and withdrawals.

- [ ] Handle missing accounts.

- [ ] Handle insufficient funds.

- [ ] Create meaningful custom exceptions.

- [ ] Ensure resources are closed properly.

**Concepts required**

- Exception and Error hierarchy.

- Checked and unchecked exceptions.

- Try, catch, and finally.

- Multiple catch blocks.

- Throw and throws.

- Custom exceptions.

- Exception propagation.

- Try-with-resources.

**Done when**

- [ ] Invalid operations produce meaningful errors.

- [ ] Exceptions are handled at appropriate boundaries.

- [ ] Resources are released safely.

## 2. Collections Framework

### Exercise 16 — Collection and Data Structure Management

**Objective:** Apply the Collections Framework to existing domain data and solve practical problems using the major Java collection categories and common data structures.

**Requirements**

- [ ] Reuse records from the library or employee applications as the working dataset rather than building another CRUD application.

- [ ] Store and retrieve records using suitable List, Set, and Map implementations.

- [ ] Prevent duplicate records and support efficient lookup.

- [ ] Sort and filter records using appropriate collection operations.

- [ ] Preserve insertion or sorted order where required.

- [ ] Implement a stack-based problem.

- [ ] Implement a queue-based problem.

- [ ] Use a priority queue for task scheduling.

- [ ] Implement an LRU cache.

- [ ] Compare different collection implementations.

- [ ] Solve selected searching and sorting problems.

**Concepts required**

- Iterable and Collection.

- List, ArrayList, and LinkedList.

- Set, HashSet, LinkedHashSet, and TreeSet.

- Map, HashMap, LinkedHashMap, and TreeMap.

- Queue and Deque.

- PriorityQueue.

- Iterator and ListIterator.

- Comparable and Comparator.

- Collections utility class.

- Hashing and HashMap internal working.

- Collision handling.

- Time and space complexity.

- ConcurrentHashMap awareness.

**Implementation constraints**

- [ ] Use a List implementation to store the selected working dataset.

- [ ] Use a Set or Map to enforce uniqueness or support efficient lookup.

- [ ] Demonstrate ordering requirements using suitable collection implementations.

- [ ] Solve stack, queue, and priority-queue problems using the appropriate data structures.

- [ ] Implement an LRU cache and explain the role of its underlying data structures.

- [ ] Use iterators and comparators where appropriate.

**Done when**

- [ ] Existing domain records can be stored, searched, sorted, and filtered correctly.

- [ ] You have practically used the major collection categories.

- [ ] You can select collections based on ordering, uniqueness, and access requirements.

- [ ] Stack, queue, priority-queue, and LRU cache implementations behave correctly.

- [ ] You understand the performance trade-offs of common collections and can explain the complexity of key operations.

---

## 3. Generics

### Exercise 17 — Generic Utility Library

**Requirements**

- [ ] Implement a generic Pair class.

- [ ] Implement generic utility methods.

- [ ] Implement a generic data structure such as a stack or bounded collection.

- [ ] Support bounded types where appropriate.

**Concepts required**

- Generic classes.

- Generic methods.

- Generic interfaces.

- Bounded type parameters.

- Wildcards.

- Upper and lower bounds.

- Type erasure.

- Generic type safety.

**Done when**

- [ ] Generic components work with different data types.

- [ ] Type safety is maintained.

- [ ] Wildcards and bounds are used appropriately.

## 4. Functional Programming and Streams

### Exercise 18 — Employee Data Processing Application

**Requirements**

- [ ] Reuse the employee model and sample data from the employee-management exercise.

- [ ] Maintain and process a collection of employees.

- [ ] Filter employees by department.

- [ ] Sort by salary and name.

- [ ] Calculate average salary.

- [ ] Group employees by department.

- [ ] Find the highest-paid employee.

- [ ] Generate summary reports.

**Concepts required**

- Functional interfaces.

- Lambda expressions.

- Method references.

- Predicate.

- Function.

- Consumer.

- Supplier.

- Optional.

- Stream API.

- Intermediate and terminal operations.

- Filter, map, and flatMap.

- Sorting and reduction.

- Collectors.

- Grouping and partitioning.

**Implementation constraint**

- [ ] Implement selected operations using traditional loops.

- [ ] Reimplement them using streams.

- [ ] Compare readability and suitability.

**Done when**

- [ ] Collection transformations work correctly.

- [ ] Streams are used appropriately.

- [ ] You understand when a normal loop is preferable.

## 5. Modern Java Features

### Exercise 19 — Apply Modern Java Features to Existing Code

**Requirements**

- [ ] Apply modern Java features to relevant classes in the earlier applications.

- [ ] Replace suitable data-holder classes with records.

- [ ] Use switch expressions where appropriate.

- [ ] Use pattern matching where useful.

- [ ] Introduce sealed classes for a restricted hierarchy.

- [ ] Use text blocks for multiline content.

- [ ] Use the Java Date and Time API for date-related operations.

**Concepts required**

- Records.

- Sealed classes.

- Switch expressions.

- Pattern matching.

- Text blocks.

- Local variable type inference.

- Applying interface features practised in the OOP phase where appropriate.

- Date and Time API.

**Done when**

- [ ] Modern Java features are used where they improve the implementation.

- [ ] Existing behavior is preserved.

## 6. File Handling and I/O

### Exercise 20 — File-Based Data Management System

**Requirements**

- [ ] Store application records in files.

- [ ] Read and update existing records.

- [ ] Import and export CSV data.

- [ ] Read and write JSON.

- [ ] Maintain application configuration using properties files.

- [ ] Handle missing and corrupted files.

**Concepts required**

- File and Path APIs.

- FileInputStream and FileOutputStream.

- FileReader and FileWriter.

- BufferedReader and BufferedWriter.

- Java NIO and NIO.2.

- Resource management.

- Serialization and deserialization.

- JSON processing.

**Done when**

- [ ] Data can be read and written reliably.

- [ ] File errors are handled.

- [ ] Resources are managed safely.

## 7. Concurrency and Multithreading

### Exercise 21 — Concurrent File Processor

**Requirements**

- [ ] Process multiple files concurrently.

- [ ] Compare sequential and concurrent execution.

- [ ] Track processing results.

- [ ] Handle task failures.

- [ ] Prevent unsafe shared-state modification.

**Concepts required**

- Processes and threads.

- Thread lifecycle.

- Thread and Runnable.

- Callable and Future.

- ExecutorService.

- Thread pools.

- Synchronization.

- Race conditions.

- Atomic variables.

- Volatile.

- Locks and ReentrantLock.

### Exercise 22 — Producer-Consumer System

**Requirements**

- [ ] Implement producers generating tasks.

- [ ] Implement consumers processing tasks.

- [ ] Maintain a shared task queue.

- [ ] Prevent race conditions.

- [ ] Handle shutdown safely.

- [ ] Compare different concurrency approaches.

**Concepts required**

- BlockingQueue.

- Concurrent collections.

- Deadlocks.

- Thread safety.

- Java Memory Model.

- Basic awareness of CompletableFuture and virtual threads (implementation is optional).

**Done when**

- [ ] Concurrent tasks execute correctly.

- [ ] Shared data is protected.

- [ ] You can identify race conditions and deadlocks.

- [ ] You understand when concurrency is useful.

## 8. JVM and Runtime Exploration

### Exercise 23 — Java Runtime Investigation

**Requirements**

- [ ] Inspect JVM memory usage.

- [ ] Observe object allocation and lifecycle.

- [ ] Explore garbage collection logs.

- [ ] Investigate a memory leak.

- [ ] Profile an application.

- [ ] Observe application behavior under different JVM options.

**Concepts required**

- JVM architecture.

- Class loading.

- Bytecode.

- Stack and heap.

- Garbage collection.

- Strong references and object reachability.

- JIT compilation.

- JVM arguments.

- Monitoring and profiling.

**Done when**

- [ ] You can explain the Java execution lifecycle.

- [ ] You can inspect basic JVM runtime information.

- [ ] You can identify basic memory and performance problems.

- [ ] You can describe weak, soft, and phantom references at a high level; implementing them is optional.

## 9. Additional Java Platform Features

### Exercise 24 — Annotations and Reflection

**Requirements**

- [ ] Create and use a custom annotation.

- [ ] Inspect class metadata using reflection.

- [ ] Use reflection to inspect constructors, methods, and fields of selected classes.

**Concepts required**

- Annotations and custom annotations.

- Reflection API.

- Runtime class metadata and reflective access.

**Done when**

- [ ] You have used these APIs in practical examples.

- [ ] You understand their common use cases and limitations.

Socket programming, internationalization, Java modules (JPMS), and advanced reflection are optional explorations rather than prerequisites for Spring Boot. Do not build a custom dependency-injection or serialization framework for this exercise.

---

# Phase 4: Java Tools, Testing and Engineering Practices

**Objective:** Learn to manage Java projects professionally, debug applications, automate builds, and verify application behavior.

## 1. Git and Maven

### Exercise 25 — Convert Existing Java Projects into Maven Projects

**Requirements**

- [ ] Convert an existing Java project into a Maven project.

- [ ] Configure dependencies.

- [ ] Organize source and test directories.

- [ ] Build the application.

- [ ] Package an executable JAR.

- [ ] Run the packaged application.

**Concepts required**

- Maven project structure.

- `pom.xml`.

- Dependencies and dependency scopes.

- Maven lifecycle.

- Maven plugins.

- JAR packaging.

- Build automation.

**Done when**

- [ ] The application builds independently of the IDE.

- [ ] Dependencies are managed through Maven.

- [ ] The packaged application runs successfully.

### Optional Reference — Git Workflow

Basic Git use is already familiar. Continue using Git for normal project version control; use this section only if you need to practise a specific collaboration workflow. It is not a prerequisite for progressing through the Java exercises.

**Requirements**

- [ ] Manage a project using Git.

- [ ] Create feature branches.

- [ ] Merge changes.

- [ ] Resolve merge conflicts.

- [ ] Create releases using tags.

- [ ] Use pull requests and code reviews.

**Concepts required**

- Git commits.

- Branching and merging.

- Pull requests.

- Merge conflict resolution.

- Tags and releases.

- Repository management.

**Done when**

- [ ] You can manage a project using a normal Git workflow.

## 2. Debugging and Code Quality

### Exercise 26 — Debug and Refactor an Existing Application

**Requirements**

- [ ] Work with a deliberately poorly structured application.

- [ ] Find and fix existing bugs.

- [ ] Identify duplicated logic.

- [ ] Improve class responsibilities.

- [ ] Improve method names and organization.

- [ ] Refactor without breaking existing behavior.

**Concepts required**

- VS Code debugger.

- Breakpoints and watches.

- Clean code.

- SOLID principles.

- Basic design patterns.

- UML and class diagrams.

**Done when**

- [ ] Bugs are identified and fixed.

- [ ] The application is easier to understand and maintain.

- [ ] Existing behavior remains correct.

## 3. Automated Testing

### Exercise 27 — Build a Test Suite for Existing Applications

**Requirements**

- [ ] Write tests for the banking application.

- [ ] Test successful operations.

- [ ] Test invalid operations.

- [ ] Test boundary conditions.

- [ ] Test custom exceptions.

- [ ] Use parameterized tests.

- [ ] Generate a test coverage report.

**Concepts required**

- Testing fundamentals.

- Unit testing.

- JUnit 5.

- Assertions.

- Test lifecycle.

- Parameterized tests.

- Test coverage.

- Test-driven development fundamentals.

### Exercise 28 — Test Applications with Dependencies

**Requirements**

- [ ] Test service classes with dependencies.

- [ ] Mock external dependencies.

- [ ] Test success and failure scenarios.

- [ ] Write integration tests.

- [ ] Test database interactions where applicable.

**Concepts required**

- Mockito.

- Mocking and stubbing.

- Dependency isolation.

- Integration testing.

- Test fixtures.

**Done when**

- [ ] You can independently write unit and integration tests.

- [ ] External dependencies can be isolated where appropriate.

- [ ] Both successful and failed execution paths are tested.

### Optional: Gradle

Maven is the primary build tool for this roadmap. Explore Gradle after becoming comfortable with Maven.

**Concepts to explore:** `build.gradle`, dependency management, build lifecycle, plugins, Maven versus Gradle.

---

# TRACK 2: BACKEND DEVELOPMENT

# Phase 5: SQL, Databases and JDBC

**Objective:** Understand relational databases and learn to interact with them directly from Java before introducing ORM frameworks.

## 1. SQL and Database Design

### Exercise 29 — Design a Library Database

**Requirements**

- [ ] Design tables for books, authors, members, and borrowing records.

- [ ] Define primary and foreign keys.

- [ ] Add appropriate constraints.

- [ ] Model relationships.

- [ ] Prevent invalid data.

- [ ] Insert realistic sample data.

**Concepts required**

- Relational database fundamentals.

- Tables, rows, and columns.

- Primary and foreign keys.

- SQL data types.

- Constraints.

- One-to-one, one-to-many, and many-to-many relationships.

- Database normalization.

- PostgreSQL.

**Done when**

- [ ] The schema represents the requirements correctly.

- [ ] Referential integrity is maintained.

- [ ] Invalid data is rejected.

### Exercise 30 — SQL Query Practice

**Requirements**

Write queries that:

- [ ] Retrieve records using filters.

- [ ] Sort and paginate results.

- [ ] Join related tables.

- [ ] Calculate aggregates.

- [ ] Group and filter grouped results.

- [ ] Use subqueries.

- [ ] Use Common Table Expressions.

- [ ] Find missing and duplicate records.

- [ ] Generate business reports.

**Concepts required**

- SELECT, INSERT, UPDATE, DELETE.

- WHERE and ORDER BY.

- GROUP BY and HAVING.

- Aggregate functions.

- INNER, LEFT, RIGHT, and other joins.

- Subqueries.

- Common Table Expressions.

- PostgreSQL functions.

**Done when**

- [ ] You can independently write queries that satisfy realistic requirements.

- [ ] You understand the results produced by different joins and aggregations.

### Exercise 31 — Database Performance and Transactions

**Requirements**

- [ ] Add indexes to selected tables.

- [ ] Inspect query execution plans.

- [ ] Compare queries before and after indexing.

- [ ] Implement multi-step transactions.

- [ ] Simulate transaction failures.

- [ ] Investigate concurrent updates.

**Concepts required**

- Indexes.

- Query plans.

- EXPLAIN and EXPLAIN ANALYZE.

- ACID properties.

- Transactions.

- Isolation levels.

- Locking.

- Query optimization.

**Done when**

- [ ] Transactions preserve data consistency.

- [ ] You can interpret basic query plans.

- [ ] You understand common indexing and transaction trade-offs.

## 2. JDBC

### Exercise 32 — Java Database-Backed Management Application

**Requirements**

- [ ] Connect a Java application to PostgreSQL.

- [ ] Perform CRUD operations.

- [ ] Search and filter records.

- [ ] Execute parameterized queries.

- [ ] Handle SQL errors.

- [ ] Manage transactions.

- [ ] Ensure database connections are closed correctly.

**Concepts required**

- JDBC architecture.

- JDBC drivers.

- Connection.

- Statement and PreparedStatement.

- ResultSet.

- SQL injection prevention.

- JDBC transactions.

- Connection pooling.

- HikariCP fundamentals.

**Done when**

- [ ] The Java application can independently interact with PostgreSQL.

- [ ] SQL queries use parameters safely.

- [ ] Transactions and connections are managed correctly.

---

# Phase 6: Spring and Spring Boot

**Objective:** Learn to build backend applications using the Spring ecosystem and expose functionality through REST APIs.

## 1. Spring Framework Fundamentals

### Exercise 33 — Build an Application Using Spring Core

**Requirements**

- [ ] Create a small application with multiple components.

- [ ] Separate application responsibilities.

- [ ] Inject dependencies between components.

- [ ] Configure beans.

- [ ] Experiment with different bean scopes.

- [ ] Compare manual configuration and component scanning.

**Concepts required**

- Spring Framework.

- Inversion of Control.

- Dependency Injection.

- Spring Beans.

- Bean lifecycle.

- ApplicationContext.

- Component scanning.

- Configuration classes.

- Bean scopes.

- Spring annotations.

- Aspect-Oriented Programming fundamentals.

**Done when**

- [ ] Components are managed by Spring.

- [ ] Dependencies are injected correctly.

- [ ] You understand how Spring creates and manages beans.

## 2. Spring Boot Application

### Exercise 34 — Build a Spring Boot Application

**Requirements**

- [ ] Create a Spring Boot project.

- [ ] Configure dependencies.

- [ ] Organize application packages.

- [ ] Configure application properties.

- [ ] Support multiple environments.

- [ ] Configure logging.

- [ ] Expose application health information.

- [ ] Package and run the application.

**Concepts required**

- Spring Initializr.

- Spring Boot architecture.

- Auto-configuration.

- Starter dependencies.

- Application properties and YAML.

- Configuration properties.

- Profiles.

- Externalized configuration.

- Spring Boot Actuator.

**Done when**

- [ ] The application starts independently.

- [ ] Configuration changes work across environments.

- [ ] Health information is accessible.

## 3. REST API Development

### Exercise 35 — Build a Task Management REST API

**Requirements**

- [ ] Create, retrieve, update, and delete tasks.

- [ ] Retrieve tasks by ID.

- [ ] Filter tasks by status.

- [ ] Search tasks.

- [ ] Support pagination and sorting.

- [ ] Validate incoming requests.

- [ ] Return appropriate HTTP status codes.

- [ ] Handle errors consistently.

- [ ] Document the API.

**Concepts required**

- HTTP and HTTPS.

- REST architecture.

- HTTP methods and status codes.

- Request and response headers.

- JSON.

- REST controllers.

- RequestBody and ResponseBody.

- PathVariable and RequestParam.

- DTOs.

- Request validation.

- Global exception handling.

- Pagination and sorting.

- Filtering and searching.

- OpenAPI and Swagger.

- CORS.

**Done when**

- [ ] All endpoints work as specified.

- [ ] Invalid requests return meaningful errors.

- [ ] API documentation accurately describes the endpoints.

- [ ] API behavior is tested.

---

# Phase 7: Persistence and Backend Security

**Objective:** Build database-backed backend applications and secure them using standard authentication and authorization mechanisms.

## 1. Spring Data JPA and Hibernate

### Exercise 36 — Convert the Task API into a Database-Backed Application

**Requirements**

- [ ] Integrate PostgreSQL.

- [ ] Persist tasks.

- [ ] Implement repository operations.

- [ ] Model relationships between users and tasks.

- [ ] Support filtering and pagination.

- [ ] Implement database migrations.

- [ ] Handle transaction boundaries.

**Concepts required**

- ORM fundamentals.

- JPA versus Hibernate.

- Entities and entity lifecycle.

- Spring Data repositories.

- Derived query methods.

- JPQL.

- Native SQL queries.

- One-to-one relationships.

- One-to-many relationships.

- Many-to-one relationships.

- Many-to-many relationships.

- Lazy and eager loading.

- Cascading and orphan removal.

- Transactions.

- Flyway or Liquibase.

**Done when**

- [ ] Application data persists in PostgreSQL.

- [ ] Relationships are correctly represented.

- [ ] Repository queries work as required.

- [ ] Schema changes are managed through migrations.

### Exercise 37 — Investigate ORM Performance

**Requirements**

- [ ] Identify unnecessary database queries.

- [ ] Reproduce an N+1 query problem.

- [ ] Investigate lazy and eager loading.

- [ ] Improve selected queries.

- [ ] Compare query counts and execution behavior.

**Concepts required**

- Hibernate SQL generation.

- Lazy and eager loading.

- N+1 problem.

- Fetch joins.

- Entity graphs.

- Transaction boundaries in ORM-managed operations.

- Applying database indexing and query-plan knowledge from the SQL phase.

**Done when**

- [ ] You can identify basic ORM performance problems.

- [ ] You can choose appropriate fetching strategies.

## 2. Authentication and Authorization

### Exercise 38 — User Authentication System

**Requirements**

- [ ] Implement user registration.

- [ ] Implement login.

- [ ] Implement either session-based authentication or JWT authentication, then explain the trade-offs of the alternative.

- [ ] Store passwords securely.

- [ ] Authenticate users.

- [ ] Implement logout or token invalidation where applicable.

- [ ] Handle invalid credentials.

- [ ] Prevent unauthorized access.

**Concepts required**

- Authentication and authorization.

- Spring Security architecture.

- Security filters.

- Password hashing.

- Session-based authentication.

- JWT authentication.

- Security configuration.

- CORS and CSRF.

- Authentication best practices.

**Done when**

- [ ] Users can authenticate securely.

- [ ] Passwords are never stored as plaintext.

- [ ] Protected endpoints reject unauthenticated requests.

### Exercise 39 — Role-Based Access Control

**Requirements**

- [ ] Support multiple roles.

- [ ] Restrict selected operations to administrators.

- [ ] Allow users to access only their permitted resources.

- [ ] Prevent users from accessing another user's private data.

- [ ] Test authorization failures.

**Concepts required**

- Role-based access control.

- Authorities and roles.

- Method-level security.

- Authorization rules.

- JWT claims where applicable.

**Done when**

- [ ] Access restrictions are enforced consistently.

- [ ] Both role-level and resource-level authorization work.

### Exercise 40 — OAuth2 and OpenID Connect Integration

**Requirements**

- [ ] Integrate an external identity provider.

- [ ] Authenticate using an OAuth2/OIDC flow.

- [ ] Configure a resource server.

- [ ] Validate incoming tokens.

- [ ] Protect API endpoints.

**Concepts required**

- OAuth 2.0 fundamentals.

- OpenID Connect.

- Authorization code flow.

- Access and refresh tokens.

- Resource server configuration.

- Token validation.

- Identity provider integration.

**Done when**

- [ ] The application can authenticate through an external identity provider.

- [ ] Protected APIs validate tokens correctly.

---

# Phase 8: Backend Engineering and Architecture

**Objective:** Move beyond implementing endpoints and learn to design maintainable, scalable, and reliable backend systems.

## 1. Application Architecture

### Exercise 41 — Refactor a Growing Backend Application

**Requirements**

- [ ] Start with a working backend application.

- [ ] Separate controllers, services, and repositories.

- [ ] Separate API DTOs from persistence entities.

- [ ] Organize business logic.

- [ ] Reduce coupling.

- [ ] Introduce appropriate abstractions.

- [ ] Document the application structure.

**Concepts required**

- Layered architecture.

- Controller-Service-Repository pattern.

- DTO and entity separation.

- Clean architecture fundamentals.

- Dependency inversion in a backend application.

- Backend-specific application boundaries and dependency direction.

- Applying SOLID principles, design patterns, and class-design techniques practised earlier.

- UML and class diagrams for backend components.

**Done when**

- [ ] Application responsibilities are clearly separated.

- [ ] Business logic is not unnecessarily coupled to HTTP or persistence.

- [ ] The architecture remains understandable as features grow.

## 2. Caching

### Exercise 42 — Add Caching to an Existing Backend

**Requirements**

- [ ] Identify frequently requested data.

- [ ] Cache selected responses.

- [ ] Handle cache expiration.

- [ ] Update or invalidate cached data after changes.

- [ ] Compare behavior with and without caching.

**Concepts required**

- Caching fundamentals.

- Cache-aside pattern.

- TTL.

- Cache invalidation.

- Redis.

- Spring Cache abstraction.

- Cache consistency.

**Done when**

- [ ] Caching reduces unnecessary database access.

- [ ] Stale data is handled according to defined requirements.

## 3. Asynchronous Processing and Messaging

### Exercise 43 — Background Task Processing

**Requirements**

- [ ] Move long-running operations out of synchronous request handling.

- [ ] Process background tasks.

- [ ] Track task status.

- [ ] Handle failures.

- [ ] Retry eligible tasks.

- [ ] Avoid processing the same task multiple times where required.

**Concepts required**

- Applying asynchronous processing concepts from the Java concurrency exercises.

- Spring asynchronous execution.

- In-process background task lifecycle.

- Retry mechanisms and retry eligibility.

- Idempotency and duplicate-task prevention.

- Tracking task state and handling task failures.

### Exercise 44 — Build a Kafka-Based Event Processing System

**Requirements**

- [ ] Create a producer.

- [ ] Create a consumer.

- [ ] Publish events when business operations occur.

- [ ] Process events asynchronously.

- [ ] Handle failed messages.

- [ ] Demonstrate consumer recovery.

- [ ] Prevent duplicate processing where appropriate.

**Concepts required**

- Messaging fundamentals.

- Kafka topics.

- Producers and consumers.

- Partitions.

- Consumer groups.

- Offsets.

- Message serialization.

- Delivery semantics.

- Idempotent processing.

**Done when**

- [ ] Events are published and consumed correctly.

- [ ] Consumer failures are handled.

- [ ] You understand the trade-offs of asynchronous communication.

## 4. Scheduled Jobs

### Exercise 45 — Scheduled Processing System

**Requirements**

- [ ] Schedule recurring tasks.

- [ ] Process pending records.

- [ ] Handle failures.

- [ ] Prevent unintended duplicate execution.

- [ ] Record execution history.

**Concepts required**

- Scheduled jobs.

- Spring scheduling.

- Cron expressions.

- Background execution.

- Concurrency considerations.

## 5. API Reliability and Advanced Backend Features

### Exercise 46 — Harden an Existing REST API

**Requirements**

- [ ] Implement request rate limiting.

- [ ] Implement idempotency for selected operations.

- [ ] Add appropriate timeout and retry behavior for outbound service calls.

- [ ] Implement resilience for external service failures.

**Concepts required**

- Rate limiting.

- Idempotency keys and request deduplication.

- Timeouts and retries for outbound calls.

- Resilience and fault tolerance.

- Circuit breakers.

- Concurrency.

- HTTP caching.

- API reliability.

## 6. Real-Time Communication

### Exercise 47 — Build a Real-Time Notification Feature

**Requirements**

- [ ] Notify users about selected application events.

- [ ] Support real-time communication.

- [ ] Handle disconnected clients.

- [ ] Support multiple users.

- [ ] Define appropriate event formats.

**Concepts required**

- WebSockets.

- HTTP versus WebSocket.

- Connection lifecycle.

- Event-driven communication.

- Basic real-time system design.

## 7. Distributed Systems and Microservices

### Exercise 48 — Split an Existing Application into Services

**Requirements**

- [ ] Identify separate business capabilities.

- [ ] Split a suitable application into multiple services.

- [ ] Define service APIs.

- [ ] Implement service-to-service communication.

- [ ] Handle service failures.

- [ ] Consider data ownership.

- [ ] Document the architecture.

**Concepts required**

- Distributed systems fundamentals.

- Microservices fundamentals.

- Service boundaries.

- Service-to-service communication.

- Synchronous versus asynchronous communication.

- Distributed failure.

- Resilience.

- Data consistency.

- Observability.

**Done when**

- [ ] You can explain the trade-offs between a monolith and microservices.

- [ ] Services have clear responsibilities.

- [ ] Failure scenarios are considered.

Microservices should come after you have built and understood a well-structured monolithic application. Do not introduce distributed complexity without a genuine reason.

## 8. Observability and Performance

### Exercise 49 — Monitor and Investigate a Backend Application

**Requirements**

- [ ] Collect and interpret application metrics.

- [ ] Trace a request across relevant application components.

- [ ] Investigate slow endpoints.

- [ ] Identify expensive database queries.

- [ ] Investigate an application failure using logs and metrics.

**Concepts required**

- Application metrics and metric interpretation.

- Distributed tracing fundamentals.

- Spring Boot Actuator metrics and observation endpoints.

- Observability across application components.

- Performance profiling.

- Query optimization.

- Error tracking and correlation of evidence across logs and metrics.

**Done when**

- [ ] You can investigate basic application failures.

- [ ] You can identify performance bottlenecks.

- [ ] Application health and important metrics are observable.

---

# Phase 9: Deployment and Production Practices

**Objective:** Learn to package, containerize, deploy, and operate backend applications.

## 1. Linux and Application Packaging

### Exercise 50 — Operate a Java Application Outside the IDE

**Requirements**

- [ ] Run the Spring Boot executable JAR produced in the earlier build exercises.

- [ ] Configure environment variables.

- [ ] Configure application profiles.

- [ ] Inspect application logs.

- [ ] Stop and restart the application.

**Concepts required**

- Running and operating an existing executable JAR.

- Linux fundamentals.

- Environment variables.

- Secrets and configuration.

- Process management.

- Application logging.

## 2. Docker

### Exercise 51 — Containerize a Backend Application

**Requirements**

- [ ] Create a Dockerfile.

- [ ] Build a Docker image.

- [ ] Run the application in a container.

- [ ] Configure environment variables.

- [ ] Persist required data.

- [ ] Connect the application to PostgreSQL.

**Concepts required**

- Docker fundamentals.

- Images and containers.

- Dockerfiles.

- Container networking.

- Volumes.

- Environment configuration.

### Exercise 52 — Docker Compose Application Environment

**Requirements**

- [ ] Run the backend application and PostgreSQL using Docker Compose.

- [ ] Configure service networking.

- [ ] Configure persistent database storage.

- [ ] Manage environment-specific configuration.

- [ ] Start and stop the environment.

**Concepts required**

- Docker Compose.

- Service definitions.

- Networks.

- Volumes.

- Container dependencies.

- Database containerization.

## 3. CI/CD

### Exercise 53 — Automate the Build and Test Pipeline

**Requirements**

- [ ] Trigger a pipeline on code changes.

- [ ] Build the application.

- [ ] Run automated tests.

- [ ] Package the application.

- [ ] Report failed builds.

- [ ] Prevent deployment when required checks fail.

**Concepts required**

- CI/CD fundamentals.

- GitHub Actions.

- Workflow files.

- Build automation.

- Automated testing.

- Artifact management.

## 4. Deployment

### Exercise 54 — Deploy a Backend Application

**Requirements**

- [ ] Deploy a backend application to a cloud or hosting environment.

- [ ] Configure environment variables and secrets.

- [ ] Connect a database.

- [ ] Expose the API.

- [ ] Configure health checks.

- [ ] Verify application behavior after deployment.

**Concepts required**

- Cloud deployment fundamentals.

- Application hosting.

- Environment configuration.

- Database connectivity.

- Networking and ports.

- Health checks.

## 5. Production Troubleshooting

### Exercise 55 — Investigate Production-Like Failures

**Requirements**

- [ ] Investigate an application startup failure.

- [ ] Diagnose a database connectivity issue.

- [ ] Investigate a failed API request.

- [ ] Identify a slow endpoint.

- [ ] Investigate resource usage.

- [ ] Recover an application after a failure.

**Concepts required**

- Production logging.

- Error tracking.

- Monitoring.

- Health checks.

- Performance profiling.

- Troubleshooting.

- Resource management.

---

# TRACK 3: INDEPENDENT BACKEND PROJECTS

The exercises above introduce individual concepts and techniques. These projects bring them together.

Project requirements should describe what needs to be built, not prescribe every class, method, or implementation detail.

Use the concepts you've practised to make your own design decisions.

## Beginner Projects

### Project 1 — Console Banking Application

**Requirements**

- [ ] Create and manage bank accounts.

- [ ] Deposit and withdraw funds.

- [ ] Transfer money between accounts.

- [ ] Track transaction history.

- [ ] Support different account types.

- [ ] Validate operations.

- [ ] Handle invalid inputs and business-rule violations.

**Suggested concepts:** Java fundamentals, OOP, collections, exceptions, methods, file I/O.

### Project 2 — Student Management System

**Requirements**

- [ ] Register students.

- [ ] Manage courses.

- [ ] Enroll students in courses.

- [ ] Track marks and grades.

- [ ] Generate student reports.

- [ ] Search and filter student records.

**Suggested concepts:** OOP, collections, interfaces, sorting, file handling.

### Project 3 — Library Management System

**Requirements**

- [ ] Manage books and members.

- [ ] Issue and return books.

- [ ] Track borrowing history.

- [ ] Search and filter books.

- [ ] Prevent invalid borrowing operations.

- [ ] Generate reports.

**Suggested concepts:** OOP, object relationships, collections, exceptions, persistence.

## Intermediate Projects

### Project 4 — Task Management REST API

**Requirements**

- [ ] User registration and authentication.

- [ ] Create, update, retrieve, and delete tasks.

- [ ] Assign tasks to users.

- [ ] Support task statuses and priorities.

- [ ] Implement filtering and pagination.

- [ ] Restrict access to user-owned tasks.

- [ ] Write automated tests.

- [ ] Document APIs.

**Suggested concepts:** Spring Boot, REST, PostgreSQL, JPA, Spring Security, validation, testing.

### Project 5 — Expense Tracker Backend

**Requirements**

- [ ] Manage users and expenses.

- [ ] Categorize expenses.

- [ ] Support income and expense records.

- [ ] Generate monthly and yearly summaries.

- [ ] Filter transactions by date and category.

- [ ] Generate spending reports.

**Suggested concepts:** SQL, JPA, aggregations, REST APIs, authentication, testing.

### Project 6 — Inventory Management System

**Requirements**

- [ ] Manage products and categories.

- [ ] Track inventory levels.

- [ ] Record stock additions and removals.

- [ ] Maintain inventory history.

- [ ] Prevent invalid stock operations.

- [ ] Support multiple users and roles.

- [ ] Generate inventory reports.

**Suggested concepts:** Database design, transactions, JPA, SQL, authorization.

### Project 7 — Blog Management Backend

**Requirements**

- [ ] Manage users and posts.

- [ ] Support categories and tags.

- [ ] Implement comments.

- [ ] Support search and pagination.

- [ ] Implement authorization.

- [ ] Maintain post publication status.

**Suggested concepts:** REST, JPA relationships, security, SQL, validation.

## Advanced Projects

### Project 8 — E-commerce Backend

**Requirements**

- [ ] Manage users and products.

- [ ] Support product categories.

- [ ] Implement shopping carts.

- [ ] Create orders.

- [ ] Manage order status.

- [ ] Implement inventory updates.

- [ ] Integrate a payment provider or payment simulation.

- [ ] Handle transaction consistency.

- [ ] Send order notifications.

- [ ] Support administrative operations.

**Suggested concepts:** Spring Boot, JPA, security, transactions, caching, messaging, testing.

### Project 9 — Booking Platform

**Requirements**

- [ ] Manage users and bookable resources.

- [ ] Support availability searches.

- [ ] Create and cancel bookings.

- [ ] Prevent conflicting reservations.

- [ ] Handle concurrent booking attempts.

- [ ] Maintain booking history.

- [ ] Send notifications.

**Suggested concepts:** SQL transactions, concurrency, locking, idempotency, REST, messaging.

### Project 10 — Notification Service

**Requirements**

- [ ] Accept notification requests.

- [ ] Support multiple delivery channels.

- [ ] Process notifications asynchronously.

- [ ] Track delivery status.

- [ ] Retry failed deliveries.

- [ ] Prevent duplicate processing.

- [ ] Provide operational metrics.

**Suggested concepts:** Messaging, Kafka, asynchronous processing, retries, idempotency, observability.

### Project 11 — Microservices-Based Application

**Requirements**

- [ ] Identify suitable service boundaries.

- [ ] Implement multiple independent services.

- [ ] Define service communication.

- [ ] Handle service failures.

- [ ] Implement event-based communication where appropriate.

- [ ] Address data ownership.

- [ ] Monitor the system.

**Suggested concepts:** Microservices, distributed systems, Kafka, resilience, Docker, observability.

---

# Final Capstone Project

**Objective:** Independently design, build, test, secure, deploy, and document a complete backend application.

Choose a problem that has enough complexity to demonstrate the skills developed throughout this roadmap.

### Minimum requirements

- [ ] Define the problem and functional requirements.

- [ ] Design the application architecture.

- [ ] Design the relational database.

- [ ] Implement REST APIs.

- [ ] Integrate PostgreSQL.

- [ ] Implement authentication and authorization.

- [ ] Implement request validation and error handling.

- [ ] Write unit and integration tests.

- [ ] Implement appropriate logging.

- [ ] Implement caching where justified.

- [ ] Implement asynchronous processing where justified.

- [ ] Dockerize the application.

- [ ] Configure CI/CD.

- [ ] Deploy the application.

- [ ] Configure health checks and basic monitoring.

- [ ] Document architecture and APIs.

- [ ] Document setup and deployment instructions.

### Project expectations

- Make your own architectural decisions.

- Do not copy a complete tutorial implementation.

- Use abstractions where they solve actual problems.

- Avoid unnecessary complexity.

- Handle invalid inputs and failure scenarios.

- Keep the application maintainable.

- Document important design decisions.

The capstone should demonstrate that you can independently turn a problem into a working backend system.

---

# SKILLS COVERAGE LEDGER

Use this ledger to track practical exposure to the topics throughout the roadmap.

**Rule:** Check a topic only after you have used it in code as part of an exercise or project. Reading about it does not count. The initial checked items below are limited to what is demonstrated by your submitted console-greeting program.

## Java Fundamentals

- [x] Variables

- [ ] Constants

- [x] Primitive data types

- [x] Reference data types

- [x] Type casting and conversion

- [x] Operators and expressions

- [x] Conditional statements

- [x] Switch statements and expressions

- [x] For loops

- [ ] While loops

- [x] Do-while loops

- [ ] Enhanced for loops

- [x] Break and continue

- [x] Scanner and user input

- [x] Methods

- [x] Method parameters

- [x] Return types

- [ ] Method overloading

- [ ] Variable scope and lifetime

- [ ] Pass-by-value

- [ ] Recursion

- [ ] Arrays

- [ ] Multidimensional arrays

- [x] Strings and String methods

- [ ] StringBuilder and StringBuffer

- [ ] Wrapper classes

- [ ] Autoboxing and unboxing

- [x] String concatenation

## Object-Oriented Programming

- [x] Classes and objects

- [ ] Fields and methods

- [ ] Constructors

- [ ] Constructor overloading

- [ ] this keyword

- [x] Static variables and methods

- [ ] Access modifiers

- [ ] Encapsulation

- [ ] Inheritance

- [ ] Method overriding

- [ ] Polymorphism

- [ ] Abstraction

- [ ] Abstract classes

- [ ] Interfaces

- [ ] super keyword

- [ ] final keyword

- [ ] Association

- [ ] Aggregation

- [ ] Composition

- [ ] Object class

- [ ] toString()

- [ ] equals() and hashCode()

- [ ] Object references

- [ ] Shallow and deep copying

- [ ] Immutable objects

- [ ] Enums

- [ ] Nested and inner classes

- [ ] Anonymous classes

## Exception Handling

- [ ] Exception and Error hierarchy

- [ ] Checked and unchecked exceptions

- [ ] try, catch, finally

- [ ] Multiple catch blocks

- [ ] throw and throws

- [ ] Custom exceptions

- [ ] Exception propagation

- [ ] Try-with-resources

## Collections and Generics

- [ ] Collections Framework

- [ ] Iterable and Collection

- [x] List and ArrayList

- [ ] LinkedList

- [ ] Set and HashSet

- [ ] LinkedHashSet and TreeSet

- [ ] Queue and Deque

- [ ] PriorityQueue

- [ ] Map and HashMap

- [ ] LinkedHashMap and TreeMap

- [ ] ConcurrentHashMap

- [ ] Iterator and ListIterator

- [ ] Comparable and Comparator

- [ ] Hashing and collision handling

- [ ] HashMap internal working

- [ ] Time and space complexity

- [ ] Generic classes

- [ ] Generic methods

- [ ] Generic interfaces

- [ ] Bounded type parameters

- [ ] Wildcards

- [ ] Upper and lower bounds

- [ ] Type erasure

## Functional and Modern Java

- [ ] Functional interfaces

- [ ] Lambda expressions

- [ ] Method references

- [ ] Predicate

- [ ] Function

- [ ] Consumer

- [ ] Supplier

- [ ] Optional

- [ ] Stream API

- [ ] Intermediate and terminal operations

- [ ] Filtering and mapping

- [ ] flatMap

- [ ] Sorting and reduction

- [ ] Collectors

- [ ] Grouping and partitioning

- [ ] Parallel streams

- [ ] Default and static interface methods

- [ ] Records

- [ ] Sealed classes

- [ ] Pattern matching

- [ ] Switch expressions

- [ ] Text blocks

- [ ] Date and Time API

## File Handling and Java Platform

- [ ] File and Path APIs

- [ ] FileInputStream and FileOutputStream

- [ ] FileReader and FileWriter

- [ ] BufferedReader and BufferedWriter

- [ ] NIO and NIO.2

- [ ] Serialization and deserialization

- [ ] JSON processing

- [ ] Properties files

- [ ] Annotations

- [ ] Custom annotations

- [ ] Reflection API

- [ ] Regular expressions

- [ ] Networking fundamentals

- [ ] Socket programming

- [ ] Internationalization

- [ ] Java modules

- [ ] Java security fundamentals

## Concurrency and JVM

- [ ] Processes and threads

- [ ] Thread lifecycle

- [ ] Thread and Runnable

- [ ] Callable and Future

- [ ] Synchronization

- [ ] Race conditions

- [ ] Deadlocks

- [ ] Volatile

- [ ] Atomic variables

- [ ] Locks and ReentrantLock

- [ ] ExecutorService

- [ ] Thread pools

- [ ] CompletableFuture

- [ ] Concurrent collections

- [ ] Java Memory Model

- [ ] Virtual threads

- [ ] JVM architecture

- [ ] Class loading

- [ ] Bytecode

- [ ] Stack and heap

- [ ] Garbage collection

- [ ] Memory leaks

- [ ] JIT compilation

- [ ] JVM arguments and monitoring

## Development Tools and Testing

- [x] JDK and VS Code setup

- [x] Terminal compilation and execution

- [ ] Git branching and merging

- [ ] Pull requests and code reviews

- [ ] Merge conflict resolution

- [ ] Git tags and releases

- [ ] Maven

- [ ] pom.xml and dependency management

- [ ] Maven lifecycle and plugins

- [ ] Multi-module Maven projects

- [ ] Gradle fundamentals

- [ ] Debugging and breakpoints

- [ ] Logging with SLF4J and Logback

- [ ] Clean code

- [ ] SOLID principles

- [ ] Design patterns

- [ ] UML and class diagrams

- [ ] JUnit 5

- [ ] Assertions and parameterized tests

- [ ] Mockito

- [ ] Mocking and stubbing

- [ ] Unit testing

- [ ] Integration testing

- [ ] Test coverage

- [ ] Test-driven development fundamentals

## SQL and Databases

- [ ] Relational database fundamentals

- [ ] Tables, rows, and columns

- [ ] Primary and foreign keys

- [ ] Constraints

- [ ] SQL data types

- [ ] SELECT, INSERT, UPDATE, DELETE

- [ ] WHERE and ORDER BY

- [ ] GROUP BY and HAVING

- [ ] Aggregate functions

- [ ] Joins

- [ ] Subqueries

- [ ] Common Table Expressions

- [ ] Indexes

- [ ] Database normalization

- [ ] Transactions

- [ ] ACID properties

- [ ] Isolation levels

- [ ] Query optimization

- [ ] PostgreSQL

- [ ] JDBC architecture and drivers

- [ ] Connection and PreparedStatement

- [ ] ResultSet

- [ ] SQL injection prevention

- [ ] JDBC transactions

- [ ] Connection pooling

## Spring and Backend Development

- [ ] Spring Framework

- [ ] Inversion of Control

- [ ] Dependency Injection

- [ ] Spring Beans and lifecycle

- [ ] ApplicationContext

- [ ] Component scanning

- [ ] Configuration classes

- [ ] Bean scopes

- [ ] Spring annotations

- [ ] AOP fundamentals

- [ ] Spring Boot

- [ ] Spring Initializr

- [ ] Auto-configuration

- [ ] Starter dependencies

- [ ] Application properties and YAML

- [ ] Configuration properties

- [ ] Profiles

- [ ] Spring Boot Actuator

- [ ] HTTP and HTTPS

- [ ] REST architecture

- [ ] HTTP methods and status codes

- [ ] JSON

- [ ] REST controllers

- [ ] DTOs

- [ ] Request validation

- [ ] Global exception handling

- [ ] Pagination and sorting

- [ ] Filtering and searching

- [ ] API versioning

- [ ] OpenAPI and Swagger

- [ ] CORS

## Persistence and Security

- [ ] ORM fundamentals

- [ ] JPA and Hibernate

- [ ] Entities and entity lifecycle

- [ ] Entity relationships

- [ ] Spring Data repositories

- [ ] Derived query methods

- [ ] JPQL and native queries

- [ ] Lazy and eager loading

- [ ] N+1 query problem

- [ ] Cascading and orphan removal

- [ ] Transactions

- [ ] Database auditing

- [ ] Flyway or Liquibase

- [ ] Authentication and authorization

- [ ] Spring Security

- [ ] Security filters

- [ ] Password hashing

- [ ] Role-based access control

- [ ] Session-based authentication

- [ ] JWT

- [ ] OAuth 2.0

- [ ] OpenID Connect

- [ ] Resource server configuration

- [ ] Method-level security

- [ ] CSRF and CORS

- [ ] Security best practices

## Backend Engineering and Architecture

- [ ] Layered architecture

- [ ] Controller-Service-Repository

- [ ] DTO and entity separation

- [ ] Clean architecture fundamentals

- [ ] SOLID principles

- [ ] Design patterns

- [ ] Caching

- [ ] Redis

- [ ] Asynchronous processing

- [ ] Message queues

- [ ] Kafka

- [ ] Scheduled jobs

- [ ] WebSockets

- [ ] Rate limiting

- [ ] Idempotency

- [ ] Distributed systems fundamentals

- [ ] Microservices fundamentals

- [ ] Service-to-service communication

- [ ] Resilience and fault tolerance

- [ ] Observability and monitoring

- [ ] Performance profiling

## Deployment and Production

- [ ] Executable JAR packaging

- [ ] Linux fundamentals

- [ ] Environment variables and secrets

- [ ] Docker fundamentals

- [ ] Dockerfiles

- [ ] Docker Compose

- [ ] Container networking and volumes

- [ ] Database containerization

- [ ] CI/CD fundamentals

- [ ] GitHub Actions

- [ ] Cloud deployment

- [ ] Application monitoring

- [ ] Health checks

- [ ] Production logging

- [ ] Error tracking

- [ ] Performance profiling

- [ ] Production troubleshooting

---

**Final Goal:** Become capable of independently solving programming problems, designing maintainable Java applications, building secure backend systems, working with databases, testing software, and deploying production-ready applications using the Java ecosystem.
