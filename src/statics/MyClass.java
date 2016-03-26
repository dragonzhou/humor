package statics;

class MyClass extends Test {
	
    public static void main(String[] args) {
    	Test e=new Test();
    	Test ee=new MyClass();
    	System.out.println(e.getClass().getName());
    	System.out.println(ee.getClass().getName());
    }

}
