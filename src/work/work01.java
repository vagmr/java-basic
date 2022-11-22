package src.work;

public class work01 {
    public static void main(String[] args) {
        person[] p1 = new person[3];
        p1[0] = new person("33",32,"dfd");
        p1[1] = new person("22",54,"45");
        p1[2] = new person("22",14,"455");
        p1 = new person().sorT(p1);
        for (int i = 0; i <p1.length ; i++) {
            System.out.println(p1[i]);
        }
    }
}
class person{
    String name;
    int age;

    public person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public person() {
    }

    String job;
    public person[] sorT(person[] a){
        for (int i = 0; i <a.length - 1; i++) {
            if(a[i].age < a[i + 1].age){
                person temp;
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        return  a;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

}
