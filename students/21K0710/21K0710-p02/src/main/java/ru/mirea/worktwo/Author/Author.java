package task2;

public class Author {
    String name;
    String email;
    char gender;
    public Author(String name, String email, char gender )
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName()
    {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
    public char getGender()
    {
        return this.gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString()
    {
        return "Name: " + this.name + ", email: " + this.email + ", gender: " + this.gender;
    }
}
