package candidateRecruting.candidate;


import candidateRecruting.department.DepartmentName;

public class Candidate {
    private String name;
    private Integer age;
    private String address;
    private String emailAddress;
    private int levelOfCompetence;
    private int yearsOfExperience;
    private DepartmentName departmentName;
    private CandidateStatus candidateStatus;

    public Candidate(String name,
                     Integer age,
                     String address,
                     String emailAddress,
                     int levelOfCompetence,
                     int yearsOfExperience,
                     DepartmentName departmentName) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.emailAddress = emailAddress;
        this.levelOfCompetence = levelOfCompetence;
        this.yearsOfExperience = yearsOfExperience;
        this.departmentName = departmentName;
        this.candidateStatus = CandidateStatus.AWAITING;
    }

    public Candidate() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getLevelOfCompetence() {
        return this.levelOfCompetence;
    }

    public void setLevelOfCompetence(int levelOfCompetence) {
        this.levelOfCompetence =levelOfCompetence;
    }

    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public DepartmentName getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName( DepartmentName departmentName) {
        this.departmentName = departmentName;
    }

    public CandidateStatus getCandidateStatus() {
        return this.candidateStatus;
    }

    public void setCandidateStatus(CandidateStatus candidateStatus) {
        this.candidateStatus = candidateStatus;
    }

    public String toString() {
        return "Candidate: " + name + " has " + yearsOfExperience
                + " years of experience, the level of competence " + levelOfCompetence +
                " applied for " + departmentName +
                " and has the status " + candidateStatus
                + "\n";
    }


}

