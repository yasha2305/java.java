package basics;


    class A

    {

        final void meth()

        {

            System.out.println("This is a final method.");

        }

    }

class B extends A 

{ 

void meth() 

{ 

System.out.println("Illegal!"); 

} 

}
