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
     *
     * To add a static method just change the default to static, so
     * static String getPersonInfo(Person person)
     * Call it straight off of the interface.
     * PersonInterface.getPersonInfo(person);
     * As it's static, can't refer to the instance methods, so use
     * person.getName() etc in it instead.
     * **/
}
