package logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {

	private static final Logger LOG = LoggerFactory.getLogger(TestLog.class);

	public static void main(String[] args) {
		
		// Chaque message est �mis en utilisant la m�thode correspondant au niveau de
		// gravit� choisi de la classe Logger

		LOG.debug("msg de debogage");
		LOG.info("msg d'information");
		LOG.warn("msg d'avertissement");
		LOG.error("msg d'erreur");

	}

}
