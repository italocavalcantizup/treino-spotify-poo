package com.italocavalcanti.spotify;

public class Music {

	private String name;
	private int likes;
	private boolean playing;
	private Artist artist;
	
	public Music(String name, Artist artist) {
		this.name = name;
		this.artist = artist;
		this.likes = 0;
		this.playing = false;
	}
	
	public String getDetails() {
		String tit = this.getName() + " - Likes: " + this.getLikes();
		return  tit + "\n" + this.artist.getBio(); 
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLikes() {
		return this.likes;
	}
	
	public void addLike() {
		this.likes++;
	}
	
	public boolean isPlaying() {
		return this.playing;
	}
	
	public void setPlaying(boolean playing) {
		this.playing = !playing;
	}
	
}
