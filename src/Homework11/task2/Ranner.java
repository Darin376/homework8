package Homework11.task2;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Ranner {


    class User implements Cloneable {
        String name;
        String email;
        int id;
        Address address; // Добавили поле Address для демонстрации глубокого клонирования

        public User(String name, String email, int id, Address address) {
            this.name = name;
            this.email = email;
            this.id = id;
            this.address = address;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", id=" + id +
                    ", address=" + address +
                    '}';
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, email, id, address);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            User user = (User) obj;
            return id == user.id && name.equals(user.name) && email.equals(user.email) && address.equals(user.address);
        }


        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone(); // Поверхностное клонирование по умолчанию
        }

        public User deepClone() {
            try {
                User clonedUser = (User) super.clone();
                clonedUser.address = this.address.clone(); // Глубокое клонирование Address
                return clonedUser;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e); // Обработка исключения
            }
        }
    }


    class Address implements Cloneable {
        String street;
        String city;

        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Address address = (Address) o;
            return street.equals(address.street) && city.equals(address.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(street, city);
        }
    }


    public class CloningExample {
        public static void main(String[] args) {
            Address address = new Address("Main Street", "Anytown");
            User user = new User("John Doe", "john.doe@example.com", 123, address);

            try {
                // Поверхностное клонирование
                User shallowClone = (User) user.clone();
                System.out.println("Original User: " + user);
                System.out.println("Shallow Clone: " + shallowClone);
                System.out.println("Shallow Clone equals original: " + user.equals(shallowClone)); //true
                shallowClone.name = "Jane Doe";
                shallowClone.address.street = "New Street"; //Изменяем address - влияет на оригинал, так как это поверхностная копия
                System.out.println("Modified Shallow Clone: " + shallowClone);
                System.out.println("Original User after shallow clone modification: " + user); // address изменился!


                // Глубокое клонирование
                User deepClone = user.deepClone();
                System.out.println("\nOriginal User: " + user);
                System.out.println("Deep Clone: " + deepClone);
                System.out.println("Deep Clone equals original: " + user.equals(deepClone)); //true
                deepClone.name = "Peter Pan";
                deepClone.address.street = "Neverland"; //Изменяем address - не влияет на оригинал
                System.out.println("Modified Deep Clone: " + deepClone);
                System.out.println("Original User after deep clone modification: " + user); // address не изменился!



            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
