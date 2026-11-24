# Software Testing

## Test Case & TDD Document
- [Test case G19 (Google Sheets)](https://docs.google.com/spreadsheets/d/1XXLxCIrHY3XAV_hgxRRTaoLXhHi7a6O05qNhlghyxkg/edit?usp=sharing)

## Task 2: Testcase Design (GradeCalculator)

| TC ID | Technique | score | เงื่อนไขที่เข้า (Branch) | Expected return | เป้าหมาย | Actual | Status |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| TC1 | BVA / EP | 100 | `score >= 80` | `"A"` | ขอบบนสุดของเกรด A | | Not run |
| TC2 | BVA / EP | 80 | `score >= 80` | `"A"` | ขอบล่างของเกรด A (พอดีเกณฑ์) | | Not run |
| TC3 | BVA | 79 | `score >= 75` | `"B+"` | ขอบบนของเกรด B+ (ต่ำกว่า A อยู่ 1) | | Not run |
| TC4 | BVA / EP | 75 | `score >= 75` | `"B+"` | ขอบล่างของเกรด B+ | | Not run |
| TC5 | BVA | 74 | `score >= 70` | `"B"` | ขอบบนของเกรด B | | Not run |
| TC6 | BVA / EP | 70 | `score >= 70` | `"B"` | ขอบล่างของเกรด B | | Not run |
| TC7 | BVA | 69 | `score >= 65` | `"C+"` | ขอบบนของเกรด C+ | | Not run |
| TC8 | BVA / EP | 65 | `score >= 65` | `"C+"` | ขอบล่างของเกรด C+ | | Not run |
| TC9 | BVA | 64 | `score >= 60` | `"C"` | ขอบบนของเกรด C | | Not run |
| TC10 | BVA / EP | 60 | `score >= 60` | `"C"` | ขอบล่างของเกรด C | | Not run |
| TC11 | BVA | 59 | `score >= 55` | `"D+"` | ขอบบนของเกรด D+ | | Not run |
| TC12 | BVA / EP | 55 | `score >= 55` | `"D+"` | ขอบล่างของเกรด D+ | | Not run |
| TC13 | BVA | 54 | `score >= 50` | `"D"` | ขอบบนของเกรด D | | Not run |
| TC14 | BVA / EP | 50 | `score >= 50` | `"D"` | ขอบล่างของเกรด D | | Not run |
| TC15 | BVA | 49 | `else (0–49)` | `"F"` | ขอบบนของเกรด F (ต่ำกว่า D อยู่ 1) | | Not run |
| TC16 | BVA / EP | 0 | `else (0–49)` | `"F"` | ขอบล่างสุดของเกรด F | | Not run |
| TC17 | BVA / EP (Invalid) | -1 | `score < 0` | `IllegalArgumentException` | คะแนนติดลบ ต่ำกว่าช่วง 0–100 | | Not run |
| TC18 | BVA / EP (Invalid) | 101 | `score > 100` | `IllegalArgumentException` | คะแนนเกิน 100 นอกช่วง 0–100 | | Not run |

### Requirements from the exercise

| Req ID | Requirement Description | Related Test Cases |
| :---: | :---: | :---: |
| R1 | คะแนนในช่วง 80–100 (`score >= 80 && score <= 100`) ต้องคืนค่าเกรด `"A"` | TC1, TC2 |
| R2 | คะแนนในช่วง 75–79 (`score >= 75 && score <= 79`) ต้องคืนค่าเกรด `"B+"` | TC3, TC4 |
| R3 | คะแนนในช่วง 70–74 (`score >= 70 && score <= 74`) ต้องคืนค่าเกรด `"B"` | TC5, TC6 |
| R4 | คะแนนในช่วง 65–69 (`score >= 65 && score <= 69`) ต้องคืนค่าเกรด `"C+"` | TC7, TC8 |
| R5 | คะแนนในช่วง 60–64 (`score >= 60 && score <= 64`) ต้องคืนค่าเกรด `"C"` | TC9, TC10 |
| R6 | คะแนนในช่วง 55–59 (`score >= 55 && score <= 59`) ต้องคืนค่าเกรด `"D+"` | TC11, TC12 |
| R7 | คะแนนในช่วง 50–54 (`score >= 50 && score <= 54`) ต้องคืนค่าเกรด `"D"` | TC13, TC14 |
| R8 | คะแนนในช่วง 0–49 (`score >= 0 && score <= 49`) ต้องคืนค่าเกรด `"F"` | TC15, TC16 |
| R9 | คะแนนที่อยู่นอกช่วง 0–100 (`score < 0` หรือ `score > 100`) ต้องโยน `IllegalArgumentException` | TC17, TC18 |
