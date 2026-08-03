/*
        Hierarchical Inheritance

              A

            B   C   
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

        class C extends A
        {
            public C()
            {
                System.out.println("\n Constructor C ");
            }
        }

    public class HierarchicalInheritance
    {
        public static void main(String [] args)
        {
             B obj1 = new B();
             C obj2 = new C();
        } 
    }

