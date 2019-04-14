# 04_smog-tests
[Here is oryginal english version](README.pl.md)

Uruchom istniejący test znajdujący się wewnątrz `FizzBuzzTest`.
Wszystkie testy powinny przejść.
Zwróć uwagę na dodatkowe logi, które pojawiają się podczas testu.

# Ćwiczenie

W tym zadaniu, twoim zadaniem jest rozwinięcie usługi odpowiedzialnej za wysyłanie różnego rodzaju typów alarmów w oparciu o pomiary PM.
Obecnie każdy kraj ma własne limity, definiujące kiedy dany typ powinien być wysyłany do ludzi.
Spójrz na dane zdjęcie:
![.img/477.jpg](.img/477.jpg)
Źródło: [https://www.polskialarmsmogowy.pl/polski-alarm-smogowy/smog/szczegoly,poziomy-informowania-i-alarmowe,19.html](https://www.polskialarmsmogowy.pl/polski-alarm-smogowy/smog/szczegoly,poziomy-informowania-i-alarmowe,19.html)

1. Przejdź do `PmAlarmServiceTest` i przeprowadź trzy testy.
2. Jak można zauważyć, dla każdego testu utworzono instancję `PmAlarmService`.
3. Zastąp wszystkie trzy wystąpienia instancji jedną przy użyciu odpowiedniej adnotacji (spójrz na `FizzBuzzTest` jako wskazówkę)
4. Utwórz zmienną `timeExecution`, która będzie używana do przechowywania wartości czasu wykonania dla wszystkich uruchomionych testów. Wydrukuj go na ostatnim etapie po wykonaniu całego testu.
5. Wdrożyć logikę dla 3 krajów z brakujących krajów i pokryj ją odpowiednimi testami.
6. Na tym etapie powinniśmy zauważyć, że ten projekt zmierza w złym kierunku.
7. Teraz, gdy masz już działający kod i jesteś objęty odpowiednią liczbą testów, spróbuj zmienić ten kod. Możesz utworzyć nowe wyliczenia reprezentujące `PmCountryAlarmLevel`, które przechowuje wszystkie wymagane informacje.