package day03;
//
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class ExceptionMain {
    public static void main(String[] args) {
        User foundUser = getUserBy(1L);
        User unknownUser = getUserBy(2L);
    }

    static class User {

    }

    public static User getUserBy(Long id) {
        if (id == 1L) {
            throw new UserNotFoundException(id.toString());
        }
        return new User();
    }

    // Java -> OS(System call)
    public static void readFileAndCreateNewFile() throws IOException, InterruptedException, FileNotFoundException, FileSystemException {
        File file = new File("test.txt");
        file.createNewFile();
        Thread.sleep(3000);
    }

    public static void readFileAndCreateNewFile2() throws Exception {
        File file = new File("test.txt");
        file.createNewFile();
    }

    public static void readFileAndCreateNewFile3() {
        File file = new File("test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            e.getStackTrace();
            System.out.println("문제가 있음");
        } finally {
            //자원 정리
        }
    }
}
