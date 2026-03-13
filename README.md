Java Bank Management System 🏦
This is a console-based application I built to practice and implement core Object-Oriented Programming (OOP) principles in Java. 
It’s designed to handle basic banking logic—everything from opening an account to managing transfers—without the need for a heavy database or GUI at this stage.

********* Key Functionalities *********
I focused on making the logic as realistic as possible for a CLI tool:

Account Management: Users can open a new account and instantly start managing funds.

Transactions: Supports deposits and withdrawals with real-time balance updates.

Internal Transfers: Move money between two different accounts seamlessly.

Logging: Every action is tracked, and you can view a summary of transaction details.

Data Integrity: Basic logic checks to ensure you can't withdraw more than you have or transfer negative amounts.

🛠️ The Tech Behind It
Language: Java

Architecture: I used a modular approach, splitting the logic into Account, Bank, and Transaction classes to maintain clean code and practice Encapsulation.

Environment: Built and tested using Git for version control.

📂 Inside the Project
The source code is organized into four main components:

Account.java: Handles individual user data and balance logic.

Bank.java: The "brain" of the system that manages the collection of accounts.

Transaction.java: A helper class to format and store history.

Main.java: The entry point with the menu-driven console interface.

--> Getting Started
If you want to try it out locally, just follow these steps:

Clone the repo

Bash
git clone https://github.com/tanujthakur634-cloud/BankManagementSystem.git
Compile the source

Bash
cd BankManagementSystem/src
javac Main.java
Run the app

Bash
java Main
📈 Future Roadmap
This is a work in progress! I plan on adding:

[ ] Persistent Storage: Moving from RAM-based storage to a MySQL database.

[ ] Security: Adding a basic login/PIN system for account access.

[ ] Interface: Eventually wrapping this logic in a JavaFX or Swing GUI.

[ ] Spring Boot: Converting this into a proper REST API.
