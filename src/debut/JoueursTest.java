package debut;

public class JoueursTest {
	import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;

	class DiversesFonctionsTestCorrige {

		
		@Test
		public final void testNombre() {
			assertEquals(1, Joueurs.VerificationsaisieNombreJoueurs(4), "cas positif");
			
			assertTrue(1, Joueurs.VerificationsaisieNombreJoueurs(4), "cas positif");

			assertTrue(1, Joueurs.VerificationsaisieNombreJoueurs(4), "cas positif");
		}
		
	

	}