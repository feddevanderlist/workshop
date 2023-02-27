# week 5

cypress en beslistabellen.

Voordat we beginnen ga in de terminal naar de week5 folder.
De snelste manier om dit te doen is: rechtermuisknop op week5 en dan `open in` vervolgens terminal
Type dan het volgende commando: `npm i` dan zou er text moeten verschijnen in het venster. <br>

Wacht niet tot dit klaar is, maar begin met het maken van de beslistabel. <br>
Aan de hand van de informatie op de volgende url:
http://158.101.196.212/#/decision <br>
_tip er zijn 3 condities en 8 uitkomsten. De uitkomsten zijn niet uniek_

**De codes die je krijgt zijn geen woorden**

Is dat gelukt? Kijk of je handmatig de code voor het scorebord kan krijgen. <br>
Waarschijnlijk zal de installatie nu voltooid zijn. In datzelfde terminal venster type `npx cypress open` <br>
klik op e2e testen en selecteer een van de browsers. En klik de [decision.cy.js](cypress/e2e/decision.cy.js) file <br>
Zoals uitgelegd kun je nu door middel van de `add command to test` en vul je gegevens uit de beslistabel in. <br>
Als dit goed is gegaan dan krijg je een code EN is het aantal testen dat je hebt gedaan 8.

Mocht dit allemaal gelukt zijn dan kun je na gaan denken over opties voor het invoerveld van de volgende link: http://158.101.196.212/#/validatie <br>
Ook hier kun je als je alles goed invult een code terug krijgen. Bestaande uit 6 letters. <br>

Denk goed na over goede en foute situaties en probeer ze allemaal uit. Vervolgens zou je dit ook kunnen automatiseren. 
Gebruik hiervoor het volgende bestand: [validation.cy.js](cypress/e2e/validation.cy.js) 

