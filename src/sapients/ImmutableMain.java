package sapients;

public class ImmutableMain {

    public static void main(String[] args) {
        CustomImmutable customImmutable= new CustomImmutable("Himanshu", "Male", 30);
        System.out.println("1st Initialization In Immutable");
        System.out.println(customImmutable);

        System.out.println("After");
        CustomImmutable customImmutable1= new CustomImmutable("Another M", "M", 19);
        System.out.println(customImmutable);

        System.out.println("#############");

        Mutable mutable= new Mutable("Pallavi", "F", 28);
        System.out.println("1st Initialization In Mutable");
        System.out.println(mutable);

        System.out.println("After");
        Mutable mutable1= new Mutable("Anothe F", "F", 17);
        System.out.println(mutable);


    }
}
