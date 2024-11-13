import java.util.*;

class Student {
    String name;
    String branch;
    String usn;
    int phone;
 public void read(String name, String usn, String branch,int phone) {
    this.name = name;
    this.branch = branch;
    this.usn = usn;
    this.phone = phone;
}
void display() {
 System.out.println("Name: "+name+"\nBranch: "+branch+"\nUSN: : "+usn+"\nPhone: "+phone);    
 }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("USN: ");
        String usn = sc.nextLine();
        System.out.println("Branch:");
        String branch = sc.nextLine();
        System.out.println("Phone: ");
        int phone = sc.nextInt();
        st.read(name,usn,branch,phone);
        st.display();
    }    
}
