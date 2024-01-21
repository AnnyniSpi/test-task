# Test-task

- Rest API for counting characters in a string.
- Based on Spring Boot ecosystem technology.
- Created for learning purposes.

# Setup and Running

- Use `JDK 17`.
- Use `Apache Maven`.
- Use `Spring Boot 3.2.2`.

## Usage

### HTTP POST /api/v1/calculator

**Summary:**  
Returns 200 OK and a Map of a character and the construction of this character in a string in ascending order

**Request Example:**

POST .../calculator

```
  aaaabbbcccccc
```

### Responses:

```json
{
  "c": 6,
  "a": 4,
  "b": 3
}
```

**200 OK**

------------------------------------------------------------------------------
