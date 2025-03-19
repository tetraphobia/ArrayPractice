import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPracticeTest {
    static final int[] a = { 0, 1, 2, 3, 4 };
    static final Foo[] b = { new Foo(0), new Foo(1), new Foo(5), new Foo(3), new Foo(4) };
    static final int sum = 10;
    static final int importantFooIndex = 2;
    static final Foo importantFoo = b[importantFooIndex];

    public static void main(String[] args) throws Exception {
        // For testing ArrayList methods
        ArrayList<Integer> c = new ArrayList<>();
        c.add(0);
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);

        ArrayList<Foo> d = new ArrayList<>();
        d.add(b[0]);
        d.add(b[1]);
        d.add(b[2]);
        d.add(b[3]);
        d.add(b[4]);

        System.out.println("printArray():");
        ArrayPractice.printArray(5);

        System.out.println("printArrayList():");
        ArrayPractice.printArrayList(5);

        {
            int actual = ArrayPractice.sumArray(a);
            boolean pass = actual == sum;
            System.out.println("sumArray(): " + (pass ? "PASS" : "FAIL"));
            if (!pass) {
                System.out.printf("Expected sum: %d\n", sum);
                System.out.printf("Actual: %d\n", actual);
            }

        }

        {
            int actual = ArrayPractice.sumArrayList(c);
            boolean pass = actual == sum;
            System.out.println("sumArrayList(): " + (pass ? "PASS" : "FAIL"));
            if (!pass) {
                System.out.printf("Expected sum: %d\n", sum);
                System.out.printf("Actual: %d\n", actual);
            }
        }

        {
            System.out.println("getFoos():");
            ArrayList<Foo> actual = ArrayPractice.getFoos();
            int size = actual.size();

            if (size != 5) {
                System.out.println("\tFAIL");
                System.out.printf("\tExpected size %d, got %d", 5, size);
            } else {
                System.out.println("\tSize == 5: PASS");
            }

            for (Foo foo : actual) {
                System.out.println("\t" + foo + " instanceof Foo: " + (foo instanceof Foo ? "PASS" : "FAIL"));

                if (!(foo instanceof Foo)) {
                    System.out.println("FAIL");
                    System.out.println("Expected Foo, got " + foo.getClass());
                    break;
                }

                if (size == 0) {
                    System.out.println("PASS");
                }

                size--;
            }
        }

        {
            System.out.print("removeFooFives(): ");

            Foo[] actual = ArrayPractice.removeFooFives(b);
            Foo[] expected = { b[0], b[1], b[3], b[4] };

            if (!Arrays.equals(actual, expected)) {
                System.out.println("FAIL");

                System.out.println("Expected: " + Arrays.toString(expected));
                System.out.println("Got:      " + Arrays.toString(actual));
            } else {
                System.out.println("PASS");
            }
        }

        {
            System.out.print("firstFiveIndex(): ");

            int actual = ArrayPractice.firstFiveIndex(d);
            int expected = importantFooIndex;

            if (actual != expected) {
                System.out.println("FAIL");

                System.out.println("Expected: " + expected);
                System.out.println("Got:      " + actual);
            } else {
                System.out.println("PASS");
            }
        }

        {
            System.out.print("reverseArray(): ");

            int[] actual = ArrayPractice.reverseArray(a);
            int[] expected = { 4, 3, 2, 1, 0 };

            if (!Arrays.equals(actual, expected)) {
                System.out.println("FAIL");

                System.out.println("Expected: " + Arrays.toString(expected));
                System.out.println("Got:      " + Arrays.toString(actual));
            } else {
                System.out.println("PASS");
            }

        }

        {
            System.out.println("removeSecond(): ");

            ArrayList<Integer> test = new ArrayList<>();
            test.add(0);
            test.add(1);

            System.out.print("\tWith size = 2: ");
            ArrayPractice.removeSecond(test);
            System.out.println(test.size() == 1 ? "PASS" : "FAIL");

            System.out.print("\tWith size = 1: ");
            ArrayPractice.removeSecond(test);
            System.out.println(test.size() == 1 ? "PASS" : "FAIL");
        }

        {
            System.out.print("arrayToArrayList(): ");

            double[] test = { 0.0, 1.1, 2.2, 3.3 };

            ArrayList<Double> actual = ArrayPractice.arrayToArrayList(test);
            ArrayList<Double> expected = new ArrayList<>();

            expected.add(0.0);
            expected.add(1.1);
            expected.add(2.2);
            expected.add(3.3);

            if (!actual.equals(expected)) {
                System.out.println("FAIL");

                System.out.println("Expected: " + expected);
                System.out.println("Got:      " + actual);
            } else {
                System.out.println("PASS");
            }
        }

        {
            System.out.print("joinArrays(): ");
            int[] test1 = { 1, 2, 3 };
            int[] test2 = { 4, 5, 6, 7 };

            int[] actual = ArrayPractice.joinArrays(test1, test2);
            int[] expected = { 1, 2, 3, 4, 5, 6, 7 };

            if (!Arrays.equals(actual, expected)) {
                System.out.println("FAIL");

                System.out.println("Expected: " + Arrays.toString(expected));
                System.out.println("Got:      " + Arrays.toString(actual));
            } else {
                System.out.println("PASS");
            }

        }

        {
            System.out.print("combineToArray(): ");
            int[] test1 = { 1, 2, 3 };
            ArrayList<Integer> test2 = new ArrayList<>();
            test2.add(4);
            test2.add(5);

            int[] actual = ArrayPractice.combineToArray(test1, test2);
            int[] expected = { 1, 2, 3, 4, 5 };

            if (!Arrays.equals(actual, expected)) {
                System.out.println("FAIL");

                System.out.println("Expected: " + Arrays.toString(expected));
                System.out.println("Got:      " + Arrays.toString(actual));
            } else {
                System.out.println("PASS");
            }

        }

        {
            System.out.print("combineToArrayList(): ");
            int[] test1 = { 0, 1, 2 };
            ArrayList<Integer> test2 = new ArrayList<Integer>();
            test2.add(3);
            test2.add(4);

            ArrayList<Integer> actual = ArrayPractice.combineToArrayList(test1, test2);
            ArrayList<Integer> expected = c;

            if (!actual.equals(expected)) {
                System.out.println("FAIL");

                System.out.println("Expected: " + expected);
                System.out.println("Got:      " + actual);
            } else {
                System.out.println("PASS");
            }
        }
    }
}
