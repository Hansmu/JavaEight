package interfaces;

public interface PersonInterface {

    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);

    //Default method - a method that can be inherited. A public method.
    default String getPersonInfo() { //Can't refer to the private fields, so refer to the abstract methods.
        return getName() + " " + getAge(); //Call the method like you would call any other method.
    }
    /**
     * Person implements PersonInterface {}
     * person.getPersonInfo();
     * **/
}
