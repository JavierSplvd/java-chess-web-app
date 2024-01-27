# Goals

1. Create a GET endpoint that returns the best possible movement given a board state. `/move/{board_state}`
2. Create a integration test that tests the endpoint with a few different board states.
3. Add a chess engine as dependency.
4. Add a security layer to the endpoint. Using the header `X-API-KEY` with the value `1234567890` should be the only way to access the endpoint.

# Run

```
mvn spring-boot:run
```