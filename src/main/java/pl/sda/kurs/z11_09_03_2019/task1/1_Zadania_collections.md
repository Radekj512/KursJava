1. Napisz symulator losowania Lotto 
    * Z  użyciem Set
    * Z  użyciem ArrayList
    
2. Dla tablicy wejściowej input zawierającą liczby typu int zwrócić tablicę zawierającą
   ilość elementów ujemnych oraz sumę elementów dodatnich. 
   Jeśli tablica będzie pusta lub null, wtedy należy zwrócić pustą tablicę.
    
3. Utwórz klasę Koło z polem promień. Stwórz Listę obiektów Koło i dodawaj
   do niej elementy o losowym promieniu z zakresu 0-1 dopóki losowy promień nie będzie mnijeszy od 0.01.
    * Wypisz elementy na ekranie
    * znajdz najmniejszy i najwiekszy element w tablicy
    * posortuj otrzymana liste
    * oblicz srednia arytmetyczna promieni elementów w kolekcji i sprawdź czy element o takim promieniu
      znajduje się w tej tablicy 
    
4. Utwórz dowolną klasę, a potem zainicjalizowaną tablicę obiektów tej klasy. 
   Zawartością tablicy wypełnij listę. 
   Wyłuskaj z niej fragment listy metodą subList(), a następnie usuń tę podlistę z oryginalnej listy.
  
5. Utwórz i zapełnij listę List<Integer>. Utwórz drugą listę List<Integer>. 
   Wstawienia do pierwszej listy elementy listy drugiej,
   ale w odwrotnej kolejności.
  
6. Napisz program, który będzie pobierał od użytkownaika nazwę państwa,
 i będzie zwracał stolicę tego Państwa.
    * dodaj funkcjonalnoć dodawania pary pańctwo:stolica jeżeli nie mamy go zapisanego
    w pamięci programu
    * zapisz już znane pary do pliku tekstowego, (BufferedWriter)
    * po uruchomieniu program będzie pobierał dane z pliku (BufferedReader)
    
7. Na podstawie poprzedniego programu napisz quiz, który będzie sprawdzał
 wiedzę użytkownika z zakresu państwo:stolica.
     * program powinien zliczać punkty, które zdobył użytkownik 
     * Napisz program w taki sposób żeby działał w obu kierunkach tj. 
     sprawdzał czy Użytkownik zna stolicę majc nazwę państwa i nazwe państwa majc podan stolicę


8. Przeprowadż testy róznic dotyczcych ArrayList i LinkedList dla:
     * wycignięcia z niej pierwszego/środkowego/ostatniego elementu dla listy o wielkości 10/100/10000 elementów.     
     * usunięcia z niej pierwszego/środkowego/ostatniego elementu dla listy o wielkości 10/100/10000 elementów.
     * dodania do niej kolejnego elementu w ilośći 1/100/10000 
     
     Do przeprowadzenia testów wykorzystaj System.currentTimeMilis() albo System.nanoTime()
     
9. Stwórz algorytm sterujący pracą automatu z napojami.
 Zakładamy, że automat przyjmuje monety 1zł, 2zł i 5zł. 
 Puszka napoju kosztuje 1zł. Na starcie automat nie ma żadnych pieniędzy.
 Dla wskazanej listy wejściowej monet, należy zwrócić true lub false w zależności
 czy automat będzie w stanie zwrócić resztę. Każda moneta jest wrzucana przez innego klienta.

 Przykład: Dla monet: List coins = List.of(1, 2, 1, 1, 5) program zwróci wartość *true*,
 zaś dla monet: List coins = List.of(1, 2, 2, 5, 2) program powinien zwrócić wartość *false*,
 gdyż już dla drugiej monety 2zł nie będzie możliwości zwrócenia reszty kupującemu.
            
    