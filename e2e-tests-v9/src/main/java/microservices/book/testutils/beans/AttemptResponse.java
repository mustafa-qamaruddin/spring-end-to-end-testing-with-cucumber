package microservices.book.testutils.beans;

public class AttemptResponse {
    
    private Boolean correct;
    private long id;
    private User user;

    public AttemptResponse() {

    }

    public boolean isCorrect() {
        return correct;
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }
}