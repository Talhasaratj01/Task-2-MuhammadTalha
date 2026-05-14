# Student Grade Calculator (Java)

Simple command-line program to calculate total marks, average percentage, and grade from user-entered subject marks.

Features
- Input validation: prompts until a valid positive integer for number of subjects is entered.
- Marks validation: accepts only integers between 0 and 100 for each subject.
- Robust against invalid types (uses `InputMismatchException` handling).
- Outputs total marks, average percentage (formatted), and a letter grade (`A`/`B`/`C`/`D`/`F`).

Files
- `StudentGradeCalculator.java` — main program (located in this folder).

Build & Run

From the `gradecalculator` folder:
```powershell
cd D:\Decodelabs\gradecalculator
javac StudentGradeCalculator.java
java StudentGradeCalculator
```

Notes
- Enter numeric input only when prompted; the program will re-prompt on invalid input.
- Grading scale:
  - A: 90% and above
  - B: 80%–89.99%
  - C: 70%–79.99%
  - D: 60%–69.99%
  - F: below 60%

Example session
```
Enter number of subjects: 3
Enter marks for subject 1 (0-100): 85
Enter marks for subject 2 (0-100): 90
Enter marks for subject 3 (0-100): 78

Results:
Total Marks: 253 / 300
Average: 84.33%
Grade: B
```

If you'd like, I can:
- Add a small README at project root linking both `ATM` and `gradecalculator` projects,
- Create a `run.bat` or small script to compile & run both projects,
- Initialize a GitHub repo and push the `gradecalculator` project like we did for `ATM`.

