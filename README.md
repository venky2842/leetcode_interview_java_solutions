# LeetCode Top Interview Questions - Java Solutions

This repository contains Java solutions for the LeetCode Top Interview Questions, organized for easy navigation and testing. The project uses a standard Maven structure for code and tests.

## Project Structure

```
java_solutions/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   └── java/
│   │       └── leetcode/
│   │           ├── SetMatrixZeroes.java
│   │           └── ThreeSum.java
│   └── test/
│       └── java/
│           └── leetcode/
│               ├── SetMatrixZeroesTest.java
│               └── ThreeSumTest.java
```

- All solution files are in `src/main/java/leetcode/`.
- All test files are in `src/test/java/leetcode/`.

## How to Run

### Prerequisites
- Java 8 or higher
- Maven 3.x

### Compile the Project
```
mvn compile
```

### Run All Tests
```
mvn test
```

### Add New Solutions
1. Add your solution Java file to `src/main/java/leetcode/`.
2. Add your JUnit test file to `src/test/java/leetcode/`.
3. Ensure the package is `leetcode` in both files.

### Add All LeetCode Top Interview Questions
This repository aims to collect all solutions for the [LeetCode Top Interview Questions](https://leetcode.com/explore/interview/card/top-interview-questions-medium). If you want to contribute, add your solution and corresponding test as described above.

## Example

To run the tests for `SetMatrixZeroes` and `ThreeSum`, simply run:
```
mvn test
```

## License
MIT 