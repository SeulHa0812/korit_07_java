package java_exam;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
class Company {
    private int companyId;
    private String companyName;
    private String address;
    private String city;
    private String state;
    private String zipCode;

}
public class JSON {
    public static void main(String[] args) {
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        Company company1 = new Company(100, "Apple", "Apple Computer Inc. 1 infinite Loop"
                , "Cupertino", "CA", "95014");
        String javaCompany1 = gsonBuilder.toJson(company1);
        System.out.println(javaCompany1);
    }
}
