import java.util.Scanner;

// Класс Baseline
class Baseline {
    private String title;
    protected String content;
    public String author;

    public Baseline(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void display() {
        System.out.println("Заголовок: " + title);
        System.out.println("Содержание: " + content);
    }

    public void publish() {
        System.out.println("Baseline опубликован.");
    }
}

// Класс Behaviour
class Behaviour extends Baseline {
    private String behaviorType;
    protected int analysisResult;

    public Behaviour(String title, String content, String author, String behaviorType, int analysisResult) {
        super(title, content, author);
        this.behaviorType = behaviorType;
        this.analysisResult = analysisResult;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Тип поведения: " + behaviorType);
    }

    public void analyze() {
        System.out.println("Поведение анализируется. Результат анализа: " + analysisResult);
    }
}

// Класс Blog
class Blog extends Behaviour {
    private String blogType;
    public String url;

    public Blog(String title, String content, String author, String behaviorType, int analysisResult, String blogType, String url) {
        super(title, content, author, behaviorType, analysisResult);
        this.blogType = blogType;
        this.url = url;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Тип блога: " + blogType);
        System.out.println("URL: " + url);
    }

    public void comment() {
        System.out.println("Блог комментируется.");
    }
}

// Класс Main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Введите данные Baseline:");
            System.out.print("Заголовок: ");
            String baselineTitle = scanner.nextLine();
            System.out.print("Содержание: ");
            String baselineContent = scanner.nextLine();
            System.out.print("Автор: ");
            String baselineAuthor = scanner.nextLine();

            System.out.println("\nВведите данные Behaviour:");
            System.out.print("Заголовок: ");
            String behaviourTitle = scanner.nextLine();
            System.out.print("Содержание: ");
            String behaviourContent = scanner.nextLine();
            System.out.print("Автор: ");
            String behaviourAuthor = scanner.nextLine();
            System.out.print("Тип поведения: ");
            String behaviorType = scanner.nextLine();
            System.out.print("Результат анализа: ");
            int analysisResult = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\nВведите данные Blog:");
            System.out.print("Заголовок: ");
            String blogTitle = scanner.nextLine();
            System.out.print("Содержание: ");
            String blogContent = scanner.nextLine();
            System.out.print("Автор: ");
            String blogAuthor = scanner.nextLine();
            System.out.print("Тип поведения: ");
            String blogBehaviorType = scanner.nextLine();
            System.out.print("Результат анализа: ");
            int blogAnalysisResult = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Тип блога: ");
            String blogType = scanner.nextLine();
            System.out.print("URL: ");
            String blogURL = scanner.nextLine();

            Baseline baseline = new Baseline(baselineTitle, baselineContent, baselineAuthor);
            Behaviour behaviour = new Behaviour(behaviourTitle, behaviourContent, behaviourAuthor, behaviorType, analysisResult);
            Blog blog = new Blog(blogTitle, blogContent, blogAuthor, blogBehaviorType, blogAnalysisResult, blogType, blogURL);

            System.out.println();
            System.out.println("Информация об объектах");
            baseline.display();
            baseline.publish();

            System.out.println();
            behaviour.display();
            behaviour.analyze();

            System.out.println();
            blog.display();
            blog.comment();

            System.out.println("\nЖелаете продолжить?");
            System.out.println("1. Продолжить");
            System.out.println("2. Выйти");
            System.out.print("Введите ваш выбор: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        } while (choice == 1);

        System.out.println("Программа завершена.");
    }
}
