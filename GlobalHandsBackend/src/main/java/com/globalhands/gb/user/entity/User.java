package com.globalhands.gb.user.entity;

import jakarta.persistence.*;

    @Entity
    @Table(name = "usuarios")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "nombre", nullable = false)
        private String firstName;

        @Column(name = "apellido", nullable = false)
        private String lastName;

        @Column(name = "email", nullable = false, unique = true)
        private String email;

        @Column(name = "password", nullable = false)
        private String password;

        // Constructor vacío
        public User() {
        }

        // Getters

        public Integer getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        // Setters

        public void setId(Integer id) {
            this.id = id;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPassword(String password) {
            this.password = password;
        }



}
