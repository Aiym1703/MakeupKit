
public class Main {
    public static void main(String[] args) {
        MakeupDirector director = new MakeupDirector();
        MakeupKitBuilder builder = new StandardMakeupKitBuilder();

        MakeupKit minimalKit = director.createMinimalKit(builder);


        MakeupKit fullKit = director.createFullKit(new StandardMakeupKitBuilder());

        System.out.println("Minimal Makeup Kit:");
        System.out.println(minimalKit);

        System.out.println("\nFull Makeup Kit:");
        System.out.println(fullKit);
    }
}
