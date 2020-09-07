package candidateRecruting.department;

import candidateRecruting.candidate.Candidate;
import candidateRecruting.candidate.CandidateStatus;

public class Marketing extends Department {

    private static final int MIN_YEARS_OF_EXPERIENCE = 5;

    public Marketing() {
        this.name = DepartmentName.MARKETING;
        this.minLevelOfCompetence = 7;
    }

    @Override
    public void evaluate(Candidate candidate){
        if (candidate.getLevelOfCompetence() > this.minLevelOfCompetence
                && candidate.getYearsOfExperience() > MIN_YEARS_OF_EXPERIENCE) {
            candidate.setCandidateStatus(CandidateStatus.ACCEPTED);
        } else {
            candidate.setCandidateStatus(CandidateStatus.REJECTED);
        }
    }
}
