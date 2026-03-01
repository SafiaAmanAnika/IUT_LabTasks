public class Doctor {

    private String doctorName;
    private int doctorAge;
    private String qualification;
    private String specialty;
    private String dutyTime;
    private Boolean isAvailable;
    private Boolean hasVacancy;

    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDoctorAge() {
        return doctorAge;
    }
    public void setDoctorAge(int doctorAge) {
        this.doctorAge = doctorAge;
    }

    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getDutyTime() {
        return dutyTime;
    }
    public void setDutyTime(String dutyTime) {
        this.dutyTime = dutyTime;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }
    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Boolean getHasVacancy() {
        return hasVacancy;
    }
    public void setHasVacancy(Boolean hasVacancy) {
        this.hasVacancy = hasVacancy;
    }
}