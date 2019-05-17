public class Main {

    public static void main(String[] args) {
        Reptile reptile = new Reptile("crocodile","brown", 3);
        reptile.printAnimalDetails();
        reptile.communicate();
        reptile.move();

        System.out.println("--------------------------------");

        Mammal mammal = new Mammal("Human", "Black",
                10,2);
        mammal.printAnimalDetails();
        mammal.communicate();
        mammal.move();
    }
}
/*
Animal Name: crocodile Color: brown Number of scales: 3
Reptiles communicate by hissing....
Reptiles move by crawling....
--------------------------------
Animal Name: Human Color: Black FurNo: 10 Legs: 2
Mammals communicate by Talking..
Mammals move by walking....
 */