# ASD
Przepraszam za błędy językowe w opisach zadań, ale są to teksty nie pisane przez moją osobę. Niemniej da się odszyfrować ich treść. Powodzenia!

# Szalki
Zadanie polega na napisaniu algorytmu mają na celu podział określonej liczby odważników o losowych masach na dwa zbiory odpowiadające dwóm szalkom wagi po jednym zbiorze na każdej ze stron. Podział powinien być wykonany w taki sposób, żeby suma mas odważników należących do jednego zbioru była możliwie najbliższa do odpowiedniej sumy mas odważników z drugiego zbioru  (aby jak najbardziej się równoważyły – czyli różnica mas obu zbiorów była możliwie blisko 0). Liczba ta jest wyznacznikiem jakości rozwiązania zadania programistycznego.
Algorytm musi obsługiwać podział przynajmniej od 3 do 2048 odważników (elementy o wartościach   1,5,10,15,20,25). Wartości mas poszczególnych odważników muszą być wybierane w sposób losowy.
Każdy odważnik musi przynależeć do któregoś z powstałych dwóch zbiorów, a ich wartości mogą się powtarzać.
Zbiory odważników reprezentujemy używając dwóch tablic.
Program powinien działać dla podanej przez użytkownika liczby odważników (w podanym wcześniej zakresie).
W wyniku działania algorytm powinien wyświetlać obydwa zbiory odważników (zbiór lewej oraz prawej szalki wagi).  
- obydwa zbiory odważników (wagi poszczególnych odważników) 
- sumy mas poszczególnych szalek (lewej i prawej) 
- różnicę między szalkami (lewą i prawą szalą)
Wyświetlone dane powinny być od siebie stosowanie odseparowane.

# DFS
Napisz algorytm, który przyjmie jako dane wejściowe tablicę integerów. Losowo z tablicy wybierze jeden element (losowo wybrany indeks z tablicy), który zostanie użyty jako korzeń naszego drzewa BST. Reszta naszego drzewa będzie wypełniana biorąc pod uwagę już wybraną wartość dla korzenia, zaczynając od pierwszego dostępnego indeksu w tablicy od lewej strony tablicy.
Po zbudowaniu drzewa BST  (binary serach tree) zgodnie z powyższymi wymogami oraz ogólnymi wymogami, algorytm również sprawdzi czy losowo wybrany element z tablicy użyty jako korzeń jest liczbą parzystą lub nie i wyświetli jego wartość z dopiskiem "Parzyste" lub "Nieparzyste". Przechodzenie przez drzewa ma się odbywać metodą DFS – in order traversal. Żadne elementy z naszej tablicy nie powinny być usuwane.
Następnie na tej podstawie algorytm wypisze tylko liście naszego drzewa, które posiadają tą samą charakterystykę co nasz korzeń - wypisze ilość liści w naszym drzewie wraz z ich wartościami (np. jeśli korzeń zawiera wartość parzystą to algorytm wyświetli tylko liście z wartościami parzystymi). 
W sytuacji gdy nie będzie liści z wartościami z tą samą charakterystyką algorytm wyświetli komunikat informujący o tym oraz wyświetli tylko ilość liści w naszym drzewie.
Ponadto algorytm na końcu wyświetli dla naszego drzewa BST wartość poprzednika metodą inorder (inorder predecessor)  oraz następcy (inorder successor).

# Sorting with Stacks
Z wykorzystaniem struktury stosu posortuj podane dane wejściowe
w następujący sposób:
- Element o maksymalnej wartości stanowi element środkowy danych wyjściowych 
- Lewa strona danych wejściowych jest ciągiem niemalejącym, natomiast prawa strona nierosnącym
