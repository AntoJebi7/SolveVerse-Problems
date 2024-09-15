# 🚀 SolveVerse-Problem-Solving Hub 🌍
Initiative on September 12, 2024, to solve a LeetCode problem daily in order to steadily build and refine my problem-solving skills.
https://leetcode.com/problemset/
## LeetCode Heatmap Building
<div align="center">
  <img src="https://leetcard.jacoblin.cool/dantojebi?ext=heatmap" alt="LeetCode Heatmap" width="90%" />
</div>
Welcome to my repository of coding challenges and solutions in different programming languages! This repo is constantly evolving as I add more problems and solutions over time. Whether you're learning a new language, preparing for coding interviews, or just love problem-solving, this is the place for you. Feel free to explore, contribute, or give feedback!

---

## 🧠 What You'll Find Here
This repository consists of a growing collection of algorithmic and data structure problems, each solved in various languages to demonstrate versatility and approach. 

### 📚 Categories Covered:
- **Array & String Manipulation**
- **Dynamic Programming**
- **Graph Algorithms**
- **Linked Lists**
- **Recursion & Backtracking**
- **Search & Sorting Algorithms**
- **Tree Traversals**
- **Greedy Algorithms**
- **Mathematical Problems**
- **Bit Manipulation**

---

## 🌐 Languages
Solutions are available in a range of programming languages to offer flexibility and variety, including:

- **C++**
- **Python**
- **Java**
- **JavaScript**

> *More languages to be added soon!*

## Bit Problems:
### XOR Gate Truth Table

| Input A | Input B | A ⊕ B (XOR) |
|---------|---------|-------------|
|    0    |    0    |      0      |
|    0    |    1    |      1      |
|    1    |    0    |      1      |
|    1    |    1    |      0      |

### AND Gate Truth Table

| Input A | Input B | A ∧ B (AND) |
|---------|---------|-------------|
|    0    |    0    |      0      |
|    0    |    1    |      0      |
|    1    |    0    |      0      |
|    1    |    1    |      1      |

# Bit Manipulation Concepts

Bit manipulation involves performing operations directly on bits. Below is a table summarizing common bit manipulation techniques and their corresponding operations.

| Operation                         | Description                                          | Formula                  | Example Code                                  | Result (Decimal) | Result (Binary) |
|-----------------------------------|------------------------------------------------------|--------------------------|-----------------------------------------------|------------------|-----------------|
| **Checking if a bit is set**       | Check if the n-th bit is set (1)                    | `x & (1 << n)`           | `x = 5 (0101 in binary), n = 2`<br>`(x & (1 << n))` | `4`              | `0001`          |
| **Setting a bit**                 | Set the n-th bit to 1                               | `x |= (1 << n)`          | `x = 5 (0101 in binary), n = 1`<br>`x |= (1 << n)` | `7`              | `0111`          |
| **Clearing a bit**                | Clear (set to 0) the n-th bit                       | `x &= ~(1 << n)`         | `x = 5 (0101 in binary), n = 2`<br>`x &= ~(1 << n)` | `1`              | `0001`          |
| **Toggling a bit**                | Flip the n-th bit                                   | `x ^= (1 << n)`          | `x = 5 (0101 in binary), n = 1`<br>`x ^= (1 << n)` | `7`              | `0111`          |
| **Checking if a number is power of 2** | Check if the number is a power of 2                | `x & (x - 1) == 0`       | `x = 4 (0100 in binary)`<br>`(x & (x - 1)) == 0` | `true`           | `0100`          |
| **Counting set bits**              | Count the number of set bits (Hamming Weight)       | `__builtin_popcount(x)`  | `x = 5 (0101 in binary)`<br>`__builtin_popcount(x)` | `2`              | `0101`          |
| **Right shift (>>) **              | Shift bits to the right                             | `x >> n`                 | `x = 8 (1000 in binary), n = 2`<br>`x >> n`     | `2`              | `0010`          |
| **Left shift (<<)**                | Shift bits to the left                              | `x << n`                 | `x = 3 (0011 in binary), n = 2`<br>`x << n`     | `12`             | `1100`          |
| **Swapping two numbers using XOR**| Swap two numbers without using a temporary variable| `a ^= b; b ^= a; a ^= b;` | `a = 5, b = 7`<br>`a ^= b; b ^= a; a ^= b;`   | `a = 7, b = 5`   | `0111, 0101`    |


