Założenia dla zadań:
--

* nie korzystamy z pętli -> tylko streamy(!)
* staramy się minimalizować ilość if()
* zadania dzielimy na klasy o pojedyńczej odpowiedzialności
* ograniczamy widoczność tak bardzo jak się da
* tworzone klasy umieszczamy w odpowiednich pakietach

Zadania 
--

1) Napisz grę w kółko i krzyżyk. 
  *  odpowiedzialność za zarządzanie wejściem wyjściem przenieś do oddzielnych klas 
  *  pozwól pierwszemu graczowi wybrać czy chcę grać kółkiem czy krzyżykiem.
  *  przy każdym ruchu wyświetli pole gry i numer gracza (wystarczy na konsoli)
  *  po każdym ruchu sprawdzi czy to koniec partii
  *  po skończonej grze pozwoli graczom zagrać jeszcze raz  


2) Cwiczenie:
* Napisz klasę Person, która powinna miec pola Name, LastName, Account, Id, Bank Card
* Napisz klasę Account która powinna miec pola Balance, DailyLimit, Number, BAnk 
* Napisz klasę Bank która będzie miała listę(?) Account, oraz metody add(), withdraw(),  
* Napisz klasę Product która będzie miała pola name i value 
* Napisz klasę Shop która będzie miała listę produktów
* Napisz interfejs BankCard który będzie miał metodę pay(), withdraw()
* Zaimplementu interfejs w dwóch klasach CreditCard i DebitCard -> 
    karta kredytowa nie sprawdza dziennego limitu, ani stanu konta  
* Dodaj do klasy Person funkcjonalność robienia zakupów zgodnie z przekazaną listą <Product>
* Jeżeli przdmioty z listy są w sklepie sklep powinien pobrać od klienta kartę kredytową
    i jeżeli to możliwe pobrać z niej kwotę będąca sumą wartości produktów na liście
* Wszystkie kroki sygnalizuj odpowiednim komentarzem (System.out.println())
* Dodaj klasę Employer która będzie miała zbiór pracowników, dla każdego
 z nich odpowiednią pensję oraz metodę paySalarys(), która będzie 
 wypłacała pracownikom nalezne wynagrodzenie
* Napisz funkcjonalność generowania losowej listy zakupów 
* Utwórz program który będzie symulował przebieg danych:
    * raz na 10 sekund będzie wypłacane wynagrodzenie wszystkim Person
    (Thread.currentThread().sleep())
    * raz na 2 sekundy każdy Person będzie robił zakupy


Stwórz kilka symulacji -> 

Klient kupuje wszystkie produkty które są na liście z kartą kredytową
    * mając dość pienieędzy na koncie
    * mając za mało pieniędzy na konice
    * ponad dzienny limit 
    * równo z dziennym limitem 
Klient kupuje wszystkie produkty które są na liście z kartą debetową
    * mając dość pienieędzy na koncie
    * mając za mało pieniędzy na konice
Klient kupuje tylko część produktów które są na liście z kartą debetową (brak produktów w sklepie)



3) Cwiczenie:
* Zaprojektuj klasę Jedzenie. Reprezentującą rodzaj jedzenie i jego ilość.
* Zaprojektuj klasę Kot, Pies, Ptak, Ryba, które będą miały listę swoich 
ulubionych potraw. Dopisz metody dajGlos, przedstawSie.
* Zaprojektuj klasę Osoba która będzie miała listę zwierzaków, jak również 
listę dostępnych potraw.
* Napisz metodę pozwalającą nakarmić wsyzstkie posiadane przez Osobę Zwierzaki 
w zależności od ich upodobania.
* Stwórz odpowiednie obiekty i przetestuj działanie napisanej metody.
* Napisz metodę która pozwoli wykonać sztuczkę Zwierzakowi.
* Rozbuduj metodę nakarm tak aby w przypadku gdy zabraknie Osobie pokarmu dokupiła 
w sklepie wystarczającą ilość tak by mogła dokończyć karmienie Zwierzaka.
* Dopisz metodę, która pozowli poczuć głód Zwierzakom (zwieksza ich zapotrzebowanie
 na jedzenie). Puszczaj ją co jakiś czas w wątku.
* W oddzielnym wątku puszczaj metodę która będzie karmiła Zwierzaki.
* Dodaj Osobie i Zwierzakom alergie, weryfikuj na ich podstawie czy dana osoba moze 
posiadać konkretnego Zwierzaka.
* Niektóre zwierzaki lubią wychodzić na spacer inne sie bawić, 
a jeszcze inne potrzebuje wyczyszczenia ich klatki / terrarium lub kuwety.
 Zadbaj o to(*).

