# 03_converters-tests
[Here is oryginal english version](README.pl.md)

Uruchom istniejący test znajdujący się wewnątrz `LengthTests`. Powinien przejść.

# Ćwiczenie
1. Dodaj nowy interfejs `TemperatureUnit` znajdujący się w nowym pakiecie `foo.bar.temperature`
2. Dodaj 3 klasy implementujące powyższy interfejs:
* `Celsius`
* `Fahrenheit`
* `Kelvin`
3. Wykonaj test obejmujący wszystkie możliwe konwersje:
* `Celsius` to `Fahrenheit`
* `Celsius` to `Kelvin`
* `Kelvin` to `Celsius`
* `Kelvin` to `Fahrenheit`
* `Fahrenheit` to `Celsius`
* `Fahrenheit` to `Kelvin`
4. Każda z powyższych klas powinna generować wyjątek `InvalidParameterException`, gdy wartość niższa niż `-273,15 °C` lub odpowiadające temperatury w innej skali.
5. Dodaj testy obejmujące tę metodę.
