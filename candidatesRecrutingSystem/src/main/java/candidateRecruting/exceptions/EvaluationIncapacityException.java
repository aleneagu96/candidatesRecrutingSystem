package candidateRecruting.exceptions;

public class EvaluationIncapacityException extends RuntimeException {

    public EvaluationIncapacityException() {
        super("This candidate did not apply for a valid department.");
    }
}
