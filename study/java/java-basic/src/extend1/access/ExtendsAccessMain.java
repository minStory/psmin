package extend1.access;

import extend1.access.child.Child;
import extend1.access.parent.Parents;

public class ExtendsAccessMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.call();
    }
}
