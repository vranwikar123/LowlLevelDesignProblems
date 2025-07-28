package ChainOfResponsibility;

public class LogEntry {
    private String message;
    private LogEntry severity;

    public LogEntry(String message, LogEntry severity)
    {
        this.message = message;
        this.severity = severity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LogEntry getSeverity() {
        return severity;
    }

    public void setSeverity(LogEntry severity) {
        this.severity = severity;
    }
}
