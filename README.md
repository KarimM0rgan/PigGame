# 🎲 Pig (Object-Oriented Java Game)
  
> A refactor of the classic *Pig* dice game using Object-Oriented Programming (OOP) principles.

---

## 🧠 Project Overview

This project reimplements the game of **Pig** using an object-oriented approach to demonstrate how decomposing a problem into classes and objects makes a program more modular, maintainable, and reusable.
---

## 🧱 Components

The program is composed of three main classes:

### 1. `Die.java`
A reusable die class that can simulate any n-sided die.

- **Key methods**: `roll()`, `getFace()`
- Encourages **encapsulation** and **reusability**
- Example:
  ```java
  Die twelveSidedDie = new Die(12);
````

### 2. `Player.java`

Represents a single player in the Pig game.

* **Constructor Parameters**: `String name`, `Die die`

* **Public Methods**:

  * `takeTurn(int goalScore)`
  * `getScore()`
  * `getName()`
  * `toString()`

* Uses a **private helper method** `readOne()` for input

* Example:

  ```java
  Player player = new Player("Bob", new Die(12));
  ```

### 3. `Pig.java`

The main game controller.

* Manages player turns, winning conditions, and game flow
* Constructor parameters:

  * `int numPlayers`
  * `int maxScore`

---

## 🚀 How to Run

1. **Clone the repository**

   ```bash
   git clone https://github.com/yourusername/pig-oop-game.git
   cd pig-oop-game
   ```

2. **Compile the classes**

   ```bash
   javac *.java
   ```

3. **Run the game**

   ```bash
   java Pig
   ```
---