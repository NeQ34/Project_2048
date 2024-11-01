# Gra 2048 w Javie
- [Opis Gry](#opis-gry)
- [Instalacja](#instalacja)
- [Uruchomienie](#uruchomienie)
- [Zasady gry](#zasady-gry)
- [Technologie](#technologie)
- [Autor](#autor)

## Opis gry
2048 to popularna gra logiczna, w której zadaniem gracza jest przesuwanie płytek na planszy, aby połączyć identyczne liczby. Każde połączenie dwóch takich samych płytek daje nową płytkę o sumie ich wartości. Celem jest osiągnięcie wartości 2048 na jednej z płytek.

## Instalacja
1. Upewnij się, że masz zainstalowaną Javę (Java JDK 8 lub nowszą).
2. Sklonuj repozytorium na swój lokalny komputer:
   ```sh
   link
3. Przejdź do katalogu z projektem:
   ``` sh
   cd Project-2048

## Uruchomienie
1. Skompiluj pliki .java:
   ``` sh
   javac src/*.java
2. Uruchom grę:
   ```sh
   java -cp src Main

## Zasady gry:
   * Gracz może przesuwać płytki w górę, dół, lewo lub prawo.
   * Gdy dwie płytki o tej samej wartości dotkną się, łączą się, tworząc płytkę o podwojonej wartości.
   * Celem gry jest osiągnięcie płytki z wartością 2048.
   * Gra kończy się, gdy nie można wykonać żadnego ruchu.

## Technologie
   * Java 13
   * Swing

![Opis GIF-a](https://github.com/user-attachments/assets/d1c18efa-c1da-4c46-b9a8-e6ac85e4d9af)
