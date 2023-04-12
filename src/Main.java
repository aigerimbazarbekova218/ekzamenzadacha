public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String[] a = new String[]{"CAKES", "WAtER", "DREAM"};

        method(a);

    }


    static void method(String[] words) {
        char[] c = {
                'a', 'b', 'c', 'd', 'e',
                'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z'
        };

        String[] newArray = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (words[i].charAt(words[i].length() / 2) == c[j]) {
                    newArray[i] = words[i].substring(0, (words[i].length() / 2) + 1);
                }
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    static void vas(String[] text) {
        String[] newArray = new String[text.length];
        for (int i = 0; i < text.length; i++) {
            if (text[i].charAt(text[i].length() / 2) == text[i].charAt(text[i].length())) {
                newArray[i] = text[i].substring(0, text[i].length() / 2);
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

    }
}