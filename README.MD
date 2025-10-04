
```markdown
# Spring AI Chat Application

A professional Spring Boot application demonstrating seamless integration with OpenAI's ChatGPT API using the Spring AI framework. This project showcases clean architecture, comprehensive testing, and production-ready AI capabilities.

## 🏗️ Project Architecture

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── springai/
│   │               ├── SpringAiApplication.java
│   │               ├── controller/
│   │               │   └── ChatController.java
│   │               ├── model/
│   │               │   └── ChatResponse.java
│   │               └── service/
│   │                   └── ChatService.java
│   └── resources/
│       └── application.properties
└── test/
└── java/
└── com/
└── example/
└── springai/
├── SpringAiApplicationTests.java
└── service/
└── ChatServiceTest.java
```

## ✨ Features

- **🤖 OpenAI Integration**: Direct integration with ChatGPT models through Spring AI
- **🚀 RESTful API**: Clean, production-ready API endpoints
- **🧪 Comprehensive Testing**: JUnit tests with mock implementations
- **📦 Clean Architecture**: Separation of concerns with controller-service-model layers
- **⚡ Spring Boot 3.x**: Built on the latest Spring Boot framework
- **🔧 Easy Configuration**: Simple setup with application properties

## 🚀 Quick Start

### Prerequisites

- **Java 17** or higher
- **Maven 3.6+**
- **OpenAI API Key** ([Get one here](https://platform.openai.com/api-keys))

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/mohammed28s/Spring-AI.git
   cd Spring-AI
   ```

2. **Configure your OpenAI API key**

   Edit `src/main/resources/application.properties`:
   ```properties
   spring.ai.openai.api-key=your_actual_openai_api_key_here
   ```

3. **Build and run the application**
   ```bash
   mvn clean spring-boot:run
   ```

   The application starts on `http://localhost:8080`

## 📡 API Documentation

### Chat Endpoint

**POST** `http://localhost:8080/api/chat`

Send a prompt to the ChatGPT model and receive AI-generated responses.

**Request Body:**
```json
{
  "message": "Explain quantum computing in simple terms"
}
```

**Success Response (200 OK):**
```json
{
  "response": "Quantum computing is a type of computation that harnesses quantum mechanical phenomena..."
}
```

**Example Usage:**
```bash
curl -X POST http://localhost:8080/api/chat \
  -H "Content-Type: application/json" \
  -d '{"message":"What is Spring AI?"}'
```

## 🧪 Testing Strategy

### Running Tests

```bash
# Run all tests
mvn test

# Run with detailed output
mvn test -Dtest=ChatServiceTest
```

### Test Coverage

- **✅ Unit Tests**: `ChatServiceTest` with mocked dependencies
- **✅ Integration Tests**: API endpoint testing
- **✅ Application Context Tests**: Spring context loading verification

### Example Test Scenario

```java
// Tests service layer with mocked AI client
// Verifies business logic without external API calls
// Ensures reliable, fast test execution
```

## 🔧 Project Configuration

### Core Dependencies

```xml
<dependencies>
    <spring-boot-starter-web>
    <spring-ai-openai-spring-boot-starter>
    <spring-boot-starter-test>
</dependencies>
```

### Application Properties

```properties
# Server Configuration
server.port=8080

# OpenAI Configuration
spring.ai.openai.api-key=${OPENAI_API_KEY}
spring.ai.openai.chat.options.model=gpt-3.5-turbo

# Optional: Configure specific model parameters
spring.ai.openai.chat.options.temperature=0.7
spring.ai.openai.chat.options.max-tokens=1000
```

## 📁 Code Structure Deep Dive

### 🎯 Controller Layer

**`ChatController.java`**
- Handles HTTP requests at `/api/chat`
- Manages request/response mapping
- Input validation and error handling

```java
@RestController
@RequestMapping("/api")
public class ChatController {
    @PostMapping("/chat")
    public ChatResponse chat(@RequestBody ChatRequest request) {
        return chatService.getChatResponse(request.getMessage());
    }
}
```

### 🔧 Service Layer

**`ChatService.java`**
- Contains business logic for AI interactions
- Integrates with Spring AI's OpenAIChatClient
- Processes and transforms AI responses

```java
@Service
public class ChatService {
    public ChatResponse getChatResponse(String message) {
        // AI integration logic here
    }
}
```

### 📊 Model Layer

**`ChatResponse.java`**
- Simple POJO for structured API responses
- Ensures consistent response format
- Serializable for JSON transformation

```java
public class ChatResponse {
    private String response;
    // Standard getters, setters, and constructors
}
```

## 🛠️ Development

### Building from Source

```bash
# Clean build
mvn clean compile

# Create executable JAR
mvn clean package

# Run the packaged application
java -jar target/spring-ai-application.jar
```

### Adding New Features

1. **Extend the Model**: Add fields to `ChatResponse` for additional data
2. **Enhance Service**: Implement new AI capabilities in `ChatService`
3. **Create New Endpoints**: Add methods in `ChatController`

### Example: Adding Streaming Support

```java
@GetMapping("/chat/stream")
public Flux<ChatResponse> streamChat(@RequestParam String message) {
    return chatService.streamChatResponse(message);
}
```

## 🔍 Troubleshooting

| Issue | Cause | Solution |
|-------|-------|----------|
| `401 Unauthorized` | Invalid API key | Verify `spring.ai.openai.api-key` in properties |
| `503 Service Unavailable` | OpenAI API down | Check [OpenAI Status](https.status.openai.com) |
| Connection timeout | Network issues | Verify internet connection and proxy settings |

## 🤝 Contributing

We welcome contributions! Please follow these steps:

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/your-feature`
3. Commit your changes: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin feature/your-feature`
5. Submit a pull request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- **Spring Team** for the excellent Spring AI framework
- **OpenAI** for providing the ChatGPT API
- **Spring Boot Community** for comprehensive documentation and support

---

**Maintainer**: [mohammed28s](https://github.com/mohammed28s)

For questions or support, please open an issue on GitHub.
```

