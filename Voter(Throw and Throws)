class voter {
    void validate (int age) throws ArithmeticException {
        if(age < 18) {
            throw new ArithmeticException("Not Eligible");
        }
        else{
        System.out.println("Eligible");
        }
    }
}    
public class Main {
    public static void main(String[] args) {
        int age = 18;
        voter v = new voter();
        try {
           v.validate(age); 
        }
        catch(ArithmeticException ae){
            System.out.println("Eception caught: "+ae.getMessage());
        }
    }
}
