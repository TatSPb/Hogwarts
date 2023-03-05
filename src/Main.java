import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        GryffindorStudent harry = generateGryffindorStudent("Гарри Поттер");
        GryffindorStudent hermione = generateGryffindorStudent("Гермиона Грейнджер");
        GryffindorStudent ron = generateGryffindorStudent("Рон Уизли");
        SlytherinStudent draco = generateSlytherinStudent("Драко Малфой");
        SlytherinStudent graham = generateSlytherinStudent("Грэхэм Монтегю");
        SlytherinStudent gregory = generateSlytherinStudent("Грегори Гойл");
        HufflepuffStudent zacharias = generateHufflepuffStudent("Захария Смит");
        HufflepuffStudent cedric = generateHufflepuffStudent("Седрик Диггори");
        HufflepuffStudent justin = generateHufflepuffStudent("Джастин Финч-Флетчли");
        RavenclawStudent cho = generateRavenclawStudent("Чжоу Чанг");
        RavenclawStudent padma = generateRavenclawStudent("Падма Патил");
        RavenclawStudent marcus = generateRavenclawStudent("Маркус Белби");

        System.out.println("Ученики факультета Гриффиндор:");
        harry.print();
        hermione.print();
        ron.print();

        System.out.println();
        System.out.println("Сравнение учеников факультета Гриффиндор:");
        harry.compareGryffindor(hermione);
        hermione.compareGryffindor(ron);
        ron.compareGryffindor(harry);

        System.out.println();
        System.out.println("Ученики факультета Слизерин:");
        draco.print();
        graham.print();
        gregory.print();

        System.out.println();
        System.out.println("Сравнение учеников факультета Слизерин:");
        draco.compareSlytherin(graham);
        graham.compareSlytherin(gregory);
        gregory.compareSlytherin(draco);

        System.out.println();
        System.out.println("Ученики факультета Пуффендуй:");
        zacharias.print();
        cedric.print();
        justin.print();

        System.out.println();
        System.out.println("Сравнение учеников факультета Пуффендуй:");
        zacharias.compareHufflepuff(cedric);
        cedric.compareHufflepuff(justin);
        justin.compareHufflepuff(zacharias);

        System.out.println();
        System.out.println("Ученики факультета Когтевран:");
        cho.print();
        padma.print();
        marcus.print();

        System.out.println();
        System.out.println("Сравнение учеников факультета Когтевран:");
        cho.compareRavenclaw(padma);
        padma.compareRavenclaw(marcus);
        marcus.compareRavenclaw(cho);
    }

    private static GryffindorStudent generateGryffindorStudent(String name) {
        return new GryffindorStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static HufflepuffStudent generateHufflepuffStudent(String name) {
        return new HufflepuffStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static RavenclawStudent generateRavenclawStudent(String name) {
        return new RavenclawStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}