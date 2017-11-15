public class Student {
    private int age;
    private boolean sex;
    private int weight;

    public Student() {
    }

    public Student(int age, boolean sex, int weight) {
        this.age = age;
        this.sex = sex;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    public int getWeight() {
        return weight;
    }
}
