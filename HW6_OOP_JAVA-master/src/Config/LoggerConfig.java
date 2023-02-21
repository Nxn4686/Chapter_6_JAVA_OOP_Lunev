package Config;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Class for logger configuration/Класс отвечающий за запись в журнал
 */
public class LoggerConfig {
    public static void config() throws IOException {
        FileHandler fileHandler = new FileHandler("src/log.log", true);
        fileHandler.setFormatter(new SimpleFormatter());
        Logger logger = Logger.getLogger("");
        logger.addHandler(fileHandler);
        logger.setLevel(Level.ALL); // уровень логирования записать всё
    }
}
