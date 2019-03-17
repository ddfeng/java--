package AnonymousInnerClass;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class demo1 {

    @Test
    public void test() {
        printList(new ArrayList<String>() {
            {
                add("HU");
                add("weifeng");
            }
        });
    }

    public void printList(List<String> list) {
        System.out.println(list);
    }
}

