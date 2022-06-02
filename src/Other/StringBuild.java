package Other;

import java.lang.StringBuilder;

public class StringBuild {

    public static void main(String[] args) {

        StringBuilder myExtensibleString = new StringBuilder("world");

        myExtensibleString.append(" hello guys");

        System.out.println(myExtensibleString);
    }

}
