import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {

    // You are given an integer value `n`

    // 1. Create an array of size `n`
    // 2. Initialize it with n integers
    // 3. Print each element of the array
    public static void printArray(int n) {
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = i;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    // You are given an integer value `n`

    // 1. Create an ArrayList of size `n` that holds integer values
    // 2. Initialize it with n integers
    // 3. Print each element of the ArrayList
    public static void printArrayList(int n) {
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(i);
        }

        for (Integer b : a) {
            System.out.println(b);
        }
    }

    // 1. Calculate the sum of the array.
    // 2. Return the sum
    public static int sumArray(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    // You are given an ArrayList `a`

    // 1. Calculate the sum of the ArrayList.
    // 2. Return the sum
    public static int sumArrayList(ArrayList<Integer> a) {
        int sum = 0;

        for (int b : a) {
            sum += b;
        }

        return sum;
    }

    // You are given an empty method

    // 1. Write code to create an ArrayList containing Foo objects (see line 1 for
    // implementation)
    // 2. The ArrayList should contain 5 Foo objects with an arbitrary integer
    // value.
    public static ArrayList<Foo> getFoos() {
        ArrayList<Foo> foos = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            foos.add(new Foo(i));
        }

        return foos;
    }

    // You are given an array `a` containing Foo objects

    // 1. Write code to remove all Foo objects with a value of 5 from the array
    // 2. Return a new array of the correct length without any padding
    public static Foo[] removeFooFives(Foo[] a) {
        Foo[] b = new Foo[a.length];
        int size = 0;

        for (Foo element : a) {
            if (element.getValue() == 5) {
                continue;
            }

            b[size] = element;
            size++;
        }

        // You can also just make a new array of size `size` and loop over the `b` array
        // to copy it.
        return Arrays.copyOfRange(b, 0, size);
    }

    // You are given an ArrayList `a` containing Foo objects

    // 1. Write code to return the index of the first Foo object with a value of 5
    public static int firstFiveIndex(ArrayList<Foo> a) {
        for (Foo b : a) {
            if (b.getValue() == 5)
                return a.indexOf(b);
        }

        return -1;
    }

    // You are given an array `a`

    // 1. Write code to reverse the elements of the array.
    // 2. Return the reversed array
    public static int[] reverseArray(int[] a) {
        int[] newArr = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            newArr[i] = a[a.length - 1 - i];
        }

        return newArr;
    }

    // You are given an ArrayList `a`

    // 1. Write code to remove the second element of the ArrayList
    // 2. If the ArrayList has less than 2 elements, do nothing

    public static void removeSecond(ArrayList<Integer> a) {
        if (a.size() < 2)
            return;

        a.remove(1);
    }

    // You are given an array of doubles `a`

    // 1. Write code to convert the array into an ArrayList of the appropriate type.
    // 2. Return the ArrayList
    public static ArrayList<Double> arrayToArrayList(double[] a) {
        ArrayList<Double> result = new ArrayList<>();

        for (double ele : a) {
            result.add(ele);
        }

        return result;
    }

    // You have given two arrays, `a` and `b`

    // 1. Write code to combine these two arrays into a single array
    // 2. Return the new array
    public static int[] joinArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0;

        for (int ele : a) {
            result[i] = ele;
            i++;
        }

        for (int ele : b) {
            result[i] = ele;
            i++;
        }

        return result;
    }

    // You are given an array `a` and an ArrayList `b`

    // 1. Write code to combine those two objects into a single array
    // 2. The elements of `a` should come before the elements of `b`
    public static int[] combineToArray(int[] a, ArrayList<Integer> b) {
        int[] result = new int[a.length + b.size()];
        int i = 0;

        for (int ele : a) {
            result[i] = ele;
            i++;
        }

        for (int ele : b) {
            result[i] = ele;
            i++;
        }

        return result;
    }

    // As above, but return an ArrayList instead
    public static ArrayList<Integer> combineToArrayList(int[] a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int ele : a) {
            result.add(ele);
        }

        for (int ele : b) {
            result.add(ele);
        }

        return result;
    }

    // EXTRA OPTIONAL

    // You are given an array `a` and and ArrayList `b`

    // 1. Write code to find the common elements between those two objects without
    // duplicates.
    // 2. Return your answer in the form of an array without any padding.
    public static int[] commonElements(int[] a, ArrayList<Integer> b){
        Set<Integer> myset = new HashSet<>();

        for (int ele : a) {
            if (b.contains(ele)) {
                result.add(ele);
            }
        }

        return myset.toArray();
    }

    // You are given a String `s`

    // 1. Write code to determine if the String is a palindrome (reads the same
    // backward as forward, such as 'madam')
    // 2. Returns true if the String is a palindrome
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right++;
        }

        return true;
    }

    // You are given an ArrayList `a` containing integers

    // 1. Write code to sort this ArrayList in order of smallest to largest (use
    // Bubble sort).
    // 2. This method does not return anything.
    public static void sortArrayList(ArrayList<Integer> a) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a.get(j) > a.get(j+1)) {
                    temp = a.get(j);
                    a.set(j, j+1);
                    a.set(j+1, temp);
                }
            }
        }
    }

    // You are given an ArrayList `a` containing Foo objects

    // 1. Write code to sort this ArrayList in order of smallest to largest (use
    // Selection sort).
    // 2. This method does not return anything.
    public static void sortArrayList(ArrayList<Foo> a) {
        for (int i = 0; i < tmp.length; i++){
            int minIndex = i;

            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(j).getValue() < a.get(minIndex).getValue()) {
                    minIndex = j;
                }
            }

            Foo temp = a.get(i);
            a.set(i, a.get(minIndex));
            a.set(minIndex, temp);
        }
    }

    // You are given a two-dimensional array `a`

    // 1. Write code to flatten this array
    // 2. Return it as an ArrayList
    public static ArrayList<Integer> flattenArray(int[][] a) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int e : a[i]) {
                result.add(e);
            }
        }

        return result;
    }
}
