public interface Messagable {
    //interface method, can't create a body
    public void sendMessage();
    //default lets you create a body
    default void someFunction(){
        System.out.println("Testing default");
    }
    //can create static methods and static instance variables here.
    static void anotherFunction(){
        System.out.println("testing static");
    }
}
