package cap7;
// Classe Card representa uma carta de baralho.

public class Card {
    private final String face; // face da carta ("Ace", "Deuce", ...)
    private final String suit; // naipe da carta ("Hearts", "Diamonds", ...)
    
    // construtor de dois argumentos inicializa face e naipe da carta
    public Card(String cardFace, String cardSuit) {
        this.face = cardFace; // inicializa face da carta
        this.suit = cardSuit; // inicializa naipe da carta
    }
    
    // retorna representação String de Card
    public String toString() {
        return face + " de " + suit;
    }
} // Fim da classe Card
