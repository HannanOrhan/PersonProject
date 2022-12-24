package Task;

public class Hakob {

    private String name;
    private String jobTitle;

    public Hakob(String name, String jobTitle) {
        setName(name);
        setJobTitle(jobTitle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
