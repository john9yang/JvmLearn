package org.fenixsoft.jvm.chapter7;

/**
 * @author John_Yang
 */
public class ForwardReferenceTest {
    static {
        i = 0;
        //System.out.print(i);
    }

    static int i = 1;
}
