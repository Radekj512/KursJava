# 05_coverage-tests
[Here is oryginal english version](README.md)

Czy kiedykolwiek słyszałeś o efekcie latte? Oto kilka linków wyjaśniających ten termin:
* [https://natemat.pl/70581,efekt-latte-czyli-oszczedzanie-na-drobiazgach](https://natemat.pl/70581,efekt-latte-czyli-oszczedzanie-na-drobiazgach)
* [https://www.forbes.com/sites/robertberger/2017/05/27/the-latte-factor-7-key-lessons-we-can-learn-from-a-cup-of-coffee/](https://www.forbes.com/sites/robertberger/2017/05/27/the-latte-factor-7-key-lessons-we-can-learn-from-a-cup-of-coffee/)

TLDR: `Latte Factor - (ekonomia) Zjawisko polegające na tym, że wiele małych zakupów przyczynia się do znacznych wydatków w czasie

Uruchom istniejący test z opcją zasięgu znajdującą się wewnątrz `MoneySavingCalculatorTest`.
Wszystkie testy powinny przejść i powinieneś zauważyć 100% pokrycia.

# Ćwiczenie

1. Spróbuj zaimplementować pozostałe wartości `SavingFrequency`, aby obliczać prawidłowe wartości i zachować 100% pokrycia.
2. Na przykład, oto jeden ze scenariuszy, który powinien zostać uwzględniony podczas tego ćwiczenia:
`` `
Jeśli oszczędzam 1,23 zł dziennie przez następne 138 dni, powinienem zaoszczędzić "169,74 PLN"
Jeśli oszczędzam 2 złote co tydzień przez kolejne 100 dni, powinienem zaoszczędzić "28 PLN"
i tak dalej...
`` `
3. Wersja bardziej zaawansowana powinna umożliwić oszacowanie oszczędności w długim okresie na podstawie wartości procentowej ROI. Załóżmy, że jest to wartość ROI przypisana do danego okresu:
Przykład:
```
John oszczędza 100 $ miesięcznie zamiast wydawać je na papierosy. Zamiat nałogu wybrał inwestycję z ROI równym 1% / miesiąc
Ile pieniędzy dostanie po 5 latach?
Rozpiszmy to:
1 miesiąc - wkłada 100 $ na konto
2 miesiące - dostaje 101 $ od pierwszego miesiąca i stawia kolejne 100 $ na koncie, więc na razie ma 201 $
3 miesiące - dostaje 203,01 $ z poprzednich miesięcy i stawia kolejne 100 $, więc teraz ma 303,01 $
4 miesiące - dostaje 306,04 $ z poprzednich miesięcy i stawia kolejne 100 $, więc teraz ma 406,04 $
5 miesięcy - dostaje 410,10 $ z poprzednich miesięcy i stawia kolejne 100 $, więc teraz ma 510,10 $
...
60 miesięcy - dostaje 8248,63 $ z poprzednich miesięcy i stawia kolejne 100 $, więc teraz ma 8348,63 $
```