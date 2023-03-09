public class CatClass {
    String name;
    int age;
    String sex;
    String hostName;
    Boolean isVaccinated;

    public CatClass(String name, int age, String sex, String hostName, Boolean isVaccinated) {
        validateName(name);
        validateAge(age);
        this.sex = sex;
        validateHostName(hostName);
        this.isVaccinated = isVaccinated;
    }

    public CatClass(String name, int age, String sex, String hostName) {
        validateName(name);
        validateAge(age);
        this.sex = sex;
        validateHostName(hostName);
    }

    public CatClass(String name, int age, String hostName, Boolean isVaccinated) {
        validateName(name);
        validateAge(age);
        validateHostName(hostName);
        this.isVaccinated = isVaccinated;
    }

    public CatClass(String name, int age, String hostName) {
        validateName(name);
        validateAge(age);
        validateHostName(hostName);
    }

    public String getName() {
        return name;}
    public void setName(String name) {
        validateName(name);
    }

    public int getAge() {
        return age; }
    public void setAge(int age) {
        validateAge(age);
    }

    public String getSex() {
        return sex;}
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHostName() {
        return hostName;}
    public void setHostName(String hostName) {
        validateHostName(hostName);
    }

    public Boolean getIsVaccinated() {
        return isVaccinated;}
    public void setIsVaccinated(Boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public void validateName(String name){
        if (name.length()>=3){
            this.name = name;
        } else {
            System.out.println("Too short name");
        }
    }

    public void validateHostName(String hostName){
        if (hostName.length()>=5){
            this.hostName = hostName;
        } else {
            System.out.println("Too short Host Name");
        }
    }

    public void validateAge(int age){
        if (age > 0 && age <= 25){
            this.age = age;
        } else {
            this.age = 1;
            if (age > 25) {
                this.age = 25;
            }
        }
    }

    public String toString() {
        return  " name - " + name +
                ", age - " + age +
                ", sex - " + sex +
                ", isVaccinated - " + isVaccinated +
                ", hostName - " + hostName;
    }
}
