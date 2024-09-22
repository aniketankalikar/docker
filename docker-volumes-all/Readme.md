curl -X POST "http://localhost:8080/file/write?filename=test.txt&content=HelloAnonymous"


curl -X POST "http://localhost:8080/file/write" -H "Content-Type: application/json" -d '{"filename":"test.txt", "content":"HelloAnonymous"}'