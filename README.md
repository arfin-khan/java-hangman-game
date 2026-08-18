# Java Hangman Game

A simple console-based Hangman game built in Java as one of my first projects while learning the Java programming language.

The game randomly selects a word from a word list and gives the player a limited number of incorrect guesses. With each incorrect guess, another part of the hangman is drawn using ASCII characters.

## How the Game Works

1. A random word is selected from the word list.
2. The letters of the word are initially hidden.
3. The player enters a letter as a guess.
4. If the letter is correct, all matching positions in the word are revealed.
5. If the guess is incorrect, the hangman drawing progresses.
6. The player has 6 incorrect guesses before the complete hangman is drawn.

## Example

```text
Your Word: _ _ _ _ _

Enter the letter you think your word contain: a

Correct guess

Your Word: _ a _ _ _
```

After an incorrect guess, the hangman progressively changes:

```text
 O
 |
```

and eventually:

```text
 O
/|\
/ \
```

## Concepts Practiced

* Java classes and methods
* `ArrayList`
* `String` and `char` manipulation
* `Random`
* `Scanner` for user input
* `BufferedReader` and `FileReader`
* Reading data from a text file
* Loops and conditional statements
* `switch` expressions
* Exception handling with `try-catch`
* ASCII art
* Basic game logic

## Project Structure

```text
java-hangman-game/
├── Hangman.java
├── words.txt
└── README.md
```

`words.txt` contains the list of words from which the game randomly selects a word.

## Requirements

* Java 15 or later

The project uses Java text blocks (`"""`) for the Hangman drawings, which require a modern version of Java.

## How to Run

1. Clone this repository.
2. Open the project in a Java IDE such as IntelliJ IDEA.
3. Make sure `words.txt` is available at the path expected by the program.
4. Run `Hangman.java`.
5. Enter letters when prompted.

## Purpose

This project was created to practice Java fundamentals by building a small interactive game from scratch.
