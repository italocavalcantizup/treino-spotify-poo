package com.italocavalcanti.spotify;

import java.util.ArrayList;

public class Spotify {

	public static void main(String[] args) {

		//Criando uma lista de usuários e de música para armazenar
		ArrayList<User> userList = new ArrayList<User>();
		ArrayList<Music> musicList = new ArrayList<Music>();
		
		//Adicionando alguns usuários
		userList.add(new User("Italo Cavalcanti", 28));
		userList.add(new User("Mariana Costa", 27));
		
		//Adicionando músicas e artistas
		Artist rael = new Artist("Rael", 38);
		musicList.add(new Music("Ela me faz", rael));
		musicList.add(new Music("Envolvidão", rael));
		musicList.add(new Music("Coisas do meu imaginário", rael));
		
		Artist billie = new Artist("Billie Eilish", 20);
		musicList.add(new Music("Happy than ever", billie));
		musicList.add(new Music("Bad guy", billie));
		musicList.add(new Music("Lovely", billie));
		
		//Fazendo alguns testes
		System.out.println("Usuários");
		for (User user : userList) {
			System.out.println(user.getDetails());
		}
		System.out.println();
		
		//Criando visualizações
		Listen listen1 = new Listen(userList.get(0), musicList.get(0));
		listen1.like();

		listen1 = new Listen(userList.get(0), musicList.get(4));
		listen1.like();

		Listen listen2 = new Listen(userList.get(1), musicList.get(5));
		listen2.like();

		listen2 = new Listen(userList.get(1), musicList.get(0));
		listen2.like();

		System.out.println();
		
		//Vendo resultados
		System.out.println("Músicas");
		for (Music music : musicList) {
			System.out.println(music.getDetails());
			System.out.println();		
		}
		System.out.println();
		
		
		
	}

}
