import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        RandomCat RandomCat = new RandomCat();

        ArrayList<CatClass> cat = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            cat.add(i, RandomCat.getRandomCat());
            System.out.println((i+1) + ") " + cat.get(i));
        }
    }
}