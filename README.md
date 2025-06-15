# Personal Debt Manager

## Purpose
A web app for securely tracking personal debts, payments, and outstanding balances. Users can register, log in, and manage their debts from anywhere.

## Tech Stack
- **Backend:** Quarkus (Java), JWT Authentication, PostgreSQL
- **Frontend:** Angular
- **Auth:** JWT-based login

## MVP Features
- User registration/login
- Add, edit, delete debts (amount, creditor, due date)
- Record payments for debts
- Dashboard summary (total owed, paid, outstanding)
- JWT-protected API

## Nice-to-have Features
- Export to CSV
- Notifications for due dates
- Multi-currency

## Data Model
### User
- id
- email
- passwordHash

### Debt
- id
- amount
- creditor
- dueDate
- paidAmount
- userId (foreign key)

## API Endpoints
- POST `/auth/register` – Register user
- POST `/auth/login` – Login (returns JWT)
- GET `/debts` – List debts for current user
- POST `/debts` – Add debt
- PUT `/debts/{id}` – Edit debt
- DELETE `/debts/{id}` – Delete debt
- POST `/debts/{id}/pay` – Record payment

## Project Structure
- `/debt-backend` – Quarkus backend
- `/debt-manager-frontend` – Angular frontend
