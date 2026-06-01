package fst_gui;

import java.util.List;

public class Programmer {

    private String name;
    private String email;
    private String workingTime;
    private String programmingIn;
    private String workingExperience;
    List<String> availability;

    public Programmer(String name, String email, String workingTime, String programmingIn, String workingExperience, List<String> availability) {
        this.name = name;
        this.email = email;
        this.workingTime = workingTime;
        this.programmingIn = programmingIn;
        this.workingExperience = workingExperience;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", workingTime='" + workingTime + '\'' +
                ", programmingIn='" + programmingIn + '\'' +
                ", workingExperience='" + workingExperience + '\'' +
                ", availability=" + availability +
                '}';
    }
}
