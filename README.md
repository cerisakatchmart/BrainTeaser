## Overview
This project is a collection of classic brainteaser games. Each one is solved twice: exactly by hand, and by simulating it thousands of times in Java to confirm the answer.
## Project Structure
```
src/
├── core/        interfaces and runners shared by every puzzle
├── games/       one class per puzzle
└── Main         runs every puzzle and prints the comparison
test/
└── games/       one test class per puzzle
docs/
└── puzzles.md   hand-worked exact answers
```
