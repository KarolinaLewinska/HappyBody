# Aplikacja HappyBody 
**Autorzy:** [Karolina Lewińska](https://github.com/KarolinaLewinska), [Justyna Gapys](https://github.com/justynagapys) <br />
**Grupa S22-32**
**Cel aplikacji:** Aplikacja obliczająca wskaźnik BMI oraz BMR (minimalne zapotrzebowanie energetyczne). <br />
**Język:** Java <br />

**Opis realizacji projektu:** <br />
* Na początku stworzyłyśmy [logo aplikacji](https://www.freelogodesign.org/):

![logo](https://github.com/KarolinaLewinska/HappyBody/blob/master/ReadmeIMG/logo.PNG)

* Logo umieściłyśmy jako ikonę aplikacji w AndroidManifest.xml <br />
![manifest](https://github.com/KarolinaLewinska/HappyBody/blob/master/ReadmeIMG/androidManifest.PNG) <br />
![menu](https://github.com/KarolinaLewinska/HappyBody/blob/master/ReadmeIMG/menu.PNG)

**Interfejsy aplikacji:** <br />
![interfaces](https://github.com/KarolinaLewinska/HappyBody/blob/master/ReadmeIMG/interfaces.PNG) <br />
![interfaces2](https://github.com/KarolinaLewinska/HappyBody/blob/master/ReadmeIMG/interfaces2.PNG)

**Kod aplikacji:** <br />
1.	Deklaracja zmiennych: <br />
![declaration](https://github.com/KarolinaLewinska/HappyBody/blob/master/ReadmeIMG/variablesDeclaration.PNG) <br />

2.	Inicjalizacja zmiennych – pobranie wartości z elementów interfejsu poprzez ich ID:
![inicialization](https://github.com/KarolinaLewinska/HappyBody/blob/master/ReadmeIMG/variablesInicialization.PNG) <br />

3.	Po kliknięciu przycisku wywoływana jest funkcja onClick:
- Funkcja sprawdza czy pola tekstowe są puste. Jeśli tak to wyświetlany jest komunikat o błędzie. <br />
![onClickListener](https://github.com/KarolinaLewinska/HappyBody/blob/master/ReadmeIMG/onClickListener.PNG) <br />

- Jeśli żadne z pól nie jest puste pobierane są wpisane wartości przez użytkownika i następnie są one konwertowane do odpowiednich typów na potrzeby późniejszych obliczeń.
![convert](https://github.com/KarolinaLewinska/HappyBody/blob/master/ReadmeIMG/convert.PNG) <br />

- Obliczanie wskaźnika BMI (wynik zaokrąglony do 2 miejsc po przecinku) i wyświetlenie wartości.
![bmi](https://github.com/KarolinaLewinska/HappyBody/blob/master/ReadmeIMG/bmi.PNG) <br />

- Następnie wynik BMI jest dopasowywany do odpowiedniej instrukcji warunkowej. Wyświetlany jest pasujący komunikat i animacja. <br />
![bmiCases](https://github.com/KarolinaLewinska/HappyBody/blob/master/ReadmeIMG/bmiCases.PNG) <br />
![bmiCases2](https://github.com/KarolinaLewinska/HappyBody/blob/master/ReadmeIMG/bmiCases2.PNG) <br />

- W zależności od płci obliczany jest wskaźnik BMR (wynik zaokrąglony do 2 miejsc po przecinku) i wyświetlana jest jego wartość.
![bmr](https://github.com/KarolinaLewinska/HappyBody/blob/master/ReadmeIMG/bmr.PNG)




