package java_exam;

import lombok.Getter;

class Factory {
    private static Factory instance;
    @Getter
    private String factoryName;

   private Factory() {
       factoryName = getClass().getSimpleName();
   }

   public static Factory getInstance() {
        if(instance == null) {
            instance = new Factory();
        }
        return instance;
    }

}

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = Factory.getInstance();
    }
}
