## Workshop 3

Api Testen met postman <br>
Clone dit project: `https://github.com/feddevanderlist/TestContainersDemoApplication.git`

Voer dan een `mvn clean verify` uit op de commandline. Of in intellij zelf aan de rechterkant met het M teken.
(Zorg dat je docker op de achtergrond draait)

Controleer of er een postgres container aan je docker is toegevoegd.
Start deze op. In het git project staat ook een readme. Lees deze door.

Start de `TestContainersDemoApplication` class op met de groene start knop.
Daarna kun je in postman met `localhost:10603/` gevolgd door de verschillende naamgeving beginnen met informatie ophalen.

- Begin met gebruiker probeer er eens eentje aan te maken
- Vraag hem dan terug
- Update een van de onderdelen. Bijvoorbeeld de naam of de leeftijd
- Probeer dit ook met de andere klassen en als laatste
<br> Alvast een voorbeeld body:
```json
  {
        "id": 1,
        "voornaam": "Homer",
        "achternaam": "Simpson",
        "leeftijd": 45,
        "titel": "Animated Character",
        "admin": false
    }
```

Volgende week gaan wij deze werkzaamheden automatiseren.

Mocht je een sneak peak willen kijk eens op: https://www.testcontainers.org/
https://www.javatpoint.com/feature-file-in-cucumber-testing