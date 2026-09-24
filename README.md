# CodeForgeV1

A Java + Spring Boot based DSA practice platform designed to provide a focused coding-practice experience with problem solving, code execution, submissions, XP, and badges.

##  Project Idea

**CodeForge** is a LeetCode-style DSA practice platform that I am building from scratch to strengthen both my problem-solving skills and backend engineering skills.

The core idea is:

> **Solve DSA problems → Submit Java code → Get judged → Earn XP → Unlock badges → Track progress**

The first version focuses specifically on **DSA practice**. More advanced features may be added in future versions.

---

##  V1 User Flow

```text
Sign Up / Login
      ↓
Browse DSA Problems
      ↓
Open a Problem
      ↓
Write Java Solution
      ↓
Run Test Cases
      ↓
Submit
      ↓
Judge Submission
      ↓
Accepted / Wrong Answer / Error
      ↓
Earn XP
      ↓
Unlock Badges
      ↓
View Profile & Progress
```

---

##  Tech Stack

### Backend

* Java 21
* Spring Boot
* Spring Data JPA
* Hibernate
* Spring Security
* JWT Authentication
* Maven
* Bean Validation

### Database

* PostgreSQL

### Frontend

* React
* Monaco Editor

### Code Execution

* Judge0 initially
* Docker-based sandboxing may be explored in future versions

### Development Tools

* IntelliJ IDEA
* Git & GitHub
* pgAdmin

---

##  Planned Database Structure

The V1 database will contain entities such as:

```text
users
   │
   ├── submissions
   │
   └── user_badges

problems
   │
   ├── test_cases
   │
   └── submissions

badges
   │
   └── user_badges
```

### Main Entities

* `User`
* `Problem`
* `TestCase`
* `Submission`
* `Badge`
* `UserBadge`

---

#  15-Day Development Plan

| Day    | Goal                                                                 | Status |
| ------ | -------------------------------------------------------------------- | ------ |
| Day 1  | Spring Boot setup, PostgreSQL, User entity, Repository, GitHub setup | ✅      |
| Day 2  | Repository testing + Service layer                                   | ⬜      |
| Day 3  | User CRUD + API structure                                            | ⬜      |
| Day 4  | Problem entity + database mapping                                    | ⬜      |
| Day 5  | Problem CRUD APIs                                                    | ⬜      |
| Day 6  | Test-case system                                                     | ⬜      |
| Day 7  | Submission entity + Submission API                                   | ⬜      |
| Day 8  | Java code execution                                                  | ⬜      |
| Day 9  | Judging system                                                       | ⬜      |
| Day 10 | XP system                                                            | ⬜      |
| Day 11 | Badge system                                                         | ⬜      |
| Day 12 | Authentication + JWT                                                 | ⬜      |
| Day 13 | React frontend + backend integration                                 | ⬜      |
| Day 14 | Error handling, validation, testing & polishing                      | ⬜      |
| Day 15 | Final testing, README, deployment preparation                        | ⬜      |

> The plan is a development target rather than a strict deadline. Features may be adjusted based on implementation complexity.

---

#  What I Want to Learn From This Project

This project is not only about creating another CRUD application.

The main goal is to understand how a real backend system is designed and built.

Through CodeForge, I want to gain practical experience with:

* REST API design
* Layered backend architecture
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL
* Authentication & authorization
* JWT
* Database relationships
* Code execution systems
* Submission and judging workflows
* Error handling
* Validation
* Backend testing
* Frontend-backend integration
* Git/GitHub workflow
* Deployment

---

#  Future Plans

After completing V1, CodeForge can evolve into a larger developer-practice platform.

### V2 — More Practice Domains

Potential additions:

* SQL challenges
* OOP challenges
* Backend development challenges
* Database design challenges
* System design problems

### V3 — Advanced Features

Potential additions:

* Multiple programming languages
* Difficulty-based progression
* Streak system
* Leaderboards
* More advanced badge/achievement system
* User statistics
* Contest mode
* Problem recommendations
* Discussion section

### Future Technical Improvements

* Docker-based secure code execution
* Redis for caching and performance
* Message queues for asynchronous judging
* Rate limiting
* Monitoring and logging
* Microservices exploration
* Cloud deployment
* CI/CD pipeline

---

#  Current Status

**Version:** V1
**Development Timeline:** 15 Days
**Primary Focus:** DSA Practice Platform
**Backend:** Java + Spring Boot
**Database:** PostgreSQL
**Repository:** GitHub

---

##  Development Philosophy

CodeForge is being built incrementally.

Instead of generating the entire application at once, each feature is implemented and understood step-by-step.

The objective is not just:

> "Make the application work."

It is:

> **"Understand why it works."**
