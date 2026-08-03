/*
        Multilevel Inheritance

              A

              B

              C
*/

        class A
        {
            public A()
            {
                System.out.println("\n Constructor A ");
            }
        }

        class B extends A
        {
            public B()
            {
                System.out.println("\n Constructor B ");
            }
        }

        class C extends B
        {
            public C()
            {
                System.out.println("\n Constructor C ");
            }
        }

    public class MultilevelInheritance
    {
        public static void main(String [] args)
        {
             C obj = new C();
        } 
    }
