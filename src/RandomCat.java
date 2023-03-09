import java.util.Random;

public class RandomCat {

    Random random = new Random();

    public String getRandomName() {
        String result = "";
        char a;
        for (int i = 0; i < 5; i++) {
            a = (char) (random.nextInt(35) + '0');
            result = result + a;
        }
        return (result);
    }

    public String getRandomHostName() {
        String result = "";
        char a;
        for (int i = 0; i < 10; i++) {
            a = (char) (random.nextInt(35) + '0');
            result = result + a;
        }
        return (result);
    }
    public boolean getRandomBoolean() {
        return random.nextBoolean();
    }

    boolean booleanRandom;
    public String getRandomSex() {
        String value1 = "Ж";
        String value2 = "М";
        String value = "";
        booleanRandom = random.nextBoolean();
        if (booleanRandom == true){
            value = value1;
        } else {
            return value2;
        }
        return value;
    }

    public int getRandomAge() {
        return random.nextInt(20);
    }

    public CatClass getRandomCat() {
        CatClass cat = new CatClass(getRandomName(), getRandomAge(), getRandomSex(), getRandomHostName(), getRandomBoolean());
        return cat;
    }
}
