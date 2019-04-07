# 02_figures-tests
[Jest też dostępna polska wersja](README.pl.md)

Run existing test located inside `SquareTests`. It should pass.

# Exercise

0. Add missing test to `circumference` method.
1. Create new implementation of `Figure` interface called `Rectangle`. It should get two parameters in constructor `int a` and `int b`
2. Forget for a while about implementation of code. Make them just compile, so both required methods can return 0 or -1.
3. Create 1 parametrized test based on `SquareTests` class.
4. Your tests should fail, since we did not implement correctly methods yet.
5. Implement missing methods to make your tests pass.
6. Add following figures based on steps (1 - 5):
* rhombus
* triangle
* circle - you can assume π is equal to `3.14`
* trapezoid
7. Don't worry if you forgot any formula. Feel free to use google to find out :-)
