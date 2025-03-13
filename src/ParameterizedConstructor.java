public class ParameterizedConstructor {
    String name;
    int age;
    ParameterizedConstructor(int age,String name) {
        this.age = age;
        this.name = name;
    }
    public static void main(String[] args) {
        ParameterizedConstructor pc = new ParameterizedConstructor(25, "cat");
        System.out.println(pc.name);
        System.out.println(pc.age);
    }
}
