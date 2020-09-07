package candidateRecruting.department;

import candidateRecruting.candidate.Candidate;
import candidateRecruting.recruitment.Evaluator;

public class Department implements Evaluator {

    protected DepartmentName name;
    protected int minLevelOfCompetence;

    @Override
    public void evaluate(Candidate candidate) {

    }
}
