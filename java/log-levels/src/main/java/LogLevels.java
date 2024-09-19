public class LogLevels {
    
    public static String message(String logLine) {
        int colonIndex = logLine.indexOf(":");

        if (colonIndex == -1) {
            return "No message";
        }
        return logLine.substring(colonIndex + 1).trim();
    }

    public static String logLevel(String logLine) {
        if (logLine.contains("INFO"))
            return "info";
        if (logLine.contains("WARNING"))
            return "warning";
        if (logLine.contains("ERROR"))
            return "error";

        return "Invalid level!";
    }

    public static String reformat(String logLine) {
        String infoSuffix = " (info)";
        String warningSuffix = " (warning)";
        String errorSuffix = " (error)";

        if (logLine.contains("INFO"))
            return message(logLine).concat(infoSuffix);
        if (logLine.contains("WARNING"))
            return message(logLine).concat(warningSuffix);
        if (logLine.contains("ERROR"))
            return message(logLine).concat(errorSuffix);

        return "Invalid format!";
    }

}
