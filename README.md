# Database Testing Framework


## Overview

Automation framework developed for database validation using Java JDBC and SQL.

The framework validates backend database records and supports integration testing between application data and database values.


## Technology Stack

- Java
- JDBC
- SQL
- TestNG
- Maven
- MySQL


## Framework Features

- Database connection management
- SQL query execution
- Data validation
- Reusable database utilities
- TestNG execution
- Maven build support


## Validation Scenarios

- Verify user records
- Validate transaction data
- Compare expected and actual database values
- Backend data verification

## Execution

Install dependencies:

mvn clean install


Execute database tests:

mvn clean test


## Framework Architecture


TestNG Test Cases

        |

        |

Database Utility Layer

        |

        |

JDBC Connection

        |

        |

SQL Database



## CI/CD

GitHub Actions executes database validation tests automatically when code changes are pushed.

## Author

Periyasamy Muthu

Senior SDET | Automation Test Engineer
