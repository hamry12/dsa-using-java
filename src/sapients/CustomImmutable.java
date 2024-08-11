package sapients;

public final class CustomImmutable {
    private final String name;

    private final String gender;

    private final int age;

    public CustomImmutable(String name, String gender, int age){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }


    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "CustomImmutable{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
