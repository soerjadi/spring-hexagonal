## Spring Boot Hexagonal Architecture Template

![diagram](https://miro.medium.com/v2/resize:fit:1400/format:webp/1*EAh0SdN-Vqv_cAJt5XvYsQ.jpeg)

This project is inspired from Golang Hexagonal Architecture. Hexagonal architecture is concrete implementation from Clean Code and bring balance between structure and flexibility in Spring Boot. Clean Code is principal how to write code in clean.

### Folder Structure
```
src/main/java/{codename}/{projectName}
│
├── adapters/                # Concrate implementations
│   ├── primary/             # Primary adapters
│   │    ├── rest/           # RestAPI adapters
│   │    └── rpc/            # RPC Adapters
│   │
│   └── secondary/           # Secondary adapters
│       ├── database/        # repositories
│       └── mq/              # message consumer
│
├── domain/                  # Entities
├── ports/                   # Concrate port layer
│   ├── adapters/            #
│   │    ├── primary/        # Primary adapters
│   │    │   ├── rest/       # RestAPI interfaces
│   │    │   └── rpc/        # RPC interfaces
│   │    │
│   │    └── secondary/      # Secondary adapters
│   │        ├── database/   # database interace
│   │        └── mq/         # message consumer interfaces
│   │ 
│   └── services/            # business logic interface
│
├── services/                # business logic implementations
│
└── MainApplication.java
```
- adapters  
  Implement port to provide business logic
- domain  
  Entities 
- ports  
  Communication bridge between domain / entity to the external layer
- services   
  Business logic places