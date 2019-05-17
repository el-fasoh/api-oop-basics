public class Mammal extends Animal  implements AnimalInterface{

    private int numberOfFur;
    private int numberOfLegs;

    public Mammal(String name, String color, int numberOfFur, int numberOfLegs) {
        super(name, color);
        this.numberOfFur = numberOfFur;
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfFur() {
        return numberOfFur;
    }

    public void setNumberOfFur(int numberOfFur) {
        this.numberOfFur = numberOfFur;
    }

    @Override
    public void printAnimalDetails() {
        System.out.println("Animal Name: "+name+" Color: "+color+" FurNo: "+numberOfFur+
                " Legs: "+numberOfLegs);

    }

    @Override
    public void move() {
        System.out.println("Mammals move by walking....");
    }

    @Override
    public void communicate() {
        System.out.println("Mammals communicate by Talking..");
    }
}
