# 06_first-integration
[Here is oryginal english version](README.md)

1. Przejdź do klasy `BlockchainHashGeneratorTest` i uruchom wszystkie testy.
2. Oba są tym samym testem, z tym że jeden z nich jest mockowany, a drugi nie.
3. Porównaj czasy wykonania tych testów. Czy widzisz różnicę?
4. Następnie uruchom jeden test znajdujący się w `WeatherServiceTest` Powinien przejść, zauważyłeś podejrzany czas wykonania? Co gdyby podobnych testów było w aplikacji 200, 300?

# Ćwiczenie
1. Pierwszą rzeczą, którą musisz zrobić, to dokonać prostego pomiaru, ile czasu zajmuje przeciętne wykonanie tego testu.
2. Teraz zaimplementuj testy i logikę programu `WeatherAlarmNotifier`, aby spełniał następujące wymagania:
- jeśli temperatura wzrasta powyżej 35 stopni Celsjusza, oznacza to, że serwis powinien wywołać alarm `SECOND_LEVEL`
- jeżeli wiatr wieje szybciej niż 100 km / h, oznacza to, że serwis powinien wywołać alarm `SECOND_LEVEL`
- jeśli opady są powyżej 100 mm, oznacza to, że serwis powinien wywołać alarm `THIRD_LEVEL`
- jeśli występuje więcej niż jeden alarm powyżej, oznacza to, że serwis powinien zgłosić alarm `FIRST_LEVEL`
- dla wszystkich innych sytuacji serwis powinien podnosić status `ALL_OK`
Możesz od razu przejść do punktu 3, który może ułatwić ci życie, niwelując długi czas wykonywania.
3. Teraz spróbuj zamockować usługi od których jesteś zależny, aby łatwiej było przetestować i uzyskać szybsze czasy wykonania testów
4. Czy zauważyłeś pewne złe załozenia w tym podejściu? Czy masz jakieś pomysły na to, jak można je refaktoryzować, abyś mógł uniknąć niepotrzebnych mockó i nadmiernej złożoności?