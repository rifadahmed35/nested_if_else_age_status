public class Main {
    public static void main(String[] args) {
        int age = 17;
        if(age<2){
            System.out.println("Infant");
        }else if(age>=2 && age<10){
            System.out.println("Child");
        }else if (age>=10 && age<20){
            System.out.println("Teenage");
        } else if (age>=20 && age<30) {
            System.out.println("Adult");
        }else {
            System.out.println("Old");
        }
    }
}