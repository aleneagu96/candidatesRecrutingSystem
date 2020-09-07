package candidateRecruting.recruitment;

import candidateRecruting.candidate.Candidate;
import candidateRecruting.department.DepartmentName;
import candidateRecruting.department.Marketing;
import candidateRecruting.department.Production;
import candidateRecruting.exceptions.EvaluationIncapacityException;

import java.util.List;

public class Company {
    private  String name;
    private List<Candidate> candidates;

    public Company(String name, List<Candidate> candidates) {
        this.name = name;
        this.candidates = candidates;
    }

    public void recruiting () {
        Marketing marketingDep = new Marketing();
        Production productionDep = new Production();

        for (Candidate c: candidates) {
            if(c.getDepartmentName().equals(DepartmentName.PRODUCTION)) {
                productionDep.evaluate(c);
            } else if (c.getDepartmentName().equals(DepartmentName.MARKETING)) {
                marketingDep.evaluate(c);
            } else {
                throw new EvaluationIncapacityException();
            }
        }

    }

}

