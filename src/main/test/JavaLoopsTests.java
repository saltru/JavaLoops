import org.junit.*;

import java.io.*;
import java.util.Scanner;

public class JavaLoopsTests {

    private int temp() {
        return 0;
    }

    @Test
    public void test1() {
        Assert.assertTrue(true);

    }

    @Test
    public void testLoops() {
        String expected = "3 7 15 \r\n";
        PrintStream stdout = System.out;
        ByteArrayOutputStream result = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(result));
            JavaLoops.printSeq(1, 2, 3);
            Assert.assertEquals(expected, result.toString());

            //Scanner scanner = new Scanner(System.in);
            //System.out.println(scanner.nextLine());
        } finally {
            System.setOut(stdout);
        }
    }
/*
    @Test
    public void testLoops() {
        String data = "1\n1 2 3\n";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            //DO TEST

            //Scanner scanner = new Scanner(System.in);
            //System.out.println(scanner.nextLine());
        } finally {
            System.setIn(stdin);
        }
    }*/
}
