package candidateRecruting.department;

import candidateRecruting.candidate.Candidate;
import candidateRecruting.candidate.CandidateStatus;

public class Production extends Department {

    public Production() {
        this.name = DepartmentName.PRODUCTION;
        this.minLevelOfCompetence = 5;
    }

    @Override
    public void evaluate(Candidate candidate){
        if (candidate.getLevelOfCompetence() > this.minLevelOfCompetence) {
            candidate.setCandidateStatus(CandidateStatus.ACCEPTED);
        } else {
            candidate.setCandidateStatus(CandidateStatus.REJECTED);
        }
    }
}