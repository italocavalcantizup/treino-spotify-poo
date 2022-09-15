package com.italocavalcanti.spotify;

public class Artist {

	private String name;
	private int age;

	public Artist() {}
	
	public Artist(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getBio() {
		return "Artista: " + this.getName() + " - " + this.getAge() + " anos.";
	}

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
}
