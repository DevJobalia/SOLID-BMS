```
com.bms
├── application              # Use case orchestration layer
│   ├── dto                 # Request/Response objects
│   └── service             # Interfaces + application service classes
│       ├── BookingService
|       ├── PaymentService.java
│       └── SearchService
│
├── domain                  # Core business logic
│   ├── payment
|   │   ├── APaymentMode.java
|   │   └── PaymentResult.java
│   ├── model              # Entities (POJOs with logic)
|   │   ├── Movie.java
|   │   ├── Theatre.java
|   │   ├── Screen.java
|   │   ├── Seat.java
|   │   ├── Show.java
|   │   └── Booking.java
│   ├── enums              # Genre, SeatType, etc.
│   ├── service            # Domain services, if needed
|   │   ├── SearchService.java
|   │   ├── BookingService.java
|   │   └── AdminService.java
│   └── exception          # Custom domain exceptions
│       ├── SeatAlreadyBookedException.java
|       └── PaymentFailedException.java
│
├── infrastructure          # External implementations
│   ├── repository         # JPA/DB-specific implementations
│   │   └── MovieRepositoryImpl
│   ├── MovieRepository.java
|   │   ├── InMemoryMovieRepository.java
|   │   ├── BookingRepository.java
|   │   └── SeatLockProvider.java
│   ├── payment            # Payment integrations (UPI/NetBanking)
|   │   ├── UpiPayment.java
|   │   ├── NetBanking.java
│   └── config             # Spring or project configs
│
├── interface               # Web/API layer
│   ├── controller         # REST APIs or web handlers
│   └── mapper             # Map DTOs to domain objects
│
├── strategy                # Behavior/Policy pattern logic
│   ├── SearchStrategy
│   └── PaymentGateway
│
|── BmsPortalApplication.java  # Main entry (SpringBootApplication or CLI entry)
└── utils/                   # ← Helpers / validators
    └── DateUtils.java

```
