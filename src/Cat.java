public class Cat {
   private String name;
   private int age;
   public Cat(String name, int age) {
       this.name = "unknown";
       this.age = 0;
   }
   String getName(){
       return name;
   }
   int getAge(){
       return age;
   }
   public static void main(String[] args) {
       Cat cat = new Cat("cat", 30  );


       System.out.println(cat.getName());
       System.out.println(cat.age);
   }

}

