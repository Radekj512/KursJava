# 01_calculator-tests

[Here is oryginal english version](README.md)

Uruchom istniejący test znajdujący się wewnątrz `CalculatorTests`. Powinien przejść pomyślnie.

# Ćwiczenie

1. Dodaj 3 testy do istniejącego przy użyciu różnych parametrów. Oto kilka przykładów, ale zachęcam do skorzystania z własnych:
```
0 + 101
-5 + -2
-1 + 5
...
```
2. Dodaj nową metodę o nazwie `substract` do klasy` Calculator`.
```
public int substract (int a, int b) {
     return -1;
}
```
3. Dodaj testy obejmujące tę metodę.
4. Uruchom testy, powinny nie przejść (chyba, że twój wynik nie jest równy -1)
4. Zaimplementuj logikę wymaganą do zaliczenia testów.
5. Powtórz proces, implementując kolejne metody (kroki 1-4), dodając 3 testy dla każdej nowej metody:
* `multiply` - metoda, pozwalająca na pomnożenie dwóch elementów. Przykład:
```
calc.multiply (2, 3) powinien wrócić 6
```
* `divide` - umożliwia dzielenie dwóch elementów
```
calc.divide (2, 2) powinien zwrócić 1
```
- zastanów się, jak poradzić sobie z dzieleniem przez 0
- jakiego typu powinna zwracać metoda?
* `power` - pozwalając ci na podniesienie danej liczby do wybranej potęgi. Przykład:
```
calc.power (2, 10) powinien zwrócić 1024
```
