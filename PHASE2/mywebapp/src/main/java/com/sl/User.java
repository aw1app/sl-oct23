package com.sl;

public class User {
	    private String username;
	    private int age;
	    private String email;
	    
	    public User() {
			
		}

	    public User(String name, int age, String email) {
	        this.username = name;
	        this.age = age;
	        this.email = email;
	    }

	    // Getters and setters
	    
	    

	    @Override
	    public String toString() {
	        return "User{" +
	                "name='" + username + '\'' +
	                ", age=" + age +
	                ", email='" + email + '\'' +
	                '}';
	    }

		public String getUsername() {
			return username;
		}

		public void setUsername(String name) {
			this.username = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	}

