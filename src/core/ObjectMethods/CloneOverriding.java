package core.ObjectMethods;

public class CloneOverriding {

    public static void main(String[] args) {
        Specification normal = new Specification("gray", 19, "few");
        Specification hiQuality = new Specification("white", 26, "a lot");

        Sheep original = new Sheep("Dolly", 4, normal);

        Sheep clone = null;
        try {
            clone  = (Sheep) original.clone();
        }
        catch (CloneNotSupportedException ex){
            ex.printStackTrace(System.err);
        }

        System.out.println("Original: " + original);
        System.out.println("Clone   :" + clone);

        System.out.println("\n#####  Clone renamed and change specifications  ######");
        clone.name = "Molly";
        clone.age = 2;
        clone.spec.color = "red";
        clone.spec.pelage = "normal";
        clone.spec.weight = 21;

        System.out.println("Original: " + original);
        System.out.println("Clone   :" + clone);

        System.out.println("\n###########  Clone set new specifications  ###########");
        clone.spec = hiQuality;

        System.out.println("Original: " + original);
        System.out.println("Clone   :" + clone);
    }
}
