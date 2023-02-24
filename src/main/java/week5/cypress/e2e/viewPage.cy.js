describe('template spec', () => {
    it('passes', () => {
        cy.visit('http://158.101.196.212/#/decision');

        cy.get('h1').should('have.text', "Tijd om beslissingen te maken");
    })
    it('create new transaction', () => {
        cy.visit('http://158.101.196.212/#/decision');
        /* ==== Generated with Cypress Studio ==== */
        cy.get('#kleur').clear('b');
        cy.get('#kleur').type('blauw');
        cy.get('#geboorte-datum').clear('0');
        cy.get('#geboorte-datum').type('01-01-2000');
        cy.get('#sportMinuten').clear('1');
        cy.get('#sportMinuten').type('180');
        cy.get('#testButton').click();

        cy.get(':nth-child(3) > div > p').should('contain.text', "Vissen");

        cy.get('#codeList').should('contain.text', "_  _  _  _  V  _  _  _");

        /* ==== End Cypress Studio ==== */
        /* ==== Generated with Cypress Studio ==== */
        cy.get('.main > :nth-child(2)').click();
        cy.get('#sportMinuten').clear();
        cy.get('#sportMinuten').type('22');
        cy.get('#testButton').click();
        cy.get(':nth-child(3) > div > p').click();
        cy.get('#codeList').click();
        /* ==== End Cypress Studio ==== */
    })
})