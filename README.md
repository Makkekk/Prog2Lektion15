opgave01	

I opgave01 pakken finder I StackEaaa interfacet, samt en konkret
implementering af dette interface i LinkedStack klassen, med tilhørende tests.
Lav en ny implementering ArrayListStack hvor I bruger en ArrayList til at holde
styr på stack elementerne.


Opgave 2

Lav en metode der givet en streng kan fortæller om parenteserne i strengen
matcher hinanden.
De parenteser der kan genkendes er (), {},[].
Følgende streng er lovlig:
(3+{5{99{*}}[23[{67}67]]})
Følgende streng er ikke lovlig:
(}){
Metoden skal have følgende signatur:
public static boolean checkParantes(String s)


Opgave 3

En drop-out stak er en stak der har samme funktionalitet som en almindelig stak,
bortset fra, at stakken maksimalt kan indeholde n elementer. Når det (n+1)’te
element indsættes, så droppes det første element, så størrelsen af drop-out
stakken aldrig bliver større end n.
Færdiggør DropOutStack klassen ved brug af dobbeltrettet noder.
2/2


Opgave 4 (Ekstra opgave)

Lav en klasse PostFixEvaluator, der indeholder en metode
public int evaluate(String input)
der givet input returnerer værdien af det postfixudtryk, der svarer til input. Hvis
input ikke er et korrekt postfixudtryk, skal der kastes en RuntimeException.
Metoden skal programmeres under anvendelse af en stak. Hvis input = ” 12 2 5
+ - 4 * 2 /” , skal der returneres 10
