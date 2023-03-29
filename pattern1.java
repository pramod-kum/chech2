interface Pramod{
    void fun();
}
class mohan implements Pramod{
    void fun(){
        System.out.println("Hello word");
    }
}
class ram{
    public static void main(String[] args) {
        mohan obj=new mohan();
        obj.fun();
    }
}