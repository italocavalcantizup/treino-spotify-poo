package com.italocavalcanti.spotify;

public class Listen {
	
	private Music music;
	private User user;
	
	public Listen(User user, Music music) {
		this.user = user;
		this.music = music;
		this.play();
	}
	
	public void play() {
		this.music.setPlaying(true);
		System.out.println(this.user.getName() + " ouvindo " + this.music.getName());
	}
	
	public void stop() {
		this.music.setPlaying(false);
	}
	
	public void like() {
		this.music.addLike();
		System.out.println(this.user.getName() + " curtiu " + this.music.getName());
	}

}
