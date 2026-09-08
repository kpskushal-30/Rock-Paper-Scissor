# 🎮 Rock Paper Scissor Game

A simple command-line implementation of the classic **Rock Paper Scissor** game developed using **Java**.

## 📌 Description

This program allows a player to play Rock Paper Scissor against the computer for a specified number of rounds.

The player enters their choice, and the computer randomly selects either **Rock**, **Paper**, or **Scissor**. The winner of each round is determined according to the standard game rules.

At the end of all rounds, the program displays the final score and announces the overall winner.

---

## ✨ Features

* 🎲 Random computer choices using Java's `Random` class
* 🔢 User-defined number of rounds
* 🪨 Rock, 📄 Paper, ✂️ Scissor gameplay
* ✅ Input validation for player choices
* 🏆 Round-by-round winner announcement
* 📊 Final score display
* 🎉 Overall winner announcement

---

## 🎯 Game Rules

The game follows these standard rules:

| Player Choice | Computer Choice | Result      |
| ------------- | --------------- | ----------- |
| 🪨 Rock       | ✂️ Scissor      | Player Wins |
| 📄 Paper      | 🪨 Rock         | Player Wins |
| ✂️ Scissor    | 📄 Paper        | Player Wins |
| Same Choice   | Same Choice     | Tie         |

---

## 🛠️ Technologies Used

* **Java**
* `Scanner` class for user input
* `Random` class for generating computer choices

---

## ▶️ How to Run

### 1. Clone the Repository

```bash
git clone <repository-url>
```

### 2. Navigate to the Project Directory

```bash
cd Rock-Paper-Scissor
```

### 3. Compile the Program

```bash
javac Rock_Paper_Scissor.java
```

### 4. Run the Program

```bash
java Rock_Paper_Scissor
```

---

## 💻 Sample Output

```text
-----ROCK PAPER SCISSOR GAME-----
Enter the number of rounds: 3

Enter your move(rock, paper, scissor): rock
Computer's choice: scissor
You WIN the round!!!

Enter your move(rock, paper, scissor): paper
Computer's choice: paper
It's a TIE!!!

Enter your move(rock, paper, scissor): scissor
Computer's choice: rock
You LOST the round!!

---------------------
Score: 1-1
You WON, Congrats :) !!!
Thank you for playing!!
```

---

## 📂 Project Structure

```text
Rock-Paper-Scissor/
│
├── Rock_Paper_Scissor.java
└── README.md
```

---

## 🚀 Future Improvements

* Add an option to play multiple games
* Improve invalid input handling
* Add a graphical user interface (GUI)
* Display round numbers
* Add a scoreboard history
* Implement a best-of-three or best-of-five mode

---

## 👨‍💻 Author

**Kushal Sawant**

---

⭐ If you enjoyed this project, feel free to give it a star!
