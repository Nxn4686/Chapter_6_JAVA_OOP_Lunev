package HW_1_OOP_JAVA;

public class Family {
    private String familyName;
    private String firstName;
    private int age;
    private String birthday;

    Family(String familyName, String firstName, int age, String birthday) {
        this.age = age;
        this.familyName = familyName;
        this.firstName = firstName;
        this.birthday = birthday;
    }

    Family() {
        this.age = 0;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getAge() {
        return age;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public void showInfo() {
        System.out.println("Family: " + familyName);
        System.out.println("Name: " + firstName);
        System.out.println("Age: " + age);
        System.out.println("Birthday: " + birthday);
    }
}

class Relaitive extends Family {
    private String relativeStatus;
    String parents;
    String children;

    public String getRelativeStatus() {
        return relativeStatus;
    }

    public void setRelativeStatus(String relativeStatus) {
        this.relativeStatus = relativeStatus;
    }


    Relaitive(String s) {
        super();
        setRelativeStatus(s);
    }

    Relaitive(String s, String famN, String firstN, int age, String birth) {
        super(famN, firstN, age, birth);
        setRelativeStatus(s);
    }

    void showStatus() {
        System.out.println("Relative status: " + relativeStatus);
    }


}

class FamilyTree {
    public static void main(String[] args) {
        Relaitive p1 = new Relaitive("Father", "Lunev", "Vasily", 65, "20.05.1958");
        Relaitive p2 = new Relaitive("Mother", "Luneva", "Antonina", 59, "26.03.1963");
        Relaitive s1= new Relaitive("Son","Lunev","Nikita",36,"01.12.1986");



        p1.showStatus();
        p1.showInfo();
        System.out.println("===========================");
        p2.showStatus();
        p2.showInfo();
        System.out.println("===========================");
        s1.showStatus();
        s1.showInfo();



    }
}
