import java.util.Objects;

public class Person {
    String nama;
    String noKtp;
    String gender;
    String address;
    int age;
    String job;
    String bahasa;

    void scream(){
        System.out.println("AAAAAAAAAAAAA");
    }

    int korenAge(){
        return age + 1;
    }

    String suku(){
        if (Objects.equals(bahasa, "Ngapak")){
            return "jawa";
        }
        return "melayu";
    }
}
