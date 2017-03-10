package com.cbs.edu.examples.cw07.local;

import java.io.Serializable;

public class Test {

    private static int s = 1;
    private int ns = 1;

    static {
        class HomeCat {

        }
    }

    public Test() {
        class HomeCat {

        }
    }

    public static void main(String[] args) {
        class HomeCat extends Object implements Serializable {

        }



        class LazyCat extends HomeCat implements Serializable {

            public int lazyLvl;

            public LazyCat(int lazyLvl) {
                this.lazyLvl = lazyLvl;
            }

            int local = 7;
            final int localFinal = 77;

            public void print() {
                System.out.println(s);
                System.out.println(new Test().ns);
                System.out.println(local);
                System.out.println(localFinal);
            }
        }

        LazyCat lazyCat = new LazyCat(999);
    }

    public void f() {
//        LazyCat lazyCat = new LazyCat();
        class HomeCat {

        }
    }
}
