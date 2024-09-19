public class LogLevels {

    public static String message(String logLine) {
        int colonIndex = logLine.indexOf(":");

        if (colonIndex != -1 && colonIndex > 0) {
            return logLine.substring(colonIndex + 1).trim();
        }
        return "INVALID_MESSAGE";
    }

    public static String logLevel(String logLine) {
        if (logLine.contains("INFO"))
            return "info";
        if (logLine.contains("WARNING"))
            return "warning";
        if (logLine.contains("ERROR"))
            return "error";

        return "INVALID_LEVEL";
    }

    public static String reformat(String logLine) {
        if (message(logLine).equalsIgnoreCase("INVALID_MESSAGE")
                && logLevel(logLine).equalsIgnoreCase("INVALID_LEVEL")) {
            return "INVALID_FORMAT";
        }
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
