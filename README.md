
# 🌟 Advanced Programming (Java) — Practice Set #1

Welcome, Java explorers! 👋  
This document contains **10 creative programming exercises** designed to review **Java basics**
Each task includes: 🧩 **description**, 💡 **example** and 🧠 **tips**

---

## 1️⃣ Simple Statistics 🔢

**Goal:** Practice input/output, arrays, loops, min/max, and average.

**Task:**  
Read an integer `n`, then read `n` integers and calculate:  
- `sum` — total of all numbers  
- `avg` — average (with 2 decimal places)  
- `min` — smallest value  
- `max` — largest value

**Input:**
```
5
3 8 -2 8 1
```

**Output:**
```
sum=18
avg=3.60
min=-2
max=8
```

**Hints:**  
- Use an `int[]` array.  
- Track sum, min, and max in a single loop.  
- For average, cast to `double`.

---

## 2️⃣ Pattern Printing with Loops 🎨✨

**Goal:** Practice nested loops and `if` conditions.

**Task:**  
Given `n` and a character `c`, print three patterns:  
1️⃣ Right triangle (1 to n characters per line)  
2️⃣ Hollow square `n×n`  
3️⃣ X shape using diagonals

**Input:**
```
4
#
```

**Output:**
```
#
##
###
####

####
#  #
#  #
####

#  #
 ## 
 ## 
#  #
```

**Hints:**  
- For the hollow square, print character only when row/column = 1 or n.  
- For the X, print when `i == j` or `i + j == n - 1`.

---

## 3️⃣ Simple Calculator 🧮⚙️

**Goal:** Use `switch`, arithmetic operations, and loops.

**Task:**  
Show a menu repeatedly until the user enters `0`:  
1️⃣ Add, 2️⃣ Subtract, 3️⃣ Multiply, 4️⃣ Divide, 5️⃣ Modulo.  
Each operation reads two integers and prints the result.  
If dividing by zero → print `"Error: divide by zero"`.

**Example:**
```
7 + 5

10 / 0

exit
```
Output:
```
Result: 12
Error: divide by zero
Bye!
```

**Tip:** Use `while(true)` and `break` to exit.

---

## 4️⃣ String Analyzer ✍️🧾

**Goal:** Practice working with strings and characters.

**Task:**  
Read one line of text and count:  
- Number of **vowels** (`a, e, i, o, u`, case-insensitive)  
- Number of **other letters**  
- Number of **digits**  
- Number of **spaces**  
- Number of **words** (split by one or more spaces)

**Example Input:**
```
Hello  Java 11
```

**Example Output:**
```
vowels=4
letters=7
digits=2
spaces=3
words=3
```

**Hint:** Use `trim()` and `split("\s+")` for words.

---

## 5️⃣ Unit Converter 🔁🌡️

**Goal:** Work with `double`, menus, and formatted output.

**Menu Options:**  
1️⃣ Celsius → Fahrenheit (F = C×1.8 + 32)  
2️⃣ Fahrenheit → Celsius (C = (F−32)/1.8)  
3️⃣ Kilometer → Mile (mile = km×0.621371)  
4️⃣ Mile → Kilometer (km = mile/0.621371)  
0️⃣ Exit

**Example:**
```
1
25
0
```
Output:
```
Result: 77.00
Bye!
```

**Hint:** Use `System.out.printf("Result: %.2f%n", value);`

---

## 6️⃣ Sorting & Linear Search 🧭

**Goal:** Practice algorithms with arrays.

**Task:**  
Read `n`, then `n` integers. Sort them ascendingly.  
Then read target `t` and print the **first index** (0-based) of `t`, or `-1` if not found.

**Example Input:**
```
6
5 1 5 3 -2 8
5
```
**Output:**
```
-2 1 3 5 5 8
3
```

**Hint:** Implement selection sort manually (find smallest and swap).

---

## 7️⃣ Number Functions — Primes & GCD 🔢🧠

**Goal:** Learn simple numeric algorithms.

**Task:**  
1️⃣ Check if `n` is prime.  
2️⃣ Print all primes ≤ `n`.  
3️⃣ Compute `gcd(a,b)` and `lcm(a,b)` for two integers.

**Example Input:**
```
10
12 18
```
**Output:**
```
prime(10)=false
primes<=10: 2 3 5 7
gcd(12,18)=6
lcm(12,18)=36
```

**Hint:**  
Use Euclid’s algorithm:
```java
while (b != 0) { int t = a % b; a = b; b = t; }
```

---

## 8️⃣ Leap Year & Day of Year 📅🕒

**Goal:** Practice `if`, `switch`, and date arithmetic.

**Task:**  
Input: year `y`, month `m`, and day `d`.  
Output:  
- Whether `y` is leap year  
- Days in month `m`  
- The day number in the year (1–365/366)

**Example:**
```
2024
3
5
```
Output:
```
leap=true
daysInMonth=31
dayOfYear=65
```

**Hint:** Use `switch` for month lengths and add up previous months’ days.

---

## 9️⃣ Guess the Number 🎯🎲

**Goal:** Practice loops and conditionals.

**Task:**  
Program generates a random number between 1–100.  
The user guesses until correct, getting hints: “Higher” / “Lower”.  
When guessed, print attempts count.

**Example:**
```
Guess? 50
Lower
Guess? 25
Higher
Guess? 32
🎉 Correct! The number was 32
Attempts: 3
```

**Hint:** Use `Math.random()` and a counter variable.

---

## 🔟 Multiplication Table & Diagonals 🧮📐

**Goal:** Work with 2D arrays and nested loops.

**Task:**  
Given `n` (2–15), print an `n×n` multiplication table.  
Then print the sum of the **main diagonal** and **secondary diagonal**.

**Example Input:**
```
3
```
**Output:**
```
1  2  3
2  4  6
3  6  9
mainDiagonalSum=14
secondaryDiagonalSum=10
```

**Hint:**  
- Main diagonal: `i == j`  
- Secondary: `i + j == n - 1`

---


