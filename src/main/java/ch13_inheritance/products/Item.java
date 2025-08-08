package ch13_inheritance.products;

public class Item {
    //1. field
    private String name;
    private String category;

    //2. AllArgsConstructor
    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }
    //3. getter/ setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
