package klu;

public class TimelineEvent {
    private String timestamp;
    private String message;

    public TimelineEvent() {
        this.timestamp = "N/A";
        this.message = "Event placeholder";
    }

    public TimelineEvent(String timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
