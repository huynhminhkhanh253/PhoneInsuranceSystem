package JavaCore.JavaBasic;

import java.util.concurrent.CompletableFuture;

public class People {
    String name;
    int age;
    public People(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public boolean equals(Object object) {
        // compare with itself
        if (object == this) {
            return true;
        }
        // check if object is the instance of People
        if (!(object instanceof People)) {
            return false;
        }

        // type cast object to People to compare

        People c = (People) object;
        if (name.equals(c.name) && age == c.age) {
            return true;
        } else {
            return false;
        }
    }
}
