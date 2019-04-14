# 01_calculator-tests

[Jest też dostępna polska wersja](README.pl.md)

Run existing test located inside `CalculatorTests`. It should pass.

# Exercise

1. Add 3 tests to existing one using different parameters. Here is some examples but feel free to use your own:
```
0 + 101
-5 + -2
-1 + 5
...
```
2. Add new method called `extract` to `Calculator` class. 
```
public int extract(int a, int b) {
    return -1;
}
```
3. Add tests covering this method.
4. Run your tests, they should fail (unless your result is not equal -1)
4. Implement logic required to pass tests.
5. Repeat process with next methods (steps 1 - 4) adding 3 tests for each new method:
* `multiply` - method, allowing you to multiply two elements. Example:
```
calc.multiply(2, 3) should return 6
```
* `divide` - allowing you to divide two elements
```
calc.divide(2, 2) should return 1
```
- think how to handle dividing by 0 
- what type should method return?
* `power` - allowing you to power number. Example:
```
calc.power(2, 10) should return 1024
```
