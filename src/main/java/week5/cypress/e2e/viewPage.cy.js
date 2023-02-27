describe('Demo spec', () => {
    it('passes', () => {
        cy.visit('http://158.101.196.212/#/easter');
        cy.viewport(1280,1000);
        cy.get('.egg').should('have.length',6);

    })

})
