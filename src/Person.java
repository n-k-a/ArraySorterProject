import java.io.Serializable;
//note use of <person> instead of <T>. can replace T(object) with the class here
public class Person implements Messagable, Serializable, Comparable<Person> {

private String firstName;
private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void sendMessage() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
//unique way of comapring using string since string's compare can't be overriden
    @Override
    //note you can use Person instead of object ebcause of what'sin comparable
    public int compareTo(Person o) {
        //if the last names are the same
        if(this.getLastName().equals(o.getLastName()))
            //return the comparison using first names
            return this.getFirstName().compareTo(o.getFirstName());
        //otherwise return the comparison with their lastnames
        else
        return getLastName().compareTo((o.getLastName()));
    }
}
