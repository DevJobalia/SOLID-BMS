# 1/6/2025

4:30 - 5:00 PM - USE CASE DIAGRAM
12:20am - create files and folder structure
3PM - define variables

1. USER INTERFACE

- USER
- ADMIN

# 20/6/2025

ADMIN
MOVIE
SCREEN
THEATRE
SEAT
SHOW
USER
BOOKING
SEARCH

- FOR ALL ENTITIES CHECK THIS
  - DEFINE ALL FUNCTION
  - implement functions & 2. ADMIN OPS REQUIRE PASSING PASSWORD
  - DEFINE USER SERVICE, admin service
    - ADD USER
    - DELETE USER
    - GET ALL USER
    - UPDATE USER
- COMPLETE SEARCH CODE
- remove moving parts related to payment (in booking, user, refund)
  - defining status
  - storing result
  - updating refunds
- WRITE TODO COMMENTS FOR FUTURE SCOPE

- FINAL CHECKS

1. USER FUNC
2. BOOKING FUNC
3. SEARCH FUNC
4. PAYMENT FUNC

- FUTURE SCOPE

1. MANAGE FOR MULTIPLE RELATION

- seat and show

2. MANAGE for cyclic relation

- show and movie
- SHOW AND BOOKING

3. BUILDER PATTERN FOR USER
4. command design pattern for user manager
5. IMPROVE SEAT DEFINATION LOGIC OF THEATRE- BASED OF FACTORY PATTERN

Absolutely! Here's a list of **realistic, console-based test flows** you can implement and test in your **BookMyShow (BMS)** Low-Level Design (LLD) project. These flows will help validate your domain models, repositories, services, and managers.

---

## ✅ 1. **Admin Flow: Add Movie & Show**

### Purpose:

To test admin's ability to add a new movie and assign a show to a screen/theatre.

### Steps:

```plaintext
1. Admin logs in
2. Admin adds a new movie using AdminManager
3. Admin adds a show for the movie (specify time, screen, seats)
4. Verify movie exists via MovieRepository
5. Verify show is mapped to theatre/screen
```

### In Code:

```java
adminManager.handleAddMovie(admin, newMovie);
adminManager.handleAddShowToTheatre(admin, theatreId, newShow);
```

---

## ✅ 2. **Customer Flow: Search & Book Ticket**

### Purpose:

Test end-to-end ticket booking: search → choose → pay → confirm booking.

### Steps:

```plaintext
1. User searches for movies by title/genre
2. User selects a show and available seats
3. User selects a payment mode
4. User books the ticket
5. Booking and PaymentResult are updated in user's profile
6. Seat is marked as booked
```

### In Code:

```java
List<Movie> results = searchService.searchByTitle("Inception");
userManager.bookTicket(userId, showId, seatIds, paymentMode);
```

---

## ✅ 3. **Seat Lock & Booking Conflict**

### Purpose:

Simulate multiple users attempting to book the same seat.

### Steps:

```plaintext
1. User A selects seat and initiates booking
2. User B tries to book same seat
3. System should throw SeatAlreadyBookedException
```

---

## ✅ 4. **Payment Failure Flow**

### Purpose:

Validate failure-handling for invalid/unsupported payments.

### Steps:

```plaintext
1. Customer tries to pay using unsupported method (e.g., invalid card)
2. PaymentService throws PaymentFailedException
3. Booking is rolled back or marked as failed
```

---

## ✅ 5. **View Booking History**

### Purpose:

Allow customer to see successful and past bookings.

### Steps:

```plaintext
1. Customer logs in
2. Views past bookings (all statuses)
3. Views successful payment results
```

---

## ✅ 6. **Cancel Booking Flow (Optional Extension)**

### Steps:

```plaintext
1. Customer selects booking to cancel
2. System checks time validity and allows cancel
3. Seat is released
4. Refund is recorded (if supported)
```

---

## 🧪 Supporting Edge Cases to Validate

| Test Case                        | Expected Outcome              |
| -------------------------------- | ----------------------------- |
| Add movie with existing ID       | `MovieAlreadyExistsException` |
| Book non-existent show           | `ShowNotFoundException`       |
| Book with invalid payment mode   | `PaymentFailedException`      |
| Search movie with no match       | Returns empty list            |
| Booking with seat already locked | `SeatAlreadyBookedException`  |

---

## 🧱 Test Components Involved

| Layer          | Component Tested               |
| -------------- | ------------------------------ |
| `Domain`       | Movie, Show, Seat, User        |
| `Repositories` | MovieRepository, BookingRepo   |
| `Services`     | BookingService, PaymentService |
| `Managers`     | UserManager, AdminManager      |
| `Exceptions`   | Custom error handling          |

---

## 🎯 Pro Tip

For each flow:

- Write a `FlowTester.java` or `ScenarioRunner.java` in `/main`
- Use mock data (hardcoded or from setup file)
- Add logs or `System.out.println` to simulate responses

---

Would you like me to generate a `ScenarioRunner.java` example for one of these flows?
