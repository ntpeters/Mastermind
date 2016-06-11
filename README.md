# Mastermind
A simple, console-based, implementation of the game Mastermind
![Example](http://i.imgur.com/0w8Jm25.png)

##Description
Mastermind is a game where a player acts as a "code-breaker", trying to guess a secret code chosen by the computer.
By default the code is 4 digits long, composed of the numbers 1 to 6, and the player will have 10 guesses to get it right.

After each guess, a series of `+` and `-` symbols will be displayed. Each `-` represents a number correct number guessed, but in the wrong position. Each `+` represents a number guessed in the correct position.

##Settings
The default settings can be overridden by providing several optional arguments when launching the game:
```
Arg  -   Type    -   Description
0    -   boolean -   Sets whether duplicate values should be allowed in the secret code
1    -   int     -   Sets number of guesses give to the user
2    -   int     -   Sets the length of the generated secret code
3    -   int     -   Sets the lower bound (inclusive) for each code value (0-9)
4    -   int     -   Sets the upper bound (inclusive) for each code value (0-9)
```
