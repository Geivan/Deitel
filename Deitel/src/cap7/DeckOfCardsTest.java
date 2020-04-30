package cap7;
// Embaralhando e distribuindo cartas.

public class DeckOfCardsTest {
    // executa o aplicativo
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // coloca Cards em ordem aleatória
        
        // imprime todas as 52 cartas na ordem em que elas são distribuídas
        for (int i = 1; i <= 52; i++) {
            // distribui e exibe uma Card
            System.out.printf("%-19s", myDeckOfCards.dealCard());
            
            if (i % 4 == 0) // gera uma nova linha após cada quarta carta
                System.out.println();
        }
    }
}
