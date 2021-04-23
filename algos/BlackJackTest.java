package algos;

import junit.framework.*;
import org.junit.Test;

public class BlackJackTest extends TestCase {
  @Test
  public void testTrue() throws Exception {
    assertEquals(true, true);
  }

  @Test
  public void testBlackJack() throws Exception {
      String[] player = new String[] {"10", "1"};
      String[] bank = new String[] {"10", "J"};
      assertEquals("BLACKJACK!", BlackJack.score(bank, player));
  }

  @Test
  public void testBank() throws Exception {
      String[] player = new String[] {"4", "9", "3"};
      String[] bank = new String[] {"10", "J"};
      assertEquals("Bank wins!", BlackJack.score(bank, player));
  }

  @Test
  public void testPlayer() throws Exception {
      String[] player = new String[] {"4", "9", "8"};
      String[] bank = new String[] {"10", "J"};
      assertEquals("Player wins!", BlackJack.score(bank, player));
  }

  @Test
  public void testBankTooMuch() throws Exception {
      String[] player = new String[] {"4", "9", "3"};
      String[] bank = new String[] {"10", "6", "K"};
      assertEquals("Player wins!", BlackJack.score(bank, player));
  }

  @Test
  public void testPlayerTooMuch() throws Exception {
      String[] player = new String[] {"4", "9", "K"};
      String[] bank = new String[] {"10", "5", "3"};
      assertEquals("Bank wins!", BlackJack.score(bank, player));
  }
}
