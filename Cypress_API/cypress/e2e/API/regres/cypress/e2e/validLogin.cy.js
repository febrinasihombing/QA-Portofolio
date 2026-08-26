/// <reference types="cypress" />

describe('OrangeHRM Login Test', () => {
  it('should login successfully with valid credentials', () => {
    // Kunjungi halaman login
    cy.visit('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

    // Tunggu input muncul (karena ada loading delay)
    cy.get('input[name="username"]', { timeout: 10000 }).should('be.visible')
    cy.get('input[name="password"]').should('be.visible')

    // Isi username dan password
    cy.get('input[name="username"]').type('Admin')
    cy.get('input[name="password"]').type('Admin123')

    // Klik tombol login
    cy.get('button[type="submit"]').click()

    // Verifikasi berhasil login (misalnya user dialihkan ke dashboard)
    cy.url({ timeout: 10000 }).should('include', '/dashboard')
    cy.contains('Dashboard').should('be.visible')
  })
})
