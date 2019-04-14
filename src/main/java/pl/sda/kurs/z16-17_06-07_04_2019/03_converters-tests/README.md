# 03_converters-tests

[Jest też dostępna polska wersja](README.pl.md)

Run existing test located inside `LengthTests`. It should pass.

# Exercise
1. Add new interface `TemperatureUnit` located in new package `foo.bar.temperature`
2. Add 3 classes implementing above interface:
* `Celsius`
* `Fahrenheit`
* `Kelvin`
3. Implement test covering multiple conversions:
* `Celsius` to `Fahrenheit`
* `Celsius` to `Kelvin`
* `Kelvin` to `Celsius` 
* `Kelvin` to `Fahrenheit` 
* `Fahrenheit` to `Celsius`
* `Fahrenheit` to `Kelvin`
4. Each of above classes should throw `InvalidParameterException` exception whenever value is lower than `-273,15 °C` units or equal value in different unit.
5. Add tests covering this feature.







