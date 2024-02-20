/**
 * Клас, що представляє клієнта з найбільшою кількістю проєктів і містить інформацію про його ім'я та кількість проєктів.
 */
public class MaxProjectCountClient {
    private String name;
    private int projectCount;

    public MaxProjectCountClient(String name, int projectCount) {
        this.name = name;
        this.projectCount = projectCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProjectCount() {
        return projectCount;
    }

    public void setProjectCount(int projectCount) {
        this.projectCount = projectCount;
    }

    @Override
    public String toString() {

        return "LongestProject: \n"
                + "Name: " + name +
                ", Project count: " + projectCount +
                "\n**********************************";
    }
}