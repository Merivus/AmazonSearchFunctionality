package helper;

import org.apache.logging.log4j.LogManager;

public class Logger {
    private static final ThreadLocal<org.apache.logging.log4j.Logger> LOGGER = ThreadLocal.withInitial(() -> LogManager.getLogger(Logger.class));

    private Logger() {
    }

    public static void info(String message) {
        LOGGER.get().info(message);
    }

    public static void info(String message, Throwable error) {
        LOGGER.get().info(message, error);
    }

    public static void info(Object message) {
        LOGGER.get().info(message);
    }

    public static void info(String message, Object... object) {
        LOGGER.get().info(message, object);
    }

    public static void debug(String message) {
        LOGGER.get().debug(message);
    }

    public static void warn(String message) {
        LOGGER.get().warn(message);
    }

    public static void fatal(String message) {
        LOGGER.get().fatal(message);
    }

    public static void error(String message) {
        LOGGER.get().error(message);
    }

    public static void trace(String message) {
        LOGGER.get().trace(message);
    }
}