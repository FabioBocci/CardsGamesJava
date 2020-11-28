import java.util.List;

public interface Maziere<E extends DeckOfCards>           //da implementare la interfaccia DeckOfCards con tutte le sue implementazioni
{

/**
 *          Overview: Maziere di un mazzo di carte, controlla le carte in tavola, le funzioni di pescaggio ecc...
 *          TE: < CarteDelMazzo , ListaGiocatori ,   >
 */

    public void createPlayer(String username)throws NullPointerException,UsernameUsedException;
    public void drawCard(String username)throws NullPointerException, DeckEmptyException,UserNotFoundException;
    public List<E> getHandCards(String username)throws NullPointerException, UserNotFoundException;
    public boolean playCards(String username, List<E> game)throws NullPointerException, UserNotFoundException, IllegalCardsException;


}













/*----------------------------------------------

                EXCEPTIONS

-----------------------------------------------*/
class UsernameUsedException extends RuntimeException
{
    public UsernameUsedException(String name)
    {
        super("nome del giocatore gia usato:"+name);
    }
    public UsernameUsedException()
    {
        super("nome del giocatore gia usato");
    }
}

class DeckEmptyException extends RuntimeException
{
    
    public DeckEmptyException()
    {
        super("DeckEmpty");
    }
}

class UserNotFoundException extends RuntimeException
{
    public UserNotFoundException(String name)
    {
        super("nome del giocatore non presente:"+name);
    }
    public UserNotFoundException()
    {
        super("nome del giocatore non presente");
    }
}

class IllegalCardsException extends RuntimeException
{
    public IllegalCardsException(String name)
    {
        super("provato a posizionare una sequenza di carte illegale in tavola");
    }
    public IllegalCardsException()
    {
        super("provato a posizionare una sequenza di carte illegale in tavola");
    }
}