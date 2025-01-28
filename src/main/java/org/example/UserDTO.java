package org.example;

public class UserDTO {
        private String name;
        private int age;

        // Constructor
        public UserDTO(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter and Setter
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


        public boolean isAdult() {
            return this.age >= 18;
        }


}
