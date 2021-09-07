import entities.Student;

public class App {
  public static void main(String[] args) {
    // Student st = new Student();
    Student st = new Student("Ken", true, 21, 8.7f);
    st.learn();
    st.sleep();
    System.out.println(st);

    // Student st2 = st;
    // System.out.println(st2);
    // st2.setName("Ryu");
    // System.out.println(st2);

    // System.out.println(st);
  }
}
