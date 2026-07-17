# Database Testing Automation Framework

## Overview

This project is a database automation framework developed using Java, JDBC, SQL, TestNG, and Maven for validating backend data in relational databases.

The framework is designed to automate database verification by connecting to the database, executing SQL queries, and validating business data against expected results.

It demonstrates how database testing can be integrated into an automation framework to support end-to-end application validation.

---

## Technology Stack

* Java
* JDBC
* SQL
* TestNG
* Maven
* GitHub Actions

---

## Framework Features

* JDBC-based database connectivity
* Reusable database connection utility
* SQL query execution
* ResultSet validation
* Configuration-based database connection
* Backend data verification
* TestNG execution
* Maven dependency management
* CI/CD ready

---

## Framework Architecture

```text
database-testing-framework

├── src
│   ├── main
│   │   ├── java
│   │   │   ├── database
│   │   │   │   └── DBConnection.java
│   │   │   └── utils
│   │   │       ├── DBUtils.java
│   │   │       └── ConfigReader.java
│   │   └── resources
│   │       └── database.properties
│   │
│   └── test
│       └── java
│           └── tests
│               └── DatabaseTest.java
│
├── pom.xml
└── README.md
```

---

## Framework Design

### Database Connection Layer

The framework establishes reusable JDBC connections using configuration stored in `database.properties`.

### Utility Layer

Reusable utility methods execute SQL queries and return results for validation.

### Test Layer

Test classes perform assertions by comparing expected values with actual database records.

Benefits:

* Reusable database utilities
* Easy environment configuration
* Reduced code duplication
* Improved maintainability

---

## Execution Flow

```text
TestNG

   |

Database Test

   |

DB Utility

   |

JDBC Driver

   |

SQL Database

   |

ResultSet

   |

Validation
```

---

## Sample SQL Query

```sql
SELECT first_name, last_name
FROM employees
WHERE employee_id = 101;
```

---

## Validation Example

Expected:

```text
First Name : John
Last Name  : Smith
```

Database Result:

```text
First Name : John
Last Name  : Smith
```

Validation:

* Record exists
* Values match expected data
* Test passes

---

## Prerequisites

Install:

* Java JDK 11 or above
* Maven
* SQL database (MySQL, PostgreSQL, Oracle, etc.)
* JDBC driver
* Git

Verify installation:

```bash
java -version

mvn -version
```

---

## Configuration

Update database connection details in:

```text
src/main/resources/database.properties
```

Example:

```properties
db.url=jdbc:mysql://localhost:3306/testdb
db.username=root
db.password=password
```

---

## Installation

Clone the repository:

```bash
git clone <repository-url>
```

Navigate to the project:

```bash
cd database-testing-framework
```

Install dependencies:

```bash
mvn clean install
```

---

## Test Execution

Execute all database tests:

```bash
mvn clean test
```

---

## Reports

Execution results include:

* SQL query execution status
* Data validation results
* Passed/Failed test cases
* Assertion failures

---

## CI/CD Integration

This framework can be integrated with GitHub Actions or Jenkins for automated execution.

Pipeline flow:

```text
Code Commit

    |

GitHub Actions

    |

Setup Java

    |

Install Maven Dependencies

    |

Execute Database Tests

    |

Publish Results
```

---

## Future Enhancements

Planned improvements:

* Multiple database support
* Environment-based execution
* Database migration validation
* Data comparison reports
* Docker-based database execution
* Integration with API and UI automation

---

## Author

**Periyasamy Muthu**

Senior SDET | Automation Test Engineer

LinkedIn:
https://www.linkedin.com/in/periyasamymuthu
